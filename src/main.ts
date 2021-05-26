import { P4Lexer } from './grammar/P4Lexer';
import { P4Parser, DeclarationContext } from './grammar/P4Parser';
import { AbstractParseTreeVisitor } from 'antlr4ts/tree/AbstractParseTreeVisitor';
import { ANTLRInputStream, CommonTokenStream } from 'antlr4ts';
import * as fs from 'fs';
import { Override } from 'antlr4ts/Decorators';
import * as vscode from 'vscode';



const tokenTypes = new Map<string, number>();
const tokenModifiers = new Map<string, number>();

const legend = (function () {
	const tokenTypesLegend = [
		'comment', 'string', 'keyword', 'number', 'regexp', 'operator', 'namespace',
		'type', 'struct', 'class', 'interface', 'enum', 'typeParameter', 'function',
		'method', 'macro', 'variable', 'parameter', 'property', 'label'
	];
	tokenTypesLegend.forEach((tokenType, index) => tokenTypes.set(tokenType, index));

	const tokenModifiersLegend = [
		'declaration', 'documentation', 'readonly', 'static', 'abstract', 'deprecated',
		'modification', 'async'
	];
	tokenModifiersLegend.forEach((tokenModifier, index) => tokenModifiers.set(tokenModifier, index));

	return new vscode.SemanticTokensLegend(tokenTypesLegend, tokenModifiersLegend);
})();

export function activate(context: vscode.ExtensionContext) {
	context.subscriptions.push(vscode.languages.registerDocumentSemanticTokensProvider({ language: 'p4'}, new DocumentSemanticTokensProvider(), legend));
}

interface parsedToken {
	line: number;
	startCharacter: number;
	length: number;
	tokenType: string;
	tokenModifiers: string[];
}

class DocumentSemanticTokensProvider implements vscode.DocumentSemanticTokensProvider {
	async provideDocumentSemanticTokens(document: vscode.TextDocument, token: vscode.CancellationToken): Promise<vscode.SemanticTokens> {
		const allTokens = this._parseText(document.getText());
		const builder = new vscode.SemanticTokensBuilder();
		allTokens.forEach((token: parsedToken) => {
			builder.push(token.line, token.startCharacter, token.length, this._encodeTokenType(token.tokenType), this._encodeTokenModifiers(token.tokenModifiers));
		});
		return builder.build();
	}

	private _encodeTokenType(tokenType: string): number {
		if (tokenTypes.has(tokenType)) {
			return tokenTypes.get(tokenType)!;
		} else if (tokenType === 'notInLegend') {
			return tokenTypes.size + 2;
		}
		return 0;
	}

	private _encodeTokenModifiers(strTokenModifiers: string[]): number {
		let result = 0;
		for (let i = 0; i < strTokenModifiers.length; i++) {
			const tokenModifier = strTokenModifiers[i];
			if (tokenModifiers.has(tokenModifier)) {
				result = result | (1 << tokenModifiers.get(tokenModifier)!);
			} else if (tokenModifier === 'notInLegend') {
				result = result | (1 << tokenModifiers.size + 2);
			}
		}
		return result;
	}

	private _parseText(text: string): parsedToken[] {
		const parsedTokens: parsedToken[] = [];
		// Create the lexer and parser
		const inputStream = new ANTLRInputStream(text);
		const lexer = new P4Lexer(inputStream);
		const tokenStream = new CommonTokenStream(lexer);
		const parser = new P4Parser(tokenStream);
		
		// Parse the input, where `compilationUnit` is whatever entry point you defined
		parser.buildParseTree = true;
		const tree = parser.program();
		tokenStream.fill();
		const tokens = tokenStream.getTokens();
		
		tokens.forEach(token => {
			if (token.type == P4Lexer.PREPROC_INCLUDE) {
				parsedTokens.push({
					line: token.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
					startCharacter: token.charPositionInLine,
					length: token.stopIndex - token.startIndex + 1,
					tokenType: "keyword", // TODO
					tokenModifiers: ['declaration']
				});
			}
			
		});
		return parsedTokens;
	}
}
