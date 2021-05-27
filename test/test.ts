import { P4Visitor } from '../src/grammar/P4Visitor';
import { P4Lexer } from '../src/grammar/P4Lexer';
import { P4Parser, DeclarationContext } from '../src/grammar/P4Parser';
import { AbstractParseTreeVisitor } from 'antlr4ts/tree/AbstractParseTreeVisitor'
import { ANTLRInputStream, CommonTokenStream } from 'antlr4ts';
import * as fs from 'fs'
import { Override } from 'antlr4ts/Decorators';

let text = fs.readFileSync('/home/hank/vscode-extension/p4-lang-vscode/sample/test.p4','utf8');

// Create the lexer and parser
let inputStream = new ANTLRInputStream(text);
let lexer = new P4Lexer(inputStream);
let tokenStream = new CommonTokenStream(lexer);
let parser = new P4Parser(tokenStream);

// Parse the input, where `compilationUnit` is whatever entry point you defined
parser.buildParseTree = true;
let tree = parser.program();
// console.log(tree)

// Extend the AbstractParseTreeVisitor to get default visitor behaviour
class CountDeclarationsVisitor extends AbstractParseTreeVisitor<number> implements P4Visitor<number> {

  defaultResult() {
    return 0
  }

  aggregateResult(aggregate: number, nextResult: number) {
    return aggregate + nextResult
  }

  visitDeclaration(context: DeclarationContext): number {
    return 1 + super.visitChildren(context)
  }
}

// Create the visitor
const countDeclarationsVisitor = new CountDeclarationsVisitor()
// Use the visitor entry point
console.log(countDeclarationsVisitor.visit(tree));

console.log(countDeclarationsVisitor);
