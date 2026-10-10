import tseslint from 'typescript-eslint';
export default tseslint.config(
    { ignores: ['dist/**', 'out/**', 'grammar/**', 'src/grammar/**'] },
    ...tseslint.configs.recommended,
    { rules: { '@typescript-eslint/no-non-null-assertion': 'off' } },
    { files: ['**/*.cjs', '**/*.mjs'], rules: { '@typescript-eslint/no-require-imports': 'off' } }
);
