<!--
SPDX-FileCopyrightText: 2026 Zhanghan Wang
SPDX-License-Identifier: Apache-2.0
-->

# Project guidance

This repository provides P4_16 editing support through a Tree-sitter WASM parser
and a language server. The refactor is an experimental, vibe-coded project
developed with substantial AI assistance. Keep its limitations visible in the
README and verify behavior before making claims about language support.

## Architecture

- `src/main.ts`: VS Code language client, server startup, and file watching.
- `src/server/server.ts`: LSP capabilities, requests, configuration, and document lifecycle.
- `src/server/parser.ts`: Tree-sitter initialization, WASM loading, and incremental parsing.
- `src/server/preprocessor.ts`: Conditional branches, macros, and include directives.
- `src/server/model.ts`: Symbols, lexical scopes, declared types, and name resolution.
- `src/server/workspace.ts`: Unsaved document overlays, include resolution, diagnostics, and caches.
- `src/server/features.ts`: Completion, navigation, rename, highlighting, and other editor features.
- `grammar/grammar.js` and `assets/tree-sitter-p4.wasm`: Parser source and checked-in generated WASM.
- `p4include/`: Pinned fallback architecture headers; `docs/`: P4_16 specifications.
- `examples/`: Example programs and header fixtures, including unchanged upstream tutorial solutions.
- `test/`: Parser, preprocessing, semantic, workspace, provenance, and LSP protocol tests.

All files under `src/server/` are active implementation code. Builds bundle the
client and server into `dist/main.js` and `dist/server.js`; TypeScript compilation
also produces `out/` for test imports. Generated `dist/`, `out/`, and `grammar/src/`
are ignored by Git.

## Implementation expectations

- Keep VS Code integration in the client and language analysis in the server.
- Preserve original file URIs and UTF-16 source positions, including after
  preprocessing and incremental edits. Navigation into includes must target
  the original source file.
- Respect lexical shadowing, active conditional branches, unsaved includes,
  and per-resource configuration. Invalidate affected analysis when inputs change.
- Keep rename edits safe: reject ambiguous symbols, known capture or collisions,
  and changes to bundled library symbols. Do not silently return partial results.
- Recover useful editor information from incomplete code. Respect request
  cancellation and dispose parser trees and workspace resources.
- Diagnostics currently cover parsing, includes, and preprocessing. The semantic
  model does not implement the full P4 compiler type system; use `p4c` for compiler
  validation. Macros are not expanded in P4 program tokens.
- Substantial refactors are welcome when they improve clarity or correctness.
  Remove obsolete files and update their references when replacing them.

## Development and validation

Use Node.js 22.17 or newer and install dependencies with `npm ci`.

- `npm run check-types`: TypeScript validation.
- `npm run lint`: Lint source, scripts, and tests.
- `npm test`: Build bundles, compile test imports, and run all tests. Protocol
  tests require working child-process stdin/stdout pipes.
- `npm run package -- --out /tmp/p4-lang-1.0.0.vsix`: Build a local installable VSIX.
- `npm run gen:parser`: Regenerate the parser after grammar changes. Commit the
  resulting `assets/tree-sitter-p4.wasm` with its grammar changes, then run tests.

Add regression tests for behavior changes, especially resolution, preprocessing,
source ranges, and protocol behavior. Documentation-only changes need content
and diff checks; rebuilding a VSIX also verifies packaged documentation when relevant.
Never modify upstream examples merely to make parser tests pass.

## Documentation, versions, and licensing

- Keep the README's workflow, diagrams, configuration, and limitations aligned
  with the implementation. The last pre-refactor extension version is `0.0.14`.
- For extension releases, synchronize `package.json`, both root version fields
  in `package-lock.json`, the LSP `serverInfo.version`, the README, and the changelog.
  The grammar's metadata version is separate.
- Add SPDX copyright attribution for Zhanghan Wang and Apache-2.0 declarations
  at the top of new project-owned files. For strict JSON or binary assets, use
  an adjacent `.license` file rather than invalid comments.
- Preserve upstream copyright notices and licenses. The adapted grammar retains
  MPL-2.0 and its original attribution. Imported tutorial sources and standard
  headers retain their upstream notices; do not add project ownership to them.
- Record pinned source revisions, original paths or URLs, and SHA-256 checksums
  when importing or updating upstream assets. Include applicable upstream licenses.
- Keep license prose in the README brief; retain the license badge and links.

## Git workflow

Create local commits at meaningful checkpoints. Do not push or publish unless
the user explicitly requests it. Amend a commit only when requested, and
preserve unrelated user changes. Keep generated bundles and VSIX files out of Git.
