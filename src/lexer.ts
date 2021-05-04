enum Token {
	// tokens
	Plus,
	Minus,
	Assign, // =
	Equal, // ==
	NotEqual,
	GreatThan,
	GreatThanOrEqual,
	LessThan,
	LessThanOrEqual,
	LeftBrace,
	RightBrace,
	LeftAngleBracket,
	RightAngleBracket,
	LeftBracket,
	RightBracket,
	LeftSquareBracket,
	RightSquareBracket,
	Semicolon, // 分号
	Comma, // 逗号
	Identifier,
	// Keyword
	Action,
	Class,
	Control,
	Error,
	Header,
	Table
}


class Lexer {
	tokens: Token[];
	text: string;

	constructor(text: string) {
		this.tokens = [];
		this.text = text;
		this.scan_token(0);
	}

	scan_token(begin: number):void {
		var end = this.text.length;
		while (begin < end) {
			var ret = this.text.match(/\s*head\s+(\w+)\s*/);
			begin = begin + 4;
			if (ret?.length == 2) {
				console.log(ret[1]);
			}
		}
	}
}

new Lexer("ddd head aaa");
	