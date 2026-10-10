import { Node } from 'web-tree-sitter';
import { SymbolKind } from 'vscode-languageserver/node';
import { ParsedFile, walk } from './parser';
import { Macro, Preprocessed } from './preprocessor';

export interface TypeRef { name: string; arguments: TypeRef[]; stack?: boolean; }
export interface P4Symbol {
    id: string;
    name: string;
    kind: SymbolKind;
    uri: string;
    start: number;
    end: number;
    fullStart: number;
    fullEnd: number;
    scope: Scope;
    bodyScope?: Scope;
    type?: TypeRef;
    parameters: P4Symbol[];
    typeParameters: string[];
    detail: string;
    documentation: string;
    readonly?: boolean;
    flavor?: string;
}
export class Scope {
    readonly symbols: P4Symbol[] = [];
    readonly children: Scope[] = [];
    constructor(readonly uri: string, readonly start: number, readonly end: number,
        readonly parent?: Scope, readonly owner?: P4Symbol) {
        parent?.children.push(this);
    }
    at(offset: number): Scope {
        return this.children.find(child => child.start <= offset && offset <= child.end)?.at(offset) ?? this;
    }
}
export interface FileModel {
    file: ParsedFile;
    preprocessing: Preprocessed;
    root: Scope;
    symbols: P4Symbol[];
    declarations: Map<number, P4Symbol>;
    identifiers: Node[];
}

export function readType(node: Node | null): TypeRef | undefined {
    if (!node) { return undefined; }
    if (node.type === 'type_ref') {
        const value = readType(node.namedChildren[0]);
        if (value) { value.stack = node.children.some(child => child.type === '['); }
        return value;
    }
    if (node.type === 'named_type') {
        return { name: node.childForFieldName('name')?.text ?? '',
            arguments: node.namedChildren.find(child => child.type === 'type_arguments')?.namedChildren.map(child => readType(child)!).filter(Boolean) ?? [] };
    }
    if (node.type === 'tuple_type') {
        return { name: node.children[0].text, arguments: node.namedChildren[0]?.namedChildren.map(child => readType(child)!).filter(Boolean) ?? [] };
    }
    return { name: node.text.replace(/\s+/g, ''), arguments: [] };
}
export function typeText(type?: TypeRef): string {
    if (!type) { return ''; }
    const argumentsText = type.arguments.length ? `<${type.arguments.map(typeText).join(', ')}>` : '';
    return `${type.name}${argumentsText}${type.stack ? '[]' : ''}`;
}
export function substitute(type: TypeRef | undefined, bindings: Map<string, TypeRef>): TypeRef | undefined {
    if (!type) { return undefined; }
    const replacement = bindings.get(type.name);
    if (replacement) { return { ...replacement, stack: type.stack || replacement.stack }; }
    return { ...type, arguments: type.arguments.map(argument => substitute(argument, bindings)!) };
}

const kinds: Record<string, SymbolKind> = {
    aggregate_declaration: SymbolKind.Struct, enum_declaration: SymbolKind.Enum,
    typedef_declaration: SymbolKind.TypeParameter, extern_declaration: SymbolKind.Class,
    parser_declaration: SymbolKind.Class, control_declaration: SymbolKind.Class,
    package_declaration: SymbolKind.Class, action_declaration: SymbolKind.Function,
    function_declaration: SymbolKind.Function, extern_function_declaration: SymbolKind.Function,
    method_declaration: SymbolKind.Method, constructor_declaration: SymbolKind.Constructor,
    constant_declaration: SymbolKind.Constant, variable_declaration: SymbolKind.Variable,
    instantiation: SymbolKind.Variable, field_declaration: SymbolKind.Field,
    parameter: SymbolKind.Variable, type_parameter: SymbolKind.TypeParameter,
    enum_member: SymbolKind.EnumMember, table_declaration: SymbolKind.Object,
    table_property: SymbolKind.Property, state_declaration: SymbolKind.Event
};
const containers = new Set(['aggregate_declaration', 'enum_declaration', 'extern_declaration',
    'parser_declaration', 'control_declaration', 'package_declaration', 'action_declaration',
    'function_declaration', 'extern_function_declaration', 'method_declaration', 'constructor_declaration',
    'table_declaration', 'state_declaration', 'error_declaration', 'match_kind_declaration']);

function documentation(source: string, start: number): string {
    const before = source.slice(0, start).trimEnd();
    const block = /^\/\*\*?([\s\S]*?)\*\/$/.exec(before.slice(before.lastIndexOf('/*')));
    if (block) { return block[1].split('\n').map(line => line.replace(/^\s*\*? ?/, '')).join('\n').trim(); }
    const lines = before.split(/\r?\n/);
    const result: string[] = [];
    while (lines.length && /^\s*\/\/\//.test(lines.at(-1)!)) { result.unshift(lines.pop()!.replace(/^\s*\/\/\/ ?/, '')); }
    return result.join('\n');
}

export function extractModel(file: ParsedFile, preprocessing: Preprocessed): FileModel {
    const uri = file.document.uri;
    const root = new Scope(uri, 0, file.document.getText().length);
    const symbols: P4Symbol[] = [];
    const declarations = new Map<number, P4Symbol>();
    const visit = (node: Node, parent: Scope) => {
        let scope = parent;
        const prototype = node.namedChildren.find(child => child.type === 'function_prototype');
        const declaration = prototype ?? node;
        const name = declaration.childForFieldName('name');
        let symbol: P4Symbol | undefined;
        const pseudo = node.type === 'error_declaration' || node.type === 'match_kind_declaration';
        if (kinds[node.type] !== undefined && name && !name.isMissing || pseudo) {
            const start = name?.startIndex ?? node.children.find(child => child.type === (node.type === 'error_declaration' ? 'error' : 'match_kind'))!.startIndex;
            const symbolName = name?.text ?? (node.type === 'error_declaration' ? 'error' : 'match_kind');
            const paramsNode = declaration.childForFieldName('parameters');
            const signatureEnd = paramsNode?.endIndex ?? node.children.find(child => child.type === '{')?.startIndex ?? node.endIndex;
            symbol = { id: `${uri}:${start}`, name: symbolName, kind: pseudo ? SymbolKind.Enum : kinds[node.type],
                uri, start, end: start + symbolName.length, fullStart: node.startIndex, fullEnd: node.endIndex,
                scope, type: readType(declaration.childForFieldName('type')), parameters: [], typeParameters: [],
                detail: file.document.getText().slice(node.startIndex, signatureEnd).replace(/\s+/g, ' ').trim().replace(/;$/, ''),
                documentation: documentation(file.document.getText(), node.startIndex),
                readonly: node.type === 'constant_declaration', flavor: node.type === 'aggregate_declaration' ? node.childForFieldName('kind')?.text : node.type };
            symbols.push(symbol);
            scope.symbols.push(symbol);
            declarations.set(start, symbol);
            if (containers.has(node.type)) {
                scope = new Scope(uri, node.startIndex, node.endIndex, parent, symbol);
                symbol.bodyScope = scope;
            }
        } else if (node.type === 'block_statement' || node.type === 'for_statement') {
            scope = new Scope(uri, node.startIndex, node.endIndex, parent);
        }
        for (const child of node.namedChildren) { visit(child, scope); }
        if (symbol?.bodyScope) {
            symbol.parameters = symbol.bodyScope.symbols.filter(child => child.flavor === 'parameter');
            symbol.typeParameters = symbol.bodyScope.symbols.filter(child => child.flavor === 'type_parameter').map(child => child.name);
        }
    };
    visit(file.tree.rootNode, root);
    for (const macro of preprocessing.macros) {
        const symbol = macroSymbol(macro, root);
        symbols.push(symbol);
        root.symbols.push(symbol);
        declarations.set(symbol.start, symbol);
    }
    return { file, preprocessing, root, symbols, declarations,
        identifiers: [...walk(file.tree.rootNode)].filter(node => node.type === 'identifier') };
}

function macroSymbol(macro: Macro, scope: Scope): P4Symbol {
    return { id: `${macro.uri}:${macro.start}`, name: macro.name, kind: SymbolKind.Constant,
        uri: macro.uri, start: macro.start, end: macro.end, fullStart: macro.start, fullEnd: macro.end,
        scope, parameters: [], typeParameters: [], readonly: true, flavor: 'macro', documentation: '',
        detail: `#define ${macro.name}${macro.parameters ? `(${macro.parameters.join(', ')})` : ''} ${macro.value}` };
}

export class TranslationUnit {
    constructor(readonly rootUri: string, readonly files: Map<string, FileModel>) {}

    visible(uri: string, offset: number): P4Symbol[] {
        const file = this.files.get(uri);
        if (!file) { return []; }
        const result = new Map<string, P4Symbol>();
        let scope: Scope | undefined = file.root.at(offset);
        while (scope) {
            for (const symbol of scope.symbols) {
                if (['variable_declaration', 'constant_declaration', 'instantiation'].includes(symbol.flavor ?? '') && scope.parent && symbol.start > offset) { continue; }
                if (!result.has(symbol.name)) { result.set(symbol.name, symbol); }
            }
            scope = scope.parent;
        }
        for (const model of this.files.values()) {
            if (model === file) { continue; }
            for (const symbol of model.root.symbols) { if (!result.has(symbol.name)) { result.set(symbol.name, symbol); } }
        }
        return [...result.values()];
    }

    lookup(uri: string, offset: number, name: string): P4Symbol | undefined {
        return this.visible(uri, offset).find(symbol => symbol.name === name);
    }

    resolveNode(uri: string, node: Node): P4Symbol | undefined {
        const file = this.files.get(uri);
        const declaration = file?.declarations.get(node.startIndex);
        if (declaration) { return declaration; }
        let parent = node.parent;
        if (parent?.type === 'member_name') { parent = parent.parent; }
        if (parent?.type === 'member_expression' && parent.childForFieldName('property')?.startIndex === node.startIndex) {
            const object = parent.childForFieldName('object');
            return object ? this.members(uri, node.startIndex, this.expressionType(uri, object)).find(member => member.name === node.text) : undefined;
        }
        return this.lookup(uri, node.startIndex, node.text);
    }

    symbolAt(uri: string, offset: number): P4Symbol | undefined {
        const file = this.files.get(uri);
        if (!file) { return undefined; }
        const declaration = file.symbols.find(symbol => symbol.start <= offset && offset <= symbol.end);
        if (declaration) { return declaration; }
        const node = file.identifiers.find(node => node.startIndex <= offset && offset <= node.endIndex);
        return node ? this.resolveNode(uri, node) : undefined;
    }

    expressionType(uri: string, node: Node): TypeRef | undefined {
        switch (node.type) {
            case 'identifier': {
                const symbol = this.resolveNode(uri, node);
                return symbol ? this.valueType(symbol) : undefined;
            }
            case 'member_name': return this.expressionType(uri, node.namedChildren[0]);
            case 'member_expression': {
                const receiver = node.childForFieldName('object');
                const property = node.childForFieldName('property');
                const member = receiver && property ? this.members(uri, node.startIndex, this.expressionType(uri, receiver)).find(member => member.name === property.text) : undefined;
                return member ? this.valueType(member) : undefined;
            }
            case 'call_expression': {
                const callable = node.childForFieldName('function');
                if (!callable) { return undefined; }
                const symbol = callable.type === 'member_expression' ? this.resolveMemberExpression(uri, callable) : this.resolveNode(uri, callable);
                if (!symbol) { return undefined; }
                const argumentsNode = node.namedChildren.find(child => child.type === 'type_arguments');
                const binding = new Map(symbol.typeParameters.map((name, index) => [name, readType(argumentsNode?.namedChildren[index] ?? null)!] as const).filter(([, type]) => type));
                return substitute(symbol.type, binding);
            }
            case 'cast_expression': return readType(node.childForFieldName('type'));
            case 'struct_expression': return readType(node.childForFieldName('type'));
            case 'parenthesized_expression': return this.expressionType(uri, node.namedChildren[0]);
            case 'index_expression': {
                const object = node.childForFieldName('object');
                const type = object ? this.expressionType(uri, object) : undefined;
                if (type?.name === 'tuple') { return type.arguments[Number(node.childForFieldName('index')?.text)]; }
                return type ? { ...type, stack: false } : undefined;
            }
            case 'boolean': return { name: 'bool', arguments: [] };
            case 'integer': return { name: 'int', arguments: [] };
            case 'string': return { name: 'string', arguments: [] };
        }
        return undefined;
    }

    resolveMemberExpression(uri: string, node: Node): P4Symbol | undefined {
        const receiver = node.childForFieldName('object');
        const property = node.childForFieldName('property');
        return receiver && property ? this.members(uri, node.startIndex, this.expressionType(uri, receiver)).find(member => member.name === property.text) : undefined;
    }

    valueType(symbol: P4Symbol): TypeRef | undefined {
        if (symbol.type) { return symbol.type; }
        if (symbol.bodyScope) { return { name: symbol.flavor === 'table_declaration' ? `@table:${symbol.id}` : symbol.name, arguments: [] }; }
        return undefined;
    }

    members(uri: string, offset: number, type: TypeRef | undefined, seen = new Set<string>()): P4Symbol[] {
        if (!type || seen.has(typeText(type)) || seen.size >= 32) { return []; }
        seen.add(typeText(type));
        if (type.stack) {
            return [this.builtin('next', SymbolKind.Field, { ...type, stack: false }),
                this.builtin('last', SymbolKind.Field, { ...type, stack: false }),
                this.builtin('size', SymbolKind.Field, { name: 'bit<32>', arguments: [] }),
                this.builtin('lastIndex', SymbolKind.Field, { name: 'bit<32>', arguments: [] }),
                this.builtin('push_front', SymbolKind.Method, { name: 'void', arguments: [] }, 'void push_front(in int count)'),
                this.builtin('pop_front', SymbolKind.Method, { name: 'void', arguments: [] }, 'void pop_front(in int count)')];
        }
        if (type.name.startsWith('@apply:')) {
            return ['hit', 'miss'].map(name => this.builtin(name, SymbolKind.Field, { name: 'bool', arguments: [] })).concat([
                this.builtin('action_run', SymbolKind.Field, { name: 'action', arguments: [] })]);
        }
        if (type.name.startsWith('@table:')) {
            return [this.builtin('apply', SymbolKind.Method, { name: type.name.replace('@table:', '@apply:'), arguments: [] }, 'apply()')];
        }
        if (type.name === 'tuple') { return type.arguments.map((argument, index) => this.builtin(String(index), SymbolKind.Field, argument)); }
        const symbol = this.lookup(uri, offset, type.name);
        if (!symbol) { return []; }
        if (symbol.flavor === 'typedef_declaration') { return this.members(symbol.uri, symbol.start, symbol.type, seen); }
        const bindings = new Map(symbol.typeParameters.map((name, index) => [name, type.arguments[index]] as const).filter(([, value]) => value));
        const result: P4Symbol[] = (symbol.bodyScope?.symbols ?? []).filter(member => !['parameter', 'type_parameter', 'constructor_declaration'].includes(member.flavor ?? ''))
            .map(member => ({ ...member, type: substitute(member.type, bindings),
                parameters: member.parameters.map(parameter => ({ ...parameter, type: substitute(parameter.type, bindings) })) }));
        if (symbol.flavor === 'header' || symbol.flavor === 'header_union') {
            result.push(this.builtin('isValid', SymbolKind.Method, { name: 'bool', arguments: [] }, 'bool isValid()'));
            if (symbol.flavor === 'header') {
                result.push(...['setValid', 'setInvalid'].map(name => this.builtin(name, SymbolKind.Method, { name: 'void', arguments: [] }, `void ${name}()`)));
            }
        }
        if (symbol.flavor === 'header' || symbol.flavor === 'struct') {
            result.push(...['minSizeInBits', 'minSizeInBytes', 'maxSizeInBits', 'maxSizeInBytes'].map(name => this.builtin(name, SymbolKind.Method, { name: 'int', arguments: [] }, `int ${name}()`)));
        }
        if (symbol.flavor === 'control_declaration' || symbol.flavor === 'parser_declaration') {
            result.push({ ...this.builtin('apply', SymbolKind.Method, { name: 'void', arguments: [] }, `void apply(${symbol.parameters.map(parameter => parameter.detail).join(', ')})`), parameters: symbol.parameters });
        }
        return result;
    }

    /** Recovery path for a trailing dot where the syntax tree contains ERROR. */
    membersForText(uri: string, offset: number, expression: string): P4Symbol[] {
        const parts = expression.match(/[A-Za-z_]\w*|\.[A-Za-z_]\w*|\[[^\]]*\]|\([^)]*\)/g);
        if (!parts?.length) { return []; }
        let symbol = this.lookup(uri, offset, parts[0]);
        let type = symbol ? this.valueType(symbol) : undefined;
        for (const part of parts.slice(1)) {
            if (part.startsWith('.')) {
                symbol = this.members(uri, offset, type).find(member => member.name === part.slice(1));
                type = symbol ? this.valueType(symbol) : undefined;
            } else if (part.startsWith('[') && type) { type = { ...type, stack: false }; }
            else if (part.startsWith('(')) { type = symbol?.type; }
        }
        return this.members(uri, offset, type);
    }

    references(symbol: P4Symbol): { uri: string; start: number; end: number }[] {
        const result: { uri: string; start: number; end: number }[] = [];
        for (const [uri, model] of this.files) {
            for (const node of model.identifiers) {
                if (node.text === symbol.name && this.resolveNode(uri, node)?.id === symbol.id) {
                    result.push({ uri, start: node.startIndex, end: node.endIndex });
                }
            }
        }
        return result;
    }

    private builtin(name: string, kind: SymbolKind, type: TypeRef, detail = `${typeText(type)} ${name}`): P4Symbol {
        return { id: `@builtin:${name}:${typeText(type)}`, name, kind, type, uri: '', start: 0, end: 0,
            fullStart: 0, fullEnd: 0, scope: new Scope('', 0, 0), parameters: [], typeParameters: [],
            detail, documentation: '', flavor: 'builtin' };
    }
}
