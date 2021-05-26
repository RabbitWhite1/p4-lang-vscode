import { P4Lexer } from './src/grammar/P4Lexer';
import { P4Parser, DeclarationContext } from './src/grammar/P4Parser';
import { AbstractParseTreeVisitor } from 'antlr4ts/tree/AbstractParseTreeVisitor';
import { ANTLRInputStream, CommonTokenStream } from 'antlr4ts';
import * as fs from 'fs';
import { Override } from 'antlr4ts/Decorators';

// Create the lexer and parser
let text = fs.readFileSync("/home/hank/vscode-extension/p4-lang/sample/test.p4").toString();
// console.log(text);
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
	if (token.type == P4Lexer.COMMENT || token.type == P4Lexer.LINE_COMMENT) {
		console.log(token.line, token.startIndex, token.stopIndex, token.text);
	}
});

