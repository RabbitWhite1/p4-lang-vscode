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
    outdir: 'dist', external: ['vscode'], sourcemap: true, logLevel: 'info'
};
if (process.argv.includes('--watch')) {
    const context = await esbuild.context(options);
    await context.watch();
} else {
    await esbuild.build(options);
}
