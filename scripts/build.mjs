import * as esbuild from 'esbuild';
import { mkdir, copyFile } from 'node:fs/promises';
import { createRequire } from 'node:module';
import { dirname, join } from 'node:path';
const require = createRequire(import.meta.url);
await mkdir('dist', { recursive: true });
await copyFile(join(dirname(require.resolve('web-tree-sitter')), 'web-tree-sitter.wasm'), 'dist/web-tree-sitter.wasm');
const options = {
    entryPoints: { main: 'src/main.ts', server: 'src/server/server.ts' },
    bundle: true, platform: 'node', format: 'cjs', target: 'node20',
    outdir: 'dist', external: ['vscode', 'web-tree-sitter/web-tree-sitter.wasm'], sourcemap: true, logLevel: 'info',
    plugins: [{ name: 'tree-sitter-cjs', setup(build) {
        // The ESM binding uses import.meta.url; the server runs as CommonJS.
        build.onResolve({ filter: /^web-tree-sitter$/ }, () => ({ path: require.resolve('web-tree-sitter') }));
    } }]
};
if (process.argv.includes('--watch')) {
    const context = await esbuild.context(options);
    await context.watch();
} else {
    await esbuild.build(options);
}
