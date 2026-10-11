<!--
SPDX-FileCopyrightText: 2026 Zhanghan Wang
SPDX-License-Identifier: Apache-2.0
-->

# Change Log

## 1.0.0

- Replace the ANTLR implementation with a Tree-sitter WASM parser and a P4_16 language server. Require VS Code 1.96 or newer.
- Add completion, definition and type navigation, hover documentation, signature help, references, rename, document and workspace symbols, folding, and semantic highlighting.
- Resolve lexical scopes, declared types, generic type arguments, aliases, parser states, header stacks, and common built-in members. Rename respects shadowing and checks known name collisions.
- Support incremental parsing, unsaved documents and includes, conditional preprocessing, include guards, active `#pragma once`, and resource-specific include paths and definitions. Publish syntax, include, and preprocessor diagnostics; use `p4c` for full compiler validation.
- Bundle pinned standard P4 headers and both Tree-sitter WASM assets, with no native addon or runtime package download required.
- Refresh the README with the analysis workflow and semantic diagrams, add current P4_16 specifications, rename `sample/` to `examples/`, and import 12 official P4 tutorial solutions with their upstream licenses and attribution preserved.
- Add parser, preprocessing, semantic, workspace, example-integrity, and LSP integration tests.
- Document the experimental, vibe-coded status of the refactor and add contributor guidance in `AGENTS.md`.

## Earlier versions

- 0.0.14: better `typeRef` support
- 0.0.13: fix auto closing
- 0.0.12: support `annotation`, `type`
- 0.0.11: support `visitRealTypeArg`
- 0.0.10: fix `numeric` again
- 0.0.9: fix `numerics`
- 0.0.8: support `package`, better support for `methodCall`
- 0.0.7: support `extern`
- 0.0.6: support `action`, `lvalue` and so on.
- 0.0.4: add corresponding node_modules
- 0.0.3: support some basic semantic highlight
