export interface Macro {
    name: string;
    value: string;
    uri: string;
    start: number;
    end: number;
    parameters?: string[];
}
export interface PreprocessorIssue { start: number; end: number; message: string; }
export interface Include { name: string; quoted: boolean; start: number; end: number; }
export interface Preprocessed {
    text: string;
    macros: Macro[];
    includes: Include[];
    issues: PreprocessorIssue[];
}

/** Removes comments without moving positions; strings remain intact. */
export function stripComments(text: string): string {
    return text.replace(/"(?:\\.|[^"\\])*"|\/\/[^\r\n]*|\/\*[\s\S]*?\*\//g,
        token => token.startsWith('/') ? blank(token) : token);
}
function blank(text: string): string { return text.replace(/[^\r\n]/g, ' '); }

const precedence: Record<string, number> = {
    '||': 1, '&&': 2, '|': 3, '^': 4, '&': 5, '==': 6, '!=': 6,
    '<': 7, '<=': 7, '>': 7, '>=': 7, '<<': 8, '>>': 8,
    '+': 9, '-': 9, '*': 10, '/': 10, '%': 10
};

/** A bounded evaluator for #if expressions. Never executes source as JS. */
export function evaluateCondition(expression: string, macros: Map<string, Macro>, seen = new Set<string>()): number {
    const tokens = expression.match(/defined|[A-Za-z_][A-Za-z0-9_]*|0[xX][0-9a-fA-F]+[uUlL]*|[0-9]+[uUlL]*|\|\||&&|==|!=|<=|>=|<<|>>|[()!~+*/%<>&^|?:-]/g) ?? [];
    if (tokens.join('') !== expression.replace(/\s/g, '')) { throw new Error('Unsupported preprocessor expression'); }
    let index = 0;
    const primary = (): number => {
        const token = tokens[index++];
        if (!token) { throw new Error('Incomplete preprocessor expression'); }
        if (token === '(') {
            const value = parse(0);
            if (tokens[index++] !== ')') { throw new Error('Unclosed preprocessor expression'); }
            return value;
        }
        if (token === 'defined') {
            const parentheses = tokens[index] === '(';
            if (parentheses) { index++; }
            const name = tokens[index++];
            if (!name || !/^[A-Za-z_]\w*$/.test(name)) { throw new Error('Expected macro name after defined'); }
            if (parentheses && tokens[index++] !== ')') { throw new Error('Unclosed defined expression'); }
            return Number(macros.has(name));
        }
        if (['!', '~', '+', '-'].includes(token)) {
            const value = primary();
            return token === '!' ? Number(!value) : token === '~' ? ~value : token === '-' ? -value : value;
        }
        if (/^[0-9]/.test(token)) { return Number(token.replace(/[uUlL]+$/, '')); }
        if (/^[A-Za-z_]\w*$/.test(token)) {
            const macro = macros.get(token);
            if (!macro) { return 0; }
            if (macro.parameters) { throw new Error('Function macros in #if require a full preprocessor'); }
            if (seen.has(token) || seen.size >= 32) { throw new Error('Recursive preprocessor definition'); }
            return evaluateCondition(macro.value || '1', macros, new Set([...seen, token]));
        }
        throw new Error(`Unexpected preprocessor token ${token}`);
    };
    const parse = (minimum: number): number => {
        let left = primary();
        while (index < tokens.length && (precedence[tokens[index]] ?? -1) >= minimum) {
            const operator = tokens[index++];
            const right = parse(precedence[operator] + 1);
            switch (operator) {
                case '||': left = Number(Boolean(left || right)); break;
                case '&&': left = Number(Boolean(left && right)); break;
                case '|': left |= right; break;
                case '^': left ^= right; break;
                case '&': left &= right; break;
                case '==': left = Number(left === right); break;
                case '!=': left = Number(left !== right); break;
                case '<': left = Number(left < right); break;
                case '<=': left = Number(left <= right); break;
                case '>': left = Number(left > right); break;
                case '>=': left = Number(left >= right); break;
                case '<<': left <<= right; break;
                case '>>': left >>= right; break;
                case '+': left += right; break;
                case '-': left -= right; break;
                case '*': left *= right; break;
                case '/': if (!right) { throw new Error('Division by zero in #if'); } left = Math.trunc(left / right); break;
                case '%': if (!right) { throw new Error('Division by zero in #if'); } left %= right; break;
            }
        }
        return left;
    };
    const value = parse(0);
    if (index !== tokens.length) { throw new Error('Unsupported preprocessor expression'); }
    return value;
}

/** Select active branches and follow includes in source order, preserving offsets. */
export async function preprocess(uri: string, source: string, environment: Map<string, Macro>,
    includeFile?: (include: Include) => Promise<void>): Promise<Preprocessed> {
    const clean = stripComments(source);
    const chunks: string[] = [];
    const macros: Macro[] = [];
    const includes: Include[] = [];
    const issues: PreprocessorIssue[] = [];
    const stack: { parent: boolean; active: boolean; taken: boolean; otherwise: boolean; start: number }[] = [];
    let active = true;
    const lines = source.match(/[^\r\n]*(?:\r\n|\n|\r|$)/g)?.filter(Boolean) ?? [];
    let offset = 0;
    for (let line = 0; line < lines.length; line++) {
        let raw = lines[line];
        let cleaned = clean.slice(offset, offset + raw.length);
        const start = offset;
        if (/^\s*#/.test(cleaned)) {
            while (/\\(?:\r\n|\n|\r)$/.test(raw) && line + 1 < lines.length) {
                raw += lines[++line];
                cleaned = clean.slice(offset, offset + raw.length);
            }
            const directive = /^\s*#\s*(\w+)\s*([\s\S]*)/.exec(cleaned.replace(/\\\r?\n/g, ' '));
            const command = directive?.[1] ?? '';
            const body = directive?.[2].trim() ?? '';
            const issue = (message: string) => issues.push({ start, end: start + raw.trimEnd().length, message });
            const condition = () => {
                try { return Boolean(evaluateCondition(body, environment)); }
                catch (error) { issue(error instanceof Error ? error.message : String(error)); return false; }
            };
            if (['if', 'ifdef', 'ifndef'].includes(command)) {
                const selected: boolean = active && (command === 'if' ? condition() : command === 'ifdef' ? environment.has(body) : !environment.has(body));
                stack.push({ parent: active, active: selected, taken: selected, otherwise: false, start });
                active = selected;
            } else if (command === 'elif' || command === 'else') {
                const branch = stack.at(-1);
                if (!branch || branch.otherwise) { issue(`Unexpected #${command}`); }
                else {
                    branch.active = branch.parent && !branch.taken && (command === 'else' || condition());
                    branch.taken ||= branch.active;
                    branch.otherwise = command === 'else';
                    active = branch.active;
                }
            } else if (command === 'endif') {
                const branch = stack.pop();
                if (!branch) { issue('Unexpected #endif'); }
                else { active = branch.parent; }
            } else if (active && command === 'define') {
                const match = /^([A-Za-z_]\w*)(\(([^)]*)\))?\s*([\s\S]*)$/.exec(body);
                if (match) {
                    const nameStart = cleaned.indexOf(match[1], cleaned.indexOf('define') + 6);
                    const macro: Macro = { name: match[1], value: match[4].trim(), uri,
                        start: start + nameStart, end: start + nameStart + match[1].length,
                        parameters: match[2] ? match[3].split(',').map(name => name.trim()).filter(Boolean) : undefined };
                    environment.set(macro.name, macro);
                    macros.push(macro);
                } else { issue('Invalid #define'); }
            } else if (active && command === 'undef') { environment.delete(body); }
            else if (active && command === 'include') {
                const match = /^(["<])([^">]+)[">]\s*$/.exec(body);
                if (match) {
                    const nameStart = cleaned.indexOf(match[2], cleaned.indexOf('include') + 7);
                    const include: Include = { name: match[2], quoted: match[1] === '"', start: start + nameStart, end: start + nameStart + match[2].length };
                    includes.push(include);
                    await includeFile?.(include);
                } else { issue('Include must use a quoted path or an angle-bracket path'); }
            } else if (active && command === 'error') { issue(`#error ${body}`); }
            chunks.push(blank(raw));
        } else { chunks.push(active ? raw : blank(raw)); }
        offset += raw.length;
    }
    for (const branch of stack) { issues.push({ start: branch.start, end: branch.start + 1, message: 'Unterminated #if directive' }); }
    return { text: chunks.join(''), macros, includes, issues };
}
