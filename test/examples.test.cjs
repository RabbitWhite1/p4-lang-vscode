// SPDX-FileCopyrightText: 2026 Zhanghan Wang
// SPDX-License-Identifier: Apache-2.0

const { test } = require('node:test');
const assert = require('node:assert/strict');
const fs = require('node:fs');
const path = require('node:path');
const { createHash } = require('node:crypto');
const { URI } = require('vscode-uri');
const { Workspace } = require('../out/server/workspace');

const directory = path.resolve('examples/tutorials');
const manifest = JSON.parse(fs.readFileSync(path.join(directory, 'sources.json'), 'utf8'));

test('upstream examples and their license match the pinned source checksums', () => {
    for (const entry of manifest.files) {
        const content = fs.readFileSync(path.join(directory, entry.file));
        assert.equal(createHash('sha256').update(content).digest('hex'), entry.sha256, entry.file);
        assert.equal(entry.url, `https://raw.githubusercontent.com/p4lang/tutorials/${manifest.revision}/${entry.upstreamPath}`);
        if (entry.file.endsWith('.p4')) {
            assert.match(content.toString(), /^\/\/ SPDX-FileCopyrightText: .+\n\/\/ SPDX-License-Identifier: Apache-2\.0\n/);
            assert.doesNotMatch(content.toString(), /Zhanghan Wang/);
        }
    }
});

test('official tutorial solutions analyze with the bundled standard headers', async () => {
    const workspace = new Workspace([URI.file(directory).toString()]);
    try {
        for (const entry of manifest.files.filter(entry => entry.file.endsWith('.p4'))) {
            const uri = URI.file(path.join(directory, entry.file)).toString();
            const unit = await workspace.get(uri);
            assert.deepEqual([...workspace.diagnostics(uri).values()].flat(), [], entry.file);
            assert.ok(unit.visible(uri, 0).some(symbol => symbol.name === 'packet_in'), entry.file);
            assert.ok(unit.visible(uri, 0).some(symbol => symbol.name === 'V1Switch'), entry.file);
        }
    } finally { workspace.dispose(); }
});
