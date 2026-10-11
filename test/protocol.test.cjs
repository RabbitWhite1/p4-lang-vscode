const { test } = require('node:test');
const assert = require('node:assert/strict');
const { spawn } = require('node:child_process');
const path = require('node:path');
const fs = require('node:fs/promises');
const os = require('node:os');
const { once } = require('node:events');
const { URI } = require('vscode-uri');
const { TextDocument } = require('vscode-languageserver-textdocument');
const { createMessageConnection, StreamMessageReader, StreamMessageWriter, IPCMessageReader, IPCMessageWriter } = require('vscode-jsonrpc/node');

async function server(t, options = {}) {
    const child = spawn(process.execPath, [options.serverPath ?? process.env.P4_SERVER_PATH ?? path.resolve('dist/server.js'), options.ipc ? '--node-ipc' : '--stdio'], { stdio: options.ipc ? ['pipe', 'pipe', 'pipe', 'ipc'] : ['pipe', 'pipe', 'pipe'] });
    let stderr = '';
    child.stderr.on('data', chunk => { stderr += chunk; });
    const connection = createMessageConnection(options.ipc ? new IPCMessageReader(child) : new StreamMessageReader(child.stdout), options.ipc ? new IPCMessageWriter(child) : new StreamMessageWriter(child.stdin));
    const messages = [];
    const waiters = new Set();
    const logs = [];
    connection.onNotification('window/logMessage', params => logs.push(params));
    connection.onNotification('textDocument/publishDiagnostics', params => {
        messages.push(params);
        for (const waiter of waiters) { waiter(params); }
    });
    connection.onRequest('workspace/configuration', params => params.items.map(item => options.settings?.(item.scopeUri) ?? {}));
    connection.listen();
    const request = (method, params) => Promise.race([
        connection.sendRequest(method, params),
        new Promise((_, reject) => { const timer = setTimeout(() => reject(new Error(`Timed out: ${method}\n${stderr}`)), 5000); timer.unref(); })
    ]);
    t.after(async () => {
        if (child.exitCode === null) {
            try { await request('shutdown'); await connection.sendNotification('exit'); await Promise.race([once(child, 'exit'), new Promise(resolve => setTimeout(resolve, 1000))]); }
            finally { if (child.exitCode === null) { child.kill(); } }
        }
        connection.dispose();
        assert.equal(stderr, '', 'server stderr');
        assert.ok(!logs.some(log => log.type === 1), JSON.stringify(logs));
    });
    const initialized = await request('initialize', {
        processId: process.pid, rootUri: options.rootUri ?? null,
        capabilities: options.capabilities ?? { workspace: { configuration: true, workspaceFolders: true } },
        workspaceFolders: options.rootUri ? [{ uri: options.rootUri, name: 'test' }] : null
    });
    await connection.sendNotification('initialized', {});
    return { connection, request, initialized,
        async diagnostics(predicate) {
            const existing = messages.findLast(predicate);
            if (existing) { return existing; }
            return new Promise((resolve, reject) => {
                const timer = setTimeout(() => { waiters.delete(listener); reject(new Error('Diagnostics timeout')); }, 4000);
                const listener = params => { if (predicate(params)) { clearTimeout(timer); waiters.delete(listener); resolve(params); } };
                waiters.add(listener);
            });
        }
    };
}

test('bundled server supports navigation, incremental edits, diagnostics and rename over LSP', { timeout: 15000 }, async t => {
    const { connection, request, initialized, diagnostics } = await server(t);
    assert.equal(initialized.capabilities.textDocumentSync.change, 2);
    assert.ok(initialized.capabilities.renameProvider.prepareProvider);
    const uri = 'untitled:protocol.p4';
    const source = 'header H { bit<8> field; }\ncontrol C(inout H h) { apply { h.field = 1; } }';
    const doc = TextDocument.create(uri, 'p4', 1, source);
    const params = offset => ({ textDocument: { uri }, position: doc.positionAt(offset) });
    await connection.sendNotification('textDocument/didOpen', { textDocument: { uri, languageId: 'p4', version: 1, text: source } });
    assert.deepEqual((await diagnostics(message => message.uri === uri && message.version === 1)).diagnostics, []);
    const definition = await request('textDocument/definition', params(source.lastIndexOf('field')));
    assert.equal(definition[0].range.start.line, 0);
    assert.match((await request('textDocument/hover', params(source.lastIndexOf('field')))).contents.value, /bit<8> field/);
    assert.equal((await request('textDocument/references', { ...params(source.lastIndexOf('field')), context: { includeDeclaration: true } })).length, 2);
    assert.equal((await request('textDocument/rename', { ...params(source.lastIndexOf('field')), newName: 'renamed' })).documentChanges[0].edits.length, 2);
    assert.ok((await request('textDocument/semanticTokens/full', { textDocument: { uri } })).data.length > 0);
    assert.equal((await request('textDocument/documentSymbol', { textDocument: { uri } })).length, 2);
    const start = source.lastIndexOf('field');
    await connection.sendNotification('textDocument/didChange', { textDocument: { uri, version: 2 }, contentChanges: [{ range: { start: doc.positionAt(start), end: doc.positionAt(start + 5) }, text: '' }] });
    const items = await request('textDocument/completion', params(start));
    assert.ok(items.some(item => item.label === 'field'));
    assert.ok((await diagnostics(message => message.uri === uri && message.version === 2)).diagnostics.length > 0);
    await connection.sendNotification('textDocument/didChange', { textDocument: { uri, version: 3 }, contentChanges: [{ text: source }] });
    assert.deepEqual((await diagnostics(message => message.uri === uri && message.version === 3)).diagnostics, []);
    await connection.sendNotification('textDocument/didClose', { textDocument: { uri } });
    assert.deepEqual((await diagnostics(message => message.uri === uri && message.version === undefined)).diagnostics, []);
});

test('LSP configuration, unsaved include changes and watched files invalidate consumers', { timeout: 15000 }, async t => {
    const dir = await fs.mkdtemp(path.join(os.tmpdir(), 'p4-protocol-'));
    t.after(() => fs.rm(dir, { recursive: true, force: true }));
    const mainUri = URI.file(path.join(dir, 'main.p4')).toString();
    const headerUri = URI.file(path.join(dir, 'types.p4')).toString();
    await fs.writeFile(path.join(dir, 'types.p4'), 'header H { bit<8> old; }');
    let defines = { FEATURE: '1' };
    const { connection, request, diagnostics } = await server(t, { rootUri: URI.file(dir).toString(), settings: () => ({ defines }) });
    const source = '#include "types.p4"\n#if FEATURE\nheader On {}\n#else\nheader Off {}\n#endif\ncontrol C(inout H h) { apply { h. } }';
    await connection.sendNotification('textDocument/didOpen', { textDocument: { uri: mainUri, languageId: 'p4', version: 1, text: source } });
    const params = { textDocument: { uri: mainUri }, position: TextDocument.create(mainUri, 'p4', 1, source).positionAt(source.lastIndexOf('h.') + 2) };
    let items = await request('textDocument/completion', params);
    assert.ok(items.some(item => item.label === 'old'));
    let symbols = await request('textDocument/documentSymbol', { textDocument: { uri: mainUri } });
    assert.ok(symbols.some(symbol => symbol.name === 'On'));
    await connection.sendNotification('textDocument/didOpen', { textDocument: { uri: headerUri, languageId: 'p4', version: 1, text: 'header H { bit<8> unsaved; }' } });
    items = await request('textDocument/completion', params);
    assert.ok(items.some(item => item.label === 'unsaved'));
    assert.ok(!items.some(item => item.label === 'old'));
    await connection.sendNotification('textDocument/didClose', { textDocument: { uri: headerUri } });
    await fs.writeFile(path.join(dir, 'types.p4'), 'header H { bit<8> disk; }');
    await connection.sendNotification('workspace/didChangeWatchedFiles', { changes: [{ uri: headerUri, type: 2 }] });
    items = await request('textDocument/completion', params);
    assert.ok(items.some(item => item.label === 'disk'));
    defines = {};
    await connection.sendNotification('workspace/didChangeConfiguration', { settings: {} });
    symbols = await request('textDocument/documentSymbol', { textDocument: { uri: mainUri } });
    assert.ok(symbols.some(symbol => symbol.name === 'Off'));
    assert.ok(!symbols.some(symbol => symbol.name === 'On'));
    await connection.sendNotification('textDocument/didChange', { textDocument: { uri: mainUri, version: 2 }, contentChanges: [{ text: '#include "missing.p4"\nheader H {}' }] });
    assert.match((await diagnostics(message => message.uri === mainUri && message.version === 2)).diagnostics[0].message, /Cannot find include/);
    await fs.writeFile(path.join(dir, 'missing.p4'), 'header New {}');
    await connection.sendNotification('workspace/didChangeWatchedFiles', { changes: [{ uri: URI.file(path.join(dir, 'missing.p4')).toString(), type: 1 }] });
    assert.deepEqual((await diagnostics(message => message.uri === mainUri && message.version === 2 && message.diagnostics.length === 0)).diagnostics, []);
});

test('standalone LSP clients without workspace configuration can open untitled documents', { timeout: 15000 }, async t => {
    const { connection, request } = await server(t, { capabilities: {} });
    await connection.sendNotification('textDocument/didOpen', { textDocument: { uri: 'untitled:plain.p4', languageId: 'p4', version: 1, text: 'header H {}' } });
    assert.equal((await request('textDocument/documentSymbol', { textDocument: { uri: 'untitled:plain.p4' } }))[0].name, 'H');
});

test('VS Code IPC transport loads the shipped WASM and navigates bundled standard headers', { timeout: 15000 }, async t => {
    const { connection, request } = await server(t, { ipc: true });
    const uri = 'untitled:core.p4';
    const source = '#include <core.p4>\nheader H { bit<8> value; }\nparser P(packet_in packet, out H h) { state start { packet.extract(h); transition accept; } }';
    const doc = TextDocument.create(uri, 'p4', 1, source);
    await connection.sendNotification('textDocument/didOpen', { textDocument: { uri, languageId: 'p4', version: 1, text: source } });
    const items = await request('textDocument/completion', { textDocument: { uri }, position: doc.positionAt(source.indexOf('packet.extract') + 7) });
    assert.ok(items.some(item => item.label === 'extract'));
    const definition = await request('textDocument/definition', { textDocument: { uri }, position: doc.positionAt(source.indexOf('packet_in')) });
    const expected = path.resolve(path.dirname(process.env.P4_SERVER_PATH ?? path.resolve('dist/server.js')), '../p4include/core.p4');
    assert.equal(definition[0].uri, URI.file(expected).toString());
    await assert.rejects(request('textDocument/prepareRename', { textDocument: { uri }, position: doc.positionAt(source.indexOf('packet_in')) }), /library symbols are read-only/);
});
