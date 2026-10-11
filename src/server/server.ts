import { CancellationToken, createConnection, Diagnostic, InitializeResult, LSPErrorCodes, ProposedFeatures,
    ResponseError, TextDocuments, TextDocumentSyncKind } from 'vscode-languageserver/node';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { Features, tokenModifiers, tokenTypes } from './features';
import { Settings, Workspace } from './workspace';

const connection = createConnection(ProposedFeatures.all);
const documents = new TextDocuments(TextDocument);
const workspace = new Workspace();
const features = new Features(workspace);
let hasConfiguration = false;
let hasWorkspaceFolders = false;
let configGeneration = 0;
const configurations = new Map<string, Promise<void>>();
let timer: ReturnType<typeof setTimeout> | undefined;
let validating = false;
let validateAgain = false;
let stopped = false;
const published = new Set<string>();

connection.onInitialize(params => {
    hasConfiguration = Boolean(params.capabilities.workspace?.configuration);
    hasWorkspaceFolders = Boolean(params.capabilities.workspace?.workspaceFolders);
    workspace.roots = params.workspaceFolders?.map(folder => folder.uri) ?? (params.rootUri ? [params.rootUri] : []);
    if (params.initializationOptions?.p4) { workspace.configure(params.initializationOptions.p4); }
    const result: InitializeResult = {
        serverInfo: { name: 'P4 Tree-sitter Language Server', version: '0.1.0' },
        capabilities: {
            textDocumentSync: { openClose: true, change: TextDocumentSyncKind.Incremental, save: { includeText: false } },
            completionProvider: { triggerCharacters: ['.'] }, hoverProvider: true,
            definitionProvider: true, typeDefinitionProvider: true,
            referencesProvider: true, renameProvider: { prepareProvider: true },
            signatureHelpProvider: { triggerCharacters: ['(', ','], retriggerCharacters: [','] },
            documentSymbolProvider: true, workspaceSymbolProvider: true, foldingRangeProvider: true,
            semanticTokensProvider: { legend: { tokenTypes, tokenModifiers }, full: true },
            workspace: { workspaceFolders: { supported: true, changeNotifications: true } }
        }
    };
    return result;
});

async function settingsFor(uri: string): Promise<void> {
    if (!hasConfiguration) { return; }
    let pending = configurations.get(uri);
    if (!pending) {
        const generation = configGeneration;
        pending = connection.workspace.getConfiguration({ scopeUri: uri, section: 'p4' }).then((settings: Partial<Settings> | null) => {
            if (generation === configGeneration) { workspace.configure(settings ?? {}, uri); }
        }).catch(error => { connection.console.error(`Cannot read P4 configuration: ${String(error)}`); });
        configurations.set(uri, pending);
    }
    await pending;
}

function scheduleDiagnostics(): void {
    if (stopped) { return; }
    if (timer) { clearTimeout(timer); }
    timer = setTimeout(() => { timer = undefined; void validate(); }, 120);
}
async function validate(): Promise<void> {
    if (validating) { validateAgain = true; return; }
    validating = true;
    try {
        const combined = new Map<string, Diagnostic[]>();
        for (const document of documents.all()) {
            await settingsFor(document.uri);
            const revision = workspace.revision;
            await workspace.get(document.uri);
            if (revision !== workspace.revision) { validateAgain = true; return; }
            for (const [uri, issues] of workspace.diagnostics(document.uri)) {
                // An open header gets diagnostics in its own preprocessing context.
                if (uri !== document.uri && documents.get(uri)) { continue; }
                combined.set(uri, [...(combined.get(uri) ?? []), ...issues]);
            }
        }
        if (stopped) { return; }
        for (const uri of new Set([...published, ...combined.keys()])) {
            const unique = new Map((combined.get(uri) ?? []).map(issue => [JSON.stringify(issue), issue]));
            await connection.sendDiagnostics({ uri, version: documents.get(uri)?.version, diagnostics: [...unique.values()].slice(0, workspace.configuration(uri).maxNumberOfProblems) });
        }
        published.clear();
        for (const uri of combined.keys()) { published.add(uri); }
    } catch (error) { connection.console.error(`P4 analysis failed: ${String(error)}`); }
    finally {
        validating = false;
        if (validateAgain && !stopped) { validateAgain = false; scheduleDiagnostics(); }
    }
}

documents.onDidChangeContent(event => {
    workspace.update(event.document.uri, event.document.getText(), event.document.version);
    scheduleDiagnostics();
});
documents.onDidClose(event => {
    workspace.close(event.document.uri);
    configurations.delete(event.document.uri);
    scheduleDiagnostics();
});
connection.onDidChangeConfiguration(event => {
    configGeneration++;
    configurations.clear();
    workspace.configure(hasConfiguration ? {} : event.settings?.p4 ?? {});
    scheduleDiagnostics();
});
connection.onDidChangeWatchedFiles(event => {
    for (const change of event.changes) { workspace.invalidate(change.uri); }
    scheduleDiagnostics();
});
connection.onInitialized(() => {
    if (hasWorkspaceFolders) {
        connection.workspace.onDidChangeWorkspaceFolders(event => {
            workspace.roots = workspace.roots.filter(uri => !event.removed.some(folder => folder.uri === uri));
            workspace.roots.push(...event.added.map(folder => folder.uri));
            workspace.invalidate();
            scheduleDiagnostics();
        });
    }
});

async function request<T>(uri: string | undefined, token: CancellationToken, run: () => Promise<T>): Promise<T> {
    try {
        if (uri) { await settingsFor(uri); }
        if (token.isCancellationRequested) { throw new ResponseError(LSPErrorCodes.RequestCancelled, 'Request cancelled'); }
        return await run();
    } catch (error) {
        if (error instanceof ResponseError) { throw error; }
        connection.console.error(`P4 request failed: ${String(error)}`);
        throw new ResponseError(LSPErrorCodes.RequestFailed, error instanceof Error ? error.message : 'P4 analysis failed');
    }
}

connection.onCompletion((params, token) => request(params.textDocument.uri, token, () => features.completion(params.textDocument.uri, params.position)));
connection.onHover((params, token) => request(params.textDocument.uri, token, () => features.hover(params.textDocument.uri, params.position)));
connection.onDefinition((params, token) => request(params.textDocument.uri, token, () => features.definition(params.textDocument.uri, params.position)));
connection.onTypeDefinition((params, token) => request(params.textDocument.uri, token, () => features.definition(params.textDocument.uri, params.position, true)));
connection.onSignatureHelp((params, token) => request(params.textDocument.uri, token, () => features.signatureHelp(params.textDocument.uri, params.position)));
connection.onDocumentSymbol((params, token) => request(params.textDocument.uri, token, () => features.documentSymbols(params.textDocument.uri)));
connection.onWorkspaceSymbol((params, token) => request(undefined, token, () => features.workspaceSymbols(params.query, token)));
connection.onReferences((params, token) => request(params.textDocument.uri, token, () => features.references(params.textDocument.uri, params.position, params.context.includeDeclaration, token)));
connection.onPrepareRename((params, token) => request(params.textDocument.uri, token, () => features.prepareRename(params.textDocument.uri, params.position)));
connection.onRenameRequest((params, token) => request(params.textDocument.uri, token, () => features.rename(params.textDocument.uri, params.position, params.newName, token)));
connection.languages.semanticTokens.on((params, token) => request(params.textDocument.uri, token, () => features.semanticTokens(params.textDocument.uri, token)));
connection.onFoldingRanges((params, token) => request(params.textDocument.uri, token, () => features.foldingRanges(params.textDocument.uri)));
connection.onShutdown(() => {
    stopped = true;
    if (timer) { clearTimeout(timer); }
    workspace.dispose();
});
documents.listen(connection);
connection.listen();
