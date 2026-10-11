const { test } = require('node:test');
const assert = require('node:assert/strict');
const fs = require('node:fs/promises');
const path = require('node:path');
const os = require('node:os');
const { URI } = require('vscode-uri');
const { Workspace } = require('../out/server/workspace');
const { Features } = require('../out/server/features');

test('named arguments and struct initializers resolve their declared names, while annotations do not', async () => {
    const uri = 'untitled:named.p4';
    const source = 'struct S { bit<8> field; }\nbit<8> f(in bit<8> value) { return value; }\n@value control C(in bit<8> value) { apply { S s = S { field = 1 }; value = f(value = 1); } }';
    const workspace = new Workspace();
    try {
        workspace.update(uri, source, 1);
        const unit = await workspace.get(uri);
        assert.deepEqual(workspace.diagnostics(uri).get(uri), []);
        assert.equal(unit.symbolAt(uri, source.lastIndexOf('field')).start, source.indexOf('field'));
        assert.equal(unit.symbolAt(uri, source.lastIndexOf('value = 1')).start, source.indexOf('value'));
        assert.equal(unit.symbolAt(uri, source.indexOf('@value') + 1), undefined);
        assert.equal(unit.references(unit.symbolAt(uri, source.indexOf('value'))).length, 3);
    } finally { workspace.dispose(); }
});

test('extended error and match_kind members resolve alongside core declarations', async () => {
    const uri = 'untitled:errors.p4';
    const source = '#include <core.p4>\nerror { Custom }\nmatch_kind { custom }\ncontrol C() { table t { key = { 1: exact; 2: custom; } } apply { error e = error.NoError; e = error.Custom; } }';
    const workspace = new Workspace();
    try {
        workspace.update(uri, source, 1);
        const unit = await workspace.get(uri);
        assert.deepEqual([...workspace.diagnostics(uri).values()].flat(), []);
        assert.equal(unit.symbolAt(uri, source.indexOf('exact;')).name, 'exact');
        assert.equal(unit.symbolAt(uri, source.lastIndexOf('custom;')).start, source.indexOf('custom'));
        assert.equal(unit.symbolAt(uri, source.lastIndexOf('Custom')).start, source.indexOf('Custom'));
        assert.equal(unit.symbolAt(uri, source.lastIndexOf('NoError')).name, 'NoError');
    } finally { workspace.dispose(); }
});

test('for-loop variables have loop scope and resolve in their bodies', async () => {
    const uri = 'untitled:loops.p4';
    const source = 'control C() { apply { for (bit<8> i = 0; i < 4; i = i + 1) { bit<8> x = i; } bit<8> after = i; } }';
    const workspace = new Workspace();
    try {
        workspace.update(uri, source, 1);
        const unit = await workspace.get(uri);
        assert.deepEqual(workspace.diagnostics(uri).get(uri), []);
        assert.equal(unit.symbolAt(uri, source.indexOf('i <')).start, source.indexOf('i ='));
        assert.equal(unit.symbolAt(uri, source.lastIndexOf('i;')), undefined);
    } finally { workspace.dispose(); }
});

test('workspace references survive eviction of idle parser caches', async () => {
    const dir = await fs.mkdtemp(path.join(os.tmpdir(), 'p4-cache-'));
    const workspace = new Workspace([URI.file(dir).toString()]);
    const header = URI.file(path.join(dir, 'header.p4')).toString();
    try {
        await fs.writeFile(path.join(dir, 'header.p4'), 'header H { bit<8> value; }');
        for (let index = 0; index < 40; index++) { await fs.writeFile(path.join(dir, `${index}.p4`), '#include "header.p4"\ncontrol C(inout H h) { apply { h.value = 1; } }'); }
        const features = new Features(workspace);
        assert.equal((await features.references(header, { line: 0, character: 18 }, true)).length, 41);
        assert.equal((await features.rename(header, { line: 0, character: 18 }, 'changed')).documentChanges.length, 41);
        assert.ok(workspace.cache.size <= 32);
    } finally { workspace.dispose(); await fs.rm(dir, { recursive: true, force: true }); }
});

test('active pragma once prevents cycles, while inactive pragma once does not hide a cycle', async () => {
    const dir = await fs.mkdtemp(path.join(os.tmpdir(), 'p4-once-'));
    const uri = URI.file(path.join(dir, 'main.p4')).toString();
    const workspace = new Workspace([URI.file(dir).toString()]);
    try {
        await fs.writeFile(path.join(dir, 'a.p4'), '#pragma once\n#include "a.p4"\nheader H {}');
        workspace.update(uri, '#include "a.p4"', 1);
        await workspace.get(uri);
        assert.deepEqual([...workspace.diagnostics(uri).values()].flat(), []);
        await fs.writeFile(path.join(dir, 'a.p4'), '#if 0\n#pragma once\n#endif\n#include "a.p4"');
        workspace.invalidate();
        await workspace.get(uri);
        assert.match([...workspace.diagnostics(uri).values()].flat()[0].message, /Cyclic include/);
    } finally { workspace.dispose(); await fs.rm(dir, { recursive: true, force: true }); }
});
