const { test } = require('node:test');
const assert = require('node:assert/strict');
const fs = require('node:fs');
const path = require('node:path');
const { ParsedFile, walk } = require('../out/server/parser');
const { preprocess } = require('../out/server/preprocessor');

test('Tree-sitter parses the bundled P4 architectures and calculator program', async () => {
    for (const name of fs.readdirSync('sample').filter(name => name.endsWith('.p4') && name !== 'testttt.p4')) {
        const source = fs.readFileSync(path.join('sample', name), 'utf8');
        const uri = `file:///sample/${name}`;
        const masked = await preprocess(uri, source, new Map());
        const file = await ParsedFile.create(uri, source, masked.text);
        try {
            const errors = [...walk(file.tree.rootNode)].filter(node => node.type === 'ERROR' || node.isMissing);
            assert.deepEqual(errors.map(node => `${node.type} ${node.startPosition.row + 1}: ${node.text.slice(0, 70)}`), [], name);
        } finally { file.dispose(); }
    }
});

test('incremental edits preserve UTF-16 positions, including emoji and CRLF', async () => {
    const before = '// 🦊\r\nheader Ethernet { bit<48> dst; }\r\n';
    const file = await ParsedFile.create('file:///unicode.p4', before);
    try {
        const after = before.replace('dst', 'destination');
        file.update(after);
        assert.equal(file.tree.rootNode.hasError, false);
        const node = [...walk(file.tree.rootNode)].find(node => node.type === 'identifier' && node.text === 'destination');
        assert.equal(node.startIndex, after.indexOf('destination'));
        assert.deepEqual(file.document.positionAt(node.startIndex), { line: 1, character: 26 });
        file.update('');
        assert.equal(file.tree.rootNode.endIndex, 0);
    } finally { file.dispose(); }
});

test('malformed code retains declarations for editor recovery', async () => {
    const file = await ParsedFile.create('file:///partial.p4', 'header Ethernet { bit<48> dst; }\ncontrol C(inout Ethernet h) { apply { h. } }');
    try {
        assert.equal(file.tree.rootNode.hasError, true);
        assert.ok([...walk(file.tree.rootNode)].some(node => node.type === 'aggregate_declaration'));
    } finally { file.dispose(); }
});
