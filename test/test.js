"use strict";
exports.__esModule = true;
var P4Lexer_1 = require("../src/grammar/P4Lexer");
var P4Parser_1 = require("../src/grammar/P4Parser");
var antlr4ts_1 = require("antlr4ts");
var fs = require("fs");
// Create the lexer and parser
var text = fs.readFileSync("/home/hank/vscode-extension/p4-lang/sample/test.p4").toString();
var inputStream = new antlr4ts_1.ANTLRInputStream(text);
var lexer = new P4Lexer_1.P4Lexer(inputStream);
var tokenStream = new antlr4ts_1.CommonTokenStream(lexer);
var parser = new P4Parser_1.P4Parser(tokenStream);
// Parse the input, where `compilationUnit` is whatever entry point you defined
parser.buildParseTree = true;
var tree = parser.program();
tokenStream.fill();
var tokens = tokenStream.getTokens();
tokens.forEach(function (token) {
    if (token.type == P4Lexer_1.P4Lexer.COMMENT || token.type == P4Lexer_1.P4Lexer.LINE_COMMENT) {
        console.log(token);
    }
});
