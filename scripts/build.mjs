// SPDX-FileCopyrightText: 2026 Zhanghan Wang
// SPDX-License-Identifier: Apache-2.0

import * as esbuild from 'esbuild';
import { mkdir, copyFile, readFile, readdir, writeFile } from 'node:fs/promises';
import { createRequire } from 'node:module';
import { dirname, join } from 'node:path';
const require = createRequire(import.meta.url);
async function writeLicenses(metafile) {
    const packages = new Set();
    for (const filename of Object.keys(metafile.inputs)) {
        const marker = filename.lastIndexOf('node_modules/');
        if (marker < 0) { continue; }
        const parts = filename.slice(marker + 13).split('/');
        packages.add(filename.slice(0, marker + 13) + parts.slice(0, parts[0].startsWith('@') ? 2 : 1).join('/'));
    }
    const sections = ['Third-party licenses for bundled JavaScript and the Tree-sitter runtime.\nThe P4 parser grammar is licensed separately under grammar/LICENSE.\nThe P4 standard headers are licensed under p4include/LICENSE.'];
    for (const directory of [...packages].sort()) {
        const manifest = JSON.parse(await readFile(join(directory, 'package.json'), 'utf8'));
        const license = (await readdir(directory)).find(name => /^licen[cs]e(?:\..+)?$/i.test(name));
        if (!license) { throw new Error(`Missing distribution license for ${manifest.name}`); }
        sections.push(`${manifest.name} ${manifest.version}\n${await readFile(join(directory, license), 'utf8')}`);
    }
    await writeFile('dist/THIRD_PARTY_LICENSES.txt', sections.join('\n\n' + '='.repeat(72) + '\n\n') + '\n');
}
await mkdir('dist', { recursive: true });
await copyFile(join(dirname(require.resolve('web-tree-sitter')), 'web-tree-sitter.wasm'), 'dist/web-tree-sitter.wasm');
const options = {
    entryPoints: { main: 'src/main.ts', server: 'src/server/server.ts' },
    bundle: true, platform: 'node', format: 'cjs', target: 'node20', metafile: true,
    outdir: 'dist', external: ['vscode', 'web-tree-sitter/web-tree-sitter.wasm'], sourcemap: true, logLevel: 'info',
    plugins: [{ name: 'tree-sitter-cjs', setup(build) {
        // The ESM binding uses import.meta.url; the server runs as CommonJS.
        build.onResolve({ filter: /^web-tree-sitter$/ }, () => ({ path: require.resolve('web-tree-sitter') }));
        build.onEnd(async result => { if (result.metafile && result.errors.length === 0) { await writeLicenses(result.metafile); } });
    } }]
};
if (process.argv.includes('--watch')) {
    const context = await esbuild.context(options);
    await context.watch();
} else {
    await esbuild.build(options);
}
