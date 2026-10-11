const { test } = require('node:test');
const assert = require('node:assert/strict');
const fs = require('node:fs/promises');
const os = require('node:os');
const path = require('node:path');
const { URI } = require('vscode-uri');
const { Workspace } = require('../out/server/workspace');
const { Features, tokenTypes } = require('../out/server/features');
const { TextDocument } = require('vscode-languageserver-textdocument');

function context(source) {
    const uri = 'untitled:features.p4';
    const workspace = new Workspace();
    workspace.update(uri, source, 1);
    return { workspace, uri, features: new Features(workspace),
        position: (text, add = 0) => TextDocument.create(uri, 'p4', 1, source).positionAt(source.lastIndexOf(text) + add) };
}

test('completion recovers a trailing dot and replaces a partially typed member', async () => {
    for (const suffix of ['h.', 'h.fi']) {
        const source = `header H { bit<8> field; } control C(inout H h) { apply { ${suffix} } }`;
        const { workspace, uri, features, position } = context(source);
        try {
            const items = await features.completion(uri, position(suffix, suffix.length));
            assert.ok(items.some(item => item.label === 'field'));
            assert.ok(items.some(item => item.label === 'isValid'));
            assert.ok(!items.some(item => item.label === 'control'));
            assert.equal(items.find(item => item.label === 'field').textEdit.range.start.character, source.indexOf(suffix) + 2);
        } finally { workspace.dispose(); }
    }
});

test('completion omits comments and inactive branches', async () => {
    const source = 'header H {}\n#if 0\nH hidden;\n#endif\n// H comment\ncontrol C() { apply { } }';
    const { workspace, uri, features, position } = context(source);
    try {
        assert.deepEqual(await features.completion(uri, position('comment', 4)), []);
        assert.deepEqual(await features.completion(uri, position('hidden', 4)), []);
        assert.ok(!(await features.completion(uri, position('apply {', 7))).some(item => item.label === 'hidden'));
    } finally { workspace.dispose(); }
});

test('hover, type definitions, signatures, symbols, folding and semantic tokens agree', async () => {
    const source = '/// Packet header\nheader H { bit<8> field; }\nbit<8> sum(in bit<8> a, in bit<8> b) { return a + b; }\ncontrol C(inout H h) {\n apply { h.field = sum(1, 2); }\n}';
    const { workspace, uri, features, position } = context(source);
    try {
        assert.equal((await features.definition(uri, position('h.field', 3)))[0].range.start.line, 1);
        assert.equal((await features.definition(uri, position('h.field'), true))[0].range.start.line, 1);
        assert.match((await features.hover(uri, position('H h'))).contents.value, /Packet header/);
        const signature = await features.signatureHelp(uri, position('sum(1, ', 7));
        assert.equal(signature.activeParameter, 1);
        assert.equal(signature.signatures[0].parameters.length, 2);
        const symbols = await features.documentSymbols(uri);
        assert.equal(symbols.find(symbol => symbol.name === 'H').children[0].name, 'field');
        assert.ok((await features.foldingRanges(uri)).length > 0);
        const tokens = await features.semanticTokens(uri);
        assert.equal(tokens.data.length % 5, 0);
        assert.ok(tokens.data.some((value, index) => index % 5 === 3 && value === tokenTypes.indexOf('property')));
    } finally { workspace.dispose(); }
});

test('rename preserves shadowed names and refuses capture, keywords, builtins and overloads', async () => {
    const source = 'control C(in bit<8> x) { apply { bit<8> taken; { bit<8> x; x = 1; } x = 2; } }';
    const { workspace, uri, features, position } = context(source);
    try {
        const edits = (await features.rename(uri, position('x = 2'), 'renamed')).documentChanges[0];
        assert.equal(edits.textDocument.version, 1);
        assert.equal(edits.edits.length, 2);
        await assert.rejects(features.rename(uri, position('x = 2'), 'taken'), /another scope/);
        await assert.rejects(features.rename(uri, position('x = 2'), 'control'), /reserved keyword/);
        await assert.rejects(features.rename(uri, position('x = 2'), 'bad-name'), /P4 identifier/);
        const overloaded = 'extern void f(); extern void f(in bit<8> a); control C() { apply { f(); } }';
        workspace.update(uri, overloaded, 2);
        await assert.rejects(features.prepareRename(uri, { line: 0, character: overloaded.lastIndexOf('f();') }), /overloaded/);
    } finally { workspace.dispose(); }
});

test('references and rename find consumers outside the current include graph', async () => {
    const dir = await fs.mkdtemp(path.join(os.tmpdir(), 'p4-features-'));
    const workspace = new Workspace([URI.file(dir).toString()]);
    const features = new Features(workspace);
    const header = URI.file(path.join(dir, 'shared.p4')).toString();
    try {
        await fs.writeFile(path.join(dir, 'shared.p4'), 'header H { bit<8> field; }');
        for (const name of ['a', 'b']) {
            await fs.writeFile(path.join(dir, `${name}.p4`), `#include "shared.p4"\ncontrol ${name}(inout H h) { apply { h.field = 1; } }`);
        }
        const refs = await features.references(header, { line: 0, character: 19 }, true);
        assert.equal(refs.length, 3);
        const rename = await features.rename(header, { line: 0, character: 19 }, 'newField');
        assert.equal(rename.documentChanges.length, 3);
        assert.ok(rename.documentChanges.every(change => change.textDocument.version === null));
        assert.equal((await features.workspaceSymbols('field')).length, 1);
        const included = await features.definition(URI.file(path.join(dir, 'a.p4')).toString(), { line: 0, character: 14 });
        assert.equal(included[0].uri, header);
    } finally { workspace.dispose(); await fs.rm(dir, { recursive: true, force: true }); }
});

test('bundled standard headers parse and provide packet and architecture definitions', async () => {
    for (const name of ['core', 'v1model', 'psa', 'pna']) {
        const { workspace, uri, features } = context(`#include <core.p4>\n#include <${name}.p4>\nparser P(packet_in packet) { state start { transition accept; } }`);
        try {
            await workspace.get(uri);
            assert.deepEqual([...workspace.diagnostics(uri).values()].flat(), [], name);
            const items = await features.completion(uri, { line: 2, character: 61 });
            assert.ok(items.some(item => item.label === 'packet_in'), name);
            assert.equal((await features.definition(uri, { line: 2, character: 12 }))[0].uri, URI.file(path.resolve('p4include/core.p4')).toString());
        } finally { workspace.dispose(); }
    }
});
