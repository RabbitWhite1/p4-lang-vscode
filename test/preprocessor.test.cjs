// SPDX-FileCopyrightText: 2026 Zhanghan Wang
// SPDX-License-Identifier: Apache-2.0

const { test } = require('node:test');
const assert = require('node:assert/strict');
const { preprocess, evaluateCondition } = require('../out/server/preprocessor');

test('condition macros preserve textual precedence and logical short-circuiting', () => {
    const macros = new Map([
        ['X', { name: 'X', value: '1 + 2', uri: '', start: 0, end: 0 }],
        ['EMPTY', { name: 'EMPTY', value: '', uri: '', start: 0, end: 0 }]
    ]);
    assert.equal(evaluateCondition('X * 3 == 7', macros), 1);
    assert.equal(evaluateCondition('defined(X) && !defined(MISSING)', macros), 1);
    assert.equal(evaluateCondition('0 && (1 / 0)', macros), 0);
    assert.equal(evaluateCondition('1 || (1 / 0)', macros), 1);
    assert.equal(evaluateCondition('010 == 8', macros), 1);
    assert.throws(() => evaluateCondition('EMPTY', macros), /Incomplete/);
});
const macro = (name, value) => ({ name, value, uri: '', start: 0, end: 0 });

test('conditional branches preserve source positions and nested selection', async () => {
    const source = '#define FLAG 1\r\n#if defined(FLAG) && FLAG == 1\r\nheader Good {}\r\n#if 0\r\ninvalid !\r\n#endif\r\n#else\r\nheader Bad {}\r\n#endif\r\n';
    const result = await preprocess('file:///test.p4', source, new Map());
    assert.equal(result.text.length, source.length);
    assert.equal(result.text.indexOf('Good'), source.indexOf('Good'));
    assert.equal(result.text.includes('Bad'), false);
    assert.equal(result.text.includes('invalid'), false);
    assert.deepEqual(result.issues, []);
});

test('includes change definitions before subsequent conditionals', async () => {
    const environment = new Map();
    const source = '#include "config.p4"\n#if ENABLED\nheader Good {}\n#else\nheader Bad {}\n#endif\n';
    const result = await preprocess('file:///test.p4', source, environment, async include => {
        assert.equal(include.name, 'config.p4');
        await preprocess('file:///config.p4', '#define ENABLED 1\n', environment);
    });
    assert.ok(result.text.includes('Good'));
    assert.ok(!result.text.includes('Bad'));
});

test('directives in comments and inactive includes do not affect the environment', async () => {
    let includes = 0;
    const environment = new Map();
    const result = await preprocess('', '/*\n#define FALSE 1\n*/\n#if 0\n#include "missing.p4"\n#endif\n', environment, async () => { includes++; });
    assert.equal(environment.has('FALSE'), false);
    assert.equal(includes, 0);
    assert.deepEqual(result.issues, []);
});

test('line continuations and undef participate in branch selection', async () => {
    const environment = new Map();
    const result = await preprocess('', '#define FLAG \\\n (1 + 2)\n#if FLAG == 3\nheader H {}\n#endif\n#undef FLAG\n#ifdef FLAG\ninvalid\n#endif\n', environment);
    assert.ok(result.text.includes('header H'));
    assert.ok(!result.text.includes('invalid'));
    assert.equal(environment.has('FLAG'), false);
});

test('expression evaluator follows precedence and rejects executable source', () => {
    const environment = new Map([['VALUE', macro('VALUE', '4')]]);
    assert.equal(evaluateCondition('defined VALUE && (VALUE << 1) == 8', environment), 1);
    assert.equal(evaluateCondition('1 + 2 * 3', environment), 7);
    assert.throws(() => evaluateCondition('process.exit()', environment));
    environment.set('LOOP', macro('LOOP', 'LOOP'));
    assert.throws(() => evaluateCondition('LOOP', environment), /Recursive/);
});

test('unbalanced directives and unsupported conditions produce diagnostics', async () => {
    const result = await preprocess('', '#else\n#if fn(1)\n', new Map());
    assert.equal(result.issues.length, 3);
});
