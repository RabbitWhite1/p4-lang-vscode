// SPDX-FileCopyrightText: 2026 Zhanghan Wang
// SPDX-License-Identifier: Apache-2.0

const { test } = require('node:test');
const assert = require('node:assert/strict');
const fs = require('node:fs/promises');
const os = require('node:os');
const path = require('node:path');
const { URI } = require('vscode-uri');
const { Workspace } = require('../out/server/workspace');

test('includes preserve definition locations and unsaved headers invalidate consumers', async () => {
    const dir = await fs.mkdtemp(path.join(os.tmpdir(), 'p4-workspace-'));
    const root = URI.file(dir).toString();
    const headerUri = URI.file(path.join(dir, 'types.p4')).toString();
    const mainUri = URI.file(path.join(dir, 'main.p4')).toString();
    const workspace = new Workspace([root]);
    try {
        await fs.writeFile(path.join(dir, 'types.p4'), '#ifndef TYPES\n#define TYPES\nheader H { bit<8> old; }\n#endif\n');
        const source = '#include "types.p4"\ncontrol C(inout H h) { apply { h.old = 1; } }';
        workspace.update(mainUri, source, 1);
        const before = await workspace.get(mainUri);
        assert.equal(before.symbolAt(mainUri, source.indexOf('old')).uri, headerUri);
        const tree = before.files.get(mainUri).file.tree;
        workspace.update(headerUri, 'header H { bit<8> newer; }', 1);
        const after = await workspace.get(mainUri);
        assert.equal(after.files.get(mainUri).file.tree, tree);
        assert.ok(after.membersForText(mainUri, source.indexOf('h.old'), 'h').some(member => member.name === 'newer'));
        assert.ok(!after.membersForText(mainUri, source.indexOf('h.old'), 'h').some(member => member.name === 'old'));
        workspace.close(headerUri);
        const restored = await workspace.get(mainUri);
        assert.ok(restored.membersForText(mainUri, source.indexOf('h.old'), 'h').some(member => member.name === 'old'));
    } finally { workspace.dispose(); await fs.rm(dir, { recursive: true, force: true }); }
});

test('missing includes are diagnosed, and newly created files are discovered', async () => {
    const dir = await fs.mkdtemp(path.join(os.tmpdir(), 'p4-missing-'));
    const uri = URI.file(path.join(dir, 'main.p4')).toString();
    const workspace = new Workspace([URI.file(dir).toString()]);
    try {
        workspace.update(uri, '#include "missing.p4"\nheader H {}', 1);
        await workspace.get(uri);
        assert.match(workspace.diagnostics(uri).get(uri)[0].message, /Cannot find include/);
        await fs.writeFile(path.join(dir, 'missing.p4'), 'header Included {}');
        workspace.invalidate(URI.file(path.join(dir, 'missing.p4')).toString());
        const unit = await workspace.get(uri);
        assert.ok(unit.visible(uri, 0).some(symbol => symbol.name === 'Included'));
        assert.deepEqual(workspace.diagnostics(uri).get(uri), []);
    } finally { workspace.dispose(); await fs.rm(dir, { recursive: true, force: true }); }
});

test('include guards stop recursive inclusion and defines remain translation-unit specific', async () => {
    const dir = await fs.mkdtemp(path.join(os.tmpdir(), 'p4-guards-'));
    const uri = URI.file(path.join(dir, 'main.p4')).toString();
    const workspace = new Workspace([URI.file(dir).toString()]);
    try {
        await fs.writeFile(path.join(dir, 'guarded.p4'), '#ifndef GUARD\n#define GUARD\n#include "guarded.p4"\n#ifdef FEATURE\nheader On {}\n#else\nheader Off {}\n#endif\n#endif\n');
        workspace.update(uri, '#include "guarded.p4"', 1);
        workspace.configure({ defines: { FEATURE: '1' } }, uri);
        const on = await workspace.get(uri);
        assert.ok(on.visible(uri, 0).some(symbol => symbol.name === 'On'));
        assert.ok(!on.visible(uri, 0).some(symbol => symbol.name === 'Off'));
        assert.ok([...workspace.diagnostics(uri).values()].every(issues => !issues.length));
        workspace.configure({ defines: {} }, uri);
        const off = await workspace.get(uri);
        assert.ok(off.visible(uri, 0).some(symbol => symbol.name === 'Off'));
    } finally { workspace.dispose(); await fs.rm(dir, { recursive: true, force: true }); }
});
