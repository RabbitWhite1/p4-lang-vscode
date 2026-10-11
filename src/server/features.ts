// SPDX-FileCopyrightText: 2026 Zhanghan Wang
// SPDX-License-Identifier: Apache-2.0

import { CancellationToken, CompletionItem, CompletionItemKind, DocumentSymbol, FoldingRange, FoldingRangeKind,
    Hover, Location, LSPErrorCodes, MarkupKind, Position, PrepareRenameResult, Range, ResponseError,
    SemanticTokens, SemanticTokensBuilder, SignatureHelp, SymbolInformation, SymbolKind, TextEdit, WorkspaceEdit } from 'vscode-languageserver/node';
import { FileModel, P4Symbol, TranslationUnit, typeText } from './model';
import { includeTargets, offsetRange, Workspace } from './workspace';
import { stripComments } from './preprocessor';
import { walk } from './parser';

export const tokenTypes = ['namespace', 'type', 'class', 'enum', 'typeParameter', 'parameter', 'variable',
    'property', 'enumMember', 'function', 'method', 'macro', 'event'];
export const tokenModifiers = ['declaration', 'readonly', 'defaultLibrary'];
export const keywords = new Set(('abstract action actions apply bit bool break const continue control default else entries enum error exit extern false for header header_union if in inout int key list match_kind out package parser priority return select state string struct switch table this transition true tuple type typedef varbit void').split(' '));

function cancelled(token?: CancellationToken): void {
    if (token?.isCancellationRequested) { throw new ResponseError(LSPErrorCodes.RequestCancelled, 'Request cancelled'); }
}
function callable(symbol: P4Symbol): boolean {
    return [SymbolKind.Function, SymbolKind.Method, SymbolKind.Constructor].some(kind => kind === symbol.kind);
}
function completionKind(symbol: P4Symbol): CompletionItemKind {
    const mapping: Partial<Record<SymbolKind, CompletionItemKind>> = {
        [SymbolKind.Struct]: CompletionItemKind.Struct, [SymbolKind.Class]: CompletionItemKind.Class,
        [SymbolKind.Enum]: CompletionItemKind.Enum, [SymbolKind.EnumMember]: CompletionItemKind.EnumMember,
        [SymbolKind.Field]: CompletionItemKind.Field, [SymbolKind.Property]: CompletionItemKind.Property,
        [SymbolKind.Function]: CompletionItemKind.Function, [SymbolKind.Method]: CompletionItemKind.Method,
        [SymbolKind.Constructor]: CompletionItemKind.Constructor, [SymbolKind.Constant]: CompletionItemKind.Constant,
        [SymbolKind.TypeParameter]: CompletionItemKind.TypeParameter
    };
    return mapping[symbol.kind] ?? CompletionItemKind.Variable;
}
function semanticType(symbol: P4Symbol): string {
    if (symbol.flavor === 'macro') { return 'macro'; }
    if (symbol.flavor === 'parameter') { return 'parameter'; }
    if (symbol.flavor === 'typedef_declaration') { return 'type'; }
    switch (symbol.kind) {
        case SymbolKind.Struct: return 'type';
        case SymbolKind.Class: return 'class';
        case SymbolKind.Enum: return 'enum';
        case SymbolKind.EnumMember: return 'enumMember';
        case SymbolKind.TypeParameter: return 'typeParameter';
        case SymbolKind.Field: case SymbolKind.Property: return 'property';
        case SymbolKind.Function: return 'function';
        case SymbolKind.Method: case SymbolKind.Constructor: return 'method';
        case SymbolKind.Event: return 'event';
        default: return 'variable';
    }
}
function location(unit: TranslationUnit, symbol: P4Symbol): Location | undefined {
    const model = unit.files.get(symbol.uri);
    return model && symbol.uri ? { uri: symbol.uri, range: offsetRange(model, symbol.start, symbol.end) } : undefined;
}

export class Features {
    constructor(readonly workspace: Workspace, private readonly prepare: (uri: string) => Promise<void> = async () => {}) {}

    async context(uri: string, position?: Position): Promise<{ unit: TranslationUnit; model?: FileModel; offset: number }> {
        let unit = await this.workspace.get(uri);
        // An edit can arrive while include files are being read.
        const overlay = this.workspace.open.get(uri);
        if (overlay && unit.files.get(uri)?.file.document.version !== overlay.version) { unit = await this.workspace.get(uri); }
        const model = unit.files.get(uri);
        return { unit, model, offset: model && position ? model.file.document.offsetAt(position) : 0 };
    }

    async completion(uri: string, position: Position): Promise<CompletionItem[]> {
        const { unit, model, offset } = await this.context(uri, position);
        if (!model || this.nonCode(model, offset)) { return []; }
        const text = model.file.document.getText();
        const prefix = /[A-Za-z_][A-Za-z0-9_]*$/.exec(text.slice(0, offset))?.[0] ?? '';
        const before = stripComments(text.slice(0, offset - prefix.length));
        const receiver = /([A-Za-z_]\w*(?:\s*(?:\.\s*[A-Za-z_]\w*|\[[^\]\n]*\]|\([^()\n]*\)))*)\s*\.\s*$/.exec(before)?.[1];
        const symbols = receiver ? unit.membersForText(uri, offset, receiver.replace(/\s*\.\s*/g, '.')) : unit.visible(uri, offset);
        const range = offsetRange(model, offset - prefix.length, offset);
        const seen = new Set<string>();
        const result: CompletionItem[] = [];
        for (const symbol of symbols) {
            if (seen.has(symbol.name)) { continue; }
            seen.add(symbol.name);
            result.push({ label: symbol.name, kind: completionKind(symbol), detail: symbol.detail,
                documentation: symbol.documentation ? { kind: MarkupKind.PlainText, value: symbol.documentation } : undefined,
                textEdit: TextEdit.replace(range, symbol.name) });
        }
        if (!receiver) { result.push(...[...keywords].map(word => ({ label: word, kind: CompletionItemKind.Keyword, textEdit: TextEdit.replace(range, word) }))); }
        return result;
    }

    async definition(uri: string, position: Position, typeDefinition = false): Promise<Location[]> {
        const { unit, model, offset } = await this.context(uri, position);
        if (!model) { return []; }
        if (!typeDefinition) {
            const include = model.preprocessing.includes.find(include => include.start <= offset && offset <= include.end);
            const target = include && includeTargets.get(include);
            if (target) { return [{ uri: target, range: Range.create(0, 0, 0, 0) }]; }
        }
        let symbol = unit.symbolAt(uri, offset);
        if (typeDefinition && symbol?.type) { symbol = unit.lookup(symbol.uri || uri, symbol.start || offset, symbol.type.name); }
        else if (typeDefinition && symbol && !symbol.bodyScope) { symbol = undefined; }
        const result = symbol && location(unit, symbol);
        return result ? [result] : [];
    }

    async hover(uri: string, position: Position): Promise<Hover | undefined> {
        const { unit, model, offset } = await this.context(uri, position);
        if (!model) { return undefined; }
        const symbol = unit.symbolAt(uri, offset);
        if (!symbol) { return undefined; }
        const identifier = model.identifiers.find(node => node.startIndex <= offset && offset <= node.endIndex);
        const start = identifier?.startIndex ?? offset;
        const end = identifier?.endIndex ?? offset;
        // Plain text keeps source comments from introducing Markdown links or commands.
        return { contents: { kind: MarkupKind.PlainText, value: symbol.detail + (symbol.documentation ? `\n\n${symbol.documentation}` : '') },
            range: offsetRange(model, start, end) };
    }

    async signatureHelp(uri: string, position: Position): Promise<SignatureHelp | undefined> {
        const { unit, model, offset } = await this.context(uri, position);
        if (!model || this.nonCode(model, offset)) { return undefined; }
        const text = stripComments(model.file.document.getText().slice(0, offset)).replace(/"(?:\\.|[^"\\])*"/g, match => ' '.repeat(match.length));
        let depth = 0, activeParameter = 0, open = -1;
        for (let index = text.length - 1; index >= 0; index--) {
            if (')]}'.includes(text[index])) { depth++; }
            else if ('([{'.includes(text[index])) {
                if (depth > 0) { depth--; }
                else if (text[index] === '(') { open = index; break; }
                else { return undefined; }
            } else if (text[index] === ',' && depth === 0) { activeParameter++; }
        }
        if (open < 0) { return undefined; }
        const name = /([A-Za-z_]\w*)(?:\s*<[^<>]*>)?\s*$/.exec(text.slice(0, open));
        if (!name) { return undefined; }
        const callableEnd = name.index + name[1].length;
        let symbol = unit.symbolAt(uri, callableEnd - 1);
        const receiver = /([A-Za-z_]\w*(?:\.[A-Za-z_]\w*|\[[^\]]*\]|\([^()]*\))*)\s*\.\s*$/.exec(text.slice(0, name.index))?.[1];
        let candidates: P4Symbol[] = [];
        if (receiver) {
            candidates = unit.membersForText(uri, offset, receiver).filter(member => member.name === name[1]);
            symbol = candidates[0] ?? symbol;
        } else if (symbol) {
            candidates = symbol.scope.symbols.filter(member => member.name === symbol!.name && callable(member));
        }
        if (symbol?.kind === SymbolKind.Class) { candidates = symbol.bodyScope?.symbols.filter(member => member.kind === SymbolKind.Constructor) ?? []; }
        if (!candidates.length && symbol && callable(symbol)) { candidates = [symbol]; }
        if (!candidates.length) { return undefined; }
        const activeSignature = Math.max(0, candidates.findIndex(candidate => candidate.parameters.length > activeParameter));
        return { signatures: candidates.map(candidate => ({
            label: candidate.flavor === 'builtin' ? candidate.detail : `${typeText(candidate.type) || (candidate.flavor === 'action_declaration' ? 'action' : '')} ${candidate.name}(${candidate.parameters.map(parameter => `${typeText(parameter.type)} ${parameter.name}`).join(', ')})`.trim(),
            documentation: candidate.documentation,
            parameters: candidate.parameters.map(parameter => ({ label: `${typeText(parameter.type)} ${parameter.name}`, documentation: parameter.documentation }))
        })), activeSignature, activeParameter: Math.min(activeParameter, Math.max(0, candidates[activeSignature].parameters.length - 1)) };
    }

    async documentSymbols(uri: string): Promise<DocumentSymbol[]> {
        const { model } = await this.context(uri);
        if (!model) { return []; }
        const convert = (symbol: P4Symbol): DocumentSymbol => ({ name: symbol.name, kind: symbol.kind, detail: symbol.detail,
            range: offsetRange(model, symbol.fullStart, symbol.fullEnd), selectionRange: offsetRange(model, symbol.start, symbol.end),
            children: model.symbols.filter(child => child.scope.owner?.id === symbol.id && child.id !== symbol.id && child.fullStart >= symbol.fullStart && child.fullEnd <= symbol.fullEnd).map(convert) });
        return model.root.symbols.map(convert);
    }

    async workspaceSymbols(query: string, token?: CancellationToken): Promise<SymbolInformation[]> {
        const results = new Map<string, SymbolInformation>();
        for (const uri of await this.workspace.projectFiles()) {
            cancelled(token);
            await this.prepare(uri);
            const unit = await this.workspace.get(uri);
            for (const model of unit.files.values()) {
                for (const symbol of model.symbols) {
                    if (symbol.name.toLowerCase().includes(query.toLowerCase()) && symbol.flavor !== 'parameter' && symbol.flavor !== 'type_parameter') {
                        results.set(symbol.id, { name: symbol.name, kind: symbol.kind, location: location(unit, symbol)!, containerName: symbol.scope.owner?.name });
                    }
                }
            }
        }
        return [...results.values()];
    }

    async references(uri: string, position: Position, includeDeclaration: boolean, token?: CancellationToken): Promise<Location[]> {
        const { unit, offset } = await this.context(uri, position);
        const symbol = unit.symbolAt(uri, offset);
        if (!symbol?.uri || symbol.flavor === 'macro') { return []; }
        return this.findReferences(symbol, unit, includeDeclaration, token);
    }

    async prepareRename(uri: string, position: Position): Promise<PrepareRenameResult> {
        const { unit, model, offset } = await this.context(uri, position);
        const symbol = unit.symbolAt(uri, offset);
        if (symbol?.defaultLibrary) { throw new ResponseError(LSPErrorCodes.RequestFailed, 'Bundled library symbols are read-only. Use project-owned headers to edit them.'); }
        if (!model || !symbol?.uri || symbol.flavor === 'macro' || ['error', 'match_kind'].includes(symbol.name) || keywords.has(symbol.name)) {
            throw new ResponseError(LSPErrorCodes.RequestFailed, 'This symbol cannot be renamed safely.');
        }
        if (symbol.scope.symbols.filter(candidate => candidate.name === symbol.name).length > 1) {
            throw new ResponseError(LSPErrorCodes.RequestFailed, 'Renaming an overloaded or multiply declared symbol is not supported.');
        }
        const node = model.identifiers.find(node => node.startIndex <= offset && offset <= node.endIndex);
        if (!node) { throw new ResponseError(LSPErrorCodes.RequestFailed, 'Select an identifier to rename.'); }
        return { range: offsetRange(model, node.startIndex, node.endIndex), placeholder: symbol.name };
    }

    async rename(uri: string, position: Position, newName: string, token?: CancellationToken): Promise<WorkspaceEdit> {
        for (const file of await this.workspace.projectFiles()) { cancelled(token); await this.prepare(file); }
        await this.prepareRename(uri, position);
        if (!/^[A-Za-z_]\w*$/.test(newName) || keywords.has(newName)) {
            throw new ResponseError(LSPErrorCodes.RequestFailed, 'Use a P4 identifier that is not a reserved keyword.');
        }
        const { unit, offset } = await this.context(uri, position);
        const symbol = unit.symbolAt(uri, offset)!;
        if (symbol.scope.symbols.some(candidate => candidate.name === newName && candidate.id !== symbol.id)) {
            throw new ResponseError(LSPErrorCodes.RequestFailed, `A symbol named '${newName}' already exists in this scope.`);
        }
        const revision = this.workspace.revision;
        const references = await this.findReferences(symbol, unit, true, token, newName);
        cancelled(token);
        if (revision !== this.workspace.revision) { throw new ResponseError(LSPErrorCodes.ContentModified, 'Documents changed while computing rename. Try again.'); }
        const changes = new Map<string, TextEdit[]>();
        for (const reference of references) {
            const edits = changes.get(reference.uri) ?? [];
            edits.push(TextEdit.replace(reference.range, newName));
            changes.set(reference.uri, edits);
        }
        return { documentChanges: [...changes].map(([target, edits]) => ({ textDocument: { uri: target, version: this.workspace.open.get(target)?.version ?? null }, edits })) };
    }

    private async findReferences(symbol: P4Symbol, initial: TranslationUnit, includeDeclaration: boolean,
        token?: CancellationToken, newName?: string): Promise<Location[]> {
        const result = new Map<string, Location>();
        const scan = (unit: TranslationUnit) => {
            for (const reference of unit.references(symbol)) {
                cancelled(token);
                if (!includeDeclaration && reference.uri === symbol.uri && reference.start === symbol.start) { continue; }
                if (newName && ![SymbolKind.Field, SymbolKind.EnumMember, SymbolKind.Method, SymbolKind.Property].some(kind => kind === symbol.kind)) {
                    const collision = unit.lookup(reference.uri, reference.start, newName);
                    if (collision && collision.id !== symbol.id) { throw new ResponseError(LSPErrorCodes.RequestFailed, `Renaming would bind a use to '${newName}' in another scope.`); }
                }
                const model = unit.files.get(reference.uri)!;
                result.set(`${reference.uri}:${reference.start}`, { uri: reference.uri, range: offsetRange(model, reference.start, reference.end) });
            }
        };
        scan(initial);
        for (const uri of await this.workspace.projectFiles()) {
            cancelled(token);
            if (uri !== initial.rootUri) { await this.prepare(uri); scan(await this.workspace.get(uri)); }
        }
        return [...result.values()];
    }

    async semanticTokens(uri: string, token?: CancellationToken): Promise<SemanticTokens> {
        const { unit, model } = await this.context(uri);
        const builder = new SemanticTokensBuilder();
        if (!model) { return builder.build(); }
        const records = new Map<number, { start: number; end: number; symbol: P4Symbol; declaration: boolean }>();
        for (const node of model.identifiers) {
            cancelled(token);
            const symbol = unit.resolveNode(uri, node);
            if (symbol) { records.set(node.startIndex, { start: node.startIndex, end: node.endIndex, symbol, declaration: model.declarations.has(node.startIndex) }); }
        }
        for (const symbol of model.symbols.filter(symbol => symbol.flavor === 'macro')) {
            records.set(symbol.start, { start: symbol.start, end: symbol.end, symbol, declaration: true });
        }
        for (const record of [...records.values()].sort((a, b) => a.start - b.start)) {
            const position = model.file.document.positionAt(record.start);
            const modifiers = (record.declaration ? 1 : 0) | (record.symbol.readonly ? 2 : 0) | (!record.symbol.uri || record.symbol.defaultLibrary ? 4 : 0);
            builder.push(position.line, position.character, record.end - record.start, tokenTypes.indexOf(semanticType(record.symbol)), modifiers);
        }
        return builder.build();
    }

    async foldingRanges(uri: string): Promise<FoldingRange[]> {
        const { model } = await this.context(uri);
        if (!model) { return []; }
        const ranges = new Map<string, FoldingRange>();
        for (const node of walk(model.file.tree.rootNode)) {
            const braces = node.children.filter(child => child.type === '{' || child.type === '}');
            if (node.type !== 'comment' && braces.length < 2) { continue; }
            const start = model.file.document.positionAt(node.startIndex).line;
            const end = model.file.document.positionAt(node.endIndex).line;
            if (end > start) { ranges.set(`${start}:${end}`, { startLine: start, endLine: end, kind: node.type === 'comment' ? FoldingRangeKind.Comment : FoldingRangeKind.Region }); }
        }
        return [...ranges.values()];
    }

    private nonCode(model: FileModel, offset: number): boolean {
        if (offset > 0 && /\S/.test(model.file.document.getText()[offset - 1]) && /\s/.test(model.preprocessing.text[offset - 1] ?? '')) { return true; }
        let node = model.file.tree.rootNode.descendantForIndex(Math.max(0, offset - 1));
        while (node) {
            if (node.type === 'comment' || node.type === 'string' || node.type === 'annotation') { return true; }
            node = node.parent;
        }
        return false;
    }
}
