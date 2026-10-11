// SPDX-FileCopyrightText: 2026 Zhanghan Wang
// SPDX-License-Identifier: Apache-2.0

import tseslint from 'typescript-eslint';
export default tseslint.config(
    { ignores: ['dist/**', 'out/**', 'grammar/**'] },
    ...tseslint.configs.recommended,
    { rules: { '@typescript-eslint/no-non-null-assertion': 'off' } },
    { files: ['**/*.cjs', '**/*.mjs'], rules: { '@typescript-eslint/no-require-imports': 'off' } }
);
