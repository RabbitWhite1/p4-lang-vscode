var Token;
(function (Token) {
    // tokens
    Token[Token["Plus"] = 0] = "Plus";
    Token[Token["Minus"] = 1] = "Minus";
    Token[Token["Assign"] = 2] = "Assign";
    Token[Token["Equal"] = 3] = "Equal";
    Token[Token["NotEqual"] = 4] = "NotEqual";
    Token[Token["GreatThan"] = 5] = "GreatThan";
    Token[Token["GreatThanOrEqual"] = 6] = "GreatThanOrEqual";
    Token[Token["LessThan"] = 7] = "LessThan";
    Token[Token["LessThanOrEqual"] = 8] = "LessThanOrEqual";
    Token[Token["LeftBrace"] = 9] = "LeftBrace";
    Token[Token["RightBrace"] = 10] = "RightBrace";
    Token[Token["LeftAngleBracket"] = 11] = "LeftAngleBracket";
    Token[Token["RightAngleBracket"] = 12] = "RightAngleBracket";
    Token[Token["LeftBracket"] = 13] = "LeftBracket";
    Token[Token["RightBracket"] = 14] = "RightBracket";
    Token[Token["LeftSquareBracket"] = 15] = "LeftSquareBracket";
    Token[Token["RightSquareBracket"] = 16] = "RightSquareBracket";
    Token[Token["Semicolon"] = 17] = "Semicolon";
    Token[Token["Comma"] = 18] = "Comma";
    Token[Token["Identifier"] = 19] = "Identifier";
    // Keyword
    Token[Token["Action"] = 20] = "Action";
    Token[Token["Class"] = 21] = "Class";
    Token[Token["Control"] = 22] = "Control";
    Token[Token["Error"] = 23] = "Error";
    Token[Token["Header"] = 24] = "Header";
    Token[Token["Table"] = 25] = "Table";
})(Token || (Token = {}));
var Lexer = /** @class */ (function () {
    function Lexer(text) {
        this.tokens = [];
        this.text = text;
        this.scan_token(0);
    }
    Lexer.prototype.scan_token = function (begin) {
        var end = this.text.length;
        while (begin < end) {
            var ret = this.text.match(/\s*head\s+(\w+)\s*/);
            begin = begin + 4;
            if ((ret === null || ret === void 0 ? void 0 : ret.length) == 2)
                console.log(ret[1]);
        }
    };
    return Lexer;
}());
new Lexer("ddd head aaa");
