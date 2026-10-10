const { test } = require('node:test');
const assert = require('node:assert/strict');
const { Workspace } = require('../out/server/workspace');

async function model(source) {
    const workspace = new Workspace();
    const uri = 'file:///model.p4';
    workspace.update(uri, source, 1);
    const unit = await workspace.get(uri);
    return { workspace, uri, unit };
}

test('member resolution connects nested fields to their original declarations', async () => {
    const source = 'header Ethernet { bit<48> dst; }\nstruct Headers { Ethernet ethernet; }\ncontrol C(inout Headers hdr) { apply { hdr.ethernet.dst = 1; } }';
    const { workspace, uri, unit } = await model(source);
    try {
        const field = unit.symbolAt(uri, source.lastIndexOf('dst'));
        assert.equal(field.name, 'dst');
        assert.equal(field.start, source.indexOf('dst'));
        assert.deepEqual(unit.membersForText(uri, source.length - 5, 'hdr.ethernet').map(member => member.name).slice(0, 4), ['dst', 'isValid', 'setValid', 'setInvalid']);
        assert.equal(unit.references(field).length, 2);
    } finally { workspace.dispose(); }
});

test('lexical scopes distinguish shadowed names and exclude later locals', async () => {
    const source = 'control C(in bit<8> x) { apply { bit<8> before; { bit<8> x; x = 1; } x = 2; bit<8> later; } }';
    const { workspace, uri, unit } = await model(source);
    try {
        const inner = unit.symbolAt(uri, source.indexOf('x = 1'));
        const outer = unit.symbolAt(uri, source.indexOf('x = 2'));
        assert.notEqual(inner.id, outer.id);
        assert.equal(outer.flavor, 'parameter');
        assert.ok(!unit.visible(uri, source.indexOf('x = 2')).some(symbol => symbol.name === 'later'));
        assert.equal(unit.references(inner).length, 2);
        assert.equal(unit.references(outer).length, 2);
    } finally { workspace.dispose(); }
});

test('typedefs, generic structs, stacks, and method return types provide members', async () => {
    const source = 'header H { bit<8> x; }\nstruct Box<T> { T value; }\ntypedef H Alias;\nextern Factory { H make(); }\ncontrol C(inout Box<H> b, inout Alias h, inout H[4] stack, Factory factory) { apply { b.value.x = h.x; stack[0].x = factory.make().x; } }';
    const { workspace, uri, unit } = await model(source);
    try {
        const offset = source.indexOf('b.value.x');
        assert.ok(unit.membersForText(uri, offset, 'b.value').some(symbol => symbol.name === 'x'));
        assert.ok(unit.membersForText(uri, offset, 'h').some(symbol => symbol.name === 'x'));
        assert.ok(unit.membersForText(uri, offset, 'stack.next').some(symbol => symbol.name === 'x'));
        assert.ok(unit.membersForText(uri, offset, 'factory.make()').some(symbol => symbol.name === 'x'));
        assert.equal(unit.symbolAt(uri, source.lastIndexOf('.x') + 1)?.name, 'x');
    } finally { workspace.dispose(); }
});

test('parser states and table apply results remain navigable', async () => {
    const source = 'parser P() { state start { transition done; } state done { transition accept; } }\ncontrol C() { action a() {} table t { actions = { a; } } apply { if (t.apply().hit) { a(); } } }';
    const { workspace, uri, unit } = await model(source);
    try {
        assert.equal(unit.symbolAt(uri, source.indexOf('done;')).flavor, 'state_declaration');
        assert.ok(unit.membersForText(uri, source.indexOf('t.apply()'), 't.apply()').some(symbol => symbol.name === 'hit'));
        assert.equal(unit.symbolAt(uri, source.lastIndexOf('a();')).flavor, 'action_declaration');
    } finally { workspace.dispose(); }
});
