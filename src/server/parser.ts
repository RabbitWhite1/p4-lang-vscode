import * as fs from 'node:fs';
import * as path from 'node:path';
import { Edit, Language, Parser, Tree, Node } from 'web-tree-sitter';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { Range } from 'vscode-languageserver/node';

let languagePromise: Promise<Language> | undefined;

function assetPath(name: string): string {
    const candidates = [path.resolve(__dirname, '../../assets', name), path.resolve(__dirname, '../assets', name)];
    const found = candidates.find(candidate => fs.existsSync(candidate));
    if (!found) { throw new Error(`Missing bundled parser asset: ${name}`); }
    return found;
}

async function language(): Promise<Language> {
    if (!languagePromise) {
        languagePromise = (async () => {
            await Parser.init({ locateFile: () => {
                const bundled = path.join(__dirname, 'web-tree-sitter.wasm');
                return fs.existsSync(bundled) ? bundled : require.resolve('web-tree-sitter/web-tree-sitter.wasm');
            } });
            return Language.load(assetPath('tree-sitter-p4.wasm'));
        })();
    }
    return languagePromise;
}

/** web-tree-sitter's string binding uses JS UTF-16 indexes, matching LSP. */
export function nodeRange(document: TextDocument, node: Node): Range {
    return { start: document.positionAt(node.startIndex), end: document.positionAt(node.endIndex) };
}

export function* walk(node: Node): Generator<Node> {
    yield node;
    for (const child of node.children) { yield* walk(child); }
}

/** One tree per file/context. Edits adjust the old tree before reusing it. */
export class ParsedFile {
    document: TextDocument;
    tree: Tree;
    private parsedText: string;
    private constructor(readonly parser: Parser, uri: string, text: string, parsedText: string, version: number) {
        this.document = TextDocument.create(uri, 'p4', version, text);
        this.parsedText = parsedText;
        this.tree = parser.parse(parsedText)!;
    }

    static async create(uri: string, text: string, parsedText = text, version = 0): Promise<ParsedFile> {
        const p4 = await language();
        const parser = new Parser();
        parser.setLanguage(p4);
        return new ParsedFile(parser, uri, text, parsedText, version);
    }

    update(text: string, parsedText = text, version = this.document.version + 1): void {
        if (parsedText !== this.parsedText) {
            const previous = this.parsedText;
            let start = 0;
            while (start < previous.length && start < parsedText.length && previous[start] === parsedText[start]) { start++; }
            let oldEnd = previous.length;
            let newEnd = parsedText.length;
            while (oldEnd > start && newEnd > start && previous[oldEnd - 1] === parsedText[newEnd - 1]) { oldEnd--; newEnd--; }
            const oldDocument = TextDocument.create('', 'p4', 0, previous);
            const newDocument = TextDocument.create('', 'p4', 0, parsedText);
            const point = (document: TextDocument, index: number) => {
                const position = document.positionAt(index);
                return { row: position.line, column: position.character };
            };
            this.tree.edit(new Edit({ startIndex: start, oldEndIndex: oldEnd, newEndIndex: newEnd,
                startPosition: point(oldDocument, start), oldEndPosition: point(oldDocument, oldEnd),
                newEndPosition: point(newDocument, newEnd) }));
            const tree = this.parser.parse(parsedText, this.tree);
            if (!tree) { throw new Error('P4 incremental parse failed'); }
            this.tree.delete();
            this.tree = tree;
            this.parsedText = parsedText;
        }
        this.document = TextDocument.create(this.document.uri, 'p4', version, text);
    }

    dispose(): void { this.tree.delete(); this.parser.delete(); }
}
