// Generated from ./src/grammar/P4.g4 by ANTLR 4.9.0-SNAPSHOT


import { ATN } from "antlr4ts/atn/ATN";
import { ATNDeserializer } from "antlr4ts/atn/ATNDeserializer";
import { FailedPredicateException } from "antlr4ts/FailedPredicateException";
import { NotNull } from "antlr4ts/Decorators";
import { NoViableAltException } from "antlr4ts/NoViableAltException";
import { Override } from "antlr4ts/Decorators";
import { Parser } from "antlr4ts/Parser";
import { ParserRuleContext } from "antlr4ts/ParserRuleContext";
import { ParserATNSimulator } from "antlr4ts/atn/ParserATNSimulator";
import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";
import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";
import { RecognitionException } from "antlr4ts/RecognitionException";
import { RuleContext } from "antlr4ts/RuleContext";
//import { RuleVersion } from "antlr4ts/RuleVersion";
import { TerminalNode } from "antlr4ts/tree/TerminalNode";
import { Token } from "antlr4ts/Token";
import { TokenStream } from "antlr4ts/TokenStream";
import { Vocabulary } from "antlr4ts/Vocabulary";
import { VocabularyImpl } from "antlr4ts/VocabularyImpl";

import * as Utils from "antlr4ts/misc/Utils";

import { P4Listener } from "./P4Listener";
import { P4Visitor } from "./P4Visitor";


export class P4Parser extends Parser {
	public static readonly T__0 = 1;
	public static readonly T__1 = 2;
	public static readonly PRAGMA = 3;
	public static readonly ABSTRACT = 4;
	public static readonly ACTION = 5;
	public static readonly ACTIONS = 6;
	public static readonly APPLY = 7;
	public static readonly BOOL = 8;
	public static readonly BIT = 9;
	public static readonly CONST = 10;
	public static readonly CONTROL = 11;
	public static readonly DEFAULT = 12;
	public static readonly ELSE = 13;
	public static readonly ENTRIES = 14;
	public static readonly ENUM = 15;
	public static readonly ERROR = 16;
	public static readonly EXIT = 17;
	public static readonly EXTERN = 18;
	public static readonly FALSE = 19;
	public static readonly HEADER = 20;
	public static readonly HEADER_UNION = 21;
	public static readonly IF = 22;
	public static readonly IN = 23;
	public static readonly INOUT = 24;
	public static readonly INT = 25;
	public static readonly KEY = 26;
	public static readonly MATCH_KIND = 27;
	public static readonly TYPE = 28;
	public static readonly OUT = 29;
	public static readonly PARSER = 30;
	public static readonly PACKAGE = 31;
	public static readonly RETURN = 32;
	public static readonly SELECT = 33;
	public static readonly STATE = 34;
	public static readonly MEGA_STATE = 35;
	public static readonly STRUCT = 36;
	public static readonly SWITCH = 37;
	public static readonly TABLE = 38;
	public static readonly THIS = 39;
	public static readonly TRANSITION = 40;
	public static readonly TRUE = 41;
	public static readonly TUPLE = 42;
	public static readonly TYPEDEF = 43;
	public static readonly VARBIT = 44;
	public static readonly VALUESET = 45;
	public static readonly VOID = 46;
	public static readonly DONTCARE = 47;
	public static readonly MASK = 48;
	public static readonly RANGE = 49;
	public static readonly SHL = 50;
	public static readonly AND = 51;
	public static readonly OR = 52;
	public static readonly EQ = 53;
	public static readonly NE = 54;
	public static readonly GE = 55;
	public static readonly LE = 56;
	public static readonly PP = 57;
	public static readonly PLUS = 58;
	public static readonly PLUS_SAT = 59;
	public static readonly MINUS = 60;
	public static readonly MINUS_SAT = 61;
	public static readonly MUL = 62;
	public static readonly DIV = 63;
	public static readonly MOD = 64;
	public static readonly BIT_OR = 65;
	public static readonly BIT_AND = 66;
	public static readonly BIT_XOR = 67;
	public static readonly COMPLEMENT = 68;
	public static readonly L_PAREN = 69;
	public static readonly R_PAREN = 70;
	public static readonly L_BRACKET = 71;
	public static readonly R_BRACKET = 72;
	public static readonly L_BRACE = 73;
	public static readonly R_BRACE = 74;
	public static readonly L_ANGLE = 75;
	public static readonly R_ANGLE = 76;
	public static readonly NOT = 77;
	public static readonly COLON = 78;
	public static readonly COMMA = 79;
	public static readonly QUESTION = 80;
	public static readonly DOT = 81;
	public static readonly ASSIGN = 82;
	public static readonly SEMICOLON = 83;
	public static readonly AT = 84;
	public static readonly UNEXPECTED_TOKEN = 85;
	public static readonly WS = 86;
	public static readonly COMMENT = 87;
	public static readonly LINE_COMMENT = 88;
	public static readonly STRING_LITERAL = 89;
	public static readonly PREPROC_INCLUDE = 90;
	public static readonly PREPROC_DEFINE = 91;
	public static readonly PREPROC_UNDEF = 92;
	public static readonly PREPROC_IFDEF = 93;
	public static readonly PREPROC_IFNDEF = 94;
	public static readonly PREPROC_ELSEIF = 95;
	public static readonly PREPROC_ENDIF = 96;
	public static readonly PREPROC_LINE = 97;
	public static readonly PREPROC_IF = 98;
	public static readonly PREPROC_ELSE = 99;
	public static readonly PREPROC_ARG = 100;
	public static readonly IDENTIFIER = 101;
	public static readonly TYPE_IDENTIFIER = 102;
	public static readonly INTEGER = 103;
	public static readonly RULE_start = 0;
	public static readonly RULE_program = 1;
	public static readonly RULE_input = 2;
	public static readonly RULE_declaration = 3;
	public static readonly RULE_preprocessorLine = 4;
	public static readonly RULE_ppIncludeFileName = 5;
	public static readonly RULE_nonTypeName = 6;
	public static readonly RULE_name = 7;
	public static readonly RULE_nonTableKwName = 8;
	public static readonly RULE_optCONST = 9;
	public static readonly RULE_optAnnotations = 10;
	public static readonly RULE_annotations = 11;
	public static readonly RULE_annotation = 12;
	public static readonly RULE_annotationBody = 13;
	public static readonly RULE_annotationToken = 14;
	public static readonly RULE_kvList = 15;
	public static readonly RULE_kvPair = 16;
	public static readonly RULE_parameterList = 17;
	public static readonly RULE_nonEmptyParameterList = 18;
	public static readonly RULE_parameter = 19;
	public static readonly RULE_direction = 20;
	public static readonly RULE_packageTypeDeclaration = 21;
	public static readonly RULE_instantiation = 22;
	public static readonly RULE_objInitializer = 23;
	public static readonly RULE_objDeclarations = 24;
	public static readonly RULE_objDeclaration = 25;
	public static readonly RULE_optConstructorParameters = 26;
	public static readonly RULE_dotPrefix = 27;
	public static readonly RULE_parserDeclaration = 28;
	public static readonly RULE_parserLocalElements = 29;
	public static readonly RULE_parserLocalElement = 30;
	public static readonly RULE_parserTypeDeclaration = 31;
	public static readonly RULE_parserStates = 32;
	public static readonly RULE_parserState = 33;
	public static readonly RULE_parserStatements = 34;
	public static readonly RULE_parserStatement = 35;
	public static readonly RULE_parserBlockStatement = 36;
	public static readonly RULE_transitionStatement = 37;
	public static readonly RULE_stateExpression = 38;
	public static readonly RULE_selectExpression = 39;
	public static readonly RULE_selectCaseList = 40;
	public static readonly RULE_selectCase = 41;
	public static readonly RULE_keysetExpression = 42;
	public static readonly RULE_tupleKeysetExpression = 43;
	public static readonly RULE_simpleExpressionList = 44;
	public static readonly RULE_simpleKeysetExpression = 45;
	public static readonly RULE_valueSetDeclaration = 46;
	public static readonly RULE_controlDeclaration = 47;
	public static readonly RULE_controlTypeDeclaration = 48;
	public static readonly RULE_controlLocalDeclarations = 49;
	public static readonly RULE_controlLocalDeclaration = 50;
	public static readonly RULE_controlBody = 51;
	public static readonly RULE_externDeclaration = 52;
	public static readonly RULE_methodPrototypes = 53;
	public static readonly RULE_functionPrototype = 54;
	public static readonly RULE_methodPrototype = 55;
	public static readonly RULE_typeRef = 56;
	public static readonly RULE_namedType = 57;
	public static readonly RULE_prefixedType = 58;
	public static readonly RULE_typeName = 59;
	public static readonly RULE_tupleType = 60;
	public static readonly RULE_headerStackType = 61;
	public static readonly RULE_specializedType = 62;
	public static readonly RULE_baseType = 63;
	public static readonly RULE_typeOrVoid = 64;
	public static readonly RULE_optTypeParameters = 65;
	public static readonly RULE_typeParameterList = 66;
	public static readonly RULE_typeArg = 67;
	public static readonly RULE_typeArgumentList = 68;
	public static readonly RULE_realTypeArg = 69;
	public static readonly RULE_realTypeArgumentList = 70;
	public static readonly RULE_typeDeclaration = 71;
	public static readonly RULE_derivedTypeDeclaration = 72;
	public static readonly RULE_headerTypeDeclaration = 73;
	public static readonly RULE_structTypeDeclaration = 74;
	public static readonly RULE_headerUnionDeclaration = 75;
	public static readonly RULE_structFieldList = 76;
	public static readonly RULE_structField = 77;
	public static readonly RULE_enumDeclaration = 78;
	public static readonly RULE_specifiedIdentifierList = 79;
	public static readonly RULE_specifiedIdentifier = 80;
	public static readonly RULE_errorDeclaration = 81;
	public static readonly RULE_matchKindDeclaration = 82;
	public static readonly RULE_identifierList = 83;
	public static readonly RULE_typedefDeclaration = 84;
	public static readonly RULE_assignmentOrMethodCallStatement = 85;
	public static readonly RULE_emptyStatement = 86;
	public static readonly RULE_exitStatement = 87;
	public static readonly RULE_returnStatement = 88;
	public static readonly RULE_conditionalStatement = 89;
	public static readonly RULE_directApplication = 90;
	public static readonly RULE_statement = 91;
	public static readonly RULE_blockStatement = 92;
	public static readonly RULE_statOrDeclList = 93;
	public static readonly RULE_switchStatement = 94;
	public static readonly RULE_switchCases = 95;
	public static readonly RULE_switchCase = 96;
	public static readonly RULE_switchLabel = 97;
	public static readonly RULE_statementOrDeclaration = 98;
	public static readonly RULE_tableDeclaration = 99;
	public static readonly RULE_tablePropertyList = 100;
	public static readonly RULE_tableProperty = 101;
	public static readonly RULE_keyElementList = 102;
	public static readonly RULE_keyElement = 103;
	public static readonly RULE_actionList = 104;
	public static readonly RULE_actionRef = 105;
	public static readonly RULE_entry = 106;
	public static readonly RULE_actionBinding = 107;
	public static readonly RULE_entriesList = 108;
	public static readonly RULE_actionDeclaration = 109;
	public static readonly RULE_variableDeclaration = 110;
	public static readonly RULE_constantDeclaration = 111;
	public static readonly RULE_optInitializer = 112;
	public static readonly RULE_initializer = 113;
	public static readonly RULE_functionDeclaration = 114;
	public static readonly RULE_argumentList = 115;
	public static readonly RULE_nonEmptyArgList = 116;
	public static readonly RULE_argument = 117;
	public static readonly RULE_expressionList = 118;
	public static readonly RULE_prefixedNonTypeName = 119;
	public static readonly RULE_lvalue = 120;
	public static readonly RULE_expression = 121;
	public static readonly RULE_type_or_id = 122;
	public static readonly RULE_parserStateCondition = 123;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"start", "program", "input", "declaration", "preprocessorLine", "ppIncludeFileName", 
		"nonTypeName", "name", "nonTableKwName", "optCONST", "optAnnotations", 
		"annotations", "annotation", "annotationBody", "annotationToken", "kvList", 
		"kvPair", "parameterList", "nonEmptyParameterList", "parameter", "direction", 
		"packageTypeDeclaration", "instantiation", "objInitializer", "objDeclarations", 
		"objDeclaration", "optConstructorParameters", "dotPrefix", "parserDeclaration", 
		"parserLocalElements", "parserLocalElement", "parserTypeDeclaration", 
		"parserStates", "parserState", "parserStatements", "parserStatement", 
		"parserBlockStatement", "transitionStatement", "stateExpression", "selectExpression", 
		"selectCaseList", "selectCase", "keysetExpression", "tupleKeysetExpression", 
		"simpleExpressionList", "simpleKeysetExpression", "valueSetDeclaration", 
		"controlDeclaration", "controlTypeDeclaration", "controlLocalDeclarations", 
		"controlLocalDeclaration", "controlBody", "externDeclaration", "methodPrototypes", 
		"functionPrototype", "methodPrototype", "typeRef", "namedType", "prefixedType", 
		"typeName", "tupleType", "headerStackType", "specializedType", "baseType", 
		"typeOrVoid", "optTypeParameters", "typeParameterList", "typeArg", "typeArgumentList", 
		"realTypeArg", "realTypeArgumentList", "typeDeclaration", "derivedTypeDeclaration", 
		"headerTypeDeclaration", "structTypeDeclaration", "headerUnionDeclaration", 
		"structFieldList", "structField", "enumDeclaration", "specifiedIdentifierList", 
		"specifiedIdentifier", "errorDeclaration", "matchKindDeclaration", "identifierList", 
		"typedefDeclaration", "assignmentOrMethodCallStatement", "emptyStatement", 
		"exitStatement", "returnStatement", "conditionalStatement", "directApplication", 
		"statement", "blockStatement", "statOrDeclList", "switchStatement", "switchCases", 
		"switchCase", "switchLabel", "statementOrDeclaration", "tableDeclaration", 
		"tablePropertyList", "tableProperty", "keyElementList", "keyElement", 
		"actionList", "actionRef", "entry", "actionBinding", "entriesList", "actionDeclaration", 
		"variableDeclaration", "constantDeclaration", "optInitializer", "initializer", 
		"functionDeclaration", "argumentList", "nonEmptyArgList", "argument", 
		"expressionList", "prefixedNonTypeName", "lvalue", "expression", "type_or_id", 
		"parserStateCondition",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, "'./'", "'../'", "'@pragma'", "'abstract'", "'action'", "'actions'", 
		"'apply'", "'bool'", "'bit'", "'const'", "'control'", "'default'", "'else'", 
		"'entries'", "'enum'", "'error'", "'exit'", "'extern'", "'false'", "'header'", 
		"'header_union'", "'if'", "'in'", "'inout'", "'int'", "'key'", "'match_kind'", 
		"'type'", "'out'", "'parser'", "'package'", "'return'", "'select'", "'state'", 
		"'mega_state'", "'struct'", "'switch'", "'table'", "'this'", "'transition'", 
		"'true'", "'tuple'", "'typedef'", "'varbit'", "'value_set'", "'void'", 
		"'_'", "'&&&'", "'..'", "'<<'", "'&&'", "'||'", "'=='", "'!='", "'>='", 
		"'<='", "'++'", "'+'", "'|+|'", "'-'", "'|-|'", "'*'", "'/'", "'%'", "'|'", 
		"'&'", "'^'", "'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", 
		"'>'", "'!'", "':'", "','", "'?'", "'.'", "'='", "';'", "'@'", "'<*>.|\n'", 
		undefined, undefined, undefined, undefined, "'#include'", "'#define'", 
		"'#undef'", "'#ifdef'", "'#ifndef'", "'#elseif'", "'#endif'", "'#line'", 
		"'#if'", "'#else'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, "PRAGMA", "ABSTRACT", "ACTION", "ACTIONS", 
		"APPLY", "BOOL", "BIT", "CONST", "CONTROL", "DEFAULT", "ELSE", "ENTRIES", 
		"ENUM", "ERROR", "EXIT", "EXTERN", "FALSE", "HEADER", "HEADER_UNION", 
		"IF", "IN", "INOUT", "INT", "KEY", "MATCH_KIND", "TYPE", "OUT", "PARSER", 
		"PACKAGE", "RETURN", "SELECT", "STATE", "MEGA_STATE", "STRUCT", "SWITCH", 
		"TABLE", "THIS", "TRANSITION", "TRUE", "TUPLE", "TYPEDEF", "VARBIT", "VALUESET", 
		"VOID", "DONTCARE", "MASK", "RANGE", "SHL", "AND", "OR", "EQ", "NE", "GE", 
		"LE", "PP", "PLUS", "PLUS_SAT", "MINUS", "MINUS_SAT", "MUL", "DIV", "MOD", 
		"BIT_OR", "BIT_AND", "BIT_XOR", "COMPLEMENT", "L_PAREN", "R_PAREN", "L_BRACKET", 
		"R_BRACKET", "L_BRACE", "R_BRACE", "L_ANGLE", "R_ANGLE", "NOT", "COLON", 
		"COMMA", "QUESTION", "DOT", "ASSIGN", "SEMICOLON", "AT", "UNEXPECTED_TOKEN", 
		"WS", "COMMENT", "LINE_COMMENT", "STRING_LITERAL", "PREPROC_INCLUDE", 
		"PREPROC_DEFINE", "PREPROC_UNDEF", "PREPROC_IFDEF", "PREPROC_IFNDEF", 
		"PREPROC_ELSEIF", "PREPROC_ENDIF", "PREPROC_LINE", "PREPROC_IF", "PREPROC_ELSE", 
		"PREPROC_ARG", "IDENTIFIER", "TYPE_IDENTIFIER", "INTEGER",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(P4Parser._LITERAL_NAMES, P4Parser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return P4Parser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "P4.g4"; }

	// @Override
	public get ruleNames(): string[] { return P4Parser.ruleNames; }

	// @Override
	public get serializedATN(): string { return P4Parser._serializedATN; }

	protected createFailedPredicateException(predicate?: string, message?: string): FailedPredicateException {
		return new FailedPredicateException(this, predicate, message);
	}

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(P4Parser._ATN, this);
	}
	// @RuleVersion(0)
	public start(): StartContext {
		let _localctx: StartContext = new StartContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, P4Parser.RULE_start);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 248;
			this.program();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public program(): ProgramContext {
		let _localctx: ProgramContext = new ProgramContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, P4Parser.RULE_program);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 250;
			this.input(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public input(): InputContext;
	public input(_p: number): InputContext;
	// @RuleVersion(0)
	public input(_p?: number): InputContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: InputContext = new InputContext(this._ctx, _parentState);
		let _prevctx: InputContext = _localctx;
		let _startState: number = 4;
		this.enterRecursionRule(_localctx, 4, P4Parser.RULE_input, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 259;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 1, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 257;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 0, this._ctx) ) {
					case 1:
						{
						_localctx = new InputContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_input);
						this.state = 253;
						if (!(this.precpred(this._ctx, 2))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
						}
						this.state = 254;
						this.declaration();
						}
						break;

					case 2:
						{
						_localctx = new InputContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_input);
						this.state = 255;
						if (!(this.precpred(this._ctx, 1))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
						}
						this.state = 256;
						this.match(P4Parser.SEMICOLON);
						}
						break;
					}
					}
				}
				this.state = 261;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 1, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public declaration(): DeclarationContext {
		let _localctx: DeclarationContext = new DeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, P4Parser.RULE_declaration);
		try {
			this.state = 273;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 2, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 262;
				this.constantDeclaration();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 263;
				this.externDeclaration();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 264;
				this.actionDeclaration();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 265;
				this.parserDeclaration();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 266;
				this.typeDeclaration();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 267;
				this.controlDeclaration();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 268;
				this.instantiation();
				}
				break;

			case 8:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 269;
				this.errorDeclaration();
				}
				break;

			case 9:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 270;
				this.matchKindDeclaration();
				}
				break;

			case 10:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 271;
				this.functionDeclaration();
				}
				break;

			case 11:
				this.enterOuterAlt(_localctx, 11);
				{
				this.state = 272;
				this.preprocessorLine();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public preprocessorLine(): PreprocessorLineContext {
		let _localctx: PreprocessorLineContext = new PreprocessorLineContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, P4Parser.RULE_preprocessorLine);
		try {
			this.state = 291;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 3, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 275;
				this.match(P4Parser.PREPROC_INCLUDE);
				this.state = 276;
				this.ppIncludeFileName();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 277;
				this.match(P4Parser.PREPROC_DEFINE);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 278;
				this.match(P4Parser.PREPROC_DEFINE);
				this.state = 279;
				this.expression(0);
				this.state = 280;
				this.expression(0);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 282;
				this.match(P4Parser.PREPROC_UNDEF);
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 283;
				this.match(P4Parser.PREPROC_IFDEF);
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 284;
				this.match(P4Parser.PREPROC_IFNDEF);
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 285;
				this.match(P4Parser.PREPROC_IF);
				this.state = 286;
				this.expression(0);
				}
				break;

			case 8:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 287;
				this.match(P4Parser.PREPROC_ELSEIF);
				}
				break;

			case 9:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 288;
				this.match(P4Parser.PREPROC_ELSE);
				}
				break;

			case 10:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 289;
				this.match(P4Parser.PREPROC_ENDIF);
				}
				break;

			case 11:
				this.enterOuterAlt(_localctx, 11);
				{
				this.state = 290;
				this.match(P4Parser.PREPROC_LINE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public ppIncludeFileName(): PpIncludeFileNameContext {
		let _localctx: PpIncludeFileNameContext = new PpIncludeFileNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, P4Parser.RULE_ppIncludeFileName);
		try {
			this.state = 309;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 4, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 293;
				this.match(P4Parser.STRING_LITERAL);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 294;
				this.match(P4Parser.L_ANGLE);
				this.state = 295;
				this.ppIncludeFileName();
				this.state = 296;
				this.match(P4Parser.R_ANGLE);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 298;
				this.name();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 299;
				this.name();
				this.state = 300;
				this.match(P4Parser.DOT);
				this.state = 301;
				this.name();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 303;
				this.match(P4Parser.T__0);
				this.state = 304;
				this.ppIncludeFileName();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 305;
				this.match(P4Parser.T__1);
				this.state = 306;
				this.ppIncludeFileName();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 307;
				this.match(P4Parser.DIV);
				this.state = 308;
				this.ppIncludeFileName();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public nonTypeName(): NonTypeNameContext {
		let _localctx: NonTypeNameContext = new NonTypeNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, P4Parser.RULE_nonTypeName);
		try {
			this.state = 318;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 311;
				this.type_or_id();
				}
				break;
			case P4Parser.APPLY:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 312;
				this.match(P4Parser.APPLY);
				}
				break;
			case P4Parser.KEY:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 313;
				this.match(P4Parser.KEY);
				}
				break;
			case P4Parser.ACTIONS:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 314;
				this.match(P4Parser.ACTIONS);
				}
				break;
			case P4Parser.STATE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 315;
				this.match(P4Parser.STATE);
				}
				break;
			case P4Parser.ENTRIES:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 316;
				this.match(P4Parser.ENTRIES);
				}
				break;
			case P4Parser.TYPE:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 317;
				this.match(P4Parser.TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public name(): NameContext {
		let _localctx: NameContext = new NameContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, P4Parser.RULE_name);
		try {
			this.state = 322;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 6, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 320;
				this.nonTypeName();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 321;
				this.type_or_id();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public nonTableKwName(): NonTableKwNameContext {
		let _localctx: NonTableKwNameContext = new NonTableKwNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, P4Parser.RULE_nonTableKwName);
		try {
			this.state = 328;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 324;
				this.type_or_id();
				}
				break;
			case P4Parser.APPLY:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 325;
				this.match(P4Parser.APPLY);
				}
				break;
			case P4Parser.STATE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 326;
				this.match(P4Parser.STATE);
				}
				break;
			case P4Parser.TYPE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 327;
				this.match(P4Parser.TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public optCONST(): OptCONSTContext {
		let _localctx: OptCONSTContext = new OptCONSTContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, P4Parser.RULE_optCONST);
		try {
			this.state = 332;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.APPLY:
			case P4Parser.ENTRIES:
			case P4Parser.TYPE:
			case P4Parser.STATE:
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				// tslint:disable-next-line:no-empty
				{
				}
				break;
			case P4Parser.CONST:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 331;
				this.match(P4Parser.CONST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public optAnnotations(): OptAnnotationsContext {
		let _localctx: OptAnnotationsContext = new OptAnnotationsContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, P4Parser.RULE_optAnnotations);
		try {
			this.state = 336;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.ABSTRACT:
			case P4Parser.ACTION:
			case P4Parser.ACTIONS:
			case P4Parser.APPLY:
			case P4Parser.BOOL:
			case P4Parser.BIT:
			case P4Parser.CONST:
			case P4Parser.CONTROL:
			case P4Parser.ENTRIES:
			case P4Parser.ENUM:
			case P4Parser.ERROR:
			case P4Parser.EXTERN:
			case P4Parser.HEADER:
			case P4Parser.HEADER_UNION:
			case P4Parser.IN:
			case P4Parser.INOUT:
			case P4Parser.INT:
			case P4Parser.KEY:
			case P4Parser.TYPE:
			case P4Parser.OUT:
			case P4Parser.PARSER:
			case P4Parser.PACKAGE:
			case P4Parser.STATE:
			case P4Parser.STRUCT:
			case P4Parser.TABLE:
			case P4Parser.TUPLE:
			case P4Parser.TYPEDEF:
			case P4Parser.VARBIT:
			case P4Parser.VALUESET:
			case P4Parser.VOID:
			case P4Parser.L_BRACE:
			case P4Parser.DOT:
			case P4Parser.SEMICOLON:
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				// tslint:disable-next-line:no-empty
				{
				}
				break;
			case P4Parser.PRAGMA:
			case P4Parser.AT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 335;
				this.annotations(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public annotations(): AnnotationsContext;
	public annotations(_p: number): AnnotationsContext;
	// @RuleVersion(0)
	public annotations(_p?: number): AnnotationsContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: AnnotationsContext = new AnnotationsContext(this._ctx, _parentState);
		let _prevctx: AnnotationsContext = _localctx;
		let _startState: number = 22;
		this.enterRecursionRule(_localctx, 22, P4Parser.RULE_annotations, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 339;
			this.annotation();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 345;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 10, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new AnnotationsContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_annotations);
					this.state = 341;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 342;
					this.annotation();
					}
					}
				}
				this.state = 347;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 10, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public annotation(): AnnotationContext {
		let _localctx: AnnotationContext = new AnnotationContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, P4Parser.RULE_annotation);
		try {
			this.state = 360;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 11, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 348;
				this.match(P4Parser.AT);
				this.state = 349;
				this.name();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 350;
				this.match(P4Parser.AT);
				this.state = 351;
				this.name();
				this.state = 352;
				this.match(P4Parser.L_PAREN);
				this.state = 353;
				this.annotationBody(0);
				this.state = 354;
				this.match(P4Parser.R_PAREN);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 356;
				this.match(P4Parser.PRAGMA);
				this.state = 357;
				this.name();
				this.state = 358;
				this.annotationBody(0);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public annotationBody(): AnnotationBodyContext;
	public annotationBody(_p: number): AnnotationBodyContext;
	// @RuleVersion(0)
	public annotationBody(_p?: number): AnnotationBodyContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: AnnotationBodyContext = new AnnotationBodyContext(this._ctx, _parentState);
		let _prevctx: AnnotationBodyContext = _localctx;
		let _startState: number = 26;
		this.enterRecursionRule(_localctx, 26, P4Parser.RULE_annotationBody, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 372;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 370;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 12, this._ctx) ) {
					case 1:
						{
						_localctx = new AnnotationBodyContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_annotationBody);
						this.state = 363;
						if (!(this.precpred(this._ctx, 2))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
						}
						this.state = 364;
						this.match(P4Parser.L_PAREN);
						this.state = 365;
						this.annotationBody(0);
						this.state = 366;
						this.match(P4Parser.R_PAREN);
						}
						break;

					case 2:
						{
						_localctx = new AnnotationBodyContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_annotationBody);
						this.state = 368;
						if (!(this.precpred(this._ctx, 1))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
						}
						this.state = 369;
						this.annotationToken();
						}
						break;
					}
					}
				}
				this.state = 374;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public annotationToken(): AnnotationTokenContext {
		let _localctx: AnnotationTokenContext = new AnnotationTokenContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, P4Parser.RULE_annotationToken);
		try {
			this.state = 458;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.UNEXPECTED_TOKEN:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 375;
				this.match(P4Parser.UNEXPECTED_TOKEN);
				}
				break;
			case P4Parser.ABSTRACT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 376;
				this.match(P4Parser.ABSTRACT);
				}
				break;
			case P4Parser.ACTION:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 377;
				this.match(P4Parser.ACTION);
				}
				break;
			case P4Parser.ACTIONS:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 378;
				this.match(P4Parser.ACTIONS);
				}
				break;
			case P4Parser.APPLY:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 379;
				this.match(P4Parser.APPLY);
				}
				break;
			case P4Parser.BOOL:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 380;
				this.match(P4Parser.BOOL);
				}
				break;
			case P4Parser.BIT:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 381;
				this.match(P4Parser.BIT);
				}
				break;
			case P4Parser.CONST:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 382;
				this.match(P4Parser.CONST);
				}
				break;
			case P4Parser.CONTROL:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 383;
				this.match(P4Parser.CONTROL);
				}
				break;
			case P4Parser.DEFAULT:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 384;
				this.match(P4Parser.DEFAULT);
				}
				break;
			case P4Parser.ELSE:
				this.enterOuterAlt(_localctx, 11);
				{
				this.state = 385;
				this.match(P4Parser.ELSE);
				}
				break;
			case P4Parser.ENTRIES:
				this.enterOuterAlt(_localctx, 12);
				{
				this.state = 386;
				this.match(P4Parser.ENTRIES);
				}
				break;
			case P4Parser.ENUM:
				this.enterOuterAlt(_localctx, 13);
				{
				this.state = 387;
				this.match(P4Parser.ENUM);
				}
				break;
			case P4Parser.ERROR:
				this.enterOuterAlt(_localctx, 14);
				{
				this.state = 388;
				this.match(P4Parser.ERROR);
				}
				break;
			case P4Parser.EXIT:
				this.enterOuterAlt(_localctx, 15);
				{
				this.state = 389;
				this.match(P4Parser.EXIT);
				}
				break;
			case P4Parser.EXTERN:
				this.enterOuterAlt(_localctx, 16);
				{
				this.state = 390;
				this.match(P4Parser.EXTERN);
				}
				break;
			case P4Parser.FALSE:
				this.enterOuterAlt(_localctx, 17);
				{
				this.state = 391;
				this.match(P4Parser.FALSE);
				}
				break;
			case P4Parser.HEADER:
				this.enterOuterAlt(_localctx, 18);
				{
				this.state = 392;
				this.match(P4Parser.HEADER);
				}
				break;
			case P4Parser.HEADER_UNION:
				this.enterOuterAlt(_localctx, 19);
				{
				this.state = 393;
				this.match(P4Parser.HEADER_UNION);
				}
				break;
			case P4Parser.IF:
				this.enterOuterAlt(_localctx, 20);
				{
				this.state = 394;
				this.match(P4Parser.IF);
				}
				break;
			case P4Parser.IN:
				this.enterOuterAlt(_localctx, 21);
				{
				this.state = 395;
				this.match(P4Parser.IN);
				}
				break;
			case P4Parser.INOUT:
				this.enterOuterAlt(_localctx, 22);
				{
				this.state = 396;
				this.match(P4Parser.INOUT);
				}
				break;
			case P4Parser.INT:
				this.enterOuterAlt(_localctx, 23);
				{
				this.state = 397;
				this.match(P4Parser.INT);
				}
				break;
			case P4Parser.KEY:
				this.enterOuterAlt(_localctx, 24);
				{
				this.state = 398;
				this.match(P4Parser.KEY);
				}
				break;
			case P4Parser.MATCH_KIND:
				this.enterOuterAlt(_localctx, 25);
				{
				this.state = 399;
				this.match(P4Parser.MATCH_KIND);
				}
				break;
			case P4Parser.TYPE:
				this.enterOuterAlt(_localctx, 26);
				{
				this.state = 400;
				this.match(P4Parser.TYPE);
				}
				break;
			case P4Parser.OUT:
				this.enterOuterAlt(_localctx, 27);
				{
				this.state = 401;
				this.match(P4Parser.OUT);
				}
				break;
			case P4Parser.PARSER:
				this.enterOuterAlt(_localctx, 28);
				{
				this.state = 402;
				this.match(P4Parser.PARSER);
				}
				break;
			case P4Parser.PACKAGE:
				this.enterOuterAlt(_localctx, 29);
				{
				this.state = 403;
				this.match(P4Parser.PACKAGE);
				}
				break;
			case P4Parser.PRAGMA:
				this.enterOuterAlt(_localctx, 30);
				{
				this.state = 404;
				this.match(P4Parser.PRAGMA);
				}
				break;
			case P4Parser.RETURN:
				this.enterOuterAlt(_localctx, 31);
				{
				this.state = 405;
				this.match(P4Parser.RETURN);
				}
				break;
			case P4Parser.SELECT:
				this.enterOuterAlt(_localctx, 32);
				{
				this.state = 406;
				this.match(P4Parser.SELECT);
				}
				break;
			case P4Parser.STATE:
				this.enterOuterAlt(_localctx, 33);
				{
				this.state = 407;
				this.match(P4Parser.STATE);
				}
				break;
			case P4Parser.STRUCT:
				this.enterOuterAlt(_localctx, 34);
				{
				this.state = 408;
				this.match(P4Parser.STRUCT);
				}
				break;
			case P4Parser.SWITCH:
				this.enterOuterAlt(_localctx, 35);
				{
				this.state = 409;
				this.match(P4Parser.SWITCH);
				}
				break;
			case P4Parser.TABLE:
				this.enterOuterAlt(_localctx, 36);
				{
				this.state = 410;
				this.match(P4Parser.TABLE);
				}
				break;
			case P4Parser.THIS:
				this.enterOuterAlt(_localctx, 37);
				{
				this.state = 411;
				this.match(P4Parser.THIS);
				}
				break;
			case P4Parser.TRANSITION:
				this.enterOuterAlt(_localctx, 38);
				{
				this.state = 412;
				this.match(P4Parser.TRANSITION);
				}
				break;
			case P4Parser.TRUE:
				this.enterOuterAlt(_localctx, 39);
				{
				this.state = 413;
				this.match(P4Parser.TRUE);
				}
				break;
			case P4Parser.TUPLE:
				this.enterOuterAlt(_localctx, 40);
				{
				this.state = 414;
				this.match(P4Parser.TUPLE);
				}
				break;
			case P4Parser.TYPEDEF:
				this.enterOuterAlt(_localctx, 41);
				{
				this.state = 415;
				this.match(P4Parser.TYPEDEF);
				}
				break;
			case P4Parser.VARBIT:
				this.enterOuterAlt(_localctx, 42);
				{
				this.state = 416;
				this.match(P4Parser.VARBIT);
				}
				break;
			case P4Parser.VALUESET:
				this.enterOuterAlt(_localctx, 43);
				{
				this.state = 417;
				this.match(P4Parser.VALUESET);
				}
				break;
			case P4Parser.VOID:
				this.enterOuterAlt(_localctx, 44);
				{
				this.state = 418;
				this.match(P4Parser.VOID);
				}
				break;
			case P4Parser.DONTCARE:
				this.enterOuterAlt(_localctx, 45);
				{
				this.state = 419;
				this.match(P4Parser.DONTCARE);
				}
				break;
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 46);
				{
				this.state = 420;
				this.type_or_id();
				}
				break;
			case P4Parser.STRING_LITERAL:
				this.enterOuterAlt(_localctx, 47);
				{
				this.state = 421;
				this.match(P4Parser.STRING_LITERAL);
				}
				break;
			case P4Parser.INTEGER:
				this.enterOuterAlt(_localctx, 48);
				{
				this.state = 422;
				this.match(P4Parser.INTEGER);
				}
				break;
			case P4Parser.MASK:
				this.enterOuterAlt(_localctx, 49);
				{
				this.state = 423;
				this.match(P4Parser.MASK);
				}
				break;
			case P4Parser.RANGE:
				this.enterOuterAlt(_localctx, 50);
				{
				this.state = 424;
				this.match(P4Parser.RANGE);
				}
				break;
			case P4Parser.SHL:
				this.enterOuterAlt(_localctx, 51);
				{
				this.state = 425;
				this.match(P4Parser.SHL);
				}
				break;
			case P4Parser.AND:
				this.enterOuterAlt(_localctx, 52);
				{
				this.state = 426;
				this.match(P4Parser.AND);
				}
				break;
			case P4Parser.OR:
				this.enterOuterAlt(_localctx, 53);
				{
				this.state = 427;
				this.match(P4Parser.OR);
				}
				break;
			case P4Parser.EQ:
				this.enterOuterAlt(_localctx, 54);
				{
				this.state = 428;
				this.match(P4Parser.EQ);
				}
				break;
			case P4Parser.NE:
				this.enterOuterAlt(_localctx, 55);
				{
				this.state = 429;
				this.match(P4Parser.NE);
				}
				break;
			case P4Parser.GE:
				this.enterOuterAlt(_localctx, 56);
				{
				this.state = 430;
				this.match(P4Parser.GE);
				}
				break;
			case P4Parser.LE:
				this.enterOuterAlt(_localctx, 57);
				{
				this.state = 431;
				this.match(P4Parser.LE);
				}
				break;
			case P4Parser.PP:
				this.enterOuterAlt(_localctx, 58);
				{
				this.state = 432;
				this.match(P4Parser.PP);
				}
				break;
			case P4Parser.PLUS:
				this.enterOuterAlt(_localctx, 59);
				{
				this.state = 433;
				this.match(P4Parser.PLUS);
				}
				break;
			case P4Parser.PLUS_SAT:
				this.enterOuterAlt(_localctx, 60);
				{
				this.state = 434;
				this.match(P4Parser.PLUS_SAT);
				}
				break;
			case P4Parser.MINUS:
				this.enterOuterAlt(_localctx, 61);
				{
				this.state = 435;
				this.match(P4Parser.MINUS);
				}
				break;
			case P4Parser.MINUS_SAT:
				this.enterOuterAlt(_localctx, 62);
				{
				this.state = 436;
				this.match(P4Parser.MINUS_SAT);
				}
				break;
			case P4Parser.MUL:
				this.enterOuterAlt(_localctx, 63);
				{
				this.state = 437;
				this.match(P4Parser.MUL);
				}
				break;
			case P4Parser.DIV:
				this.enterOuterAlt(_localctx, 64);
				{
				this.state = 438;
				this.match(P4Parser.DIV);
				}
				break;
			case P4Parser.MOD:
				this.enterOuterAlt(_localctx, 65);
				{
				this.state = 439;
				this.match(P4Parser.MOD);
				}
				break;
			case P4Parser.BIT_OR:
				this.enterOuterAlt(_localctx, 66);
				{
				this.state = 440;
				this.match(P4Parser.BIT_OR);
				}
				break;
			case P4Parser.BIT_AND:
				this.enterOuterAlt(_localctx, 67);
				{
				this.state = 441;
				this.match(P4Parser.BIT_AND);
				}
				break;
			case P4Parser.BIT_XOR:
				this.enterOuterAlt(_localctx, 68);
				{
				this.state = 442;
				this.match(P4Parser.BIT_XOR);
				}
				break;
			case P4Parser.COMPLEMENT:
				this.enterOuterAlt(_localctx, 69);
				{
				this.state = 443;
				this.match(P4Parser.COMPLEMENT);
				}
				break;
			case P4Parser.L_BRACKET:
				this.enterOuterAlt(_localctx, 70);
				{
				this.state = 444;
				this.match(P4Parser.L_BRACKET);
				}
				break;
			case P4Parser.R_BRACKET:
				this.enterOuterAlt(_localctx, 71);
				{
				this.state = 445;
				this.match(P4Parser.R_BRACKET);
				}
				break;
			case P4Parser.L_BRACE:
				this.enterOuterAlt(_localctx, 72);
				{
				this.state = 446;
				this.match(P4Parser.L_BRACE);
				}
				break;
			case P4Parser.R_BRACE:
				this.enterOuterAlt(_localctx, 73);
				{
				this.state = 447;
				this.match(P4Parser.R_BRACE);
				}
				break;
			case P4Parser.L_ANGLE:
				this.enterOuterAlt(_localctx, 74);
				{
				this.state = 448;
				this.match(P4Parser.L_ANGLE);
				}
				break;
			case P4Parser.R_ANGLE:
				this.enterOuterAlt(_localctx, 75);
				{
				this.state = 449;
				this.match(P4Parser.R_ANGLE);
				}
				break;
			case P4Parser.NOT:
				this.enterOuterAlt(_localctx, 76);
				{
				this.state = 450;
				this.match(P4Parser.NOT);
				}
				break;
			case P4Parser.COLON:
				this.enterOuterAlt(_localctx, 77);
				{
				this.state = 451;
				this.match(P4Parser.COLON);
				}
				break;
			case P4Parser.COMMA:
				this.enterOuterAlt(_localctx, 78);
				{
				this.state = 452;
				this.match(P4Parser.COMMA);
				}
				break;
			case P4Parser.QUESTION:
				this.enterOuterAlt(_localctx, 79);
				{
				this.state = 453;
				this.match(P4Parser.QUESTION);
				}
				break;
			case P4Parser.DOT:
				this.enterOuterAlt(_localctx, 80);
				{
				this.state = 454;
				this.match(P4Parser.DOT);
				}
				break;
			case P4Parser.ASSIGN:
				this.enterOuterAlt(_localctx, 81);
				{
				this.state = 455;
				this.match(P4Parser.ASSIGN);
				}
				break;
			case P4Parser.SEMICOLON:
				this.enterOuterAlt(_localctx, 82);
				{
				this.state = 456;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			case P4Parser.AT:
				this.enterOuterAlt(_localctx, 83);
				{
				this.state = 457;
				this.match(P4Parser.AT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public kvList(): KvListContext;
	public kvList(_p: number): KvListContext;
	// @RuleVersion(0)
	public kvList(_p?: number): KvListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: KvListContext = new KvListContext(this._ctx, _parentState);
		let _prevctx: KvListContext = _localctx;
		let _startState: number = 30;
		this.enterRecursionRule(_localctx, 30, P4Parser.RULE_kvList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 461;
			this.kvPair();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 468;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 15, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new KvListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_kvList);
					this.state = 463;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 464;
					this.match(P4Parser.COMMA);
					this.state = 465;
					this.kvPair();
					}
					}
				}
				this.state = 470;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 15, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public kvPair(): KvPairContext {
		let _localctx: KvPairContext = new KvPairContext(this._ctx, this.state);
		this.enterRule(_localctx, 32, P4Parser.RULE_kvPair);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 471;
			this.name();
			this.state = 472;
			this.match(P4Parser.ASSIGN);
			this.state = 473;
			this.expression(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parameterList(): ParameterListContext {
		let _localctx: ParameterListContext = new ParameterListContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, P4Parser.RULE_parameterList);
		try {
			this.state = 477;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.R_PAREN:
				this.enterOuterAlt(_localctx, 1);
				// tslint:disable-next-line:no-empty
				{
				}
				break;
			case P4Parser.PRAGMA:
			case P4Parser.ABSTRACT:
			case P4Parser.ACTION:
			case P4Parser.ACTIONS:
			case P4Parser.APPLY:
			case P4Parser.BOOL:
			case P4Parser.BIT:
			case P4Parser.CONST:
			case P4Parser.CONTROL:
			case P4Parser.ENTRIES:
			case P4Parser.ENUM:
			case P4Parser.ERROR:
			case P4Parser.EXTERN:
			case P4Parser.HEADER:
			case P4Parser.HEADER_UNION:
			case P4Parser.IN:
			case P4Parser.INOUT:
			case P4Parser.INT:
			case P4Parser.KEY:
			case P4Parser.TYPE:
			case P4Parser.OUT:
			case P4Parser.PARSER:
			case P4Parser.PACKAGE:
			case P4Parser.STATE:
			case P4Parser.STRUCT:
			case P4Parser.TABLE:
			case P4Parser.TUPLE:
			case P4Parser.TYPEDEF:
			case P4Parser.VARBIT:
			case P4Parser.VALUESET:
			case P4Parser.VOID:
			case P4Parser.L_BRACE:
			case P4Parser.DOT:
			case P4Parser.SEMICOLON:
			case P4Parser.AT:
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 476;
				this.nonEmptyParameterList(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public nonEmptyParameterList(): NonEmptyParameterListContext;
	public nonEmptyParameterList(_p: number): NonEmptyParameterListContext;
	// @RuleVersion(0)
	public nonEmptyParameterList(_p?: number): NonEmptyParameterListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: NonEmptyParameterListContext = new NonEmptyParameterListContext(this._ctx, _parentState);
		let _prevctx: NonEmptyParameterListContext = _localctx;
		let _startState: number = 36;
		this.enterRecursionRule(_localctx, 36, P4Parser.RULE_nonEmptyParameterList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 480;
			this.parameter();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 487;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 17, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new NonEmptyParameterListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_nonEmptyParameterList);
					this.state = 482;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 483;
					this.match(P4Parser.COMMA);
					this.state = 484;
					this.parameter();
					}
					}
				}
				this.state = 489;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 17, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parameter(): ParameterContext {
		let _localctx: ParameterContext = new ParameterContext(this._ctx, this.state);
		this.enterRule(_localctx, 38, P4Parser.RULE_parameter);
		try {
			this.state = 502;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 18, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 490;
				this.optAnnotations();
				this.state = 491;
				this.direction();
				this.state = 492;
				this.typeRef();
				this.state = 493;
				this.name();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 495;
				this.optAnnotations();
				this.state = 496;
				this.direction();
				this.state = 497;
				this.typeRef();
				this.state = 498;
				this.name();
				this.state = 499;
				this.match(P4Parser.ASSIGN);
				this.state = 500;
				this.expression(0);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public direction(): DirectionContext {
		let _localctx: DirectionContext = new DirectionContext(this._ctx, this.state);
		this.enterRule(_localctx, 40, P4Parser.RULE_direction);
		try {
			this.state = 508;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.IN:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 504;
				this.match(P4Parser.IN);
				}
				break;
			case P4Parser.OUT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 505;
				this.match(P4Parser.OUT);
				}
				break;
			case P4Parser.INOUT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 506;
				this.match(P4Parser.INOUT);
				}
				break;
			case P4Parser.BOOL:
			case P4Parser.BIT:
			case P4Parser.ERROR:
			case P4Parser.INT:
			case P4Parser.TUPLE:
			case P4Parser.VARBIT:
			case P4Parser.DOT:
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 4);
				// tslint:disable-next-line:no-empty
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public packageTypeDeclaration(): PackageTypeDeclarationContext {
		let _localctx: PackageTypeDeclarationContext = new PackageTypeDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, P4Parser.RULE_packageTypeDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 510;
			this.optAnnotations();
			this.state = 511;
			this.match(P4Parser.PACKAGE);
			this.state = 512;
			this.name();
			this.state = 513;
			this.optTypeParameters();
			this.state = 514;
			this.match(P4Parser.L_PAREN);
			this.state = 515;
			this.parameterList();
			this.state = 516;
			this.match(P4Parser.R_PAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public instantiation(): InstantiationContext {
		let _localctx: InstantiationContext = new InstantiationContext(this._ctx, this.state);
		this.enterRule(_localctx, 44, P4Parser.RULE_instantiation);
		try {
			this.state = 552;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 20, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 518;
				this.annotations(0);
				this.state = 519;
				this.typeRef();
				this.state = 520;
				this.match(P4Parser.L_PAREN);
				this.state = 521;
				this.argumentList();
				this.state = 522;
				this.match(P4Parser.R_PAREN);
				this.state = 523;
				this.name();
				this.state = 524;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 526;
				this.typeRef();
				this.state = 527;
				this.match(P4Parser.L_PAREN);
				this.state = 528;
				this.argumentList();
				this.state = 529;
				this.match(P4Parser.R_PAREN);
				this.state = 530;
				this.name();
				this.state = 531;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 533;
				this.annotations(0);
				this.state = 534;
				this.typeRef();
				this.state = 535;
				this.match(P4Parser.L_PAREN);
				this.state = 536;
				this.argumentList();
				this.state = 537;
				this.match(P4Parser.R_PAREN);
				this.state = 538;
				this.name();
				this.state = 539;
				this.match(P4Parser.ASSIGN);
				this.state = 540;
				this.objInitializer();
				this.state = 541;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 543;
				this.typeRef();
				this.state = 544;
				this.match(P4Parser.L_PAREN);
				this.state = 545;
				this.argumentList();
				this.state = 546;
				this.match(P4Parser.R_PAREN);
				this.state = 547;
				this.name();
				this.state = 548;
				this.match(P4Parser.ASSIGN);
				this.state = 549;
				this.objInitializer();
				this.state = 550;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public objInitializer(): ObjInitializerContext {
		let _localctx: ObjInitializerContext = new ObjInitializerContext(this._ctx, this.state);
		this.enterRule(_localctx, 46, P4Parser.RULE_objInitializer);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 554;
			this.match(P4Parser.L_BRACE);
			this.state = 555;
			this.objDeclarations(0);
			this.state = 556;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public objDeclarations(): ObjDeclarationsContext;
	public objDeclarations(_p: number): ObjDeclarationsContext;
	// @RuleVersion(0)
	public objDeclarations(_p?: number): ObjDeclarationsContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: ObjDeclarationsContext = new ObjDeclarationsContext(this._ctx, _parentState);
		let _prevctx: ObjDeclarationsContext = _localctx;
		let _startState: number = 48;
		this.enterRecursionRule(_localctx, 48, P4Parser.RULE_objDeclarations, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 563;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 21, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new ObjDeclarationsContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_objDeclarations);
					this.state = 559;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 560;
					this.objDeclaration();
					}
					}
				}
				this.state = 565;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 21, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public objDeclaration(): ObjDeclarationContext {
		let _localctx: ObjDeclarationContext = new ObjDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 50, P4Parser.RULE_objDeclaration);
		try {
			this.state = 568;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 22, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 566;
				this.functionDeclaration();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 567;
				this.instantiation();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public optConstructorParameters(): OptConstructorParametersContext {
		let _localctx: OptConstructorParametersContext = new OptConstructorParametersContext(this._ctx, this.state);
		this.enterRule(_localctx, 52, P4Parser.RULE_optConstructorParameters);
		try {
			this.state = 575;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.L_BRACE:
				this.enterOuterAlt(_localctx, 1);
				// tslint:disable-next-line:no-empty
				{
				}
				break;
			case P4Parser.L_PAREN:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 571;
				this.match(P4Parser.L_PAREN);
				this.state = 572;
				this.parameterList();
				this.state = 573;
				this.match(P4Parser.R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public dotPrefix(): DotPrefixContext {
		let _localctx: DotPrefixContext = new DotPrefixContext(this._ctx, this.state);
		this.enterRule(_localctx, 54, P4Parser.RULE_dotPrefix);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 577;
			this.match(P4Parser.DOT);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parserDeclaration(): ParserDeclarationContext {
		let _localctx: ParserDeclarationContext = new ParserDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 56, P4Parser.RULE_parserDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 579;
			this.parserTypeDeclaration();
			this.state = 580;
			this.optConstructorParameters();
			this.state = 581;
			this.match(P4Parser.L_BRACE);
			this.state = 582;
			this.parserLocalElements(0);
			this.state = 583;
			this.parserStates(0);
			this.state = 584;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public parserLocalElements(): ParserLocalElementsContext;
	public parserLocalElements(_p: number): ParserLocalElementsContext;
	// @RuleVersion(0)
	public parserLocalElements(_p?: number): ParserLocalElementsContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: ParserLocalElementsContext = new ParserLocalElementsContext(this._ctx, _parentState);
		let _prevctx: ParserLocalElementsContext = _localctx;
		let _startState: number = 58;
		this.enterRecursionRule(_localctx, 58, P4Parser.RULE_parserLocalElements, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 591;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 24, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new ParserLocalElementsContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_parserLocalElements);
					this.state = 587;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 588;
					this.parserLocalElement();
					}
					}
				}
				this.state = 593;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 24, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parserLocalElement(): ParserLocalElementContext {
		let _localctx: ParserLocalElementContext = new ParserLocalElementContext(this._ctx, this.state);
		this.enterRule(_localctx, 60, P4Parser.RULE_parserLocalElement);
		try {
			this.state = 598;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 25, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 594;
				this.constantDeclaration();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 595;
				this.instantiation();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 596;
				this.variableDeclaration();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 597;
				this.valueSetDeclaration();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parserTypeDeclaration(): ParserTypeDeclarationContext {
		let _localctx: ParserTypeDeclarationContext = new ParserTypeDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 62, P4Parser.RULE_parserTypeDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 600;
			this.optAnnotations();
			this.state = 601;
			this.match(P4Parser.PARSER);
			this.state = 602;
			this.name();
			this.state = 603;
			this.optTypeParameters();
			this.state = 604;
			this.match(P4Parser.L_PAREN);
			this.state = 605;
			this.parameterList();
			this.state = 606;
			this.match(P4Parser.R_PAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public parserStates(): ParserStatesContext;
	public parserStates(_p: number): ParserStatesContext;
	// @RuleVersion(0)
	public parserStates(_p?: number): ParserStatesContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: ParserStatesContext = new ParserStatesContext(this._ctx, _parentState);
		let _prevctx: ParserStatesContext = _localctx;
		let _startState: number = 64;
		this.enterRecursionRule(_localctx, 64, P4Parser.RULE_parserStates, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 609;
			this.parserState();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 615;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 26, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new ParserStatesContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_parserStates);
					this.state = 611;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 612;
					this.parserState();
					}
					}
				}
				this.state = 617;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 26, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parserState(): ParserStateContext {
		let _localctx: ParserStateContext = new ParserStateContext(this._ctx, this.state);
		this.enterRule(_localctx, 66, P4Parser.RULE_parserState);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 618;
			this.optAnnotations();
			this.state = 619;
			this.match(P4Parser.STATE);
			this.state = 620;
			this.name();
			this.state = 621;
			this.match(P4Parser.L_BRACE);
			this.state = 622;
			this.parserStatements(0);
			this.state = 623;
			this.transitionStatement();
			this.state = 624;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public parserStatements(): ParserStatementsContext;
	public parserStatements(_p: number): ParserStatementsContext;
	// @RuleVersion(0)
	public parserStatements(_p?: number): ParserStatementsContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: ParserStatementsContext = new ParserStatementsContext(this._ctx, _parentState);
		let _prevctx: ParserStatementsContext = _localctx;
		let _startState: number = 68;
		this.enterRecursionRule(_localctx, 68, P4Parser.RULE_parserStatements, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 631;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 27, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new ParserStatementsContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_parserStatements);
					this.state = 627;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 628;
					this.parserStatement();
					}
					}
				}
				this.state = 633;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 27, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parserStatement(): ParserStatementContext {
		let _localctx: ParserStatementContext = new ParserStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 70, P4Parser.RULE_parserStatement);
		try {
			this.state = 639;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 28, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 634;
				this.assignmentOrMethodCallStatement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 635;
				this.directApplication();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 636;
				this.variableDeclaration();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 637;
				this.constantDeclaration();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 638;
				this.parserBlockStatement();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parserBlockStatement(): ParserBlockStatementContext {
		let _localctx: ParserBlockStatementContext = new ParserBlockStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 72, P4Parser.RULE_parserBlockStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 641;
			this.optAnnotations();
			this.state = 642;
			this.match(P4Parser.L_BRACE);
			this.state = 643;
			this.parserStatements(0);
			this.state = 644;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public transitionStatement(): TransitionStatementContext {
		let _localctx: TransitionStatementContext = new TransitionStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 74, P4Parser.RULE_transitionStatement);
		try {
			this.state = 649;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.R_BRACE:
				this.enterOuterAlt(_localctx, 1);
				// tslint:disable-next-line:no-empty
				{
				}
				break;
			case P4Parser.TRANSITION:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 647;
				this.match(P4Parser.TRANSITION);
				this.state = 648;
				this.stateExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public stateExpression(): StateExpressionContext {
		let _localctx: StateExpressionContext = new StateExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 76, P4Parser.RULE_stateExpression);
		try {
			this.state = 655;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.ACTIONS:
			case P4Parser.APPLY:
			case P4Parser.ENTRIES:
			case P4Parser.KEY:
			case P4Parser.TYPE:
			case P4Parser.STATE:
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 651;
				this.name();
				this.state = 652;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			case P4Parser.SELECT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 654;
				this.selectExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectExpression(): SelectExpressionContext {
		let _localctx: SelectExpressionContext = new SelectExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 78, P4Parser.RULE_selectExpression);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 657;
			this.match(P4Parser.SELECT);
			this.state = 658;
			this.match(P4Parser.L_PAREN);
			this.state = 659;
			this.expressionList(0);
			this.state = 660;
			this.match(P4Parser.R_PAREN);
			this.state = 661;
			this.match(P4Parser.L_BRACE);
			this.state = 662;
			this.selectCaseList(0);
			this.state = 663;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public selectCaseList(): SelectCaseListContext;
	public selectCaseList(_p: number): SelectCaseListContext;
	// @RuleVersion(0)
	public selectCaseList(_p?: number): SelectCaseListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: SelectCaseListContext = new SelectCaseListContext(this._ctx, _parentState);
		let _prevctx: SelectCaseListContext = _localctx;
		let _startState: number = 80;
		this.enterRecursionRule(_localctx, 80, P4Parser.RULE_selectCaseList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 670;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 31, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectCaseListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_selectCaseList);
					this.state = 666;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 667;
					this.selectCase();
					}
					}
				}
				this.state = 672;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 31, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectCase(): SelectCaseContext {
		let _localctx: SelectCaseContext = new SelectCaseContext(this._ctx, this.state);
		this.enterRule(_localctx, 82, P4Parser.RULE_selectCase);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 673;
			this.keysetExpression();
			this.state = 674;
			this.match(P4Parser.COLON);
			this.state = 675;
			this.name();
			this.state = 676;
			this.match(P4Parser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public keysetExpression(): KeysetExpressionContext {
		let _localctx: KeysetExpressionContext = new KeysetExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 84, P4Parser.RULE_keysetExpression);
		try {
			this.state = 680;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 32, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 678;
				this.tupleKeysetExpression();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 679;
				this.simpleKeysetExpression();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public tupleKeysetExpression(): TupleKeysetExpressionContext {
		let _localctx: TupleKeysetExpressionContext = new TupleKeysetExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 86, P4Parser.RULE_tupleKeysetExpression);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 682;
			this.match(P4Parser.L_PAREN);
			this.state = 683;
			this.simpleKeysetExpression();
			this.state = 684;
			this.match(P4Parser.COMMA);
			this.state = 685;
			this.simpleExpressionList(0);
			this.state = 686;
			this.match(P4Parser.R_PAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public simpleExpressionList(): SimpleExpressionListContext;
	public simpleExpressionList(_p: number): SimpleExpressionListContext;
	// @RuleVersion(0)
	public simpleExpressionList(_p?: number): SimpleExpressionListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: SimpleExpressionListContext = new SimpleExpressionListContext(this._ctx, _parentState);
		let _prevctx: SimpleExpressionListContext = _localctx;
		let _startState: number = 88;
		this.enterRecursionRule(_localctx, 88, P4Parser.RULE_simpleExpressionList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 689;
			this.simpleKeysetExpression();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 696;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 33, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpressionListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_simpleExpressionList);
					this.state = 691;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 692;
					this.match(P4Parser.COMMA);
					this.state = 693;
					this.simpleKeysetExpression();
					}
					}
				}
				this.state = 698;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 33, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public simpleKeysetExpression(): SimpleKeysetExpressionContext {
		let _localctx: SimpleKeysetExpressionContext = new SimpleKeysetExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 90, P4Parser.RULE_simpleKeysetExpression);
		try {
			this.state = 710;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 34, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 699;
				this.expression(0);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 700;
				this.expression(0);
				this.state = 701;
				this.match(P4Parser.MASK);
				this.state = 702;
				this.expression(0);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 704;
				this.expression(0);
				this.state = 705;
				this.match(P4Parser.RANGE);
				this.state = 706;
				this.expression(0);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 708;
				this.match(P4Parser.DEFAULT);
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 709;
				this.match(P4Parser.DONTCARE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public valueSetDeclaration(): ValueSetDeclarationContext {
		let _localctx: ValueSetDeclarationContext = new ValueSetDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 92, P4Parser.RULE_valueSetDeclaration);
		try {
			this.state = 745;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 35, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 712;
				this.optAnnotations();
				this.state = 713;
				this.match(P4Parser.VALUESET);
				this.state = 714;
				this.match(P4Parser.L_ANGLE);
				this.state = 715;
				this.baseType();
				this.state = 716;
				this.match(P4Parser.R_ANGLE);
				this.state = 717;
				this.match(P4Parser.L_PAREN);
				this.state = 718;
				this.expression(0);
				this.state = 719;
				this.match(P4Parser.R_PAREN);
				this.state = 720;
				this.name();
				this.state = 721;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 723;
				this.optAnnotations();
				this.state = 724;
				this.match(P4Parser.VALUESET);
				this.state = 725;
				this.match(P4Parser.L_ANGLE);
				this.state = 726;
				this.tupleType();
				this.state = 727;
				this.match(P4Parser.R_ANGLE);
				this.state = 728;
				this.match(P4Parser.L_PAREN);
				this.state = 729;
				this.expression(0);
				this.state = 730;
				this.match(P4Parser.R_PAREN);
				this.state = 731;
				this.name();
				this.state = 732;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 734;
				this.optAnnotations();
				this.state = 735;
				this.match(P4Parser.VALUESET);
				this.state = 736;
				this.match(P4Parser.L_ANGLE);
				this.state = 737;
				this.typeName();
				this.state = 738;
				this.match(P4Parser.R_ANGLE);
				this.state = 739;
				this.match(P4Parser.L_PAREN);
				this.state = 740;
				this.expression(0);
				this.state = 741;
				this.match(P4Parser.R_PAREN);
				this.state = 742;
				this.name();
				this.state = 743;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public controlDeclaration(): ControlDeclarationContext {
		let _localctx: ControlDeclarationContext = new ControlDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 94, P4Parser.RULE_controlDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 747;
			this.controlTypeDeclaration();
			this.state = 748;
			this.optConstructorParameters();
			this.state = 749;
			this.match(P4Parser.L_BRACE);
			this.state = 750;
			this.controlLocalDeclarations(0);
			this.state = 751;
			this.match(P4Parser.APPLY);
			this.state = 752;
			this.controlBody();
			this.state = 753;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public controlTypeDeclaration(): ControlTypeDeclarationContext {
		let _localctx: ControlTypeDeclarationContext = new ControlTypeDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 96, P4Parser.RULE_controlTypeDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 755;
			this.optAnnotations();
			this.state = 756;
			this.match(P4Parser.CONTROL);
			this.state = 757;
			this.name();
			this.state = 758;
			this.optTypeParameters();
			this.state = 759;
			this.match(P4Parser.L_PAREN);
			this.state = 760;
			this.parameterList();
			this.state = 761;
			this.match(P4Parser.R_PAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public controlLocalDeclarations(): ControlLocalDeclarationsContext;
	public controlLocalDeclarations(_p: number): ControlLocalDeclarationsContext;
	// @RuleVersion(0)
	public controlLocalDeclarations(_p?: number): ControlLocalDeclarationsContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: ControlLocalDeclarationsContext = new ControlLocalDeclarationsContext(this._ctx, _parentState);
		let _prevctx: ControlLocalDeclarationsContext = _localctx;
		let _startState: number = 98;
		this.enterRecursionRule(_localctx, 98, P4Parser.RULE_controlLocalDeclarations, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 768;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 36, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new ControlLocalDeclarationsContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_controlLocalDeclarations);
					this.state = 764;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 765;
					this.controlLocalDeclaration();
					}
					}
				}
				this.state = 770;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 36, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public controlLocalDeclaration(): ControlLocalDeclarationContext {
		let _localctx: ControlLocalDeclarationContext = new ControlLocalDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 100, P4Parser.RULE_controlLocalDeclaration);
		try {
			this.state = 776;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 37, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 771;
				this.constantDeclaration();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 772;
				this.actionDeclaration();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 773;
				this.tableDeclaration();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 774;
				this.instantiation();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 775;
				this.variableDeclaration();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public controlBody(): ControlBodyContext {
		let _localctx: ControlBodyContext = new ControlBodyContext(this._ctx, this.state);
		this.enterRule(_localctx, 102, P4Parser.RULE_controlBody);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 778;
			this.blockStatement();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public externDeclaration(): ExternDeclarationContext {
		let _localctx: ExternDeclarationContext = new ExternDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 104, P4Parser.RULE_externDeclaration);
		try {
			this.state = 798;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 38, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 780;
				this.optAnnotations();
				this.state = 781;
				this.match(P4Parser.EXTERN);
				this.state = 782;
				this.nonTypeName();
				this.state = 783;
				this.optTypeParameters();
				this.state = 784;
				this.match(P4Parser.L_BRACE);
				this.state = 785;
				this.methodPrototypes(0);
				this.state = 786;
				this.match(P4Parser.R_BRACE);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 788;
				this.optAnnotations();
				this.state = 789;
				this.match(P4Parser.EXTERN);
				this.state = 790;
				this.functionPrototype();
				this.state = 791;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 793;
				this.optAnnotations();
				this.state = 794;
				this.match(P4Parser.EXTERN);
				this.state = 795;
				this.name();
				this.state = 796;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public methodPrototypes(): MethodPrototypesContext;
	public methodPrototypes(_p: number): MethodPrototypesContext;
	// @RuleVersion(0)
	public methodPrototypes(_p?: number): MethodPrototypesContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: MethodPrototypesContext = new MethodPrototypesContext(this._ctx, _parentState);
		let _prevctx: MethodPrototypesContext = _localctx;
		let _startState: number = 106;
		this.enterRecursionRule(_localctx, 106, P4Parser.RULE_methodPrototypes, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 805;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 39, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new MethodPrototypesContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_methodPrototypes);
					this.state = 801;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 802;
					this.methodPrototype();
					}
					}
				}
				this.state = 807;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 39, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionPrototype(): FunctionPrototypeContext {
		let _localctx: FunctionPrototypeContext = new FunctionPrototypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 108, P4Parser.RULE_functionPrototype);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 808;
			this.typeOrVoid();
			this.state = 809;
			this.name();
			this.state = 810;
			this.optTypeParameters();
			this.state = 811;
			this.match(P4Parser.L_PAREN);
			this.state = 812;
			this.parameterList();
			this.state = 813;
			this.match(P4Parser.R_PAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public methodPrototype(): MethodPrototypeContext {
		let _localctx: MethodPrototypeContext = new MethodPrototypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 110, P4Parser.RULE_methodPrototype);
		try {
			this.state = 831;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 40, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 815;
				this.optAnnotations();
				this.state = 816;
				this.functionPrototype();
				this.state = 817;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 819;
				this.optAnnotations();
				this.state = 820;
				this.match(P4Parser.ABSTRACT);
				this.state = 821;
				this.functionPrototype();
				this.state = 822;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 824;
				this.optAnnotations();
				this.state = 825;
				this.type_or_id();
				this.state = 826;
				this.match(P4Parser.L_PAREN);
				this.state = 827;
				this.parameterList();
				this.state = 828;
				this.match(P4Parser.R_PAREN);
				this.state = 829;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public typeRef(): TypeRefContext {
		let _localctx: TypeRefContext = new TypeRefContext(this._ctx, this.state);
		this.enterRule(_localctx, 112, P4Parser.RULE_typeRef);
		try {
			this.state = 838;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 41, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 833;
				this.baseType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 834;
				this.typeName();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 835;
				this.specializedType();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 836;
				this.headerStackType();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 837;
				this.tupleType();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public namedType(): NamedTypeContext {
		let _localctx: NamedTypeContext = new NamedTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 114, P4Parser.RULE_namedType);
		try {
			this.state = 842;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 42, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 840;
				this.typeName();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 841;
				this.specializedType();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public prefixedType(): PrefixedTypeContext {
		let _localctx: PrefixedTypeContext = new PrefixedTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 116, P4Parser.RULE_prefixedType);
		try {
			this.state = 848;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 844;
				this.type_or_id();
				}
				break;
			case P4Parser.DOT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 845;
				this.dotPrefix();
				this.state = 846;
				this.type_or_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public typeName(): TypeNameContext {
		let _localctx: TypeNameContext = new TypeNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 118, P4Parser.RULE_typeName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 850;
			this.prefixedType();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public tupleType(): TupleTypeContext {
		let _localctx: TupleTypeContext = new TupleTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 120, P4Parser.RULE_tupleType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 852;
			this.match(P4Parser.TUPLE);
			this.state = 853;
			this.match(P4Parser.L_ANGLE);
			this.state = 854;
			this.typeArgumentList(0);
			this.state = 855;
			this.match(P4Parser.R_ANGLE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public headerStackType(): HeaderStackTypeContext {
		let _localctx: HeaderStackTypeContext = new HeaderStackTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 122, P4Parser.RULE_headerStackType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 857;
			this.typeName();
			this.state = 858;
			this.match(P4Parser.L_BRACKET);
			this.state = 859;
			this.expression(0);
			this.state = 860;
			this.match(P4Parser.R_BRACKET);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public specializedType(): SpecializedTypeContext {
		let _localctx: SpecializedTypeContext = new SpecializedTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 124, P4Parser.RULE_specializedType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 862;
			this.typeName();
			this.state = 863;
			this.match(P4Parser.L_ANGLE);
			this.state = 864;
			this.typeArgumentList(0);
			this.state = 865;
			this.match(P4Parser.R_ANGLE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public baseType(): BaseTypeContext {
		let _localctx: BaseTypeContext = new BaseTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 126, P4Parser.RULE_baseType);
		try {
			this.state = 904;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 44, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 867;
				this.match(P4Parser.BOOL);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 868;
				this.match(P4Parser.ERROR);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 869;
				this.match(P4Parser.BIT);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 870;
				this.match(P4Parser.INT);
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 871;
				this.match(P4Parser.BIT);
				this.state = 872;
				this.match(P4Parser.L_ANGLE);
				this.state = 873;
				this.match(P4Parser.INTEGER);
				this.state = 874;
				this.match(P4Parser.R_ANGLE);
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 875;
				this.match(P4Parser.INT);
				this.state = 876;
				this.match(P4Parser.L_ANGLE);
				this.state = 877;
				this.match(P4Parser.INTEGER);
				this.state = 878;
				this.match(P4Parser.R_ANGLE);
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 879;
				this.match(P4Parser.VARBIT);
				this.state = 880;
				this.match(P4Parser.L_ANGLE);
				this.state = 881;
				this.match(P4Parser.INTEGER);
				this.state = 882;
				this.match(P4Parser.R_ANGLE);
				}
				break;

			case 8:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 883;
				this.match(P4Parser.BIT);
				this.state = 884;
				this.match(P4Parser.L_ANGLE);
				this.state = 885;
				this.match(P4Parser.L_PAREN);
				this.state = 886;
				this.expression(0);
				this.state = 887;
				this.match(P4Parser.R_PAREN);
				this.state = 888;
				this.match(P4Parser.R_ANGLE);
				}
				break;

			case 9:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 890;
				this.match(P4Parser.INT);
				this.state = 891;
				this.match(P4Parser.L_ANGLE);
				this.state = 892;
				this.match(P4Parser.L_PAREN);
				this.state = 893;
				this.expression(0);
				this.state = 894;
				this.match(P4Parser.R_PAREN);
				this.state = 895;
				this.match(P4Parser.R_ANGLE);
				}
				break;

			case 10:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 897;
				this.match(P4Parser.VARBIT);
				this.state = 898;
				this.match(P4Parser.L_ANGLE);
				this.state = 899;
				this.match(P4Parser.L_PAREN);
				this.state = 900;
				this.expression(0);
				this.state = 901;
				this.match(P4Parser.R_PAREN);
				this.state = 902;
				this.match(P4Parser.R_ANGLE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public typeOrVoid(): TypeOrVoidContext {
		let _localctx: TypeOrVoidContext = new TypeOrVoidContext(this._ctx, this.state);
		this.enterRule(_localctx, 128, P4Parser.RULE_typeOrVoid);
		try {
			this.state = 909;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 45, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 906;
				this.typeRef();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 907;
				this.match(P4Parser.VOID);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 908;
				this.type_or_id();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public optTypeParameters(): OptTypeParametersContext {
		let _localctx: OptTypeParametersContext = new OptTypeParametersContext(this._ctx, this.state);
		this.enterRule(_localctx, 130, P4Parser.RULE_optTypeParameters);
		try {
			this.state = 916;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.L_PAREN:
			case P4Parser.L_BRACE:
				this.enterOuterAlt(_localctx, 1);
				// tslint:disable-next-line:no-empty
				{
				}
				break;
			case P4Parser.L_ANGLE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 912;
				this.match(P4Parser.L_ANGLE);
				this.state = 913;
				this.typeParameterList(0);
				this.state = 914;
				this.match(P4Parser.R_ANGLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public typeParameterList(): TypeParameterListContext;
	public typeParameterList(_p: number): TypeParameterListContext;
	// @RuleVersion(0)
	public typeParameterList(_p?: number): TypeParameterListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: TypeParameterListContext = new TypeParameterListContext(this._ctx, _parentState);
		let _prevctx: TypeParameterListContext = _localctx;
		let _startState: number = 132;
		this.enterRecursionRule(_localctx, 132, P4Parser.RULE_typeParameterList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 919;
			this.name();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 926;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 47, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeParameterListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_typeParameterList);
					this.state = 921;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 922;
					this.match(P4Parser.COMMA);
					this.state = 923;
					this.name();
					}
					}
				}
				this.state = 928;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 47, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public typeArg(): TypeArgContext {
		let _localctx: TypeArgContext = new TypeArgContext(this._ctx, this.state);
		this.enterRule(_localctx, 134, P4Parser.RULE_typeArg);
		try {
			this.state = 933;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 48, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 929;
				this.typeRef();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 930;
				this.nonTypeName();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 931;
				this.match(P4Parser.VOID);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 932;
				this.match(P4Parser.DONTCARE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public typeArgumentList(): TypeArgumentListContext;
	public typeArgumentList(_p: number): TypeArgumentListContext;
	// @RuleVersion(0)
	public typeArgumentList(_p?: number): TypeArgumentListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: TypeArgumentListContext = new TypeArgumentListContext(this._ctx, _parentState);
		let _prevctx: TypeArgumentListContext = _localctx;
		let _startState: number = 136;
		this.enterRecursionRule(_localctx, 136, P4Parser.RULE_typeArgumentList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 937;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 49, this._ctx) ) {
			case 1:
				{
				}
				break;

			case 2:
				{
				this.state = 936;
				this.typeArg();
				}
				break;
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 944;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 50, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeArgumentListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_typeArgumentList);
					this.state = 939;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 940;
					this.match(P4Parser.COMMA);
					this.state = 941;
					this.typeArg();
					}
					}
				}
				this.state = 946;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 50, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public realTypeArg(): RealTypeArgContext {
		let _localctx: RealTypeArgContext = new RealTypeArgContext(this._ctx, this.state);
		this.enterRule(_localctx, 138, P4Parser.RULE_realTypeArg);
		try {
			this.state = 950;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.BOOL:
			case P4Parser.BIT:
			case P4Parser.ERROR:
			case P4Parser.INT:
			case P4Parser.TUPLE:
			case P4Parser.VARBIT:
			case P4Parser.DOT:
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 947;
				this.typeRef();
				}
				break;
			case P4Parser.VOID:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 948;
				this.match(P4Parser.VOID);
				}
				break;
			case P4Parser.DONTCARE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 949;
				this.match(P4Parser.DONTCARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public realTypeArgumentList(): RealTypeArgumentListContext;
	public realTypeArgumentList(_p: number): RealTypeArgumentListContext;
	// @RuleVersion(0)
	public realTypeArgumentList(_p?: number): RealTypeArgumentListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: RealTypeArgumentListContext = new RealTypeArgumentListContext(this._ctx, _parentState);
		let _prevctx: RealTypeArgumentListContext = _localctx;
		let _startState: number = 140;
		this.enterRecursionRule(_localctx, 140, P4Parser.RULE_realTypeArgumentList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 953;
			this.realTypeArg();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 960;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 52, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new RealTypeArgumentListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_realTypeArgumentList);
					this.state = 955;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 956;
					this.match(P4Parser.COMMA);
					this.state = 957;
					this.typeArg();
					}
					}
				}
				this.state = 962;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 52, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public typeDeclaration(): TypeDeclarationContext {
		let _localctx: TypeDeclarationContext = new TypeDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 142, P4Parser.RULE_typeDeclaration);
		try {
			this.state = 976;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 53, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 963;
				this.derivedTypeDeclaration();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 964;
				this.typedefDeclaration();
				this.state = 965;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 967;
				this.parserTypeDeclaration();
				this.state = 968;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 970;
				this.controlTypeDeclaration();
				this.state = 971;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 973;
				this.packageTypeDeclaration();
				this.state = 974;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public derivedTypeDeclaration(): DerivedTypeDeclarationContext {
		let _localctx: DerivedTypeDeclarationContext = new DerivedTypeDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 144, P4Parser.RULE_derivedTypeDeclaration);
		try {
			this.state = 982;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 54, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 978;
				this.headerTypeDeclaration();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 979;
				this.headerUnionDeclaration();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 980;
				this.structTypeDeclaration();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 981;
				this.enumDeclaration();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public headerTypeDeclaration(): HeaderTypeDeclarationContext {
		let _localctx: HeaderTypeDeclarationContext = new HeaderTypeDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 146, P4Parser.RULE_headerTypeDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 984;
			this.optAnnotations();
			this.state = 985;
			this.match(P4Parser.HEADER);
			this.state = 986;
			this.name();
			this.state = 987;
			this.match(P4Parser.L_BRACE);
			this.state = 988;
			this.structFieldList(0);
			this.state = 989;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public structTypeDeclaration(): StructTypeDeclarationContext {
		let _localctx: StructTypeDeclarationContext = new StructTypeDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 148, P4Parser.RULE_structTypeDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 991;
			this.optAnnotations();
			this.state = 992;
			this.match(P4Parser.STRUCT);
			this.state = 993;
			this.name();
			this.state = 994;
			this.match(P4Parser.L_BRACE);
			this.state = 995;
			this.structFieldList(0);
			this.state = 996;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public headerUnionDeclaration(): HeaderUnionDeclarationContext {
		let _localctx: HeaderUnionDeclarationContext = new HeaderUnionDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 150, P4Parser.RULE_headerUnionDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 998;
			this.optAnnotations();
			this.state = 999;
			this.match(P4Parser.HEADER_UNION);
			this.state = 1000;
			this.name();
			this.state = 1001;
			this.match(P4Parser.L_BRACE);
			this.state = 1002;
			this.structFieldList(0);
			this.state = 1003;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public structFieldList(): StructFieldListContext;
	public structFieldList(_p: number): StructFieldListContext;
	// @RuleVersion(0)
	public structFieldList(_p?: number): StructFieldListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: StructFieldListContext = new StructFieldListContext(this._ctx, _parentState);
		let _prevctx: StructFieldListContext = _localctx;
		let _startState: number = 152;
		this.enterRecursionRule(_localctx, 152, P4Parser.RULE_structFieldList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1010;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 55, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new StructFieldListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_structFieldList);
					this.state = 1006;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 1007;
					this.structField();
					}
					}
				}
				this.state = 1012;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 55, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public structField(): StructFieldContext {
		let _localctx: StructFieldContext = new StructFieldContext(this._ctx, this.state);
		this.enterRule(_localctx, 154, P4Parser.RULE_structField);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1013;
			this.optAnnotations();
			this.state = 1014;
			this.typeRef();
			this.state = 1015;
			this.name();
			this.state = 1016;
			this.match(P4Parser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public enumDeclaration(): EnumDeclarationContext {
		let _localctx: EnumDeclarationContext = new EnumDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 156, P4Parser.RULE_enumDeclaration);
		try {
			this.state = 1036;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 56, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1018;
				this.optAnnotations();
				this.state = 1019;
				this.match(P4Parser.ENUM);
				this.state = 1020;
				this.name();
				this.state = 1021;
				this.match(P4Parser.L_BRACE);
				this.state = 1022;
				this.identifierList(0);
				this.state = 1023;
				this.match(P4Parser.R_BRACE);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1025;
				this.optAnnotations();
				this.state = 1026;
				this.match(P4Parser.ENUM);
				this.state = 1027;
				this.match(P4Parser.BIT);
				this.state = 1028;
				this.match(P4Parser.L_ANGLE);
				this.state = 1029;
				this.match(P4Parser.INTEGER);
				this.state = 1030;
				this.match(P4Parser.R_ANGLE);
				this.state = 1031;
				this.name();
				this.state = 1032;
				this.match(P4Parser.L_BRACE);
				this.state = 1033;
				this.specifiedIdentifierList(0);
				this.state = 1034;
				this.match(P4Parser.R_BRACE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public specifiedIdentifierList(): SpecifiedIdentifierListContext;
	public specifiedIdentifierList(_p: number): SpecifiedIdentifierListContext;
	// @RuleVersion(0)
	public specifiedIdentifierList(_p?: number): SpecifiedIdentifierListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: SpecifiedIdentifierListContext = new SpecifiedIdentifierListContext(this._ctx, _parentState);
		let _prevctx: SpecifiedIdentifierListContext = _localctx;
		let _startState: number = 158;
		this.enterRecursionRule(_localctx, 158, P4Parser.RULE_specifiedIdentifierList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 1039;
			this.specifiedIdentifier();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1046;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 57, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new SpecifiedIdentifierListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_specifiedIdentifierList);
					this.state = 1041;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 1042;
					this.match(P4Parser.COMMA);
					this.state = 1043;
					this.specifiedIdentifier();
					}
					}
				}
				this.state = 1048;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 57, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public specifiedIdentifier(): SpecifiedIdentifierContext {
		let _localctx: SpecifiedIdentifierContext = new SpecifiedIdentifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 160, P4Parser.RULE_specifiedIdentifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1049;
			this.name();
			this.state = 1050;
			this.match(P4Parser.ASSIGN);
			this.state = 1051;
			this.initializer();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public errorDeclaration(): ErrorDeclarationContext {
		let _localctx: ErrorDeclarationContext = new ErrorDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 162, P4Parser.RULE_errorDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1053;
			this.match(P4Parser.ERROR);
			this.state = 1054;
			this.match(P4Parser.L_BRACE);
			this.state = 1055;
			this.identifierList(0);
			this.state = 1056;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public matchKindDeclaration(): MatchKindDeclarationContext {
		let _localctx: MatchKindDeclarationContext = new MatchKindDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 164, P4Parser.RULE_matchKindDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1058;
			this.match(P4Parser.MATCH_KIND);
			this.state = 1059;
			this.match(P4Parser.L_BRACE);
			this.state = 1060;
			this.identifierList(0);
			this.state = 1061;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public identifierList(): IdentifierListContext;
	public identifierList(_p: number): IdentifierListContext;
	// @RuleVersion(0)
	public identifierList(_p?: number): IdentifierListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: IdentifierListContext = new IdentifierListContext(this._ctx, _parentState);
		let _prevctx: IdentifierListContext = _localctx;
		let _startState: number = 166;
		this.enterRecursionRule(_localctx, 166, P4Parser.RULE_identifierList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 1064;
			this.name();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1071;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 58, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_identifierList);
					this.state = 1066;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 1067;
					this.match(P4Parser.COMMA);
					this.state = 1068;
					this.name();
					}
					}
				}
				this.state = 1073;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 58, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public typedefDeclaration(): TypedefDeclarationContext {
		let _localctx: TypedefDeclarationContext = new TypedefDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 168, P4Parser.RULE_typedefDeclaration);
		try {
			this.state = 1094;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 59, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1074;
				this.optAnnotations();
				this.state = 1075;
				this.match(P4Parser.TYPEDEF);
				this.state = 1076;
				this.typeRef();
				this.state = 1077;
				this.name();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1079;
				this.optAnnotations();
				this.state = 1080;
				this.match(P4Parser.TYPEDEF);
				this.state = 1081;
				this.derivedTypeDeclaration();
				this.state = 1082;
				this.name();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1084;
				this.optAnnotations();
				this.state = 1085;
				this.match(P4Parser.TYPE);
				this.state = 1086;
				this.typeRef();
				this.state = 1087;
				this.name();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1089;
				this.optAnnotations();
				this.state = 1090;
				this.match(P4Parser.TYPE);
				this.state = 1091;
				this.derivedTypeDeclaration();
				this.state = 1092;
				this.name();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public assignmentOrMethodCallStatement(): AssignmentOrMethodCallStatementContext {
		let _localctx: AssignmentOrMethodCallStatementContext = new AssignmentOrMethodCallStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 170, P4Parser.RULE_assignmentOrMethodCallStatement);
		try {
			this.state = 1116;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 60, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1096;
				this.lvalue(0);
				this.state = 1097;
				this.match(P4Parser.L_PAREN);
				this.state = 1098;
				this.argumentList();
				this.state = 1099;
				this.match(P4Parser.R_PAREN);
				this.state = 1100;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1102;
				this.lvalue(0);
				this.state = 1103;
				this.match(P4Parser.L_ANGLE);
				this.state = 1104;
				this.typeArgumentList(0);
				this.state = 1105;
				this.match(P4Parser.R_ANGLE);
				this.state = 1106;
				this.match(P4Parser.L_PAREN);
				this.state = 1107;
				this.argumentList();
				this.state = 1108;
				this.match(P4Parser.R_PAREN);
				this.state = 1109;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1111;
				this.lvalue(0);
				this.state = 1112;
				this.match(P4Parser.ASSIGN);
				this.state = 1113;
				this.expression(0);
				this.state = 1114;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public emptyStatement(): EmptyStatementContext {
		let _localctx: EmptyStatementContext = new EmptyStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 172, P4Parser.RULE_emptyStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1118;
			this.match(P4Parser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public exitStatement(): ExitStatementContext {
		let _localctx: ExitStatementContext = new ExitStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 174, P4Parser.RULE_exitStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1120;
			this.match(P4Parser.EXIT);
			this.state = 1121;
			this.match(P4Parser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public returnStatement(): ReturnStatementContext {
		let _localctx: ReturnStatementContext = new ReturnStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 176, P4Parser.RULE_returnStatement);
		try {
			this.state = 1129;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 61, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1123;
				this.match(P4Parser.RETURN);
				this.state = 1124;
				this.match(P4Parser.SEMICOLON);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1125;
				this.match(P4Parser.RETURN);
				this.state = 1126;
				this.expression(0);
				this.state = 1127;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public conditionalStatement(): ConditionalStatementContext {
		let _localctx: ConditionalStatementContext = new ConditionalStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 178, P4Parser.RULE_conditionalStatement);
		try {
			this.state = 1145;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 62, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1131;
				this.match(P4Parser.IF);
				this.state = 1132;
				this.match(P4Parser.L_PAREN);
				this.state = 1133;
				this.expression(0);
				this.state = 1134;
				this.match(P4Parser.R_PAREN);
				this.state = 1135;
				this.statement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1137;
				this.match(P4Parser.IF);
				this.state = 1138;
				this.match(P4Parser.L_PAREN);
				this.state = 1139;
				this.expression(0);
				this.state = 1140;
				this.match(P4Parser.R_PAREN);
				this.state = 1141;
				this.statement();
				this.state = 1142;
				this.match(P4Parser.ELSE);
				this.state = 1143;
				this.statement();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public directApplication(): DirectApplicationContext {
		let _localctx: DirectApplicationContext = new DirectApplicationContext(this._ctx, this.state);
		this.enterRule(_localctx, 180, P4Parser.RULE_directApplication);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1147;
			this.typeName();
			this.state = 1148;
			this.match(P4Parser.DOT);
			this.state = 1149;
			this.match(P4Parser.APPLY);
			this.state = 1150;
			this.match(P4Parser.L_PAREN);
			this.state = 1151;
			this.argumentList();
			this.state = 1152;
			this.match(P4Parser.R_PAREN);
			this.state = 1153;
			this.match(P4Parser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public statement(): StatementContext {
		let _localctx: StatementContext = new StatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 182, P4Parser.RULE_statement);
		try {
			this.state = 1163;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 63, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1155;
				this.directApplication();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1156;
				this.assignmentOrMethodCallStatement();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1157;
				this.conditionalStatement();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1158;
				this.emptyStatement();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1159;
				this.blockStatement();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1160;
				this.returnStatement();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 1161;
				this.exitStatement();
				}
				break;

			case 8:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 1162;
				this.switchStatement();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public blockStatement(): BlockStatementContext {
		let _localctx: BlockStatementContext = new BlockStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 184, P4Parser.RULE_blockStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1165;
			this.optAnnotations();
			this.state = 1166;
			this.match(P4Parser.L_BRACE);
			this.state = 1167;
			this.statOrDeclList(0);
			this.state = 1168;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public statOrDeclList(): StatOrDeclListContext;
	public statOrDeclList(_p: number): StatOrDeclListContext;
	// @RuleVersion(0)
	public statOrDeclList(_p?: number): StatOrDeclListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: StatOrDeclListContext = new StatOrDeclListContext(this._ctx, _parentState);
		let _prevctx: StatOrDeclListContext = _localctx;
		let _startState: number = 186;
		this.enterRecursionRule(_localctx, 186, P4Parser.RULE_statOrDeclList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1175;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 64, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new StatOrDeclListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_statOrDeclList);
					this.state = 1171;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 1172;
					this.statementOrDeclaration();
					}
					}
				}
				this.state = 1177;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 64, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public switchStatement(): SwitchStatementContext {
		let _localctx: SwitchStatementContext = new SwitchStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 188, P4Parser.RULE_switchStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1178;
			this.match(P4Parser.SWITCH);
			this.state = 1179;
			this.match(P4Parser.L_PAREN);
			this.state = 1180;
			this.expression(0);
			this.state = 1181;
			this.match(P4Parser.R_PAREN);
			this.state = 1182;
			this.match(P4Parser.L_BRACE);
			this.state = 1183;
			this.switchCases(0);
			this.state = 1184;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public switchCases(): SwitchCasesContext;
	public switchCases(_p: number): SwitchCasesContext;
	// @RuleVersion(0)
	public switchCases(_p?: number): SwitchCasesContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: SwitchCasesContext = new SwitchCasesContext(this._ctx, _parentState);
		let _prevctx: SwitchCasesContext = _localctx;
		let _startState: number = 190;
		this.enterRecursionRule(_localctx, 190, P4Parser.RULE_switchCases, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1191;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 65, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new SwitchCasesContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_switchCases);
					this.state = 1187;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 1188;
					this.switchCase();
					}
					}
				}
				this.state = 1193;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 65, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public switchCase(): SwitchCaseContext {
		let _localctx: SwitchCaseContext = new SwitchCaseContext(this._ctx, this.state);
		this.enterRule(_localctx, 192, P4Parser.RULE_switchCase);
		try {
			this.state = 1201;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 66, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1194;
				this.switchLabel();
				this.state = 1195;
				this.match(P4Parser.COLON);
				this.state = 1196;
				this.blockStatement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1198;
				this.switchLabel();
				this.state = 1199;
				this.match(P4Parser.COLON);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public switchLabel(): SwitchLabelContext {
		let _localctx: SwitchLabelContext = new SwitchLabelContext(this._ctx, this.state);
		this.enterRule(_localctx, 194, P4Parser.RULE_switchLabel);
		try {
			this.state = 1205;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.ACTIONS:
			case P4Parser.APPLY:
			case P4Parser.ENTRIES:
			case P4Parser.KEY:
			case P4Parser.TYPE:
			case P4Parser.STATE:
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1203;
				this.name();
				}
				break;
			case P4Parser.DEFAULT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1204;
				this.match(P4Parser.DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public statementOrDeclaration(): StatementOrDeclarationContext {
		let _localctx: StatementOrDeclarationContext = new StatementOrDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 196, P4Parser.RULE_statementOrDeclaration);
		try {
			this.state = 1211;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 68, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1207;
				this.variableDeclaration();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1208;
				this.constantDeclaration();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1209;
				this.statement();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1210;
				this.instantiation();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public tableDeclaration(): TableDeclarationContext {
		let _localctx: TableDeclarationContext = new TableDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 198, P4Parser.RULE_tableDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1213;
			this.optAnnotations();
			this.state = 1214;
			this.match(P4Parser.TABLE);
			this.state = 1215;
			this.name();
			this.state = 1216;
			this.match(P4Parser.L_BRACE);
			this.state = 1217;
			this.tablePropertyList(0);
			this.state = 1218;
			this.match(P4Parser.R_BRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public tablePropertyList(): TablePropertyListContext;
	public tablePropertyList(_p: number): TablePropertyListContext;
	// @RuleVersion(0)
	public tablePropertyList(_p?: number): TablePropertyListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: TablePropertyListContext = new TablePropertyListContext(this._ctx, _parentState);
		let _prevctx: TablePropertyListContext = _localctx;
		let _startState: number = 200;
		this.enterRecursionRule(_localctx, 200, P4Parser.RULE_tablePropertyList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 1221;
			this.tableProperty();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1227;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 69, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new TablePropertyListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_tablePropertyList);
					this.state = 1223;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 1224;
					this.tableProperty();
					}
					}
				}
				this.state = 1229;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 69, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public tableProperty(): TablePropertyContext {
		let _localctx: TablePropertyContext = new TablePropertyContext(this._ctx, this.state);
		this.enterRule(_localctx, 202, P4Parser.RULE_tableProperty);
		try {
			this.state = 1257;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 70, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1230;
				this.match(P4Parser.KEY);
				this.state = 1231;
				this.match(P4Parser.ASSIGN);
				this.state = 1232;
				this.match(P4Parser.L_BRACE);
				this.state = 1233;
				this.keyElementList(0);
				this.state = 1234;
				this.match(P4Parser.R_BRACE);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1236;
				this.match(P4Parser.ACTIONS);
				this.state = 1237;
				this.match(P4Parser.ASSIGN);
				this.state = 1238;
				this.match(P4Parser.L_BRACE);
				this.state = 1239;
				this.actionList(0);
				this.state = 1240;
				this.match(P4Parser.R_BRACE);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1242;
				this.optAnnotations();
				this.state = 1243;
				this.optCONST();
				this.state = 1244;
				this.match(P4Parser.ENTRIES);
				this.state = 1245;
				this.match(P4Parser.ASSIGN);
				this.state = 1246;
				this.match(P4Parser.L_BRACE);
				this.state = 1247;
				this.entriesList(0);
				this.state = 1248;
				this.match(P4Parser.R_BRACE);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1250;
				this.optAnnotations();
				this.state = 1251;
				this.optCONST();
				this.state = 1252;
				this.nonTableKwName();
				this.state = 1253;
				this.match(P4Parser.ASSIGN);
				this.state = 1254;
				this.initializer();
				this.state = 1255;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public keyElementList(): KeyElementListContext;
	public keyElementList(_p: number): KeyElementListContext;
	// @RuleVersion(0)
	public keyElementList(_p?: number): KeyElementListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: KeyElementListContext = new KeyElementListContext(this._ctx, _parentState);
		let _prevctx: KeyElementListContext = _localctx;
		let _startState: number = 204;
		this.enterRecursionRule(_localctx, 204, P4Parser.RULE_keyElementList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1264;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 71, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new KeyElementListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_keyElementList);
					this.state = 1260;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 1261;
					this.keyElement();
					}
					}
				}
				this.state = 1266;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 71, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public keyElement(): KeyElementContext {
		let _localctx: KeyElementContext = new KeyElementContext(this._ctx, this.state);
		this.enterRule(_localctx, 206, P4Parser.RULE_keyElement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1267;
			this.expression(0);
			this.state = 1268;
			this.match(P4Parser.COLON);
			this.state = 1269;
			this.name();
			this.state = 1270;
			this.optAnnotations();
			this.state = 1271;
			this.match(P4Parser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public actionList(): ActionListContext;
	public actionList(_p: number): ActionListContext;
	// @RuleVersion(0)
	public actionList(_p?: number): ActionListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: ActionListContext = new ActionListContext(this._ctx, _parentState);
		let _prevctx: ActionListContext = _localctx;
		let _startState: number = 208;
		this.enterRecursionRule(_localctx, 208, P4Parser.RULE_actionList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1280;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 72, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new ActionListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_actionList);
					this.state = 1274;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 1275;
					this.actionRef();
					this.state = 1276;
					this.match(P4Parser.SEMICOLON);
					}
					}
				}
				this.state = 1282;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 72, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public actionRef(): ActionRefContext {
		let _localctx: ActionRefContext = new ActionRefContext(this._ctx, this.state);
		this.enterRule(_localctx, 210, P4Parser.RULE_actionRef);
		try {
			this.state = 1292;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 73, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1283;
				this.optAnnotations();
				this.state = 1284;
				this.name();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1286;
				this.optAnnotations();
				this.state = 1287;
				this.name();
				this.state = 1288;
				this.match(P4Parser.L_PAREN);
				this.state = 1289;
				this.argumentList();
				this.state = 1290;
				this.match(P4Parser.R_PAREN);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public entry(): EntryContext {
		let _localctx: EntryContext = new EntryContext(this._ctx, this.state);
		this.enterRule(_localctx, 212, P4Parser.RULE_entry);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1294;
			this.keysetExpression();
			this.state = 1295;
			this.match(P4Parser.COLON);
			this.state = 1296;
			this.actionBinding();
			this.state = 1297;
			this.optAnnotations();
			this.state = 1298;
			this.match(P4Parser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public actionBinding(): ActionBindingContext {
		let _localctx: ActionBindingContext = new ActionBindingContext(this._ctx, this.state);
		this.enterRule(_localctx, 214, P4Parser.RULE_actionBinding);
		try {
			this.state = 1313;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 74, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1300;
				this.lvalue(0);
				this.state = 1301;
				this.match(P4Parser.L_PAREN);
				this.state = 1302;
				this.argumentList();
				this.state = 1303;
				this.match(P4Parser.R_PAREN);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1305;
				this.lvalue(0);
				this.state = 1306;
				this.match(P4Parser.L_ANGLE);
				this.state = 1307;
				this.typeArgumentList(0);
				this.state = 1308;
				this.match(P4Parser.R_ANGLE);
				this.state = 1309;
				this.match(P4Parser.L_PAREN);
				this.state = 1310;
				this.argumentList();
				this.state = 1311;
				this.match(P4Parser.R_PAREN);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public entriesList(): EntriesListContext;
	public entriesList(_p: number): EntriesListContext;
	// @RuleVersion(0)
	public entriesList(_p?: number): EntriesListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: EntriesListContext = new EntriesListContext(this._ctx, _parentState);
		let _prevctx: EntriesListContext = _localctx;
		let _startState: number = 216;
		this.enterRecursionRule(_localctx, 216, P4Parser.RULE_entriesList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 1316;
			this.entry();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1322;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 75, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new EntriesListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_entriesList);
					this.state = 1318;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 1319;
					this.entry();
					}
					}
				}
				this.state = 1324;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 75, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public actionDeclaration(): ActionDeclarationContext {
		let _localctx: ActionDeclarationContext = new ActionDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 218, P4Parser.RULE_actionDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1325;
			this.optAnnotations();
			this.state = 1326;
			this.match(P4Parser.ACTION);
			this.state = 1327;
			this.name();
			this.state = 1328;
			this.match(P4Parser.L_PAREN);
			this.state = 1329;
			this.parameterList();
			this.state = 1330;
			this.match(P4Parser.R_PAREN);
			this.state = 1331;
			this.blockStatement();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableDeclaration(): VariableDeclarationContext {
		let _localctx: VariableDeclarationContext = new VariableDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 220, P4Parser.RULE_variableDeclaration);
		try {
			this.state = 1344;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.PRAGMA:
			case P4Parser.AT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1333;
				this.annotations(0);
				this.state = 1334;
				this.typeRef();
				this.state = 1335;
				this.name();
				this.state = 1336;
				this.optInitializer();
				this.state = 1337;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			case P4Parser.BOOL:
			case P4Parser.BIT:
			case P4Parser.ERROR:
			case P4Parser.INT:
			case P4Parser.TUPLE:
			case P4Parser.VARBIT:
			case P4Parser.DOT:
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1339;
				this.typeRef();
				this.state = 1340;
				this.name();
				this.state = 1341;
				this.optInitializer();
				this.state = 1342;
				this.match(P4Parser.SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public constantDeclaration(): ConstantDeclarationContext {
		let _localctx: ConstantDeclarationContext = new ConstantDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 222, P4Parser.RULE_constantDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1346;
			this.optAnnotations();
			this.state = 1347;
			this.match(P4Parser.CONST);
			this.state = 1348;
			this.typeRef();
			this.state = 1349;
			this.name();
			this.state = 1350;
			this.match(P4Parser.ASSIGN);
			this.state = 1351;
			this.initializer();
			this.state = 1352;
			this.match(P4Parser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public optInitializer(): OptInitializerContext {
		let _localctx: OptInitializerContext = new OptInitializerContext(this._ctx, this.state);
		this.enterRule(_localctx, 224, P4Parser.RULE_optInitializer);
		try {
			this.state = 1357;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.SEMICOLON:
				this.enterOuterAlt(_localctx, 1);
				// tslint:disable-next-line:no-empty
				{
				}
				break;
			case P4Parser.ASSIGN:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1355;
				this.match(P4Parser.ASSIGN);
				this.state = 1356;
				this.initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public initializer(): InitializerContext {
		let _localctx: InitializerContext = new InitializerContext(this._ctx, this.state);
		this.enterRule(_localctx, 226, P4Parser.RULE_initializer);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1359;
			this.expression(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDeclaration(): FunctionDeclarationContext {
		let _localctx: FunctionDeclarationContext = new FunctionDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 228, P4Parser.RULE_functionDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1361;
			this.functionPrototype();
			this.state = 1362;
			this.blockStatement();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public argumentList(): ArgumentListContext {
		let _localctx: ArgumentListContext = new ArgumentListContext(this._ctx, this.state);
		this.enterRule(_localctx, 230, P4Parser.RULE_argumentList);
		try {
			this.state = 1366;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.R_PAREN:
				this.enterOuterAlt(_localctx, 1);
				// tslint:disable-next-line:no-empty
				{
				}
				break;
			case P4Parser.ACTIONS:
			case P4Parser.APPLY:
			case P4Parser.ENTRIES:
			case P4Parser.ERROR:
			case P4Parser.FALSE:
			case P4Parser.KEY:
			case P4Parser.TYPE:
			case P4Parser.STATE:
			case P4Parser.THIS:
			case P4Parser.TRUE:
			case P4Parser.DONTCARE:
			case P4Parser.PLUS:
			case P4Parser.MINUS:
			case P4Parser.COMPLEMENT:
			case P4Parser.L_PAREN:
			case P4Parser.L_BRACE:
			case P4Parser.NOT:
			case P4Parser.DOT:
			case P4Parser.STRING_LITERAL:
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
			case P4Parser.INTEGER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1365;
				this.nonEmptyArgList(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public nonEmptyArgList(): NonEmptyArgListContext;
	public nonEmptyArgList(_p: number): NonEmptyArgListContext;
	// @RuleVersion(0)
	public nonEmptyArgList(_p?: number): NonEmptyArgListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: NonEmptyArgListContext = new NonEmptyArgListContext(this._ctx, _parentState);
		let _prevctx: NonEmptyArgListContext = _localctx;
		let _startState: number = 232;
		this.enterRecursionRule(_localctx, 232, P4Parser.RULE_nonEmptyArgList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 1369;
			this.argument();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1376;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 79, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new NonEmptyArgListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_nonEmptyArgList);
					this.state = 1371;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 1372;
					this.match(P4Parser.COMMA);
					this.state = 1373;
					this.argument();
					}
					}
				}
				this.state = 1378;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 79, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public argument(): ArgumentContext {
		let _localctx: ArgumentContext = new ArgumentContext(this._ctx, this.state);
		this.enterRule(_localctx, 234, P4Parser.RULE_argument);
		try {
			this.state = 1385;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 80, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1379;
				this.expression(0);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1380;
				this.name();
				this.state = 1381;
				this.match(P4Parser.ASSIGN);
				this.state = 1382;
				this.expression(0);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1384;
				this.match(P4Parser.DONTCARE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public expressionList(): ExpressionListContext;
	public expressionList(_p: number): ExpressionListContext;
	// @RuleVersion(0)
	public expressionList(_p?: number): ExpressionListContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: ExpressionListContext = new ExpressionListContext(this._ctx, _parentState);
		let _prevctx: ExpressionListContext = _localctx;
		let _startState: number = 236;
		this.enterRecursionRule(_localctx, 236, P4Parser.RULE_expressionList, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1389;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 81, this._ctx) ) {
			case 1:
				{
				}
				break;

			case 2:
				{
				this.state = 1388;
				this.expression(0);
				}
				break;
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1396;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 82, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expressionList);
					this.state = 1391;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 1392;
					this.match(P4Parser.COMMA);
					this.state = 1393;
					this.expression(0);
					}
					}
				}
				this.state = 1398;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 82, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public prefixedNonTypeName(): PrefixedNonTypeNameContext {
		let _localctx: PrefixedNonTypeNameContext = new PrefixedNonTypeNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 238, P4Parser.RULE_prefixedNonTypeName);
		try {
			this.state = 1403;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.ACTIONS:
			case P4Parser.APPLY:
			case P4Parser.ENTRIES:
			case P4Parser.KEY:
			case P4Parser.TYPE:
			case P4Parser.STATE:
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1399;
				this.nonTypeName();
				}
				break;
			case P4Parser.DOT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1400;
				this.dotPrefix();
				this.state = 1401;
				this.nonTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public lvalue(): LvalueContext;
	public lvalue(_p: number): LvalueContext;
	// @RuleVersion(0)
	public lvalue(_p?: number): LvalueContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: LvalueContext = new LvalueContext(this._ctx, _parentState);
		let _prevctx: LvalueContext = _localctx;
		let _startState: number = 240;
		this.enterRecursionRule(_localctx, 240, P4Parser.RULE_lvalue, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1408;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case P4Parser.ACTIONS:
			case P4Parser.APPLY:
			case P4Parser.ENTRIES:
			case P4Parser.KEY:
			case P4Parser.TYPE:
			case P4Parser.STATE:
			case P4Parser.DOT:
			case P4Parser.IDENTIFIER:
			case P4Parser.TYPE_IDENTIFIER:
				{
				this.state = 1406;
				this.prefixedNonTypeName();
				}
				break;
			case P4Parser.THIS:
				{
				this.state = 1407;
				this.match(P4Parser.THIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1427;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 86, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 1425;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 85, this._ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_lvalue);
						this.state = 1410;
						if (!(this.precpred(this._ctx, 3))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 3)");
						}
						this.state = 1411;
						this.match(P4Parser.DOT);
						this.state = 1412;
						this.name();
						}
						break;

					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_lvalue);
						this.state = 1413;
						if (!(this.precpred(this._ctx, 2))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
						}
						this.state = 1414;
						this.match(P4Parser.L_BRACKET);
						this.state = 1415;
						this.expression(0);
						this.state = 1416;
						this.match(P4Parser.R_BRACKET);
						}
						break;

					case 3:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_lvalue);
						this.state = 1418;
						if (!(this.precpred(this._ctx, 1))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
						}
						this.state = 1419;
						this.match(P4Parser.L_BRACKET);
						this.state = 1420;
						this.expression(0);
						this.state = 1421;
						this.match(P4Parser.COLON);
						this.state = 1422;
						this.expression(0);
						this.state = 1423;
						this.match(P4Parser.R_BRACKET);
						}
						break;
					}
					}
				}
				this.state = 1429;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 86, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public expression(): ExpressionContext;
	public expression(_p: number): ExpressionContext;
	// @RuleVersion(0)
	public expression(_p?: number): ExpressionContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: ExpressionContext = new ExpressionContext(this._ctx, _parentState);
		let _prevctx: ExpressionContext = _localctx;
		let _startState: number = 242;
		this.enterRecursionRule(_localctx, 242, P4Parser.RULE_expression, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1473;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 87, this._ctx) ) {
			case 1:
				{
				this.state = 1431;
				this.match(P4Parser.INTEGER);
				}
				break;

			case 2:
				{
				this.state = 1432;
				this.match(P4Parser.STRING_LITERAL);
				}
				break;

			case 3:
				{
				this.state = 1433;
				this.match(P4Parser.TRUE);
				}
				break;

			case 4:
				{
				this.state = 1434;
				this.match(P4Parser.FALSE);
				}
				break;

			case 5:
				{
				this.state = 1435;
				this.match(P4Parser.THIS);
				}
				break;

			case 6:
				{
				this.state = 1436;
				this.nonTypeName();
				}
				break;

			case 7:
				{
				this.state = 1437;
				this.dotPrefix();
				this.state = 1438;
				this.nonTypeName();
				}
				break;

			case 8:
				{
				this.state = 1440;
				this.match(P4Parser.L_BRACE);
				this.state = 1441;
				this.expressionList(0);
				this.state = 1442;
				this.match(P4Parser.R_BRACE);
				}
				break;

			case 9:
				{
				this.state = 1444;
				this.match(P4Parser.L_PAREN);
				this.state = 1445;
				this.expression(0);
				this.state = 1446;
				this.match(P4Parser.R_PAREN);
				}
				break;

			case 10:
				{
				this.state = 1448;
				this.match(P4Parser.NOT);
				this.state = 1449;
				this.expression(33);
				}
				break;

			case 11:
				{
				this.state = 1450;
				this.match(P4Parser.COMPLEMENT);
				this.state = 1451;
				this.expression(32);
				}
				break;

			case 12:
				{
				this.state = 1452;
				this.match(P4Parser.MINUS);
				this.state = 1453;
				this.expression(31);
				}
				break;

			case 13:
				{
				this.state = 1454;
				this.match(P4Parser.PLUS);
				this.state = 1455;
				this.expression(30);
				}
				break;

			case 14:
				{
				this.state = 1456;
				this.typeName();
				this.state = 1457;
				this.match(P4Parser.DOT);
				this.state = 1458;
				this.name();
				}
				break;

			case 15:
				{
				this.state = 1460;
				this.match(P4Parser.ERROR);
				this.state = 1461;
				this.match(P4Parser.DOT);
				this.state = 1462;
				this.name();
				}
				break;

			case 16:
				{
				this.state = 1463;
				this.namedType();
				this.state = 1464;
				this.match(P4Parser.L_PAREN);
				this.state = 1465;
				this.argumentList();
				this.state = 1466;
				this.match(P4Parser.R_PAREN);
				}
				break;

			case 17:
				{
				this.state = 1468;
				this.match(P4Parser.L_PAREN);
				this.state = 1469;
				this.typeRef();
				this.state = 1470;
				this.match(P4Parser.R_PAREN);
				this.state = 1471;
				this.expression(1);
				}
				break;
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 1575;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 89, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 1573;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 88, this._ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1475;
						if (!(this.precpred(this._ctx, 26))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 26)");
						}
						this.state = 1476;
						this.match(P4Parser.MUL);
						this.state = 1477;
						this.expression(27);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1478;
						if (!(this.precpred(this._ctx, 25))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 25)");
						}
						this.state = 1479;
						this.match(P4Parser.DIV);
						this.state = 1480;
						this.expression(26);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1481;
						if (!(this.precpred(this._ctx, 24))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 24)");
						}
						this.state = 1482;
						this.match(P4Parser.MOD);
						this.state = 1483;
						this.expression(25);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1484;
						if (!(this.precpred(this._ctx, 23))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 23)");
						}
						this.state = 1485;
						this.match(P4Parser.PLUS);
						this.state = 1486;
						this.expression(24);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1487;
						if (!(this.precpred(this._ctx, 22))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 22)");
						}
						this.state = 1488;
						this.match(P4Parser.MINUS);
						this.state = 1489;
						this.expression(23);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1490;
						if (!(this.precpred(this._ctx, 21))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 21)");
						}
						this.state = 1491;
						this.match(P4Parser.PLUS_SAT);
						this.state = 1492;
						this.expression(22);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1493;
						if (!(this.precpred(this._ctx, 20))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 20)");
						}
						this.state = 1494;
						this.match(P4Parser.MINUS_SAT);
						this.state = 1495;
						this.expression(21);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1496;
						if (!(this.precpred(this._ctx, 19))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 19)");
						}
						this.state = 1497;
						this.match(P4Parser.SHL);
						this.state = 1498;
						this.expression(20);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1499;
						if (!(this.precpred(this._ctx, 18))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 18)");
						}
						this.state = 1500;
						this.match(P4Parser.R_ANGLE);
						this.state = 1501;
						this.match(P4Parser.R_ANGLE);
						this.state = 1502;
						this.expression(19);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1503;
						if (!(this.precpred(this._ctx, 17))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 17)");
						}
						this.state = 1504;
						this.match(P4Parser.LE);
						this.state = 1505;
						this.expression(18);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1506;
						if (!(this.precpred(this._ctx, 16))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 16)");
						}
						this.state = 1507;
						this.match(P4Parser.GE);
						this.state = 1508;
						this.expression(17);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1509;
						if (!(this.precpred(this._ctx, 15))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 15)");
						}
						this.state = 1510;
						this.match(P4Parser.L_ANGLE);
						this.state = 1511;
						this.expression(16);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1512;
						if (!(this.precpred(this._ctx, 14))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 14)");
						}
						this.state = 1513;
						this.match(P4Parser.R_ANGLE);
						this.state = 1514;
						this.expression(15);
						}
						break;

					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1515;
						if (!(this.precpred(this._ctx, 13))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 13)");
						}
						this.state = 1516;
						this.match(P4Parser.NE);
						this.state = 1517;
						this.expression(14);
						}
						break;

					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1518;
						if (!(this.precpred(this._ctx, 12))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 12)");
						}
						this.state = 1519;
						this.match(P4Parser.EQ);
						this.state = 1520;
						this.expression(13);
						}
						break;

					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1521;
						if (!(this.precpred(this._ctx, 11))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 11)");
						}
						this.state = 1522;
						this.match(P4Parser.BIT_AND);
						this.state = 1523;
						this.expression(12);
						}
						break;

					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1524;
						if (!(this.precpred(this._ctx, 10))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 10)");
						}
						this.state = 1525;
						this.match(P4Parser.BIT_XOR);
						this.state = 1526;
						this.expression(11);
						}
						break;

					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1527;
						if (!(this.precpred(this._ctx, 9))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 9)");
						}
						this.state = 1528;
						this.match(P4Parser.BIT_OR);
						this.state = 1529;
						this.expression(10);
						}
						break;

					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1530;
						if (!(this.precpred(this._ctx, 8))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 8)");
						}
						this.state = 1531;
						this.match(P4Parser.PP);
						this.state = 1532;
						this.expression(9);
						}
						break;

					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1533;
						if (!(this.precpred(this._ctx, 7))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 7)");
						}
						this.state = 1534;
						this.match(P4Parser.AND);
						this.state = 1535;
						this.expression(8);
						}
						break;

					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1536;
						if (!(this.precpred(this._ctx, 6))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 6)");
						}
						this.state = 1537;
						this.match(P4Parser.OR);
						this.state = 1538;
						this.expression(7);
						}
						break;

					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1539;
						if (!(this.precpred(this._ctx, 5))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 5)");
						}
						this.state = 1540;
						this.match(P4Parser.QUESTION);
						this.state = 1541;
						this.expression(0);
						this.state = 1542;
						this.match(P4Parser.COLON);
						this.state = 1543;
						this.expression(6);
						}
						break;

					case 23:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1545;
						if (!(this.precpred(this._ctx, 37))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 37)");
						}
						this.state = 1546;
						this.match(P4Parser.L_BRACKET);
						this.state = 1547;
						this.expression(0);
						this.state = 1548;
						this.match(P4Parser.R_BRACKET);
						}
						break;

					case 24:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1550;
						if (!(this.precpred(this._ctx, 36))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 36)");
						}
						this.state = 1551;
						this.match(P4Parser.L_BRACKET);
						this.state = 1552;
						this.expression(0);
						this.state = 1553;
						this.match(P4Parser.COLON);
						this.state = 1554;
						this.expression(0);
						this.state = 1555;
						this.match(P4Parser.R_BRACKET);
						}
						break;

					case 25:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1557;
						if (!(this.precpred(this._ctx, 27))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 27)");
						}
						this.state = 1558;
						this.match(P4Parser.DOT);
						this.state = 1559;
						this.name();
						}
						break;

					case 26:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1560;
						if (!(this.precpred(this._ctx, 4))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 4)");
						}
						this.state = 1561;
						this.match(P4Parser.L_ANGLE);
						this.state = 1562;
						this.realTypeArgumentList(0);
						this.state = 1563;
						this.match(P4Parser.R_ANGLE);
						this.state = 1564;
						this.match(P4Parser.L_PAREN);
						this.state = 1565;
						this.argumentList();
						this.state = 1566;
						this.match(P4Parser.R_PAREN);
						}
						break;

					case 27:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, P4Parser.RULE_expression);
						this.state = 1568;
						if (!(this.precpred(this._ctx, 3))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 3)");
						}
						this.state = 1569;
						this.match(P4Parser.L_PAREN);
						this.state = 1570;
						this.argumentList();
						this.state = 1571;
						this.match(P4Parser.R_PAREN);
						}
						break;
					}
					}
				}
				this.state = 1577;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 89, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public type_or_id(): Type_or_idContext {
		let _localctx: Type_or_idContext = new Type_or_idContext(this._ctx, this.state);
		this.enterRule(_localctx, 244, P4Parser.RULE_type_or_id);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1578;
			_la = this._input.LA(1);
			if (!(_la === P4Parser.IDENTIFIER || _la === P4Parser.TYPE_IDENTIFIER)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parserStateCondition(): ParserStateConditionContext {
		let _localctx: ParserStateConditionContext = new ParserStateConditionContext(this._ctx, this.state);
		this.enterRule(_localctx, 246, P4Parser.RULE_parserStateCondition);
		try {
			this.state = 1601;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 90, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1580;
				this.expression(0);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1581;
				this.expression(0);
				this.state = 1582;
				this.match(P4Parser.EQ);
				this.state = 1583;
				this.keysetExpression();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1585;
				this.expression(0);
				this.state = 1586;
				this.match(P4Parser.EQ);
				this.state = 1587;
				this.match(P4Parser.L_PAREN);
				this.state = 1588;
				this.keysetExpression();
				this.state = 1589;
				this.match(P4Parser.R_PAREN);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1591;
				this.keysetExpression();
				this.state = 1592;
				this.match(P4Parser.EQ);
				this.state = 1593;
				this.expression(0);
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1595;
				this.match(P4Parser.L_PAREN);
				this.state = 1596;
				this.keysetExpression();
				this.state = 1597;
				this.match(P4Parser.R_PAREN);
				this.state = 1598;
				this.match(P4Parser.EQ);
				this.state = 1599;
				this.expression(0);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public sempred(_localctx: RuleContext, ruleIndex: number, predIndex: number): boolean {
		switch (ruleIndex) {
		case 2:
			return this.input_sempred(_localctx as InputContext, predIndex);

		case 11:
			return this.annotations_sempred(_localctx as AnnotationsContext, predIndex);

		case 13:
			return this.annotationBody_sempred(_localctx as AnnotationBodyContext, predIndex);

		case 15:
			return this.kvList_sempred(_localctx as KvListContext, predIndex);

		case 18:
			return this.nonEmptyParameterList_sempred(_localctx as NonEmptyParameterListContext, predIndex);

		case 24:
			return this.objDeclarations_sempred(_localctx as ObjDeclarationsContext, predIndex);

		case 29:
			return this.parserLocalElements_sempred(_localctx as ParserLocalElementsContext, predIndex);

		case 32:
			return this.parserStates_sempred(_localctx as ParserStatesContext, predIndex);

		case 34:
			return this.parserStatements_sempred(_localctx as ParserStatementsContext, predIndex);

		case 40:
			return this.selectCaseList_sempred(_localctx as SelectCaseListContext, predIndex);

		case 44:
			return this.simpleExpressionList_sempred(_localctx as SimpleExpressionListContext, predIndex);

		case 49:
			return this.controlLocalDeclarations_sempred(_localctx as ControlLocalDeclarationsContext, predIndex);

		case 53:
			return this.methodPrototypes_sempred(_localctx as MethodPrototypesContext, predIndex);

		case 66:
			return this.typeParameterList_sempred(_localctx as TypeParameterListContext, predIndex);

		case 68:
			return this.typeArgumentList_sempred(_localctx as TypeArgumentListContext, predIndex);

		case 70:
			return this.realTypeArgumentList_sempred(_localctx as RealTypeArgumentListContext, predIndex);

		case 76:
			return this.structFieldList_sempred(_localctx as StructFieldListContext, predIndex);

		case 79:
			return this.specifiedIdentifierList_sempred(_localctx as SpecifiedIdentifierListContext, predIndex);

		case 83:
			return this.identifierList_sempred(_localctx as IdentifierListContext, predIndex);

		case 93:
			return this.statOrDeclList_sempred(_localctx as StatOrDeclListContext, predIndex);

		case 95:
			return this.switchCases_sempred(_localctx as SwitchCasesContext, predIndex);

		case 100:
			return this.tablePropertyList_sempred(_localctx as TablePropertyListContext, predIndex);

		case 102:
			return this.keyElementList_sempred(_localctx as KeyElementListContext, predIndex);

		case 104:
			return this.actionList_sempred(_localctx as ActionListContext, predIndex);

		case 108:
			return this.entriesList_sempred(_localctx as EntriesListContext, predIndex);

		case 116:
			return this.nonEmptyArgList_sempred(_localctx as NonEmptyArgListContext, predIndex);

		case 118:
			return this.expressionList_sempred(_localctx as ExpressionListContext, predIndex);

		case 120:
			return this.lvalue_sempred(_localctx as LvalueContext, predIndex);

		case 121:
			return this.expression_sempred(_localctx as ExpressionContext, predIndex);
		}
		return true;
	}
	private input_sempred(_localctx: InputContext, predIndex: number): boolean {
		switch (predIndex) {
		case 0:
			return this.precpred(this._ctx, 2);

		case 1:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private annotations_sempred(_localctx: AnnotationsContext, predIndex: number): boolean {
		switch (predIndex) {
		case 2:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private annotationBody_sempred(_localctx: AnnotationBodyContext, predIndex: number): boolean {
		switch (predIndex) {
		case 3:
			return this.precpred(this._ctx, 2);

		case 4:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private kvList_sempred(_localctx: KvListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 5:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private nonEmptyParameterList_sempred(_localctx: NonEmptyParameterListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 6:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private objDeclarations_sempred(_localctx: ObjDeclarationsContext, predIndex: number): boolean {
		switch (predIndex) {
		case 7:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private parserLocalElements_sempred(_localctx: ParserLocalElementsContext, predIndex: number): boolean {
		switch (predIndex) {
		case 8:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private parserStates_sempred(_localctx: ParserStatesContext, predIndex: number): boolean {
		switch (predIndex) {
		case 9:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private parserStatements_sempred(_localctx: ParserStatementsContext, predIndex: number): boolean {
		switch (predIndex) {
		case 10:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private selectCaseList_sempred(_localctx: SelectCaseListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 11:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private simpleExpressionList_sempred(_localctx: SimpleExpressionListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 12:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private controlLocalDeclarations_sempred(_localctx: ControlLocalDeclarationsContext, predIndex: number): boolean {
		switch (predIndex) {
		case 13:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private methodPrototypes_sempred(_localctx: MethodPrototypesContext, predIndex: number): boolean {
		switch (predIndex) {
		case 14:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private typeParameterList_sempred(_localctx: TypeParameterListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 15:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private typeArgumentList_sempred(_localctx: TypeArgumentListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 16:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private realTypeArgumentList_sempred(_localctx: RealTypeArgumentListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 17:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private structFieldList_sempred(_localctx: StructFieldListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 18:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private specifiedIdentifierList_sempred(_localctx: SpecifiedIdentifierListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 19:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private identifierList_sempred(_localctx: IdentifierListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 20:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private statOrDeclList_sempred(_localctx: StatOrDeclListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 21:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private switchCases_sempred(_localctx: SwitchCasesContext, predIndex: number): boolean {
		switch (predIndex) {
		case 22:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private tablePropertyList_sempred(_localctx: TablePropertyListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 23:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private keyElementList_sempred(_localctx: KeyElementListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 24:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private actionList_sempred(_localctx: ActionListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 25:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private entriesList_sempred(_localctx: EntriesListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 26:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private nonEmptyArgList_sempred(_localctx: NonEmptyArgListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 27:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private expressionList_sempred(_localctx: ExpressionListContext, predIndex: number): boolean {
		switch (predIndex) {
		case 28:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private lvalue_sempred(_localctx: LvalueContext, predIndex: number): boolean {
		switch (predIndex) {
		case 29:
			return this.precpred(this._ctx, 3);

		case 30:
			return this.precpred(this._ctx, 2);

		case 31:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private expression_sempred(_localctx: ExpressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 32:
			return this.precpred(this._ctx, 26);

		case 33:
			return this.precpred(this._ctx, 25);

		case 34:
			return this.precpred(this._ctx, 24);

		case 35:
			return this.precpred(this._ctx, 23);

		case 36:
			return this.precpred(this._ctx, 22);

		case 37:
			return this.precpred(this._ctx, 21);

		case 38:
			return this.precpred(this._ctx, 20);

		case 39:
			return this.precpred(this._ctx, 19);

		case 40:
			return this.precpred(this._ctx, 18);

		case 41:
			return this.precpred(this._ctx, 17);

		case 42:
			return this.precpred(this._ctx, 16);

		case 43:
			return this.precpred(this._ctx, 15);

		case 44:
			return this.precpred(this._ctx, 14);

		case 45:
			return this.precpred(this._ctx, 13);

		case 46:
			return this.precpred(this._ctx, 12);

		case 47:
			return this.precpred(this._ctx, 11);

		case 48:
			return this.precpred(this._ctx, 10);

		case 49:
			return this.precpred(this._ctx, 9);

		case 50:
			return this.precpred(this._ctx, 8);

		case 51:
			return this.precpred(this._ctx, 7);

		case 52:
			return this.precpred(this._ctx, 6);

		case 53:
			return this.precpred(this._ctx, 5);

		case 54:
			return this.precpred(this._ctx, 37);

		case 55:
			return this.precpred(this._ctx, 36);

		case 56:
			return this.precpred(this._ctx, 27);

		case 57:
			return this.precpred(this._ctx, 4);

		case 58:
			return this.precpred(this._ctx, 3);
		}
		return true;
	}

	private static readonly _serializedATNSegments: number = 3;
	private static readonly _serializedATNSegment0: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03i\u0646\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C\x04" +
		"\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t\"\x04#" +
		"\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04+\t+" +
		"\x04,\t,\x04-\t-\x04.\t.\x04/\t/\x040\t0\x041\t1\x042\t2\x043\t3\x044" +
		"\t4\x045\t5\x046\t6\x047\t7\x048\t8\x049\t9\x04:\t:\x04;\t;\x04<\t<\x04" +
		"=\t=\x04>\t>\x04?\t?\x04@\t@\x04A\tA\x04B\tB\x04C\tC\x04D\tD\x04E\tE\x04" +
		"F\tF\x04G\tG\x04H\tH\x04I\tI\x04J\tJ\x04K\tK\x04L\tL\x04M\tM\x04N\tN\x04" +
		"O\tO\x04P\tP\x04Q\tQ\x04R\tR\x04S\tS\x04T\tT\x04U\tU\x04V\tV\x04W\tW\x04" +
		"X\tX\x04Y\tY\x04Z\tZ\x04[\t[\x04\\\t\\\x04]\t]\x04^\t^\x04_\t_\x04`\t" +
		"`\x04a\ta\x04b\tb\x04c\tc\x04d\td\x04e\te\x04f\tf\x04g\tg\x04h\th\x04" +
		"i\ti\x04j\tj\x04k\tk\x04l\tl\x04m\tm\x04n\tn\x04o\to\x04p\tp\x04q\tq\x04" +
		"r\tr\x04s\ts\x04t\tt\x04u\tu\x04v\tv\x04w\tw\x04x\tx\x04y\ty\x04z\tz\x04" +
		"{\t{\x04|\t|\x04}\t}\x03\x02\x03\x02\x03\x03\x03\x03\x03\x04\x03\x04\x03" +
		"\x04\x03\x04\x03\x04\x07\x04\u0104\n\x04\f\x04\x0E\x04\u0107\v\x04\x03" +
		"\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03" +
		"\x05\x03\x05\x05\x05\u0114\n\x05\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06" +
		"\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06" +
		"\x03\x06\x03\x06\x05\x06\u0126\n\x06\x03\x07\x03\x07\x03\x07\x03\x07\x03" +
		"\x07\x03\x07\x03\x07\x03\x07\x03\x07\x03\x07\x03\x07\x03\x07\x03\x07\x03" +
		"\x07\x03\x07\x03\x07\x05\x07\u0138\n\x07\x03\b\x03\b\x03\b\x03\b\x03\b" +
		"\x03\b\x03\b\x05\b\u0141\n\b\x03\t\x03\t\x05\t\u0145\n\t\x03\n\x03\n\x03" +
		"\n\x03\n\x05\n\u014B\n\n\x03\v\x03\v\x05\v\u014F\n\v\x03\f\x03\f\x05\f" +
		"\u0153\n\f\x03\r\x03\r\x03\r\x03\r\x03\r\x07\r\u015A\n\r\f\r\x0E\r\u015D" +
		"\v\r\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03" +
		"\x0E\x03\x0E\x03\x0E\x03\x0E\x05\x0E\u016B\n\x0E\x03\x0F\x03\x0F\x03\x0F" +
		"\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x07\x0F\u0175\n\x0F\f\x0F\x0E" +
		"\x0F\u0178\v\x0F\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x05\x10\u01CD\n\x10\x03\x11\x03\x11\x03" +
		"\x11\x03\x11\x03\x11\x03\x11\x07\x11\u01D5\n\x11\f\x11\x0E\x11\u01D8\v" +
		"\x11\x03\x12\x03\x12\x03\x12\x03\x12\x03\x13\x03\x13\x05\x13\u01E0\n\x13" +
		"\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14\x07\x14\u01E8\n\x14\f" +
		"\x14\x0E\x14\u01EB\v\x14\x03\x15\x03\x15\x03\x15\x03\x15\x03\x15\x03\x15" +
		"\x03\x15\x03\x15\x03\x15\x03\x15\x03\x15\x03\x15\x05\x15\u01F9\n\x15\x03" +
		"\x16\x03\x16\x03\x16\x03\x16\x05\x16\u01FF\n\x16\x03\x17\x03\x17\x03\x17" +
		"\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x18\x03\x18\x03\x18\x03\x18" +
		"\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18" +
		"\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18" +
		"\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18" +
		"\x03\x18\x03\x18\x03\x18\x05\x18\u022B\n\x18\x03\x19\x03\x19\x03\x19\x03" +
		"\x19\x03\x1A\x03\x1A\x03\x1A\x07\x1A\u0234\n\x1A\f\x1A\x0E\x1A\u0237\v" +
		"\x1A\x03\x1B\x03\x1B\x05\x1B\u023B\n\x1B\x03\x1C\x03\x1C\x03\x1C\x03\x1C" +
		"\x03\x1C\x05\x1C\u0242\n\x1C\x03\x1D\x03\x1D\x03\x1E\x03\x1E\x03\x1E\x03" +
		"\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1F\x03\x1F\x03\x1F\x07\x1F\u0250\n\x1F" +
		"\f\x1F\x0E\x1F\u0253\v\x1F\x03 \x03 \x03 \x03 \x05 \u0259\n \x03!\x03" +
		"!\x03!\x03!\x03!\x03!\x03!\x03!\x03\"\x03\"\x03\"\x03\"\x03\"\x07\"\u0268" +
		"\n\"\f\"\x0E\"\u026B\v\"\x03#\x03#\x03#\x03#\x03#\x03#\x03#\x03#\x03$" +
		"\x03$\x03$\x07$\u0278\n$\f$\x0E$\u027B\v$\x03%\x03%\x03%\x03%\x03%\x05" +
		"%\u0282\n%\x03&\x03&\x03&\x03&\x03&\x03\'\x03\'\x03\'\x05\'\u028C\n\'" +
		"\x03(\x03(\x03(\x03(\x05(\u0292\n(\x03)\x03)\x03)\x03)\x03)\x03)\x03)" +
		"\x03)\x03*\x03*\x03*\x07*\u029F\n*\f*\x0E*\u02A2\v*\x03+\x03+\x03+\x03" +
		"+\x03+\x03,\x03,\x05,\u02AB\n,\x03-\x03-\x03-\x03-\x03-\x03-\x03.\x03" +
		".\x03.\x03.\x03.\x03.\x07.\u02B9\n.\f.\x0E.\u02BC\v.\x03/\x03/\x03/\x03" +
		"/\x03/\x03/\x03/\x03/\x03/\x03/\x03/\x05/\u02C9\n/\x030\x030\x030\x03" +
		"0\x030\x030\x030\x030\x030\x030\x030\x030\x030\x030\x030\x030\x030\x03" +
		"0\x030\x030\x030\x030\x030\x030\x030\x030\x030\x030\x030\x030\x030\x03" +
		"0\x030\x050\u02EC\n0\x031\x031\x031\x031\x031\x031\x031\x031\x032\x03" +
		"2\x032\x032\x032\x032\x032\x032\x033\x033\x033\x073\u0301\n3\f3\x0E3\u0304" +
		"\v3\x034\x034\x034\x034\x034\x054\u030B\n4\x035\x035\x036\x036\x036\x03" +
		"6\x036\x036\x036\x036\x036\x036\x036\x036\x036\x036\x036\x036\x036\x03" +
		"6\x056\u0321\n6\x037\x037\x037\x077\u0326\n7\f7\x0E7\u0329\v7\x038\x03" +
		"8\x038\x038\x038\x038\x038\x039\x039\x039\x039\x039\x039\x039\x039\x03" +
		"9\x039\x039\x039\x039\x039\x039\x039\x059\u0342\n9\x03:\x03:\x03:\x03" +
		":\x03:\x05:\u0349\n:\x03;\x03;\x05;\u034D\n;\x03<\x03<\x03<\x03<\x05<" +
		"\u0353\n<\x03=\x03=\x03>\x03>\x03>\x03>\x03>\x03?\x03?\x03?\x03?\x03?" +
		"\x03@\x03@\x03@\x03@\x03@\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03" +
		"A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03" +
		"A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03A\x03" +
		"A\x05A\u038B\nA\x03B\x03B\x03B\x05B\u0390\nB\x03C\x03C\x03C\x03C\x03C" +
		"\x05C\u0397\nC\x03D\x03D\x03D\x03D\x03D\x03D\x07D\u039F\nD\fD\x0ED\u03A2" +
		"\vD\x03E\x03E\x03E\x03E\x05E\u03A8\nE\x03F\x03F\x05F\u03AC\nF\x03F\x03" +
		"F\x03F\x07F\u03B1\nF\fF\x0EF\u03B4\vF\x03G\x03G\x03G\x05G\u03B9\nG\x03" +
		"H\x03H\x03H\x03H\x03H\x03H\x07H\u03C1\nH\fH\x0EH\u03C4\vH\x03I\x03I\x03" +
		"I\x03I\x03I\x03I\x03I\x03I\x03I\x03I\x03I\x03I\x03I\x05I\u03D3\nI\x03" +
		"J\x03J\x03J\x03J\x05J\u03D9\nJ\x03K\x03K\x03K\x03K\x03K\x03K\x03K\x03" +
		"L\x03L\x03L\x03L\x03L\x03L\x03L\x03M\x03M\x03M\x03M\x03M\x03M\x03M\x03" +
		"N\x03N\x03N\x07N\u03F3\nN\fN\x0EN\u03F6\vN\x03O\x03O\x03O\x03O\x03O\x03" +
		"P\x03P\x03P\x03P\x03P\x03P\x03P\x03P\x03P\x03P\x03P\x03P\x03P\x03P\x03" +
		"P\x03P\x03P\x03P\x05P\u040F\nP\x03Q\x03Q\x03Q\x03Q\x03Q\x03Q\x07Q\u0417" +
		"\nQ\fQ\x0EQ\u041A\vQ\x03R\x03R\x03R\x03R\x03S\x03S\x03S\x03S\x03S\x03" +
		"T\x03T\x03T\x03T\x03T\x03U\x03U\x03U\x03U\x03U\x03U\x07U\u0430\nU\fU\x0E" +
		"U\u0433\vU\x03V\x03V\x03V\x03V\x03V\x03V\x03V\x03V\x03V\x03V\x03V\x03" +
		"V\x03V\x03V\x03V\x03V\x03V\x03V\x03V\x03V\x05V\u0449\nV\x03W\x03W\x03" +
		"W\x03W\x03W\x03W\x03W\x03W\x03W\x03W\x03W\x03W\x03W\x03W\x03W\x03W\x03" +
		"W\x03W\x03W\x03W\x05W\u045F\nW\x03X\x03X\x03Y\x03Y\x03Y\x03Z\x03Z\x03" +
		"Z\x03Z\x03Z\x03Z\x05Z\u046C\nZ\x03[\x03[\x03[\x03[\x03[\x03[\x03[\x03" +
		"[\x03[\x03[\x03[\x03[\x03[\x03[\x05[\u047C\n[\x03\\\x03\\\x03\\\x03\\" +
		"\x03\\\x03\\\x03\\\x03\\\x03]\x03]\x03]\x03]\x03]\x03]\x03]\x03]\x05]" +
		"\u048E\n]\x03^\x03^\x03^\x03^\x03^\x03_\x03_\x03_\x07_\u0498\n_\f_\x0E" +
		"_\u049B\v_\x03`\x03`\x03`\x03`\x03`\x03`\x03`\x03`\x03a\x03a\x03a\x07" +
		"a\u04A8\na\fa\x0Ea\u04AB\va\x03b\x03b\x03b\x03b\x03b\x03b\x03b\x05b\u04B4" +
		"\nb\x03c\x03c\x05c\u04B8\nc\x03d\x03d\x03d\x03d\x05d\u04BE\nd\x03e\x03" +
		"e\x03e\x03e\x03e\x03e\x03e\x03f\x03f\x03f\x03f\x03f\x07f\u04CC\nf\ff\x0E" +
		"f\u04CF\vf\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03" +
		"g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03" +
		"g\x03g\x05g\u04EC\ng\x03h\x03h\x03h\x07h\u04F1\nh\fh\x0Eh\u04F4\vh\x03" +
		"i\x03i\x03i\x03i\x03i\x03i\x03j\x03j\x03j\x03j\x03j\x07j\u0501\nj\fj\x0E" +
		"j\u0504\vj\x03k\x03k\x03k\x03k\x03k\x03k\x03k\x03k\x03k\x05k\u050F\nk" +
		"\x03l\x03l\x03l\x03l\x03l\x03l\x03m\x03m\x03m\x03m\x03m\x03m\x03m\x03" +
		"m\x03m\x03m\x03m\x03m\x03m\x05m\u0524\nm\x03n\x03n\x03n\x03n\x03n\x07" +
		"n\u052B\nn\fn\x0En\u052E\vn\x03o\x03o\x03o\x03o\x03o\x03o\x03o\x03o\x03" +
		"p\x03p\x03p\x03p\x03p\x03p\x03p\x03p\x03p\x03p\x03p\x05p\u0543\np\x03" +
		"q\x03q\x03q\x03q\x03q\x03q\x03q\x03q\x03r\x03r\x03r\x05r\u0550\nr\x03" +
		"s\x03s\x03t\x03t\x03t\x03u\x03u\x05u\u0559\nu\x03v\x03v\x03v\x03v\x03" +
		"v\x03v\x07v\u0561\nv\fv\x0Ev\u0564\vv\x03w\x03w\x03w\x03w\x03w\x03w\x05" +
		"w\u056C\nw\x03x\x03x\x05x\u0570\nx\x03x\x03x\x03x\x07x\u0575\nx\fx\x0E" +
		"x\u0578\vx\x03y\x03y\x03y\x03y\x05y\u057E\ny\x03z\x03z\x03z\x05z\u0583" +
		"\nz\x03z\x03z\x03z\x03z\x03z\x03z\x03z\x03z\x03z\x03z\x03z\x03z\x03z\x03" +
		"z\x03z\x07z\u0594\nz\fz\x0Ez\u0597\vz\x03{\x03{\x03{\x03{\x03{\x03{\x03" +
		"{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03" +
		"{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03" +
		"{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x05{\u05C4\n{\x03{\x03{\x03" +
		"{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03" +
		"{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03" +
		"{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03" +
		"{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03" +
		"{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03" +
		"{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03" +
		"{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x03{\x07{\u0628\n" +
		"{\f{\x0E{\u062B\v{\x03|\x03|\x03}\x03}\x03}\x03}\x03}\x03}\x03}\x03}\x03" +
		"}\x03}\x03}\x03}\x03}\x03}\x03}\x03}\x03}\x03}\x03}\x03}\x03}\x05}\u0644" +
		"\n}\x03}\x02\x02\x1F\x06\x18\x1C &2<BFRZdl\x86\x8A\x8E\x9A\xA0\xA8\xBC" +
		"\xC0\xCA\xCE\xD2\xDA\xEA\xEE\xF2\xF4~\x02\x02\x04\x02\x06\x02\b\x02\n" +
		"\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C" +
		"\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x024\x026" +
		"\x028\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02P\x02" +
		"R\x02T\x02V\x02X\x02Z\x02\\\x02^\x02`\x02b\x02d\x02f\x02h\x02j\x02l\x02" +
		"n\x02p\x02r\x02t\x02v\x02x\x02z\x02|\x02~\x02\x80\x02\x82\x02\x84\x02" +
		"\x86\x02\x88\x02\x8A\x02\x8C\x02\x8E\x02\x90\x02\x92\x02\x94\x02\x96\x02" +
		"\x98\x02\x9A\x02\x9C\x02\x9E\x02\xA0\x02\xA2\x02\xA4\x02\xA6\x02\xA8\x02" +
		"\xAA\x02\xAC\x02\xAE\x02\xB0\x02\xB2\x02\xB4\x02\xB6\x02\xB8\x02\xBA\x02" +
		"\xBC\x02\xBE\x02\xC0\x02\xC2\x02\xC4\x02\xC6\x02\xC8\x02\xCA\x02\xCC\x02" +
		"\xCE\x02\xD0\x02\xD2\x02\xD4\x02\xD6\x02\xD8\x02\xDA\x02\xDC\x02\xDE\x02" +
		"\xE0\x02\xE2\x02\xE4\x02\xE6\x02\xE8\x02\xEA\x02\xEC\x02\xEE\x02\xF0\x02" +
		"\xF2\x02\xF4\x02\xF6\x02\xF8\x02\x02\x03\x03\x02gh\x02\u06F4\x02\xFA\x03" +
		"\x02\x02\x02\x04\xFC\x03\x02\x02\x02\x06\xFE\x03\x02\x02\x02\b\u0113\x03" +
		"\x02\x02\x02\n\u0125\x03\x02\x02\x02\f\u0137\x03\x02\x02\x02\x0E\u0140" +
		"\x03\x02\x02\x02\x10\u0144\x03\x02\x02\x02\x12\u014A\x03\x02\x02\x02\x14" +
		"\u014E\x03\x02\x02\x02\x16\u0152\x03\x02\x02\x02\x18\u0154\x03\x02\x02" +
		"\x02\x1A\u016A\x03\x02\x02\x02\x1C\u016C\x03\x02\x02\x02\x1E\u01CC\x03" +
		"\x02\x02\x02 \u01CE\x03\x02\x02\x02\"\u01D9\x03\x02\x02\x02$\u01DF\x03" +
		"\x02\x02\x02&\u01E1\x03\x02\x02\x02(\u01F8\x03\x02\x02\x02*\u01FE\x03" +
		"\x02\x02\x02,\u0200\x03\x02\x02\x02.\u022A\x03\x02\x02\x020\u022C\x03" +
		"\x02\x02\x022\u0230\x03\x02\x02\x024\u023A\x03\x02\x02\x026\u0241\x03" +
		"\x02\x02\x028\u0243\x03\x02\x02\x02:\u0245\x03\x02\x02\x02<\u024C\x03" +
		"\x02\x02\x02>\u0258\x03\x02\x02\x02@\u025A\x03\x02\x02\x02B\u0262\x03" +
		"\x02\x02\x02D\u026C\x03\x02\x02\x02F\u0274\x03\x02\x02\x02H\u0281\x03" +
		"\x02\x02\x02J\u0283\x03\x02\x02\x02L\u028B\x03\x02\x02\x02N\u0291\x03" +
		"\x02\x02\x02P\u0293\x03\x02\x02\x02R\u029B\x03\x02\x02\x02T\u02A3\x03" +
		"\x02\x02\x02V\u02AA\x03\x02\x02\x02X\u02AC\x03\x02\x02\x02Z\u02B2\x03" +
		"\x02\x02\x02\\\u02C8\x03\x02\x02\x02^\u02EB\x03\x02\x02\x02`\u02ED\x03" +
		"\x02\x02\x02b\u02F5\x03\x02\x02\x02d\u02FD\x03\x02\x02\x02f\u030A\x03" +
		"\x02\x02\x02h\u030C\x03\x02\x02\x02j\u0320\x03\x02\x02\x02l\u0322\x03" +
		"\x02\x02\x02n\u032A\x03\x02\x02\x02p\u0341\x03\x02\x02\x02r\u0348\x03" +
		"\x02\x02\x02t\u034C\x03\x02\x02\x02v\u0352\x03\x02\x02\x02x\u0354\x03" +
		"\x02\x02\x02z\u0356\x03\x02\x02\x02|\u035B\x03\x02\x02\x02~\u0360\x03" +
		"\x02\x02\x02\x80\u038A\x03\x02\x02\x02\x82\u038F\x03\x02\x02\x02\x84\u0396" +
		"\x03\x02\x02\x02\x86\u0398\x03\x02\x02\x02\x88\u03A7\x03\x02\x02\x02\x8A" +
		"\u03AB\x03\x02\x02\x02\x8C\u03B8\x03\x02\x02\x02\x8E\u03BA\x03\x02\x02" +
		"\x02\x90\u03D2\x03\x02\x02\x02\x92\u03D8\x03\x02\x02\x02\x94\u03DA\x03" +
		"\x02\x02\x02\x96\u03E1\x03\x02\x02\x02\x98\u03E8\x03\x02\x02\x02\x9A\u03EF" +
		"\x03\x02\x02\x02\x9C\u03F7\x03\x02\x02\x02\x9E\u040E\x03\x02\x02\x02\xA0" +
		"\u0410\x03\x02\x02\x02\xA2\u041B\x03\x02\x02\x02\xA4\u041F\x03\x02\x02" +
		"\x02\xA6\u0424\x03\x02\x02\x02\xA8\u0429\x03\x02\x02\x02\xAA\u0448\x03" +
		"\x02\x02\x02\xAC\u045E\x03\x02\x02\x02\xAE\u0460\x03\x02\x02\x02\xB0\u0462" +
		"\x03\x02\x02\x02\xB2\u046B\x03\x02\x02\x02\xB4\u047B\x03\x02\x02\x02\xB6" +
		"\u047D\x03\x02\x02\x02\xB8\u048D\x03\x02\x02\x02\xBA\u048F\x03\x02\x02" +
		"\x02\xBC\u0494\x03\x02\x02\x02\xBE\u049C\x03\x02\x02\x02\xC0\u04A4\x03" +
		"\x02\x02\x02\xC2\u04B3\x03\x02\x02\x02\xC4\u04B7\x03\x02\x02\x02\xC6\u04BD" +
		"\x03\x02\x02\x02\xC8\u04BF\x03\x02\x02\x02\xCA\u04C6\x03\x02\x02\x02\xCC" +
		"\u04EB\x03\x02\x02\x02\xCE\u04ED\x03\x02\x02\x02\xD0\u04F5\x03\x02\x02" +
		"\x02\xD2\u04FB\x03\x02\x02\x02\xD4\u050E\x03\x02\x02\x02\xD6\u0510\x03" +
		"\x02\x02\x02\xD8\u0523\x03\x02\x02\x02\xDA\u0525\x03\x02\x02\x02\xDC\u052F" +
		"\x03\x02\x02\x02\xDE\u0542\x03\x02\x02\x02\xE0\u0544\x03\x02\x02\x02\xE2" +
		"\u054F\x03\x02\x02\x02\xE4\u0551\x03\x02\x02\x02\xE6\u0553\x03\x02\x02" +
		"\x02\xE8\u0558\x03\x02\x02\x02\xEA\u055A\x03\x02\x02\x02\xEC\u056B\x03" +
		"\x02\x02\x02\xEE\u056F\x03\x02\x02\x02\xF0\u057D\x03\x02\x02\x02\xF2\u0582" +
		"\x03\x02\x02\x02\xF4\u05C3\x03\x02\x02\x02\xF6\u062C\x03\x02\x02\x02\xF8" +
		"\u0643\x03\x02\x02\x02\xFA\xFB\x05\x04\x03\x02\xFB\x03\x03\x02\x02\x02" +
		"\xFC\xFD\x05\x06\x04\x02\xFD\x05\x03\x02\x02\x02\xFE\u0105\b\x04\x01\x02" +
		"\xFF\u0100\f\x04\x02\x02\u0100\u0104\x05\b\x05\x02\u0101\u0102\f\x03\x02" +
		"\x02\u0102\u0104\x07U\x02\x02\u0103\xFF\x03\x02\x02\x02\u0103\u0101\x03" +
		"\x02\x02\x02\u0104\u0107\x03\x02\x02\x02\u0105\u0103\x03\x02\x02\x02\u0105" +
		"\u0106\x03\x02\x02\x02\u0106\x07\x03\x02\x02\x02\u0107\u0105\x03\x02\x02" +
		"\x02\u0108\u0114\x05\xE0q\x02\u0109\u0114\x05j6\x02\u010A\u0114\x05\xDC" +
		"o\x02\u010B\u0114\x05:\x1E\x02\u010C\u0114\x05\x90I\x02\u010D\u0114\x05" +
		"`1\x02\u010E\u0114\x05.\x18\x02\u010F\u0114\x05\xA4S\x02\u0110\u0114\x05" +
		"\xA6T\x02\u0111\u0114\x05\xE6t\x02\u0112\u0114\x05\n\x06\x02\u0113\u0108" +
		"\x03\x02\x02\x02\u0113\u0109\x03\x02\x02\x02\u0113\u010A\x03\x02\x02\x02" +
		"\u0113\u010B\x03\x02\x02\x02\u0113\u010C\x03\x02\x02\x02\u0113\u010D\x03" +
		"\x02\x02\x02\u0113\u010E\x03\x02\x02\x02\u0113\u010F\x03\x02\x02\x02\u0113" +
		"\u0110\x03\x02\x02\x02\u0113\u0111\x03\x02\x02\x02\u0113\u0112\x03\x02" +
		"\x02\x02\u0114\t\x03\x02\x02\x02\u0115\u0116\x07\\\x02\x02\u0116\u0126" +
		"\x05\f\x07\x02\u0117\u0126\x07]\x02\x02\u0118\u0119\x07]\x02\x02\u0119" +
		"\u011A\x05\xF4{\x02\u011A\u011B\x05\xF4{\x02\u011B\u0126\x03\x02\x02\x02" +
		"\u011C\u0126\x07^\x02\x02\u011D\u0126\x07_\x02\x02\u011E\u0126\x07`\x02" +
		"\x02\u011F\u0120\x07d\x02\x02\u0120\u0126\x05\xF4{\x02\u0121\u0126\x07" +
		"a\x02\x02\u0122\u0126\x07e\x02\x02\u0123\u0126\x07b\x02\x02\u0124\u0126" +
		"\x07c\x02\x02\u0125\u0115\x03\x02\x02\x02\u0125\u0117\x03\x02\x02\x02" +
		"\u0125\u0118\x03\x02\x02\x02\u0125\u011C\x03\x02\x02\x02\u0125\u011D\x03" +
		"\x02\x02\x02\u0125\u011E\x03\x02\x02\x02\u0125\u011F\x03\x02\x02\x02\u0125" +
		"\u0121\x03\x02\x02\x02\u0125\u0122\x03\x02\x02\x02\u0125\u0123\x03\x02" +
		"\x02\x02\u0125\u0124\x03\x02\x02\x02\u0126\v\x03\x02\x02\x02\u0127\u0138" +
		"\x07[\x02\x02\u0128\u0129\x07M\x02\x02\u0129\u012A\x05\f\x07\x02\u012A" +
		"\u012B\x07N\x02\x02\u012B\u0138\x03\x02\x02\x02\u012C\u0138\x05\x10\t" +
		"\x02\u012D\u012E\x05\x10\t\x02\u012E\u012F\x07S\x02\x02\u012F\u0130\x05" +
		"\x10\t\x02\u0130\u0138\x03\x02\x02\x02\u0131\u0132\x07\x03\x02\x02\u0132" +
		"\u0138\x05\f\x07\x02\u0133\u0134\x07\x04\x02\x02\u0134\u0138\x05\f\x07" +
		"\x02\u0135\u0136\x07A\x02\x02\u0136\u0138\x05\f\x07\x02\u0137\u0127\x03" +
		"\x02\x02\x02\u0137\u0128\x03\x02\x02\x02\u0137\u012C\x03\x02\x02\x02\u0137" +
		"\u012D\x03\x02\x02\x02\u0137\u0131\x03\x02\x02\x02\u0137\u0133\x03\x02" +
		"\x02\x02\u0137\u0135\x03\x02\x02\x02\u0138\r\x03\x02\x02\x02\u0139\u0141" +
		"\x05\xF6|\x02\u013A\u0141\x07\t\x02\x02\u013B\u0141\x07\x1C\x02\x02\u013C" +
		"\u0141\x07\b\x02\x02\u013D\u0141\x07$\x02\x02\u013E\u0141\x07\x10\x02" +
		"\x02\u013F\u0141\x07\x1E\x02\x02\u0140\u0139\x03\x02\x02\x02\u0140\u013A" +
		"\x03\x02\x02\x02\u0140\u013B\x03\x02\x02\x02\u0140\u013C\x03\x02\x02\x02" +
		"\u0140\u013D\x03\x02\x02\x02\u0140\u013E\x03\x02\x02\x02\u0140\u013F\x03" +
		"\x02\x02\x02\u0141";
	private static readonly _serializedATNSegment1: string =
		"\x0F\x03\x02\x02\x02\u0142\u0145\x05\x0E\b\x02\u0143\u0145\x05\xF6|\x02" +
		"\u0144\u0142\x03\x02\x02\x02\u0144\u0143\x03\x02\x02\x02\u0145\x11\x03" +
		"\x02\x02\x02\u0146\u014B\x05\xF6|\x02\u0147\u014B\x07\t\x02\x02\u0148" +
		"\u014B\x07$\x02\x02\u0149\u014B\x07\x1E\x02\x02\u014A\u0146\x03\x02\x02" +
		"\x02\u014A\u0147\x03\x02\x02\x02\u014A\u0148\x03\x02\x02\x02\u014A\u0149" +
		"\x03\x02\x02\x02\u014B\x13\x03\x02\x02\x02\u014C\u014F\x03\x02\x02\x02" +
		"\u014D\u014F\x07\f\x02\x02\u014E\u014C\x03\x02\x02\x02\u014E\u014D\x03" +
		"\x02\x02\x02\u014F\x15\x03\x02\x02\x02\u0150\u0153\x03\x02\x02\x02\u0151" +
		"\u0153\x05\x18\r\x02\u0152\u0150\x03\x02\x02\x02\u0152\u0151\x03\x02\x02" +
		"\x02\u0153\x17\x03\x02\x02\x02\u0154\u0155\b\r\x01\x02\u0155\u0156\x05" +
		"\x1A\x0E\x02\u0156\u015B\x03\x02\x02\x02\u0157\u0158\f\x03\x02\x02\u0158" +
		"\u015A\x05\x1A\x0E\x02\u0159\u0157\x03\x02\x02\x02\u015A\u015D\x03\x02" +
		"\x02\x02\u015B\u0159\x03\x02\x02\x02\u015B\u015C\x03\x02\x02\x02\u015C" +
		"\x19\x03\x02\x02\x02\u015D\u015B\x03\x02\x02\x02\u015E\u015F\x07V\x02" +
		"\x02\u015F\u016B\x05\x10\t\x02\u0160\u0161\x07V\x02\x02\u0161\u0162\x05" +
		"\x10\t\x02\u0162\u0163\x07G\x02\x02\u0163\u0164\x05\x1C\x0F\x02\u0164" +
		"\u0165\x07H\x02\x02\u0165\u016B\x03\x02\x02\x02\u0166\u0167\x07\x05\x02" +
		"\x02\u0167\u0168\x05\x10\t\x02\u0168\u0169\x05\x1C\x0F\x02\u0169\u016B" +
		"\x03\x02\x02\x02\u016A\u015E\x03\x02\x02\x02\u016A\u0160\x03\x02\x02\x02" +
		"\u016A\u0166\x03\x02\x02\x02\u016B\x1B\x03\x02\x02\x02\u016C\u0176\b\x0F" +
		"\x01\x02\u016D\u016E\f\x04\x02\x02\u016E\u016F\x07G\x02\x02\u016F\u0170" +
		"\x05\x1C\x0F\x02\u0170\u0171\x07H\x02\x02\u0171\u0175\x03\x02\x02\x02" +
		"\u0172\u0173\f\x03\x02\x02\u0173\u0175\x05\x1E\x10\x02\u0174\u016D\x03" +
		"\x02\x02\x02\u0174\u0172\x03\x02\x02\x02\u0175\u0178\x03\x02\x02\x02\u0176" +
		"\u0174\x03\x02\x02\x02\u0176\u0177\x03\x02\x02\x02\u0177\x1D\x03\x02\x02" +
		"\x02\u0178\u0176\x03\x02\x02\x02\u0179\u01CD\x07W\x02\x02\u017A\u01CD" +
		"\x07\x06\x02\x02\u017B\u01CD\x07\x07\x02\x02\u017C\u01CD\x07\b\x02\x02" +
		"\u017D\u01CD\x07\t\x02\x02\u017E\u01CD\x07\n\x02\x02\u017F\u01CD\x07\v" +
		"\x02\x02\u0180\u01CD\x07\f\x02\x02\u0181\u01CD\x07\r\x02\x02\u0182\u01CD" +
		"\x07\x0E\x02\x02\u0183\u01CD\x07\x0F\x02\x02\u0184\u01CD\x07\x10\x02\x02" +
		"\u0185\u01CD\x07\x11\x02\x02\u0186\u01CD\x07\x12\x02\x02\u0187\u01CD\x07" +
		"\x13\x02\x02\u0188\u01CD\x07\x14\x02\x02\u0189\u01CD\x07\x15\x02\x02\u018A" +
		"\u01CD\x07\x16\x02\x02\u018B\u01CD\x07\x17\x02\x02\u018C\u01CD\x07\x18" +
		"\x02\x02\u018D\u01CD\x07\x19\x02\x02\u018E\u01CD\x07\x1A\x02\x02\u018F" +
		"\u01CD\x07\x1B\x02\x02\u0190\u01CD\x07\x1C\x02\x02\u0191\u01CD\x07\x1D" +
		"\x02\x02\u0192\u01CD\x07\x1E\x02\x02\u0193\u01CD\x07\x1F\x02\x02\u0194" +
		"\u01CD\x07 \x02\x02\u0195\u01CD\x07!\x02\x02\u0196\u01CD\x07\x05\x02\x02" +
		"\u0197\u01CD\x07\"\x02\x02\u0198\u01CD\x07#\x02\x02\u0199\u01CD\x07$\x02" +
		"\x02\u019A\u01CD\x07&\x02\x02\u019B\u01CD\x07\'\x02\x02\u019C\u01CD\x07" +
		"(\x02\x02\u019D\u01CD\x07)\x02\x02\u019E\u01CD\x07*\x02\x02\u019F\u01CD" +
		"\x07+\x02\x02\u01A0\u01CD\x07,\x02\x02\u01A1\u01CD\x07-\x02\x02\u01A2" +
		"\u01CD\x07.\x02\x02\u01A3\u01CD\x07/\x02\x02\u01A4\u01CD\x070\x02\x02" +
		"\u01A5\u01CD\x071\x02\x02\u01A6\u01CD\x05\xF6|\x02\u01A7\u01CD\x07[\x02" +
		"\x02\u01A8\u01CD\x07i\x02\x02\u01A9\u01CD\x072\x02\x02\u01AA\u01CD\x07" +
		"3\x02\x02\u01AB\u01CD\x074\x02\x02\u01AC\u01CD\x075\x02\x02\u01AD\u01CD" +
		"\x076\x02\x02\u01AE\u01CD\x077\x02\x02\u01AF\u01CD\x078\x02\x02\u01B0" +
		"\u01CD\x079\x02\x02\u01B1\u01CD\x07:\x02\x02\u01B2\u01CD\x07;\x02\x02" +
		"\u01B3\u01CD\x07<\x02\x02\u01B4\u01CD\x07=\x02\x02\u01B5\u01CD\x07>\x02" +
		"\x02\u01B6\u01CD\x07?\x02\x02\u01B7\u01CD\x07@\x02\x02\u01B8\u01CD\x07" +
		"A\x02\x02\u01B9\u01CD\x07B\x02\x02\u01BA\u01CD\x07C\x02\x02\u01BB\u01CD" +
		"\x07D\x02\x02\u01BC\u01CD\x07E\x02\x02\u01BD\u01CD\x07F\x02\x02\u01BE" +
		"\u01CD\x07I\x02\x02\u01BF\u01CD\x07J\x02\x02\u01C0\u01CD\x07K\x02\x02" +
		"\u01C1\u01CD\x07L\x02\x02\u01C2\u01CD\x07M\x02\x02\u01C3\u01CD\x07N\x02" +
		"\x02\u01C4\u01CD\x07O\x02\x02\u01C5\u01CD\x07P\x02\x02\u01C6\u01CD\x07" +
		"Q\x02\x02\u01C7\u01CD\x07R\x02\x02\u01C8\u01CD\x07S\x02\x02\u01C9\u01CD" +
		"\x07T\x02\x02\u01CA\u01CD\x07U\x02\x02\u01CB\u01CD\x07V\x02\x02\u01CC" +
		"\u0179\x03\x02\x02\x02\u01CC\u017A\x03\x02\x02\x02\u01CC\u017B\x03\x02" +
		"\x02\x02\u01CC\u017C\x03\x02\x02\x02\u01CC\u017D\x03\x02\x02\x02\u01CC" +
		"\u017E\x03\x02\x02\x02\u01CC\u017F\x03\x02\x02\x02\u01CC\u0180\x03\x02" +
		"\x02\x02\u01CC\u0181\x03\x02\x02\x02\u01CC\u0182\x03\x02\x02\x02\u01CC" +
		"\u0183\x03\x02\x02\x02\u01CC\u0184\x03\x02\x02\x02\u01CC\u0185\x03\x02" +
		"\x02\x02\u01CC\u0186\x03\x02\x02\x02\u01CC\u0187\x03\x02\x02\x02\u01CC" +
		"\u0188\x03\x02\x02\x02\u01CC\u0189\x03\x02\x02\x02\u01CC\u018A\x03\x02" +
		"\x02\x02\u01CC\u018B\x03\x02\x02\x02\u01CC\u018C\x03\x02\x02\x02\u01CC" +
		"\u018D\x03\x02\x02\x02\u01CC\u018E\x03\x02\x02\x02\u01CC\u018F\x03\x02" +
		"\x02\x02\u01CC\u0190\x03\x02\x02\x02\u01CC\u0191\x03\x02\x02\x02\u01CC" +
		"\u0192\x03\x02\x02\x02\u01CC\u0193\x03\x02\x02\x02\u01CC\u0194\x03\x02" +
		"\x02\x02\u01CC\u0195\x03\x02\x02\x02\u01CC\u0196\x03\x02\x02\x02\u01CC" +
		"\u0197\x03\x02\x02\x02\u01CC\u0198\x03\x02\x02\x02\u01CC\u0199\x03\x02" +
		"\x02\x02\u01CC\u019A\x03\x02\x02\x02\u01CC\u019B\x03\x02\x02\x02\u01CC" +
		"\u019C\x03\x02\x02\x02\u01CC\u019D\x03\x02\x02\x02\u01CC\u019E\x03\x02" +
		"\x02\x02\u01CC\u019F\x03\x02\x02\x02\u01CC\u01A0\x03\x02\x02\x02\u01CC" +
		"\u01A1\x03\x02\x02\x02\u01CC\u01A2\x03\x02\x02\x02\u01CC\u01A3\x03\x02" +
		"\x02\x02\u01CC\u01A4\x03\x02\x02\x02\u01CC\u01A5\x03\x02\x02\x02\u01CC" +
		"\u01A6\x03\x02\x02\x02\u01CC\u01A7\x03\x02\x02\x02\u01CC\u01A8\x03\x02" +
		"\x02\x02\u01CC\u01A9\x03\x02\x02\x02\u01CC\u01AA\x03\x02\x02\x02\u01CC" +
		"\u01AB\x03\x02\x02\x02\u01CC\u01AC\x03\x02\x02\x02\u01CC\u01AD\x03\x02" +
		"\x02\x02\u01CC\u01AE\x03\x02\x02\x02\u01CC\u01AF\x03\x02\x02\x02\u01CC" +
		"\u01B0\x03\x02\x02\x02\u01CC\u01B1\x03\x02\x02\x02\u01CC\u01B2\x03\x02" +
		"\x02\x02\u01CC\u01B3\x03\x02\x02\x02\u01CC\u01B4\x03\x02\x02\x02\u01CC" +
		"\u01B5\x03\x02\x02\x02\u01CC\u01B6\x03\x02\x02\x02\u01CC\u01B7\x03\x02" +
		"\x02\x02\u01CC\u01B8\x03\x02\x02\x02\u01CC\u01B9\x03\x02\x02\x02\u01CC" +
		"\u01BA\x03\x02\x02\x02\u01CC\u01BB\x03\x02\x02\x02\u01CC\u01BC\x03\x02" +
		"\x02\x02\u01CC\u01BD\x03\x02\x02\x02\u01CC\u01BE\x03\x02\x02\x02\u01CC" +
		"\u01BF\x03\x02\x02\x02\u01CC\u01C0\x03\x02\x02\x02\u01CC\u01C1\x03\x02" +
		"\x02\x02\u01CC\u01C2\x03\x02\x02\x02\u01CC\u01C3\x03\x02\x02\x02\u01CC" +
		"\u01C4\x03\x02\x02\x02\u01CC\u01C5\x03\x02\x02\x02\u01CC\u01C6\x03\x02" +
		"\x02\x02\u01CC\u01C7\x03\x02\x02\x02\u01CC\u01C8\x03\x02\x02\x02\u01CC" +
		"\u01C9\x03\x02\x02\x02\u01CC\u01CA\x03\x02\x02\x02\u01CC\u01CB\x03\x02" +
		"\x02\x02\u01CD\x1F\x03\x02\x02\x02\u01CE\u01CF\b\x11\x01\x02\u01CF\u01D0" +
		"\x05\"\x12\x02\u01D0\u01D6\x03\x02\x02\x02\u01D1\u01D2\f\x03\x02\x02\u01D2" +
		"\u01D3\x07Q\x02\x02\u01D3\u01D5\x05\"\x12\x02\u01D4\u01D1\x03\x02\x02" +
		"\x02\u01D5\u01D8\x03\x02\x02\x02\u01D6\u01D4\x03\x02\x02\x02\u01D6\u01D7" +
		"\x03\x02\x02\x02\u01D7!\x03\x02\x02\x02\u01D8\u01D6\x03\x02\x02\x02\u01D9" +
		"\u01DA\x05\x10\t\x02\u01DA\u01DB\x07T\x02\x02\u01DB\u01DC\x05\xF4{\x02" +
		"\u01DC#\x03\x02\x02\x02\u01DD\u01E0\x03\x02\x02\x02\u01DE\u01E0\x05&\x14" +
		"\x02\u01DF\u01DD\x03\x02\x02\x02\u01DF\u01DE\x03\x02\x02\x02\u01E0%\x03" +
		"\x02\x02\x02\u01E1\u01E2\b\x14\x01\x02\u01E2\u01E3\x05(\x15\x02\u01E3" +
		"\u01E9\x03\x02\x02\x02\u01E4\u01E5\f\x03\x02\x02\u01E5\u01E6\x07Q\x02" +
		"\x02\u01E6\u01E8\x05(\x15\x02\u01E7\u01E4\x03\x02\x02\x02\u01E8\u01EB" +
		"\x03\x02\x02\x02\u01E9\u01E7\x03\x02\x02\x02\u01E9\u01EA\x03\x02\x02\x02" +
		"\u01EA\'\x03\x02\x02\x02\u01EB\u01E9\x03\x02\x02\x02\u01EC\u01ED\x05\x16" +
		"\f\x02\u01ED\u01EE\x05*\x16\x02\u01EE\u01EF\x05r:\x02\u01EF\u01F0\x05" +
		"\x10\t\x02\u01F0\u01F9\x03\x02\x02\x02\u01F1\u01F2\x05\x16\f\x02\u01F2" +
		"\u01F3\x05*\x16\x02\u01F3\u01F4\x05r:\x02\u01F4\u01F5\x05\x10\t\x02\u01F5" +
		"\u01F6\x07T\x02\x02\u01F6\u01F7\x05\xF4{\x02\u01F7\u01F9\x03\x02\x02\x02" +
		"\u01F8\u01EC\x03\x02\x02\x02\u01F8\u01F1\x03\x02\x02\x02\u01F9)\x03\x02" +
		"\x02\x02\u01FA\u01FF\x07\x19\x02\x02\u01FB\u01FF\x07\x1F\x02\x02\u01FC" +
		"\u01FF\x07\x1A\x02\x02\u01FD\u01FF\x03\x02\x02\x02\u01FE\u01FA\x03\x02" +
		"\x02\x02\u01FE\u01FB\x03\x02\x02\x02\u01FE\u01FC\x03\x02\x02\x02\u01FE" +
		"\u01FD\x03\x02\x02\x02\u01FF+\x03\x02\x02\x02\u0200\u0201\x05\x16\f\x02" +
		"\u0201\u0202\x07!\x02\x02\u0202\u0203\x05\x10\t\x02\u0203\u0204\x05\x84" +
		"C\x02\u0204\u0205\x07G\x02\x02\u0205\u0206\x05$\x13\x02\u0206\u0207\x07" +
		"H\x02\x02\u0207-\x03\x02\x02\x02\u0208\u0209\x05\x18\r\x02\u0209\u020A" +
		"\x05r:\x02\u020A\u020B\x07G\x02\x02\u020B\u020C\x05\xE8u\x02\u020C\u020D" +
		"\x07H\x02\x02\u020D\u020E\x05\x10\t\x02\u020E\u020F\x07U\x02\x02\u020F" +
		"\u022B\x03\x02\x02\x02\u0210\u0211\x05r:\x02\u0211\u0212\x07G\x02\x02" +
		"\u0212\u0213\x05\xE8u\x02\u0213\u0214\x07H\x02\x02\u0214\u0215\x05\x10" +
		"\t\x02\u0215\u0216\x07U\x02\x02\u0216\u022B\x03\x02\x02\x02\u0217\u0218" +
		"\x05\x18\r\x02\u0218\u0219\x05r:\x02\u0219\u021A\x07G\x02\x02\u021A\u021B" +
		"\x05\xE8u\x02\u021B\u021C\x07H\x02\x02\u021C\u021D\x05\x10\t\x02\u021D" +
		"\u021E\x07T\x02\x02\u021E\u021F\x050\x19\x02\u021F\u0220\x07U\x02\x02" +
		"\u0220\u022B\x03\x02\x02\x02\u0221\u0222\x05r:\x02\u0222\u0223\x07G\x02" +
		"\x02\u0223\u0224\x05\xE8u\x02\u0224\u0225\x07H\x02\x02\u0225\u0226\x05" +
		"\x10\t\x02\u0226\u0227\x07T\x02\x02\u0227\u0228\x050\x19\x02\u0228\u0229" +
		"\x07U\x02\x02\u0229\u022B\x03\x02\x02\x02\u022A\u0208\x03\x02\x02\x02" +
		"\u022A\u0210\x03\x02\x02\x02\u022A\u0217\x03\x02\x02\x02\u022A\u0221\x03" +
		"\x02\x02\x02\u022B/\x03\x02\x02\x02\u022C\u022D\x07K\x02\x02\u022D\u022E" +
		"\x052\x1A\x02\u022E\u022F\x07L\x02\x02\u022F1\x03\x02\x02\x02\u0230\u0235" +
		"\b\x1A\x01\x02\u0231\u0232\f\x03\x02\x02\u0232\u0234\x054\x1B\x02\u0233" +
		"\u0231\x03\x02\x02\x02\u0234\u0237\x03\x02\x02\x02\u0235\u0233\x03\x02" +
		"\x02\x02\u0235\u0236\x03\x02\x02\x02\u02363\x03\x02\x02\x02\u0237\u0235" +
		"\x03\x02\x02\x02\u0238\u023B\x05\xE6t\x02\u0239\u023B\x05.\x18\x02\u023A" +
		"\u0238\x03\x02\x02\x02\u023A\u0239\x03\x02\x02\x02\u023B5\x03\x02\x02" +
		"\x02\u023C\u0242\x03\x02\x02\x02\u023D\u023E\x07G\x02\x02\u023E\u023F" +
		"\x05$\x13\x02\u023F\u0240\x07H\x02\x02\u0240\u0242\x03\x02\x02\x02\u0241" +
		"\u023C\x03\x02\x02\x02\u0241\u023D\x03\x02\x02\x02\u02427\x03\x02\x02" +
		"\x02\u0243\u0244\x07S\x02\x02\u02449\x03\x02\x02\x02\u0245\u0246\x05@" +
		"!\x02\u0246\u0247\x056\x1C\x02\u0247\u0248\x07K\x02\x02\u0248\u0249\x05" +
		"<\x1F\x02\u0249\u024A\x05B\"\x02\u024A\u024B\x07L\x02\x02\u024B;\x03\x02" +
		"\x02\x02\u024C\u0251\b\x1F\x01\x02\u024D\u024E\f\x03\x02\x02\u024E\u0250" +
		"\x05> \x02\u024F\u024D\x03\x02\x02\x02\u0250\u0253\x03\x02\x02\x02\u0251" +
		"\u024F\x03\x02\x02\x02\u0251\u0252\x03\x02\x02\x02\u0252=\x03\x02\x02" +
		"\x02\u0253\u0251\x03\x02\x02\x02\u0254\u0259\x05\xE0q\x02\u0255\u0259" +
		"\x05.\x18\x02\u0256\u0259\x05\xDEp\x02\u0257\u0259\x05^0\x02\u0258\u0254" +
		"\x03\x02\x02\x02\u0258\u0255\x03\x02\x02\x02\u0258\u0256\x03\x02\x02\x02" +
		"\u0258\u0257\x03\x02\x02\x02\u0259?\x03\x02\x02\x02\u025A\u025B\x05\x16" +
		"\f\x02\u025B\u025C\x07 \x02\x02\u025C\u025D\x05\x10\t\x02\u025D\u025E" +
		"\x05\x84C\x02\u025E\u025F\x07G\x02\x02\u025F\u0260\x05$\x13\x02\u0260" +
		"\u0261\x07H\x02\x02\u0261A\x03\x02\x02\x02\u0262\u0263\b\"\x01\x02\u0263" +
		"\u0264\x05D#\x02\u0264\u0269\x03\x02\x02\x02\u0265\u0266\f\x03\x02\x02" +
		"\u0266\u0268\x05D#\x02\u0267\u0265\x03\x02\x02\x02\u0268\u026B\x03\x02" +
		"\x02\x02\u0269\u0267\x03\x02\x02\x02\u0269\u026A\x03\x02\x02\x02\u026A" +
		"C\x03\x02\x02\x02\u026B\u0269\x03\x02\x02\x02\u026C\u026D\x05\x16\f\x02" +
		"\u026D\u026E\x07$\x02\x02\u026E\u026F\x05\x10\t\x02\u026F\u0270\x07K\x02" +
		"\x02\u0270\u0271\x05F$\x02\u0271\u0272\x05L\'\x02\u0272\u0273\x07L\x02" +
		"\x02\u0273E\x03\x02\x02\x02\u0274\u0279\b$\x01\x02\u0275\u0276\f\x03\x02" +
		"\x02\u0276\u0278\x05H%\x02\u0277\u0275\x03\x02\x02\x02\u0278\u027B\x03" +
		"\x02\x02\x02\u0279\u0277\x03\x02\x02\x02\u0279\u027A\x03\x02\x02\x02\u027A" +
		"G\x03\x02\x02\x02\u027B\u0279\x03\x02\x02\x02\u027C\u0282\x05\xACW\x02" +
		"\u027D\u0282\x05\xB6\\\x02\u027E\u0282\x05\xDEp\x02\u027F\u0282\x05\xE0" +
		"q\x02\u0280\u0282\x05J&\x02\u0281\u027C\x03\x02\x02\x02\u0281\u027D\x03" +
		"\x02\x02\x02\u0281\u027E\x03\x02\x02\x02\u0281\u027F\x03\x02\x02\x02\u0281" +
		"\u0280\x03\x02\x02\x02\u0282I\x03\x02\x02\x02\u0283\u0284\x05\x16\f\x02" +
		"\u0284\u0285\x07K\x02\x02\u0285\u0286\x05F$\x02\u0286\u0287\x07L\x02\x02" +
		"\u0287K\x03\x02\x02\x02\u0288\u028C\x03\x02\x02\x02\u0289\u028A\x07*\x02" +
		"\x02\u028A\u028C\x05N(\x02\u028B\u0288\x03\x02\x02\x02\u028B\u0289\x03" +
		"\x02\x02\x02\u028CM\x03\x02\x02\x02\u028D\u028E\x05\x10\t\x02\u028E\u028F" +
		"\x07U\x02\x02\u028F\u0292\x03\x02\x02\x02\u0290\u0292\x05P)\x02\u0291" +
		"\u028D\x03\x02\x02\x02\u0291\u0290\x03\x02\x02\x02\u0292O\x03\x02\x02" +
		"\x02\u0293\u0294\x07#\x02\x02\u0294\u0295\x07G\x02\x02\u0295\u0296\x05" +
		"\xEEx\x02\u0296\u0297\x07H\x02\x02\u0297\u0298\x07K\x02\x02\u0298\u0299" +
		"\x05R*\x02\u0299\u029A\x07L\x02\x02\u029AQ\x03\x02\x02\x02\u029B\u02A0" +
		"\b*\x01\x02\u029C\u029D\f\x03\x02\x02\u029D\u029F\x05T+\x02\u029E\u029C" +
		"\x03\x02\x02\x02\u029F\u02A2\x03\x02\x02\x02\u02A0\u029E\x03\x02\x02\x02" +
		"\u02A0\u02A1\x03\x02\x02\x02\u02A1S\x03\x02\x02\x02\u02A2\u02A0\x03\x02" +
		"\x02\x02\u02A3\u02A4\x05V,\x02\u02A4\u02A5\x07P\x02\x02\u02A5\u02A6\x05" +
		"\x10\t\x02\u02A6\u02A7\x07U\x02\x02\u02A7U\x03\x02\x02\x02\u02A8\u02AB" +
		"\x05X-\x02\u02A9\u02AB\x05\\/\x02\u02AA\u02A8\x03\x02\x02\x02\u02AA\u02A9" +
		"\x03\x02\x02\x02\u02ABW\x03\x02\x02\x02\u02AC\u02AD\x07G\x02\x02\u02AD" +
		"\u02AE\x05\\/\x02\u02AE\u02AF\x07Q\x02\x02\u02AF\u02B0\x05Z.\x02\u02B0" +
		"\u02B1\x07H\x02\x02\u02B1Y\x03\x02\x02\x02\u02B2\u02B3\b.\x01\x02\u02B3" +
		"\u02B4\x05\\/\x02\u02B4\u02BA\x03\x02\x02\x02\u02B5\u02B6\f\x03\x02\x02" +
		"\u02B6\u02B7\x07Q\x02\x02\u02B7\u02B9\x05\\/\x02\u02B8\u02B5\x03\x02\x02" +
		"\x02\u02B9\u02BC\x03\x02\x02\x02\u02BA\u02B8\x03\x02\x02\x02\u02BA\u02BB" +
		"\x03\x02\x02\x02\u02BB[\x03\x02\x02\x02\u02BC\u02BA\x03\x02\x02\x02\u02BD" +
		"\u02C9\x05\xF4{\x02\u02BE\u02BF\x05\xF4{\x02\u02BF\u02C0\x072\x02\x02" +
		"\u02C0\u02C1\x05\xF4{\x02\u02C1\u02C9\x03\x02\x02\x02\u02C2\u02C3\x05" +
		"\xF4{\x02\u02C3\u02C4\x073\x02\x02\u02C4\u02C5\x05\xF4{\x02\u02C5\u02C9" +
		"\x03\x02\x02\x02\u02C6\u02C9\x07\x0E\x02\x02\u02C7\u02C9\x071\x02\x02" +
		"\u02C8\u02BD\x03\x02\x02\x02\u02C8\u02BE\x03\x02\x02\x02\u02C8\u02C2\x03" +
		"\x02\x02\x02\u02C8\u02C6\x03\x02\x02\x02\u02C8\u02C7\x03\x02\x02\x02\u02C9" +
		"]\x03\x02\x02\x02\u02CA\u02CB\x05\x16\f\x02\u02CB\u02CC\x07/\x02\x02\u02CC" +
		"\u02CD\x07M\x02\x02\u02CD\u02CE\x05\x80A\x02\u02CE\u02CF\x07N\x02\x02" +
		"\u02CF\u02D0\x07G\x02\x02\u02D0\u02D1\x05\xF4{\x02\u02D1\u02D2\x07H\x02" +
		"\x02\u02D2\u02D3\x05\x10\t\x02\u02D3\u02D4\x07U\x02\x02\u02D4\u02EC\x03" +
		"\x02\x02\x02\u02D5\u02D6\x05\x16\f\x02\u02D6\u02D7\x07/\x02\x02\u02D7" +
		"\u02D8\x07M\x02\x02\u02D8\u02D9\x05z>\x02\u02D9\u02DA\x07N\x02\x02\u02DA" +
		"\u02DB\x07G\x02\x02\u02DB\u02DC\x05\xF4{\x02\u02DC\u02DD\x07H\x02\x02" +
		"\u02DD\u02DE\x05\x10\t\x02\u02DE\u02DF\x07U\x02\x02\u02DF\u02EC\x03\x02" +
		"\x02\x02\u02E0\u02E1\x05\x16\f\x02\u02E1\u02E2\x07/\x02\x02\u02E2\u02E3" +
		"\x07M\x02\x02\u02E3\u02E4\x05x=\x02\u02E4\u02E5\x07N\x02\x02\u02E5\u02E6" +
		"\x07G\x02\x02\u02E6\u02E7\x05\xF4{\x02\u02E7\u02E8\x07H\x02\x02\u02E8" +
		"\u02E9\x05\x10\t\x02\u02E9\u02EA\x07U\x02\x02\u02EA\u02EC\x03\x02\x02" +
		"\x02\u02EB\u02CA\x03\x02\x02\x02\u02EB\u02D5\x03\x02\x02\x02\u02EB\u02E0" +
		"\x03\x02\x02\x02\u02EC_\x03\x02\x02\x02\u02ED\u02EE\x05b2\x02\u02EE\u02EF" +
		"\x056\x1C\x02\u02EF\u02F0\x07K\x02\x02\u02F0\u02F1\x05d3\x02\u02F1\u02F2" +
		"\x07\t\x02\x02\u02F2\u02F3\x05h5\x02\u02F3\u02F4\x07L\x02\x02\u02F4a\x03" +
		"\x02\x02\x02\u02F5\u02F6\x05\x16\f\x02\u02F6\u02F7\x07\r\x02\x02\u02F7" +
		"\u02F8\x05\x10\t\x02\u02F8\u02F9\x05\x84C\x02\u02F9\u02FA\x07G\x02\x02" +
		"\u02FA\u02FB\x05$\x13\x02\u02FB\u02FC\x07H\x02\x02\u02FCc\x03\x02\x02" +
		"\x02\u02FD\u0302\b3\x01\x02\u02FE\u02FF\f\x03\x02\x02\u02FF\u0301\x05" +
		"f4\x02\u0300\u02FE\x03\x02\x02\x02\u0301\u0304\x03\x02\x02\x02\u0302\u0300" +
		"\x03\x02\x02\x02\u0302\u0303\x03\x02\x02\x02\u0303e\x03\x02\x02\x02\u0304" +
		"\u0302\x03\x02\x02\x02\u0305\u030B\x05\xE0q\x02\u0306\u030B\x05\xDCo\x02" +
		"\u0307\u030B\x05\xC8e\x02\u0308\u030B\x05.\x18\x02\u0309\u030B\x05\xDE" +
		"p\x02\u030A\u0305\x03\x02\x02\x02\u030A\u0306\x03\x02\x02\x02\u030A\u0307" +
		"\x03\x02\x02\x02\u030A\u0308\x03\x02\x02\x02\u030A\u0309\x03\x02\x02\x02" +
		"\u030Bg\x03\x02\x02\x02\u030C\u030D\x05\xBA^\x02\u030Di\x03\x02\x02\x02" +
		"\u030E\u030F\x05\x16\f\x02\u030F\u0310\x07\x14\x02\x02\u0310\u0311\x05" +
		"\x0E\b\x02\u0311\u0312\x05\x84C\x02\u0312\u0313\x07K\x02\x02\u0313\u0314" +
		"\x05l7\x02\u0314\u0315\x07L\x02\x02\u0315\u0321\x03\x02\x02\x02\u0316" +
		"\u0317\x05\x16\f\x02\u0317\u0318\x07\x14\x02\x02\u0318\u0319\x05n8\x02" +
		"\u0319\u031A\x07U\x02\x02\u031A\u0321\x03\x02\x02\x02\u031B\u031C\x05" +
		"\x16\f\x02\u031C\u031D\x07\x14\x02\x02\u031D\u031E\x05\x10\t\x02\u031E" +
		"\u031F\x07U\x02\x02\u031F\u0321\x03\x02\x02\x02\u0320\u030E\x03\x02\x02" +
		"\x02\u0320\u0316\x03\x02\x02\x02\u0320\u031B\x03\x02\x02\x02\u0321k\x03" +
		"\x02\x02\x02\u0322\u0327\b7\x01\x02\u0323\u0324\f\x03\x02\x02\u0324\u0326" +
		"\x05p9\x02\u0325\u0323\x03\x02\x02\x02\u0326\u0329\x03\x02\x02\x02\u0327" +
		"\u0325\x03\x02\x02\x02\u0327\u0328\x03\x02\x02\x02\u0328m\x03\x02\x02" +
		"\x02\u0329\u0327\x03\x02\x02\x02\u032A\u032B\x05\x82B\x02\u032B\u032C" +
		"\x05\x10\t\x02\u032C\u032D\x05\x84C\x02\u032D\u032E\x07G\x02\x02\u032E" +
		"\u032F\x05$\x13\x02\u032F\u0330\x07H\x02\x02\u0330o\x03\x02\x02\x02\u0331" +
		"\u0332\x05\x16\f\x02\u0332\u0333\x05n8\x02\u0333\u0334\x07U\x02\x02\u0334" +
		"\u0342\x03\x02\x02\x02\u0335\u0336\x05\x16\f\x02\u0336\u0337\x07\x06\x02" +
		"\x02\u0337\u0338\x05n8\x02\u0338\u0339\x07U\x02\x02\u0339\u0342\x03\x02" +
		"\x02\x02\u033A\u033B\x05\x16\f\x02\u033B\u033C\x05\xF6|\x02\u033C\u033D" +
		"\x07G\x02\x02\u033D\u033E\x05$\x13\x02\u033E\u033F\x07H\x02\x02\u033F" +
		"\u0340\x07U\x02\x02\u0340\u0342\x03\x02\x02\x02\u0341\u0331\x03\x02\x02" +
		"\x02\u0341\u0335\x03\x02\x02\x02\u0341\u033A\x03\x02\x02\x02\u0342q\x03" +
		"\x02\x02\x02\u0343\u0349\x05\x80A\x02\u0344\u0349\x05x=\x02\u0345\u0349" +
		"\x05~@\x02\u0346\u0349\x05|?\x02\u0347\u0349\x05z>\x02\u0348\u0343\x03" +
		"\x02\x02\x02\u0348\u0344\x03\x02\x02\x02\u0348\u0345\x03\x02\x02\x02\u0348" +
		"\u0346\x03\x02\x02\x02\u0348\u0347\x03\x02\x02\x02\u0349s\x03\x02\x02" +
		"\x02\u034A\u034D\x05x=\x02\u034B\u034D\x05~@\x02\u034C\u034A\x03\x02\x02" +
		"\x02\u034C\u034B\x03\x02\x02\x02\u034Du\x03\x02\x02\x02\u034E\u0353\x05" +
		"\xF6|\x02\u034F\u0350\x058\x1D\x02\u0350\u0351\x05\xF6|\x02\u0351\u0353" +
		"\x03\x02\x02\x02\u0352\u034E\x03\x02\x02\x02\u0352\u034F\x03\x02\x02\x02" +
		"\u0353w\x03\x02\x02\x02\u0354\u0355\x05v<\x02\u0355y\x03\x02\x02\x02\u0356" +
		"\u0357\x07,\x02\x02\u0357\u0358\x07M\x02\x02\u0358\u0359\x05\x8AF\x02" +
		"\u0359\u035A\x07N\x02\x02\u035A{\x03\x02\x02\x02\u035B\u035C\x05x=\x02" +
		"\u035C\u035D\x07I\x02\x02\u035D\u035E\x05\xF4{\x02\u035E\u035F\x07J\x02" +
		"\x02\u035F}\x03\x02\x02\x02\u0360\u0361\x05x=\x02\u0361\u0362\x07M\x02" +
		"\x02\u0362\u0363\x05\x8AF\x02\u0363\u0364\x07N\x02\x02\u0364\x7F\x03\x02" +
		"\x02\x02\u0365\u038B\x07\n\x02\x02\u0366\u038B\x07\x12\x02\x02\u0367\u038B" +
		"\x07\v\x02\x02\u0368\u038B\x07\x1B\x02\x02\u0369\u036A\x07\v\x02\x02\u036A" +
		"\u036B\x07M\x02\x02\u036B\u036C\x07i\x02\x02\u036C\u038B\x07N\x02\x02" +
		"\u036D\u036E\x07\x1B\x02\x02\u036E\u036F\x07M\x02\x02\u036F\u0370\x07" +
		"i\x02\x02\u0370\u038B\x07N\x02\x02\u0371\u0372\x07.\x02\x02\u0372\u0373" +
		"\x07M\x02\x02\u0373\u0374\x07i\x02\x02\u0374\u038B\x07N\x02\x02\u0375" +
		"\u0376\x07\v\x02\x02\u0376\u0377\x07M\x02\x02\u0377\u0378\x07G\x02\x02" +
		"\u0378\u0379\x05\xF4{\x02\u0379\u037A\x07H\x02\x02\u037A\u037B\x07N\x02" +
		"\x02\u037B\u038B\x03\x02\x02\x02\u037C\u037D\x07\x1B\x02\x02\u037D\u037E" +
		"\x07M\x02\x02\u037E\u037F\x07G\x02\x02\u037F\u0380\x05\xF4{\x02\u0380" +
		"\u0381\x07H\x02\x02\u0381\u0382\x07N\x02\x02\u0382\u038B\x03\x02\x02\x02" +
		"\u0383\u0384\x07.\x02\x02\u0384\u0385\x07M\x02\x02\u0385\u0386\x07G\x02" +
		"\x02\u0386\u0387\x05\xF4{\x02\u0387\u0388\x07H\x02\x02\u0388\u0389\x07" +
		"N\x02\x02\u0389\u038B\x03\x02\x02\x02\u038A\u0365\x03\x02\x02\x02\u038A" +
		"\u0366\x03\x02\x02\x02\u038A\u0367\x03\x02\x02\x02\u038A\u0368\x03\x02" +
		"\x02\x02\u038A\u0369\x03\x02\x02\x02\u038A\u036D\x03\x02\x02\x02\u038A" +
		"\u0371\x03\x02\x02\x02\u038A\u0375\x03\x02\x02\x02\u038A\u037C\x03\x02" +
		"\x02\x02\u038A\u0383\x03\x02\x02\x02\u038B\x81\x03\x02\x02\x02\u038C\u0390" +
		"\x05r:\x02\u038D\u0390\x070\x02\x02\u038E\u0390\x05\xF6|\x02\u038F\u038C" +
		"\x03\x02\x02\x02\u038F\u038D\x03\x02\x02\x02\u038F\u038E\x03\x02\x02\x02" +
		"\u0390\x83\x03\x02\x02\x02\u0391\u0397\x03\x02\x02\x02\u0392\u0393\x07" +
		"M\x02\x02\u0393\u0394\x05\x86D\x02\u0394\u0395\x07N\x02\x02\u0395\u0397" +
		"\x03\x02\x02\x02\u0396\u0391\x03\x02\x02\x02\u0396\u0392\x03\x02\x02\x02" +
		"\u0397\x85\x03\x02\x02\x02\u0398\u0399\bD\x01\x02\u0399\u039A\x05\x10" +
		"\t\x02\u039A\u03A0\x03\x02\x02\x02\u039B\u039C\f\x03\x02\x02\u039C\u039D" +
		"\x07Q\x02\x02\u039D\u039F\x05\x10\t\x02\u039E\u039B\x03\x02\x02\x02\u039F" +
		"\u03A2\x03\x02\x02\x02\u03A0\u039E\x03\x02\x02\x02\u03A0\u03A1\x03\x02" +
		"\x02\x02\u03A1\x87\x03\x02\x02\x02\u03A2\u03A0\x03\x02\x02\x02\u03A3\u03A8" +
		"\x05r:\x02\u03A4\u03A8\x05\x0E\b\x02\u03A5\u03A8\x070\x02\x02\u03A6\u03A8" +
		"\x071\x02\x02\u03A7\u03A3\x03\x02\x02\x02\u03A7\u03A4\x03\x02\x02\x02" +
		"\u03A7\u03A5\x03\x02\x02\x02\u03A7\u03A6\x03\x02\x02\x02\u03A8\x89\x03" +
		"\x02\x02\x02\u03A9\u03AC\bF\x01\x02\u03AA\u03AC\x05\x88E\x02\u03AB\u03A9" +
		"\x03\x02\x02\x02\u03AB\u03AA\x03\x02\x02\x02\u03AC\u03B2\x03\x02\x02\x02" +
		"\u03AD\u03AE\f\x03\x02\x02\u03AE\u03AF\x07Q\x02\x02\u03AF\u03B1\x05\x88" +
		"E\x02\u03B0\u03AD\x03\x02\x02\x02\u03B1\u03B4\x03\x02\x02\x02\u03B2\u03B0" +
		"\x03\x02\x02\x02\u03B2\u03B3\x03\x02\x02\x02\u03B3\x8B\x03\x02\x02\x02" +
		"\u03B4\u03B2\x03\x02\x02\x02\u03B5\u03B9\x05r:\x02\u03B6\u03B9\x070\x02" +
		"\x02\u03B7\u03B9\x071\x02\x02\u03B8\u03B5\x03\x02\x02\x02\u03B8\u03B6" +
		"\x03\x02\x02\x02\u03B8\u03B7\x03\x02\x02\x02\u03B9\x8D\x03\x02\x02\x02" +
		"\u03BA\u03BB\bH\x01\x02\u03BB\u03BC\x05\x8CG\x02\u03BC\u03C2\x03\x02\x02" +
		"\x02\u03BD\u03BE\f\x03\x02\x02\u03BE\u03BF\x07Q\x02\x02\u03BF\u03C1\x05" +
		"\x88E\x02\u03C0\u03BD\x03\x02\x02\x02\u03C1\u03C4\x03\x02\x02\x02\u03C2" +
		"\u03C0\x03\x02\x02\x02\u03C2\u03C3\x03\x02\x02\x02\u03C3\x8F\x03\x02\x02" +
		"\x02\u03C4\u03C2\x03\x02\x02\x02\u03C5\u03D3\x05\x92J\x02\u03C6\u03C7" +
		"\x05\xAAV\x02\u03C7\u03C8\x07U\x02\x02\u03C8\u03D3\x03\x02\x02\x02\u03C9" +
		"\u03CA\x05@!\x02\u03CA\u03CB\x07U\x02\x02\u03CB\u03D3\x03\x02\x02\x02" +
		"\u03CC\u03CD\x05b2\x02\u03CD\u03CE\x07U\x02\x02\u03CE\u03D3\x03\x02\x02" +
		"\x02\u03CF\u03D0\x05,\x17\x02\u03D0\u03D1\x07U\x02\x02\u03D1\u03D3\x03" +
		"\x02\x02\x02\u03D2\u03C5\x03\x02\x02\x02\u03D2\u03C6\x03\x02\x02\x02\u03D2" +
		"\u03C9\x03\x02\x02\x02\u03D2\u03CC\x03\x02\x02\x02\u03D2\u03CF\x03\x02" +
		"\x02\x02\u03D3\x91\x03\x02\x02\x02\u03D4\u03D9\x05\x94K\x02\u03D5\u03D9" +
		"\x05\x98M\x02\u03D6\u03D9\x05\x96L\x02\u03D7\u03D9\x05\x9EP\x02\u03D8" +
		"\u03D4\x03\x02\x02\x02\u03D8\u03D5\x03\x02\x02\x02\u03D8\u03D6\x03";
	private static readonly _serializedATNSegment2: string =
		"\x02\x02\x02\u03D8\u03D7\x03\x02\x02\x02\u03D9\x93\x03\x02\x02\x02\u03DA" +
		"\u03DB\x05\x16\f\x02\u03DB\u03DC\x07\x16\x02\x02\u03DC\u03DD\x05\x10\t" +
		"\x02\u03DD\u03DE\x07K\x02\x02\u03DE\u03DF\x05\x9AN\x02\u03DF\u03E0\x07" +
		"L\x02\x02\u03E0\x95\x03\x02\x02\x02\u03E1\u03E2\x05\x16\f\x02\u03E2\u03E3" +
		"\x07&\x02\x02\u03E3\u03E4\x05\x10\t\x02\u03E4\u03E5\x07K\x02\x02\u03E5" +
		"\u03E6\x05\x9AN\x02\u03E6\u03E7\x07L\x02\x02\u03E7\x97\x03\x02\x02\x02" +
		"\u03E8\u03E9\x05\x16\f\x02\u03E9\u03EA\x07\x17\x02\x02\u03EA\u03EB\x05" +
		"\x10\t\x02\u03EB\u03EC\x07K\x02\x02\u03EC\u03ED\x05\x9AN\x02\u03ED\u03EE" +
		"\x07L\x02\x02\u03EE\x99\x03\x02\x02\x02\u03EF\u03F4\bN\x01\x02\u03F0\u03F1" +
		"\f\x03\x02\x02\u03F1\u03F3\x05\x9CO\x02\u03F2\u03F0\x03\x02\x02\x02\u03F3" +
		"\u03F6\x03\x02\x02\x02\u03F4\u03F2\x03\x02\x02\x02\u03F4\u03F5\x03\x02" +
		"\x02\x02\u03F5\x9B\x03\x02\x02\x02\u03F6\u03F4\x03\x02\x02\x02\u03F7\u03F8" +
		"\x05\x16\f\x02\u03F8\u03F9\x05r:\x02\u03F9\u03FA\x05\x10\t\x02\u03FA\u03FB" +
		"\x07U\x02\x02\u03FB\x9D\x03\x02\x02\x02\u03FC\u03FD\x05\x16\f\x02\u03FD" +
		"\u03FE\x07\x11\x02\x02\u03FE\u03FF\x05\x10\t\x02\u03FF\u0400\x07K\x02" +
		"\x02\u0400\u0401\x05\xA8U\x02\u0401\u0402\x07L\x02\x02\u0402\u040F\x03" +
		"\x02\x02\x02\u0403\u0404\x05\x16\f\x02\u0404\u0405\x07\x11\x02\x02\u0405" +
		"\u0406\x07\v\x02\x02\u0406\u0407\x07M\x02\x02\u0407\u0408\x07i\x02\x02" +
		"\u0408\u0409\x07N\x02\x02\u0409\u040A\x05\x10\t\x02\u040A\u040B\x07K\x02" +
		"\x02\u040B\u040C\x05\xA0Q\x02\u040C\u040D\x07L\x02\x02\u040D\u040F\x03" +
		"\x02\x02\x02\u040E\u03FC\x03\x02\x02\x02\u040E\u0403\x03\x02\x02\x02\u040F" +
		"\x9F\x03\x02\x02\x02\u0410\u0411\bQ\x01\x02\u0411\u0412\x05\xA2R\x02\u0412" +
		"\u0418\x03\x02\x02\x02\u0413\u0414\f\x03\x02\x02\u0414\u0415\x07Q\x02" +
		"\x02\u0415\u0417\x05\xA2R\x02\u0416\u0413\x03\x02\x02\x02\u0417\u041A" +
		"\x03\x02\x02\x02\u0418\u0416\x03\x02\x02\x02\u0418\u0419\x03\x02\x02\x02" +
		"\u0419\xA1\x03\x02\x02\x02\u041A\u0418\x03\x02\x02\x02\u041B\u041C\x05" +
		"\x10\t\x02\u041C\u041D\x07T\x02\x02\u041D\u041E\x05\xE4s\x02\u041E\xA3" +
		"\x03\x02\x02\x02\u041F\u0420\x07\x12\x02\x02\u0420\u0421\x07K\x02\x02" +
		"\u0421\u0422\x05\xA8U\x02\u0422\u0423\x07L\x02\x02\u0423\xA5\x03\x02\x02" +
		"\x02\u0424\u0425\x07\x1D\x02\x02\u0425\u0426\x07K\x02\x02\u0426\u0427" +
		"\x05\xA8U\x02\u0427\u0428\x07L\x02\x02\u0428\xA7\x03\x02\x02\x02\u0429" +
		"\u042A\bU\x01\x02\u042A\u042B\x05\x10\t\x02\u042B\u0431\x03\x02\x02\x02" +
		"\u042C\u042D\f\x03\x02\x02\u042D\u042E\x07Q\x02\x02\u042E\u0430\x05\x10" +
		"\t\x02\u042F\u042C\x03\x02\x02\x02\u0430\u0433\x03\x02\x02\x02\u0431\u042F" +
		"\x03\x02\x02\x02\u0431\u0432\x03\x02\x02\x02\u0432\xA9\x03\x02\x02\x02" +
		"\u0433\u0431\x03\x02\x02\x02\u0434\u0435\x05\x16\f\x02\u0435\u0436\x07" +
		"-\x02\x02\u0436\u0437\x05r:\x02\u0437\u0438\x05\x10\t\x02\u0438\u0449" +
		"\x03\x02\x02\x02\u0439\u043A\x05\x16\f\x02\u043A\u043B\x07-\x02\x02\u043B" +
		"\u043C\x05\x92J\x02\u043C\u043D\x05\x10\t\x02\u043D\u0449\x03\x02\x02" +
		"\x02\u043E\u043F\x05\x16\f\x02\u043F\u0440\x07\x1E\x02\x02\u0440\u0441" +
		"\x05r:\x02\u0441\u0442\x05\x10\t\x02\u0442\u0449\x03\x02\x02\x02\u0443" +
		"\u0444\x05\x16\f\x02\u0444\u0445\x07\x1E\x02\x02\u0445\u0446\x05\x92J" +
		"\x02\u0446\u0447\x05\x10\t\x02\u0447\u0449\x03\x02\x02\x02\u0448\u0434" +
		"\x03\x02\x02\x02\u0448\u0439\x03\x02\x02\x02\u0448\u043E\x03\x02\x02\x02" +
		"\u0448\u0443\x03\x02\x02\x02\u0449\xAB\x03\x02\x02\x02\u044A\u044B\x05" +
		"\xF2z\x02\u044B\u044C\x07G\x02\x02\u044C\u044D\x05\xE8u\x02\u044D\u044E" +
		"\x07H\x02\x02\u044E\u044F\x07U\x02\x02\u044F\u045F\x03\x02\x02\x02\u0450" +
		"\u0451\x05\xF2z\x02\u0451\u0452\x07M\x02\x02\u0452\u0453\x05\x8AF\x02" +
		"\u0453\u0454\x07N\x02\x02\u0454\u0455\x07G\x02\x02\u0455\u0456\x05\xE8" +
		"u\x02\u0456\u0457\x07H\x02\x02\u0457\u0458\x07U\x02\x02\u0458\u045F\x03" +
		"\x02\x02\x02\u0459\u045A\x05\xF2z\x02\u045A\u045B\x07T\x02\x02\u045B\u045C" +
		"\x05\xF4{\x02\u045C\u045D\x07U\x02\x02\u045D\u045F\x03\x02\x02\x02\u045E" +
		"\u044A\x03\x02\x02\x02\u045E\u0450\x03\x02\x02\x02\u045E\u0459\x03\x02" +
		"\x02\x02\u045F\xAD\x03\x02\x02\x02\u0460\u0461\x07U\x02\x02\u0461\xAF" +
		"\x03\x02\x02\x02\u0462\u0463\x07\x13\x02\x02\u0463\u0464\x07U\x02\x02" +
		"\u0464\xB1\x03\x02\x02\x02\u0465\u0466\x07\"\x02\x02\u0466\u046C\x07U" +
		"\x02\x02\u0467\u0468\x07\"\x02\x02\u0468\u0469\x05\xF4{\x02\u0469\u046A" +
		"\x07U\x02\x02\u046A\u046C\x03\x02\x02\x02\u046B\u0465\x03\x02\x02\x02" +
		"\u046B\u0467\x03\x02\x02\x02\u046C\xB3\x03\x02\x02\x02\u046D\u046E\x07" +
		"\x18\x02\x02\u046E\u046F\x07G\x02\x02\u046F\u0470\x05\xF4{\x02\u0470\u0471" +
		"\x07H\x02\x02\u0471\u0472\x05\xB8]\x02\u0472\u047C\x03\x02\x02\x02\u0473" +
		"\u0474\x07\x18\x02\x02\u0474\u0475\x07G\x02\x02\u0475\u0476\x05\xF4{\x02" +
		"\u0476\u0477\x07H\x02\x02\u0477\u0478\x05\xB8]\x02\u0478\u0479\x07\x0F" +
		"\x02\x02\u0479\u047A\x05\xB8]\x02\u047A\u047C\x03\x02\x02\x02\u047B\u046D" +
		"\x03\x02\x02\x02\u047B\u0473\x03\x02\x02\x02\u047C\xB5\x03\x02\x02\x02" +
		"\u047D\u047E\x05x=\x02\u047E\u047F\x07S\x02\x02\u047F\u0480\x07\t\x02" +
		"\x02\u0480\u0481\x07G\x02\x02\u0481\u0482\x05\xE8u\x02\u0482\u0483\x07" +
		"H\x02\x02\u0483\u0484\x07U\x02\x02\u0484\xB7\x03\x02\x02\x02\u0485\u048E" +
		"\x05\xB6\\\x02\u0486\u048E\x05\xACW\x02\u0487\u048E\x05\xB4[\x02\u0488" +
		"\u048E\x05\xAEX\x02\u0489\u048E\x05\xBA^\x02\u048A\u048E\x05\xB2Z\x02" +
		"\u048B\u048E\x05\xB0Y\x02\u048C\u048E\x05\xBE`\x02\u048D\u0485\x03\x02" +
		"\x02\x02\u048D\u0486\x03\x02\x02\x02\u048D\u0487\x03\x02\x02\x02\u048D" +
		"\u0488\x03\x02\x02\x02\u048D\u0489\x03\x02\x02\x02\u048D\u048A\x03\x02" +
		"\x02\x02\u048D\u048B\x03\x02\x02\x02\u048D\u048C\x03\x02\x02\x02\u048E" +
		"\xB9\x03\x02\x02\x02\u048F\u0490\x05\x16\f\x02\u0490\u0491\x07K\x02\x02" +
		"\u0491\u0492\x05\xBC_\x02\u0492\u0493\x07L\x02\x02\u0493\xBB\x03\x02\x02" +
		"\x02\u0494\u0499\b_\x01\x02\u0495\u0496\f\x03\x02\x02\u0496\u0498\x05" +
		"\xC6d\x02\u0497\u0495\x03\x02\x02\x02\u0498\u049B\x03\x02\x02\x02\u0499" +
		"\u0497\x03\x02\x02\x02\u0499\u049A\x03\x02\x02\x02\u049A\xBD\x03\x02\x02" +
		"\x02\u049B\u0499\x03\x02\x02\x02\u049C\u049D\x07\'\x02\x02\u049D\u049E" +
		"\x07G\x02\x02\u049E\u049F\x05\xF4{\x02\u049F\u04A0\x07H\x02\x02\u04A0" +
		"\u04A1\x07K\x02\x02\u04A1\u04A2\x05\xC0a\x02\u04A2\u04A3\x07L\x02\x02" +
		"\u04A3\xBF\x03\x02\x02\x02\u04A4\u04A9\ba\x01\x02\u04A5\u04A6\f\x03\x02" +
		"\x02\u04A6\u04A8\x05\xC2b\x02\u04A7\u04A5\x03\x02\x02\x02\u04A8\u04AB" +
		"\x03\x02\x02\x02\u04A9\u04A7\x03\x02\x02\x02\u04A9\u04AA\x03\x02\x02\x02" +
		"\u04AA\xC1\x03\x02\x02\x02\u04AB\u04A9\x03\x02\x02\x02\u04AC\u04AD\x05" +
		"\xC4c\x02\u04AD\u04AE\x07P\x02\x02\u04AE\u04AF\x05\xBA^\x02\u04AF\u04B4" +
		"\x03\x02\x02\x02\u04B0\u04B1\x05\xC4c\x02\u04B1\u04B2\x07P\x02\x02\u04B2" +
		"\u04B4\x03\x02\x02\x02\u04B3\u04AC\x03\x02\x02\x02\u04B3\u04B0\x03\x02" +
		"\x02\x02\u04B4\xC3\x03\x02\x02\x02\u04B5\u04B8\x05\x10\t\x02\u04B6\u04B8" +
		"\x07\x0E\x02\x02\u04B7\u04B5\x03\x02\x02\x02\u04B7\u04B6\x03\x02\x02\x02" +
		"\u04B8\xC5\x03\x02\x02\x02\u04B9\u04BE\x05\xDEp\x02\u04BA\u04BE\x05\xE0" +
		"q\x02\u04BB\u04BE\x05\xB8]\x02\u04BC\u04BE\x05.\x18\x02\u04BD\u04B9\x03" +
		"\x02\x02\x02\u04BD\u04BA\x03\x02\x02\x02\u04BD\u04BB\x03\x02\x02\x02\u04BD" +
		"\u04BC\x03\x02\x02\x02\u04BE\xC7\x03\x02\x02\x02\u04BF\u04C0\x05\x16\f" +
		"\x02\u04C0\u04C1\x07(\x02\x02\u04C1\u04C2\x05\x10\t\x02\u04C2\u04C3\x07" +
		"K\x02\x02\u04C3\u04C4\x05\xCAf\x02\u04C4\u04C5\x07L\x02\x02\u04C5\xC9" +
		"\x03\x02\x02\x02\u04C6\u04C7\bf\x01\x02\u04C7\u04C8\x05\xCCg\x02\u04C8" +
		"\u04CD\x03\x02\x02\x02\u04C9\u04CA\f\x03\x02\x02\u04CA\u04CC\x05\xCCg" +
		"\x02\u04CB\u04C9\x03\x02\x02\x02\u04CC\u04CF\x03\x02\x02\x02\u04CD\u04CB" +
		"\x03\x02\x02\x02\u04CD\u04CE\x03\x02\x02\x02\u04CE\xCB\x03\x02\x02\x02" +
		"\u04CF\u04CD\x03\x02\x02\x02\u04D0\u04D1\x07\x1C\x02\x02\u04D1\u04D2\x07" +
		"T\x02\x02\u04D2\u04D3\x07K\x02\x02\u04D3\u04D4\x05\xCEh\x02\u04D4\u04D5" +
		"\x07L\x02\x02\u04D5\u04EC\x03\x02\x02\x02\u04D6\u04D7\x07\b\x02\x02\u04D7" +
		"\u04D8\x07T\x02\x02\u04D8\u04D9\x07K\x02\x02\u04D9\u04DA\x05\xD2j\x02" +
		"\u04DA\u04DB\x07L\x02\x02\u04DB\u04EC\x03\x02\x02\x02\u04DC\u04DD\x05" +
		"\x16\f\x02\u04DD\u04DE\x05\x14\v\x02\u04DE\u04DF\x07\x10\x02\x02\u04DF" +
		"\u04E0\x07T\x02\x02\u04E0\u04E1\x07K\x02\x02\u04E1\u04E2\x05\xDAn\x02" +
		"\u04E2\u04E3\x07L\x02\x02\u04E3\u04EC\x03\x02\x02\x02\u04E4\u04E5\x05" +
		"\x16\f\x02\u04E5\u04E6\x05\x14\v\x02\u04E6\u04E7\x05\x12\n\x02\u04E7\u04E8" +
		"\x07T\x02\x02\u04E8\u04E9\x05\xE4s\x02\u04E9\u04EA\x07U\x02\x02\u04EA" +
		"\u04EC\x03\x02\x02\x02\u04EB\u04D0\x03\x02\x02\x02\u04EB\u04D6\x03\x02" +
		"\x02\x02\u04EB\u04DC\x03\x02\x02\x02\u04EB\u04E4\x03\x02\x02\x02\u04EC" +
		"\xCD\x03\x02\x02\x02\u04ED\u04F2\bh\x01\x02\u04EE\u04EF\f\x03\x02\x02" +
		"\u04EF\u04F1\x05\xD0i\x02\u04F0\u04EE\x03\x02\x02\x02\u04F1\u04F4\x03" +
		"\x02\x02\x02\u04F2\u04F0\x03\x02\x02\x02\u04F2\u04F3\x03\x02\x02\x02\u04F3" +
		"\xCF\x03\x02\x02\x02\u04F4\u04F2\x03\x02\x02\x02\u04F5\u04F6\x05\xF4{" +
		"\x02\u04F6\u04F7\x07P\x02\x02\u04F7\u04F8\x05\x10\t\x02\u04F8\u04F9\x05" +
		"\x16\f\x02\u04F9\u04FA\x07U\x02\x02\u04FA\xD1\x03\x02\x02\x02\u04FB\u0502" +
		"\bj\x01\x02\u04FC\u04FD\f\x03\x02\x02\u04FD\u04FE\x05\xD4k\x02\u04FE\u04FF" +
		"\x07U\x02\x02\u04FF\u0501\x03\x02\x02\x02\u0500\u04FC\x03\x02\x02\x02" +
		"\u0501\u0504\x03\x02\x02\x02\u0502\u0500\x03\x02\x02\x02\u0502\u0503\x03" +
		"\x02\x02\x02\u0503\xD3\x03\x02\x02\x02\u0504\u0502\x03\x02\x02\x02\u0505" +
		"\u0506\x05\x16\f\x02\u0506\u0507\x05\x10\t\x02\u0507\u050F\x03\x02\x02" +
		"\x02\u0508\u0509\x05\x16\f\x02\u0509\u050A\x05\x10\t\x02\u050A\u050B\x07" +
		"G\x02\x02\u050B\u050C\x05\xE8u\x02\u050C\u050D\x07H\x02\x02\u050D\u050F" +
		"\x03\x02\x02\x02\u050E\u0505\x03\x02\x02\x02\u050E\u0508\x03\x02\x02\x02" +
		"\u050F\xD5\x03\x02\x02\x02\u0510\u0511\x05V,\x02\u0511\u0512\x07P\x02" +
		"\x02\u0512\u0513\x05\xD8m\x02\u0513\u0514\x05\x16\f\x02\u0514\u0515\x07" +
		"U\x02\x02\u0515\xD7\x03\x02\x02\x02\u0516\u0517\x05\xF2z\x02\u0517\u0518" +
		"\x07G\x02\x02\u0518\u0519\x05\xE8u\x02\u0519\u051A\x07H\x02\x02\u051A" +
		"\u0524\x03\x02\x02\x02\u051B\u051C\x05\xF2z\x02\u051C\u051D\x07M\x02\x02" +
		"\u051D\u051E\x05\x8AF\x02\u051E\u051F\x07N\x02\x02\u051F\u0520\x07G\x02" +
		"\x02\u0520\u0521\x05\xE8u\x02\u0521\u0522\x07H\x02\x02\u0522\u0524\x03" +
		"\x02\x02\x02\u0523\u0516\x03\x02\x02\x02\u0523\u051B\x03\x02\x02\x02\u0524" +
		"\xD9\x03\x02\x02\x02\u0525\u0526\bn\x01\x02\u0526\u0527\x05\xD6l\x02\u0527" +
		"\u052C\x03\x02\x02\x02\u0528\u0529\f\x03\x02\x02\u0529\u052B\x05\xD6l" +
		"\x02\u052A\u0528\x03\x02\x02\x02\u052B\u052E\x03\x02\x02\x02\u052C\u052A" +
		"\x03\x02\x02\x02\u052C\u052D\x03\x02\x02\x02\u052D\xDB\x03\x02\x02\x02" +
		"\u052E\u052C\x03\x02\x02\x02\u052F\u0530\x05\x16\f\x02\u0530\u0531\x07" +
		"\x07\x02\x02\u0531\u0532\x05\x10\t\x02\u0532\u0533\x07G\x02\x02\u0533" +
		"\u0534\x05$\x13\x02\u0534\u0535\x07H\x02\x02\u0535\u0536\x05\xBA^\x02" +
		"\u0536\xDD\x03\x02\x02\x02\u0537\u0538\x05\x18\r\x02\u0538\u0539\x05r" +
		":\x02\u0539\u053A\x05\x10\t\x02\u053A\u053B\x05\xE2r\x02\u053B\u053C\x07" +
		"U\x02\x02\u053C\u0543\x03\x02\x02\x02\u053D\u053E\x05r:\x02\u053E\u053F" +
		"\x05\x10\t\x02\u053F\u0540\x05\xE2r\x02\u0540\u0541\x07U\x02\x02\u0541" +
		"\u0543\x03\x02\x02\x02\u0542\u0537\x03\x02\x02\x02\u0542\u053D\x03\x02" +
		"\x02\x02\u0543\xDF\x03\x02\x02\x02\u0544\u0545\x05\x16\f\x02\u0545\u0546" +
		"\x07\f\x02\x02\u0546\u0547\x05r:\x02\u0547\u0548\x05\x10\t\x02\u0548\u0549" +
		"\x07T\x02\x02\u0549\u054A\x05\xE4s\x02\u054A\u054B\x07U\x02\x02\u054B" +
		"\xE1\x03\x02\x02\x02\u054C\u0550\x03\x02\x02\x02\u054D\u054E\x07T\x02" +
		"\x02\u054E\u0550\x05\xE4s\x02\u054F\u054C\x03\x02\x02\x02\u054F\u054D" +
		"\x03\x02\x02\x02\u0550\xE3\x03\x02\x02\x02\u0551\u0552\x05\xF4{\x02\u0552" +
		"\xE5\x03\x02\x02\x02\u0553\u0554\x05n8\x02\u0554\u0555\x05\xBA^\x02\u0555" +
		"\xE7\x03\x02\x02\x02\u0556\u0559\x03\x02\x02\x02\u0557\u0559\x05\xEAv" +
		"\x02\u0558\u0556\x03\x02\x02\x02\u0558\u0557\x03\x02\x02\x02\u0559\xE9" +
		"\x03\x02\x02\x02\u055A\u055B\bv\x01\x02\u055B\u055C\x05\xECw\x02\u055C" +
		"\u0562\x03\x02\x02\x02\u055D\u055E\f\x03\x02\x02\u055E\u055F\x07Q\x02" +
		"\x02\u055F\u0561\x05\xECw\x02\u0560\u055D\x03\x02\x02\x02\u0561\u0564" +
		"\x03\x02\x02\x02\u0562\u0560\x03\x02\x02\x02\u0562\u0563\x03\x02\x02\x02" +
		"\u0563\xEB\x03\x02\x02\x02\u0564\u0562\x03\x02\x02\x02\u0565\u056C\x05" +
		"\xF4{\x02\u0566\u0567\x05\x10\t\x02\u0567\u0568\x07T\x02\x02\u0568\u0569" +
		"\x05\xF4{\x02\u0569\u056C\x03\x02\x02\x02\u056A\u056C\x071\x02\x02\u056B" +
		"\u0565\x03\x02\x02\x02\u056B\u0566\x03\x02\x02\x02\u056B\u056A\x03\x02" +
		"\x02\x02\u056C\xED\x03\x02\x02\x02\u056D\u0570\bx\x01\x02\u056E\u0570" +
		"\x05\xF4{\x02\u056F\u056D\x03\x02\x02\x02\u056F\u056E\x03\x02\x02\x02" +
		"\u0570\u0576\x03\x02\x02\x02\u0571\u0572\f\x03\x02\x02\u0572\u0573\x07" +
		"Q\x02\x02\u0573\u0575\x05\xF4{\x02\u0574\u0571\x03\x02\x02\x02\u0575\u0578" +
		"\x03\x02\x02\x02\u0576\u0574\x03\x02\x02\x02\u0576\u0577\x03\x02\x02\x02" +
		"\u0577\xEF\x03\x02\x02\x02\u0578\u0576\x03\x02\x02\x02\u0579\u057E\x05" +
		"\x0E\b\x02\u057A\u057B\x058\x1D\x02\u057B\u057C\x05\x0E\b\x02\u057C\u057E" +
		"\x03\x02\x02\x02\u057D\u0579\x03\x02\x02\x02\u057D\u057A\x03\x02\x02\x02" +
		"\u057E\xF1\x03\x02\x02\x02\u057F\u0580\bz\x01\x02\u0580\u0583\x05\xF0" +
		"y\x02\u0581\u0583\x07)\x02\x02\u0582\u057F\x03\x02\x02\x02\u0582\u0581" +
		"\x03\x02\x02\x02\u0583\u0595\x03\x02\x02\x02\u0584\u0585\f\x05\x02\x02" +
		"\u0585\u0586\x07S\x02\x02\u0586\u0594\x05\x10\t\x02\u0587\u0588\f\x04" +
		"\x02\x02\u0588\u0589\x07I\x02\x02\u0589\u058A\x05\xF4{\x02\u058A\u058B" +
		"\x07J\x02\x02\u058B\u0594\x03\x02\x02\x02\u058C\u058D\f\x03\x02\x02\u058D" +
		"\u058E\x07I\x02\x02\u058E\u058F\x05\xF4{\x02\u058F\u0590\x07P\x02\x02" +
		"\u0590\u0591\x05\xF4{\x02\u0591\u0592\x07J\x02\x02\u0592\u0594\x03\x02" +
		"\x02\x02\u0593\u0584\x03\x02\x02\x02\u0593\u0587\x03\x02\x02\x02\u0593" +
		"\u058C\x03\x02\x02\x02\u0594\u0597\x03\x02\x02\x02\u0595\u0593\x03\x02" +
		"\x02\x02\u0595\u0596\x03\x02\x02\x02\u0596\xF3\x03\x02\x02\x02\u0597\u0595" +
		"\x03\x02\x02\x02\u0598\u0599\b{\x01\x02\u0599\u05C4\x07i\x02\x02\u059A" +
		"\u05C4\x07[\x02\x02\u059B\u05C4\x07+\x02\x02\u059C\u05C4\x07\x15\x02\x02" +
		"\u059D\u05C4\x07)\x02\x02\u059E\u05C4\x05\x0E\b\x02\u059F\u05A0\x058\x1D" +
		"\x02\u05A0\u05A1\x05\x0E\b\x02\u05A1\u05C4\x03\x02\x02\x02\u05A2\u05A3" +
		"\x07K\x02\x02\u05A3\u05A4\x05\xEEx\x02\u05A4\u05A5\x07L\x02\x02\u05A5" +
		"\u05C4\x03\x02\x02\x02\u05A6\u05A7\x07G\x02\x02\u05A7\u05A8\x05\xF4{\x02" +
		"\u05A8\u05A9\x07H\x02\x02\u05A9\u05C4\x03\x02\x02\x02\u05AA\u05AB\x07" +
		"O\x02\x02\u05AB\u05C4\x05\xF4{#\u05AC\u05AD\x07F\x02\x02\u05AD\u05C4\x05" +
		"\xF4{\"\u05AE\u05AF\x07>\x02\x02\u05AF\u05C4\x05\xF4{!\u05B0\u05B1\x07" +
		"<\x02\x02\u05B1\u05C4\x05\xF4{ \u05B2\u05B3\x05x=\x02\u05B3\u05B4\x07" +
		"S\x02\x02\u05B4\u05B5\x05\x10\t\x02\u05B5\u05C4\x03\x02\x02\x02\u05B6" +
		"\u05B7\x07\x12\x02\x02\u05B7\u05B8\x07S\x02\x02\u05B8\u05C4\x05\x10\t" +
		"\x02\u05B9\u05BA\x05t;\x02\u05BA\u05BB\x07G\x02\x02\u05BB\u05BC\x05\xE8" +
		"u\x02\u05BC\u05BD\x07H\x02\x02\u05BD\u05C4\x03\x02\x02\x02\u05BE\u05BF" +
		"\x07G\x02\x02\u05BF\u05C0\x05r:\x02\u05C0\u05C1\x07H\x02\x02\u05C1\u05C2" +
		"\x05\xF4{\x03\u05C2\u05C4\x03\x02\x02\x02\u05C3\u0598\x03\x02\x02\x02" +
		"\u05C3\u059A\x03\x02\x02\x02\u05C3\u059B\x03\x02\x02\x02\u05C3\u059C\x03" +
		"\x02\x02\x02\u05C3\u059D\x03\x02\x02\x02\u05C3\u059E\x03\x02\x02\x02\u05C3" +
		"\u059F\x03\x02\x02\x02\u05C3\u05A2\x03\x02\x02\x02\u05C3\u05A6\x03\x02" +
		"\x02\x02\u05C3\u05AA\x03\x02\x02\x02\u05C3\u05AC\x03\x02\x02\x02\u05C3" +
		"\u05AE\x03\x02\x02\x02\u05C3\u05B0\x03\x02\x02\x02\u05C3\u05B2\x03\x02" +
		"\x02\x02\u05C3\u05B6\x03\x02\x02\x02\u05C3\u05B9\x03\x02\x02\x02\u05C3" +
		"\u05BE\x03\x02\x02\x02\u05C4\u0629\x03\x02\x02\x02\u05C5\u05C6\f\x1C\x02" +
		"\x02\u05C6\u05C7\x07@\x02\x02\u05C7\u0628\x05\xF4{\x1D\u05C8\u05C9\f\x1B" +
		"\x02\x02\u05C9\u05CA\x07A\x02\x02\u05CA\u0628\x05\xF4{\x1C\u05CB\u05CC" +
		"\f\x1A\x02\x02\u05CC\u05CD\x07B\x02\x02\u05CD\u0628\x05\xF4{\x1B\u05CE" +
		"\u05CF\f\x19\x02\x02\u05CF\u05D0\x07<\x02\x02\u05D0\u0628\x05\xF4{\x1A" +
		"\u05D1\u05D2\f\x18\x02\x02\u05D2\u05D3\x07>\x02\x02\u05D3\u0628\x05\xF4" +
		"{\x19\u05D4\u05D5\f\x17\x02\x02\u05D5\u05D6\x07=\x02\x02\u05D6\u0628\x05" +
		"\xF4{\x18\u05D7\u05D8\f\x16\x02\x02\u05D8\u05D9\x07?\x02\x02\u05D9\u0628" +
		"\x05\xF4{\x17\u05DA\u05DB\f\x15\x02\x02\u05DB\u05DC\x074\x02\x02\u05DC" +
		"\u0628\x05\xF4{\x16\u05DD\u05DE\f\x14\x02\x02\u05DE\u05DF\x07N\x02\x02" +
		"\u05DF\u05E0\x07N\x02\x02\u05E0\u0628\x05\xF4{\x15\u05E1\u05E2\f\x13\x02" +
		"\x02\u05E2\u05E3\x07:\x02\x02\u05E3\u0628\x05\xF4{\x14\u05E4\u05E5\f\x12" +
		"\x02\x02\u05E5\u05E6\x079\x02\x02\u05E6\u0628\x05\xF4{\x13\u05E7\u05E8" +
		"\f\x11\x02\x02\u05E8\u05E9\x07M\x02\x02\u05E9\u0628\x05\xF4{\x12\u05EA" +
		"\u05EB\f\x10\x02\x02\u05EB\u05EC\x07N\x02\x02\u05EC\u0628\x05\xF4{\x11" +
		"\u05ED\u05EE\f\x0F\x02\x02\u05EE\u05EF\x078\x02\x02\u05EF\u0628\x05\xF4" +
		"{\x10\u05F0\u05F1\f\x0E\x02\x02\u05F1\u05F2\x077\x02\x02\u05F2\u0628\x05" +
		"\xF4{\x0F\u05F3\u05F4\f\r\x02\x02\u05F4\u05F5\x07D\x02\x02\u05F5\u0628" +
		"\x05\xF4{\x0E\u05F6\u05F7\f\f\x02\x02\u05F7\u05F8\x07E\x02\x02\u05F8\u0628" +
		"\x05\xF4{\r\u05F9\u05FA\f\v\x02\x02\u05FA\u05FB\x07C\x02\x02\u05FB\u0628" +
		"\x05\xF4{\f\u05FC\u05FD\f\n\x02\x02\u05FD\u05FE\x07;\x02\x02\u05FE\u0628" +
		"\x05\xF4{\v\u05FF\u0600\f\t\x02\x02\u0600\u0601\x075\x02\x02\u0601\u0628" +
		"\x05\xF4{\n\u0602\u0603\f\b\x02\x02\u0603\u0604\x076\x02\x02\u0604\u0628" +
		"\x05\xF4{\t\u0605\u0606\f\x07\x02\x02\u0606\u0607\x07R\x02\x02\u0607\u0608" +
		"\x05\xF4{\x02\u0608\u0609\x07P\x02\x02\u0609\u060A\x05\xF4{\b\u060A\u0628" +
		"\x03\x02\x02\x02\u060B\u060C\f\'\x02\x02\u060C\u060D\x07I\x02\x02\u060D" +
		"\u060E\x05\xF4{\x02\u060E\u060F\x07J\x02\x02\u060F\u0628\x03\x02\x02\x02" +
		"\u0610\u0611\f&\x02\x02\u0611\u0612\x07I\x02\x02\u0612\u0613\x05\xF4{" +
		"\x02\u0613\u0614\x07P\x02\x02\u0614\u0615\x05\xF4{\x02\u0615\u0616\x07" +
		"J\x02\x02\u0616\u0628\x03\x02\x02\x02\u0617\u0618\f\x1D\x02\x02\u0618" +
		"\u0619\x07S\x02\x02\u0619\u0628\x05\x10\t\x02\u061A\u061B\f\x06\x02\x02" +
		"\u061B\u061C\x07M\x02\x02\u061C\u061D\x05\x8EH\x02\u061D\u061E\x07N\x02" +
		"\x02\u061E\u061F\x07G\x02\x02\u061F\u0620\x05\xE8u\x02\u0620\u0621\x07" +
		"H\x02\x02\u0621\u0628\x03\x02\x02\x02\u0622\u0623\f\x05\x02\x02\u0623" +
		"\u0624\x07G\x02\x02\u0624\u0625\x05\xE8u\x02\u0625\u0626\x07H\x02\x02" +
		"\u0626\u0628\x03\x02\x02\x02\u0627\u05C5\x03\x02\x02\x02\u0627\u05C8\x03" +
		"\x02\x02\x02\u0627\u05CB\x03\x02\x02\x02\u0627\u05CE\x03\x02\x02\x02\u0627" +
		"\u05D1\x03\x02\x02\x02\u0627\u05D4\x03\x02\x02\x02\u0627\u05D7\x03\x02" +
		"\x02\x02\u0627\u05DA\x03\x02\x02\x02\u0627\u05DD\x03\x02\x02\x02\u0627" +
		"\u05E1\x03\x02\x02\x02\u0627\u05E4\x03\x02\x02\x02\u0627\u05E7\x03\x02" +
		"\x02\x02\u0627\u05EA\x03\x02\x02\x02\u0627\u05ED\x03\x02\x02\x02\u0627" +
		"\u05F0\x03\x02\x02\x02\u0627\u05F3\x03\x02\x02\x02\u0627\u05F6\x03\x02" +
		"\x02\x02\u0627\u05F9\x03\x02\x02\x02\u0627\u05FC\x03\x02\x02\x02\u0627" +
		"\u05FF\x03\x02\x02\x02\u0627\u0602\x03\x02\x02\x02\u0627\u0605\x03\x02" +
		"\x02\x02\u0627\u060B\x03\x02\x02\x02\u0627\u0610\x03\x02\x02\x02\u0627" +
		"\u0617\x03\x02\x02\x02\u0627\u061A\x03\x02\x02\x02\u0627\u0622\x03\x02" +
		"\x02\x02\u0628\u062B\x03\x02\x02\x02\u0629\u0627\x03\x02\x02\x02\u0629" +
		"\u062A\x03\x02\x02\x02\u062A\xF5\x03\x02\x02\x02\u062B\u0629\x03\x02\x02" +
		"\x02\u062C\u062D\t\x02\x02\x02\u062D\xF7\x03\x02\x02\x02\u062E\u0644\x05" +
		"\xF4{\x02\u062F\u0630\x05\xF4{\x02\u0630\u0631\x077\x02\x02\u0631\u0632" +
		"\x05V,\x02\u0632\u0644\x03\x02\x02\x02\u0633\u0634\x05\xF4{\x02\u0634" +
		"\u0635\x077\x02\x02\u0635\u0636\x07G\x02\x02\u0636\u0637\x05V,\x02\u0637" +
		"\u0638\x07H\x02\x02\u0638\u0644\x03\x02\x02\x02\u0639\u063A\x05V,\x02" +
		"\u063A\u063B\x077\x02\x02\u063B\u063C\x05\xF4{\x02\u063C\u0644\x03\x02" +
		"\x02\x02\u063D\u063E\x07G\x02\x02\u063E\u063F\x05V,\x02\u063F\u0640\x07" +
		"H\x02\x02\u0640\u0641\x077\x02\x02\u0641\u0642\x05\xF4{\x02\u0642\u0644" +
		"\x03\x02\x02\x02\u0643\u062E\x03\x02\x02\x02\u0643\u062F\x03\x02\x02\x02" +
		"\u0643\u0633\x03\x02\x02\x02\u0643\u0639\x03\x02\x02\x02\u0643\u063D\x03" +
		"\x02\x02\x02\u0644\xF9\x03\x02\x02\x02]\u0103\u0105\u0113\u0125\u0137" +
		"\u0140\u0144\u014A\u014E\u0152\u015B\u016A\u0174\u0176\u01CC\u01D6\u01DF" +
		"\u01E9\u01F8\u01FE\u022A\u0235\u023A\u0241\u0251\u0258\u0269\u0279\u0281" +
		"\u028B\u0291\u02A0\u02AA\u02BA\u02C8\u02EB\u0302\u030A\u0320\u0327\u0341" +
		"\u0348\u034C\u0352\u038A\u038F\u0396\u03A0\u03A7\u03AB\u03B2\u03B8\u03C2" +
		"\u03D2\u03D8\u03F4\u040E\u0418\u0431\u0448\u045E\u046B\u047B\u048D\u0499" +
		"\u04A9\u04B3\u04B7\u04BD\u04CD\u04EB\u04F2\u0502\u050E\u0523\u052C\u0542" +
		"\u054F\u0558\u0562\u056B\u056F\u0576\u057D\u0582\u0593\u0595\u05C3\u0627" +
		"\u0629\u0643";
	public static readonly _serializedATN: string = Utils.join(
		[
			P4Parser._serializedATNSegment0,
			P4Parser._serializedATNSegment1,
			P4Parser._serializedATNSegment2,
		],
		"",
	);
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!P4Parser.__ATN) {
			P4Parser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(P4Parser._serializedATN));
		}

		return P4Parser.__ATN;
	}

}

export class StartContext extends ParserRuleContext {
	public program(): ProgramContext {
		return this.getRuleContext(0, ProgramContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_start; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterStart) {
			listener.enterStart(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitStart) {
			listener.exitStart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitStart) {
			return visitor.visitStart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ProgramContext extends ParserRuleContext {
	public input(): InputContext {
		return this.getRuleContext(0, InputContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_program; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterProgram) {
			listener.enterProgram(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitProgram) {
			listener.exitProgram(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitProgram) {
			return visitor.visitProgram(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InputContext extends ParserRuleContext {
	public input(): InputContext | undefined {
		return this.tryGetRuleContext(0, InputContext);
	}
	public declaration(): DeclarationContext | undefined {
		return this.tryGetRuleContext(0, DeclarationContext);
	}
	public SEMICOLON(): TerminalNode | undefined { return this.tryGetToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_input; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterInput) {
			listener.enterInput(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitInput) {
			listener.exitInput(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitInput) {
			return visitor.visitInput(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DeclarationContext extends ParserRuleContext {
	public constantDeclaration(): ConstantDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ConstantDeclarationContext);
	}
	public externDeclaration(): ExternDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ExternDeclarationContext);
	}
	public actionDeclaration(): ActionDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ActionDeclarationContext);
	}
	public parserDeclaration(): ParserDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ParserDeclarationContext);
	}
	public typeDeclaration(): TypeDeclarationContext | undefined {
		return this.tryGetRuleContext(0, TypeDeclarationContext);
	}
	public controlDeclaration(): ControlDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ControlDeclarationContext);
	}
	public instantiation(): InstantiationContext | undefined {
		return this.tryGetRuleContext(0, InstantiationContext);
	}
	public errorDeclaration(): ErrorDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ErrorDeclarationContext);
	}
	public matchKindDeclaration(): MatchKindDeclarationContext | undefined {
		return this.tryGetRuleContext(0, MatchKindDeclarationContext);
	}
	public functionDeclaration(): FunctionDeclarationContext | undefined {
		return this.tryGetRuleContext(0, FunctionDeclarationContext);
	}
	public preprocessorLine(): PreprocessorLineContext | undefined {
		return this.tryGetRuleContext(0, PreprocessorLineContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_declaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterDeclaration) {
			listener.enterDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitDeclaration) {
			listener.exitDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitDeclaration) {
			return visitor.visitDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PreprocessorLineContext extends ParserRuleContext {
	public PREPROC_INCLUDE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PREPROC_INCLUDE, 0); }
	public ppIncludeFileName(): PpIncludeFileNameContext | undefined {
		return this.tryGetRuleContext(0, PpIncludeFileNameContext);
	}
	public PREPROC_DEFINE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PREPROC_DEFINE, 0); }
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public PREPROC_UNDEF(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PREPROC_UNDEF, 0); }
	public PREPROC_IFDEF(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PREPROC_IFDEF, 0); }
	public PREPROC_IFNDEF(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PREPROC_IFNDEF, 0); }
	public PREPROC_IF(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PREPROC_IF, 0); }
	public PREPROC_ELSEIF(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PREPROC_ELSEIF, 0); }
	public PREPROC_ELSE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PREPROC_ELSE, 0); }
	public PREPROC_ENDIF(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PREPROC_ENDIF, 0); }
	public PREPROC_LINE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PREPROC_LINE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_preprocessorLine; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterPreprocessorLine) {
			listener.enterPreprocessorLine(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitPreprocessorLine) {
			listener.exitPreprocessorLine(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitPreprocessorLine) {
			return visitor.visitPreprocessorLine(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PpIncludeFileNameContext extends ParserRuleContext {
	public STRING_LITERAL(): TerminalNode | undefined { return this.tryGetToken(P4Parser.STRING_LITERAL, 0); }
	public L_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_ANGLE, 0); }
	public ppIncludeFileName(): PpIncludeFileNameContext | undefined {
		return this.tryGetRuleContext(0, PpIncludeFileNameContext);
	}
	public R_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_ANGLE, 0); }
	public name(): NameContext[];
	public name(i: number): NameContext;
	public name(i?: number): NameContext | NameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(NameContext);
		} else {
			return this.getRuleContext(i, NameContext);
		}
	}
	public DOT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DOT, 0); }
	public DIV(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DIV, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_ppIncludeFileName; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterPpIncludeFileName) {
			listener.enterPpIncludeFileName(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitPpIncludeFileName) {
			listener.exitPpIncludeFileName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitPpIncludeFileName) {
			return visitor.visitPpIncludeFileName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NonTypeNameContext extends ParserRuleContext {
	public type_or_id(): Type_or_idContext | undefined {
		return this.tryGetRuleContext(0, Type_or_idContext);
	}
	public APPLY(): TerminalNode | undefined { return this.tryGetToken(P4Parser.APPLY, 0); }
	public KEY(): TerminalNode | undefined { return this.tryGetToken(P4Parser.KEY, 0); }
	public ACTIONS(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ACTIONS, 0); }
	public STATE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.STATE, 0); }
	public ENTRIES(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ENTRIES, 0); }
	public TYPE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TYPE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_nonTypeName; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterNonTypeName) {
			listener.enterNonTypeName(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitNonTypeName) {
			listener.exitNonTypeName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitNonTypeName) {
			return visitor.visitNonTypeName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NameContext extends ParserRuleContext {
	public nonTypeName(): NonTypeNameContext | undefined {
		return this.tryGetRuleContext(0, NonTypeNameContext);
	}
	public type_or_id(): Type_or_idContext | undefined {
		return this.tryGetRuleContext(0, Type_or_idContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_name; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterName) {
			listener.enterName(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitName) {
			listener.exitName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitName) {
			return visitor.visitName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NonTableKwNameContext extends ParserRuleContext {
	public type_or_id(): Type_or_idContext | undefined {
		return this.tryGetRuleContext(0, Type_or_idContext);
	}
	public APPLY(): TerminalNode | undefined { return this.tryGetToken(P4Parser.APPLY, 0); }
	public STATE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.STATE, 0); }
	public TYPE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TYPE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_nonTableKwName; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterNonTableKwName) {
			listener.enterNonTableKwName(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitNonTableKwName) {
			listener.exitNonTableKwName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitNonTableKwName) {
			return visitor.visitNonTableKwName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OptCONSTContext extends ParserRuleContext {
	public CONST(): TerminalNode | undefined { return this.tryGetToken(P4Parser.CONST, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_optCONST; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterOptCONST) {
			listener.enterOptCONST(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitOptCONST) {
			listener.exitOptCONST(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitOptCONST) {
			return visitor.visitOptCONST(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OptAnnotationsContext extends ParserRuleContext {
	public annotations(): AnnotationsContext | undefined {
		return this.tryGetRuleContext(0, AnnotationsContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_optAnnotations; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterOptAnnotations) {
			listener.enterOptAnnotations(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitOptAnnotations) {
			listener.exitOptAnnotations(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitOptAnnotations) {
			return visitor.visitOptAnnotations(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AnnotationsContext extends ParserRuleContext {
	public annotation(): AnnotationContext {
		return this.getRuleContext(0, AnnotationContext);
	}
	public annotations(): AnnotationsContext | undefined {
		return this.tryGetRuleContext(0, AnnotationsContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_annotations; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterAnnotations) {
			listener.enterAnnotations(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitAnnotations) {
			listener.exitAnnotations(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitAnnotations) {
			return visitor.visitAnnotations(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AnnotationContext extends ParserRuleContext {
	public AT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.AT, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public L_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_PAREN, 0); }
	public annotationBody(): AnnotationBodyContext | undefined {
		return this.tryGetRuleContext(0, AnnotationBodyContext);
	}
	public R_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_PAREN, 0); }
	public PRAGMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PRAGMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_annotation; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterAnnotation) {
			listener.enterAnnotation(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitAnnotation) {
			listener.exitAnnotation(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitAnnotation) {
			return visitor.visitAnnotation(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AnnotationBodyContext extends ParserRuleContext {
	public annotationBody(): AnnotationBodyContext[];
	public annotationBody(i: number): AnnotationBodyContext;
	public annotationBody(i?: number): AnnotationBodyContext | AnnotationBodyContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AnnotationBodyContext);
		} else {
			return this.getRuleContext(i, AnnotationBodyContext);
		}
	}
	public L_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_PAREN, 0); }
	public R_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_PAREN, 0); }
	public annotationToken(): AnnotationTokenContext | undefined {
		return this.tryGetRuleContext(0, AnnotationTokenContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_annotationBody; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterAnnotationBody) {
			listener.enterAnnotationBody(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitAnnotationBody) {
			listener.exitAnnotationBody(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitAnnotationBody) {
			return visitor.visitAnnotationBody(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AnnotationTokenContext extends ParserRuleContext {
	public UNEXPECTED_TOKEN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.UNEXPECTED_TOKEN, 0); }
	public ABSTRACT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ABSTRACT, 0); }
	public ACTION(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ACTION, 0); }
	public ACTIONS(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ACTIONS, 0); }
	public APPLY(): TerminalNode | undefined { return this.tryGetToken(P4Parser.APPLY, 0); }
	public BOOL(): TerminalNode | undefined { return this.tryGetToken(P4Parser.BOOL, 0); }
	public BIT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.BIT, 0); }
	public CONST(): TerminalNode | undefined { return this.tryGetToken(P4Parser.CONST, 0); }
	public CONTROL(): TerminalNode | undefined { return this.tryGetToken(P4Parser.CONTROL, 0); }
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DEFAULT, 0); }
	public ELSE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ELSE, 0); }
	public ENTRIES(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ENTRIES, 0); }
	public ENUM(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ENUM, 0); }
	public ERROR(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ERROR, 0); }
	public EXIT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.EXIT, 0); }
	public EXTERN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.EXTERN, 0); }
	public FALSE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.FALSE, 0); }
	public HEADER(): TerminalNode | undefined { return this.tryGetToken(P4Parser.HEADER, 0); }
	public HEADER_UNION(): TerminalNode | undefined { return this.tryGetToken(P4Parser.HEADER_UNION, 0); }
	public IF(): TerminalNode | undefined { return this.tryGetToken(P4Parser.IF, 0); }
	public IN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.IN, 0); }
	public INOUT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.INOUT, 0); }
	public INT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.INT, 0); }
	public KEY(): TerminalNode | undefined { return this.tryGetToken(P4Parser.KEY, 0); }
	public MATCH_KIND(): TerminalNode | undefined { return this.tryGetToken(P4Parser.MATCH_KIND, 0); }
	public TYPE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TYPE, 0); }
	public OUT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.OUT, 0); }
	public PARSER(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PARSER, 0); }
	public PACKAGE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PACKAGE, 0); }
	public PRAGMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PRAGMA, 0); }
	public RETURN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.RETURN, 0); }
	public SELECT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.SELECT, 0); }
	public STATE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.STATE, 0); }
	public STRUCT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.STRUCT, 0); }
	public SWITCH(): TerminalNode | undefined { return this.tryGetToken(P4Parser.SWITCH, 0); }
	public TABLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TABLE, 0); }
	public THIS(): TerminalNode | undefined { return this.tryGetToken(P4Parser.THIS, 0); }
	public TRANSITION(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TRANSITION, 0); }
	public TRUE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TRUE, 0); }
	public TUPLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TUPLE, 0); }
	public TYPEDEF(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TYPEDEF, 0); }
	public VARBIT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.VARBIT, 0); }
	public VALUESET(): TerminalNode | undefined { return this.tryGetToken(P4Parser.VALUESET, 0); }
	public VOID(): TerminalNode | undefined { return this.tryGetToken(P4Parser.VOID, 0); }
	public DONTCARE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DONTCARE, 0); }
	public type_or_id(): Type_or_idContext | undefined {
		return this.tryGetRuleContext(0, Type_or_idContext);
	}
	public STRING_LITERAL(): TerminalNode | undefined { return this.tryGetToken(P4Parser.STRING_LITERAL, 0); }
	public INTEGER(): TerminalNode | undefined { return this.tryGetToken(P4Parser.INTEGER, 0); }
	public MASK(): TerminalNode | undefined { return this.tryGetToken(P4Parser.MASK, 0); }
	public RANGE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.RANGE, 0); }
	public SHL(): TerminalNode | undefined { return this.tryGetToken(P4Parser.SHL, 0); }
	public AND(): TerminalNode | undefined { return this.tryGetToken(P4Parser.AND, 0); }
	public OR(): TerminalNode | undefined { return this.tryGetToken(P4Parser.OR, 0); }
	public EQ(): TerminalNode | undefined { return this.tryGetToken(P4Parser.EQ, 0); }
	public NE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.NE, 0); }
	public GE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.GE, 0); }
	public LE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.LE, 0); }
	public PP(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PP, 0); }
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PLUS, 0); }
	public PLUS_SAT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PLUS_SAT, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(P4Parser.MINUS, 0); }
	public MINUS_SAT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.MINUS_SAT, 0); }
	public MUL(): TerminalNode | undefined { return this.tryGetToken(P4Parser.MUL, 0); }
	public DIV(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DIV, 0); }
	public MOD(): TerminalNode | undefined { return this.tryGetToken(P4Parser.MOD, 0); }
	public BIT_OR(): TerminalNode | undefined { return this.tryGetToken(P4Parser.BIT_OR, 0); }
	public BIT_AND(): TerminalNode | undefined { return this.tryGetToken(P4Parser.BIT_AND, 0); }
	public BIT_XOR(): TerminalNode | undefined { return this.tryGetToken(P4Parser.BIT_XOR, 0); }
	public COMPLEMENT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMPLEMENT, 0); }
	public L_BRACKET(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_BRACKET, 0); }
	public R_BRACKET(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_BRACKET, 0); }
	public L_BRACE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_BRACE, 0); }
	public R_BRACE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_BRACE, 0); }
	public L_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_ANGLE, 0); }
	public R_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_ANGLE, 0); }
	public NOT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.NOT, 0); }
	public COLON(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COLON, 0); }
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMMA, 0); }
	public QUESTION(): TerminalNode | undefined { return this.tryGetToken(P4Parser.QUESTION, 0); }
	public DOT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DOT, 0); }
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ASSIGN, 0); }
	public SEMICOLON(): TerminalNode | undefined { return this.tryGetToken(P4Parser.SEMICOLON, 0); }
	public AT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.AT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_annotationToken; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterAnnotationToken) {
			listener.enterAnnotationToken(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitAnnotationToken) {
			listener.exitAnnotationToken(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitAnnotationToken) {
			return visitor.visitAnnotationToken(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KvListContext extends ParserRuleContext {
	public kvPair(): KvPairContext {
		return this.getRuleContext(0, KvPairContext);
	}
	public kvList(): KvListContext | undefined {
		return this.tryGetRuleContext(0, KvListContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_kvList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterKvList) {
			listener.enterKvList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitKvList) {
			listener.exitKvList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitKvList) {
			return visitor.visitKvList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KvPairContext extends ParserRuleContext {
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public ASSIGN(): TerminalNode { return this.getToken(P4Parser.ASSIGN, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_kvPair; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterKvPair) {
			listener.enterKvPair(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitKvPair) {
			listener.exitKvPair(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitKvPair) {
			return visitor.visitKvPair(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterListContext extends ParserRuleContext {
	public nonEmptyParameterList(): NonEmptyParameterListContext | undefined {
		return this.tryGetRuleContext(0, NonEmptyParameterListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parameterList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParameterList) {
			listener.enterParameterList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParameterList) {
			listener.exitParameterList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParameterList) {
			return visitor.visitParameterList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NonEmptyParameterListContext extends ParserRuleContext {
	public parameter(): ParameterContext {
		return this.getRuleContext(0, ParameterContext);
	}
	public nonEmptyParameterList(): NonEmptyParameterListContext | undefined {
		return this.tryGetRuleContext(0, NonEmptyParameterListContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_nonEmptyParameterList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterNonEmptyParameterList) {
			listener.enterNonEmptyParameterList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitNonEmptyParameterList) {
			listener.exitNonEmptyParameterList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitNonEmptyParameterList) {
			return visitor.visitNonEmptyParameterList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public direction(): DirectionContext {
		return this.getRuleContext(0, DirectionContext);
	}
	public typeRef(): TypeRefContext {
		return this.getRuleContext(0, TypeRefContext);
	}
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ASSIGN, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parameter; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParameter) {
			listener.enterParameter(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParameter) {
			listener.exitParameter(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParameter) {
			return visitor.visitParameter(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DirectionContext extends ParserRuleContext {
	public IN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.IN, 0); }
	public OUT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.OUT, 0); }
	public INOUT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.INOUT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_direction; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterDirection) {
			listener.enterDirection(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitDirection) {
			listener.exitDirection(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitDirection) {
			return visitor.visitDirection(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PackageTypeDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public PACKAGE(): TerminalNode { return this.getToken(P4Parser.PACKAGE, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public optTypeParameters(): OptTypeParametersContext {
		return this.getRuleContext(0, OptTypeParametersContext);
	}
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public parameterList(): ParameterListContext {
		return this.getRuleContext(0, ParameterListContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_packageTypeDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterPackageTypeDeclaration) {
			listener.enterPackageTypeDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitPackageTypeDeclaration) {
			listener.exitPackageTypeDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitPackageTypeDeclaration) {
			return visitor.visitPackageTypeDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InstantiationContext extends ParserRuleContext {
	public annotations(): AnnotationsContext | undefined {
		return this.tryGetRuleContext(0, AnnotationsContext);
	}
	public typeRef(): TypeRefContext {
		return this.getRuleContext(0, TypeRefContext);
	}
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public argumentList(): ArgumentListContext {
		return this.getRuleContext(0, ArgumentListContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ASSIGN, 0); }
	public objInitializer(): ObjInitializerContext | undefined {
		return this.tryGetRuleContext(0, ObjInitializerContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_instantiation; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterInstantiation) {
			listener.enterInstantiation(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitInstantiation) {
			listener.exitInstantiation(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitInstantiation) {
			return visitor.visitInstantiation(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ObjInitializerContext extends ParserRuleContext {
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public objDeclarations(): ObjDeclarationsContext {
		return this.getRuleContext(0, ObjDeclarationsContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_objInitializer; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterObjInitializer) {
			listener.enterObjInitializer(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitObjInitializer) {
			listener.exitObjInitializer(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitObjInitializer) {
			return visitor.visitObjInitializer(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ObjDeclarationsContext extends ParserRuleContext {
	public objDeclarations(): ObjDeclarationsContext | undefined {
		return this.tryGetRuleContext(0, ObjDeclarationsContext);
	}
	public objDeclaration(): ObjDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ObjDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_objDeclarations; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterObjDeclarations) {
			listener.enterObjDeclarations(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitObjDeclarations) {
			listener.exitObjDeclarations(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitObjDeclarations) {
			return visitor.visitObjDeclarations(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ObjDeclarationContext extends ParserRuleContext {
	public functionDeclaration(): FunctionDeclarationContext | undefined {
		return this.tryGetRuleContext(0, FunctionDeclarationContext);
	}
	public instantiation(): InstantiationContext | undefined {
		return this.tryGetRuleContext(0, InstantiationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_objDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterObjDeclaration) {
			listener.enterObjDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitObjDeclaration) {
			listener.exitObjDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitObjDeclaration) {
			return visitor.visitObjDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OptConstructorParametersContext extends ParserRuleContext {
	public L_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_PAREN, 0); }
	public parameterList(): ParameterListContext | undefined {
		return this.tryGetRuleContext(0, ParameterListContext);
	}
	public R_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_optConstructorParameters; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterOptConstructorParameters) {
			listener.enterOptConstructorParameters(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitOptConstructorParameters) {
			listener.exitOptConstructorParameters(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitOptConstructorParameters) {
			return visitor.visitOptConstructorParameters(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DotPrefixContext extends ParserRuleContext {
	public DOT(): TerminalNode { return this.getToken(P4Parser.DOT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_dotPrefix; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterDotPrefix) {
			listener.enterDotPrefix(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitDotPrefix) {
			listener.exitDotPrefix(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitDotPrefix) {
			return visitor.visitDotPrefix(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParserDeclarationContext extends ParserRuleContext {
	public parserTypeDeclaration(): ParserTypeDeclarationContext {
		return this.getRuleContext(0, ParserTypeDeclarationContext);
	}
	public optConstructorParameters(): OptConstructorParametersContext {
		return this.getRuleContext(0, OptConstructorParametersContext);
	}
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public parserLocalElements(): ParserLocalElementsContext {
		return this.getRuleContext(0, ParserLocalElementsContext);
	}
	public parserStates(): ParserStatesContext {
		return this.getRuleContext(0, ParserStatesContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parserDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParserDeclaration) {
			listener.enterParserDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParserDeclaration) {
			listener.exitParserDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParserDeclaration) {
			return visitor.visitParserDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParserLocalElementsContext extends ParserRuleContext {
	public parserLocalElements(): ParserLocalElementsContext | undefined {
		return this.tryGetRuleContext(0, ParserLocalElementsContext);
	}
	public parserLocalElement(): ParserLocalElementContext | undefined {
		return this.tryGetRuleContext(0, ParserLocalElementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parserLocalElements; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParserLocalElements) {
			listener.enterParserLocalElements(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParserLocalElements) {
			listener.exitParserLocalElements(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParserLocalElements) {
			return visitor.visitParserLocalElements(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParserLocalElementContext extends ParserRuleContext {
	public constantDeclaration(): ConstantDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ConstantDeclarationContext);
	}
	public instantiation(): InstantiationContext | undefined {
		return this.tryGetRuleContext(0, InstantiationContext);
	}
	public variableDeclaration(): VariableDeclarationContext | undefined {
		return this.tryGetRuleContext(0, VariableDeclarationContext);
	}
	public valueSetDeclaration(): ValueSetDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ValueSetDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parserLocalElement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParserLocalElement) {
			listener.enterParserLocalElement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParserLocalElement) {
			listener.exitParserLocalElement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParserLocalElement) {
			return visitor.visitParserLocalElement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParserTypeDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public PARSER(): TerminalNode { return this.getToken(P4Parser.PARSER, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public optTypeParameters(): OptTypeParametersContext {
		return this.getRuleContext(0, OptTypeParametersContext);
	}
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public parameterList(): ParameterListContext {
		return this.getRuleContext(0, ParameterListContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parserTypeDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParserTypeDeclaration) {
			listener.enterParserTypeDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParserTypeDeclaration) {
			listener.exitParserTypeDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParserTypeDeclaration) {
			return visitor.visitParserTypeDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParserStatesContext extends ParserRuleContext {
	public parserState(): ParserStateContext {
		return this.getRuleContext(0, ParserStateContext);
	}
	public parserStates(): ParserStatesContext | undefined {
		return this.tryGetRuleContext(0, ParserStatesContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parserStates; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParserStates) {
			listener.enterParserStates(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParserStates) {
			listener.exitParserStates(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParserStates) {
			return visitor.visitParserStates(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParserStateContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public STATE(): TerminalNode { return this.getToken(P4Parser.STATE, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public parserStatements(): ParserStatementsContext {
		return this.getRuleContext(0, ParserStatementsContext);
	}
	public transitionStatement(): TransitionStatementContext {
		return this.getRuleContext(0, TransitionStatementContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parserState; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParserState) {
			listener.enterParserState(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParserState) {
			listener.exitParserState(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParserState) {
			return visitor.visitParserState(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParserStatementsContext extends ParserRuleContext {
	public parserStatements(): ParserStatementsContext | undefined {
		return this.tryGetRuleContext(0, ParserStatementsContext);
	}
	public parserStatement(): ParserStatementContext | undefined {
		return this.tryGetRuleContext(0, ParserStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parserStatements; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParserStatements) {
			listener.enterParserStatements(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParserStatements) {
			listener.exitParserStatements(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParserStatements) {
			return visitor.visitParserStatements(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParserStatementContext extends ParserRuleContext {
	public assignmentOrMethodCallStatement(): AssignmentOrMethodCallStatementContext | undefined {
		return this.tryGetRuleContext(0, AssignmentOrMethodCallStatementContext);
	}
	public directApplication(): DirectApplicationContext | undefined {
		return this.tryGetRuleContext(0, DirectApplicationContext);
	}
	public variableDeclaration(): VariableDeclarationContext | undefined {
		return this.tryGetRuleContext(0, VariableDeclarationContext);
	}
	public constantDeclaration(): ConstantDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ConstantDeclarationContext);
	}
	public parserBlockStatement(): ParserBlockStatementContext | undefined {
		return this.tryGetRuleContext(0, ParserBlockStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parserStatement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParserStatement) {
			listener.enterParserStatement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParserStatement) {
			listener.exitParserStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParserStatement) {
			return visitor.visitParserStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParserBlockStatementContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public parserStatements(): ParserStatementsContext {
		return this.getRuleContext(0, ParserStatementsContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parserBlockStatement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParserBlockStatement) {
			listener.enterParserBlockStatement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParserBlockStatement) {
			listener.exitParserBlockStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParserBlockStatement) {
			return visitor.visitParserBlockStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TransitionStatementContext extends ParserRuleContext {
	public TRANSITION(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TRANSITION, 0); }
	public stateExpression(): StateExpressionContext | undefined {
		return this.tryGetRuleContext(0, StateExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_transitionStatement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTransitionStatement) {
			listener.enterTransitionStatement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTransitionStatement) {
			listener.exitTransitionStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTransitionStatement) {
			return visitor.visitTransitionStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StateExpressionContext extends ParserRuleContext {
	public name(): NameContext | undefined {
		return this.tryGetRuleContext(0, NameContext);
	}
	public SEMICOLON(): TerminalNode | undefined { return this.tryGetToken(P4Parser.SEMICOLON, 0); }
	public selectExpression(): SelectExpressionContext | undefined {
		return this.tryGetRuleContext(0, SelectExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_stateExpression; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterStateExpression) {
			listener.enterStateExpression(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitStateExpression) {
			listener.exitStateExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitStateExpression) {
			return visitor.visitStateExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SelectExpressionContext extends ParserRuleContext {
	public SELECT(): TerminalNode { return this.getToken(P4Parser.SELECT, 0); }
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public expressionList(): ExpressionListContext {
		return this.getRuleContext(0, ExpressionListContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public selectCaseList(): SelectCaseListContext {
		return this.getRuleContext(0, SelectCaseListContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_selectExpression; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSelectExpression) {
			listener.enterSelectExpression(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSelectExpression) {
			listener.exitSelectExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSelectExpression) {
			return visitor.visitSelectExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SelectCaseListContext extends ParserRuleContext {
	public selectCaseList(): SelectCaseListContext | undefined {
		return this.tryGetRuleContext(0, SelectCaseListContext);
	}
	public selectCase(): SelectCaseContext | undefined {
		return this.tryGetRuleContext(0, SelectCaseContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_selectCaseList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSelectCaseList) {
			listener.enterSelectCaseList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSelectCaseList) {
			listener.exitSelectCaseList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSelectCaseList) {
			return visitor.visitSelectCaseList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SelectCaseContext extends ParserRuleContext {
	public keysetExpression(): KeysetExpressionContext {
		return this.getRuleContext(0, KeysetExpressionContext);
	}
	public COLON(): TerminalNode { return this.getToken(P4Parser.COLON, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_selectCase; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSelectCase) {
			listener.enterSelectCase(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSelectCase) {
			listener.exitSelectCase(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSelectCase) {
			return visitor.visitSelectCase(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KeysetExpressionContext extends ParserRuleContext {
	public tupleKeysetExpression(): TupleKeysetExpressionContext | undefined {
		return this.tryGetRuleContext(0, TupleKeysetExpressionContext);
	}
	public simpleKeysetExpression(): SimpleKeysetExpressionContext | undefined {
		return this.tryGetRuleContext(0, SimpleKeysetExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_keysetExpression; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterKeysetExpression) {
			listener.enterKeysetExpression(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitKeysetExpression) {
			listener.exitKeysetExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitKeysetExpression) {
			return visitor.visitKeysetExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TupleKeysetExpressionContext extends ParserRuleContext {
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public simpleKeysetExpression(): SimpleKeysetExpressionContext {
		return this.getRuleContext(0, SimpleKeysetExpressionContext);
	}
	public COMMA(): TerminalNode { return this.getToken(P4Parser.COMMA, 0); }
	public simpleExpressionList(): SimpleExpressionListContext {
		return this.getRuleContext(0, SimpleExpressionListContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_tupleKeysetExpression; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTupleKeysetExpression) {
			listener.enterTupleKeysetExpression(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTupleKeysetExpression) {
			listener.exitTupleKeysetExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTupleKeysetExpression) {
			return visitor.visitTupleKeysetExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SimpleExpressionListContext extends ParserRuleContext {
	public simpleKeysetExpression(): SimpleKeysetExpressionContext {
		return this.getRuleContext(0, SimpleKeysetExpressionContext);
	}
	public simpleExpressionList(): SimpleExpressionListContext | undefined {
		return this.tryGetRuleContext(0, SimpleExpressionListContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_simpleExpressionList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSimpleExpressionList) {
			listener.enterSimpleExpressionList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSimpleExpressionList) {
			listener.exitSimpleExpressionList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSimpleExpressionList) {
			return visitor.visitSimpleExpressionList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SimpleKeysetExpressionContext extends ParserRuleContext {
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public MASK(): TerminalNode | undefined { return this.tryGetToken(P4Parser.MASK, 0); }
	public RANGE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.RANGE, 0); }
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DEFAULT, 0); }
	public DONTCARE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DONTCARE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_simpleKeysetExpression; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSimpleKeysetExpression) {
			listener.enterSimpleKeysetExpression(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSimpleKeysetExpression) {
			listener.exitSimpleKeysetExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSimpleKeysetExpression) {
			return visitor.visitSimpleKeysetExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ValueSetDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public VALUESET(): TerminalNode { return this.getToken(P4Parser.VALUESET, 0); }
	public L_ANGLE(): TerminalNode { return this.getToken(P4Parser.L_ANGLE, 0); }
	public baseType(): BaseTypeContext | undefined {
		return this.tryGetRuleContext(0, BaseTypeContext);
	}
	public R_ANGLE(): TerminalNode { return this.getToken(P4Parser.R_ANGLE, 0); }
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	public tupleType(): TupleTypeContext | undefined {
		return this.tryGetRuleContext(0, TupleTypeContext);
	}
	public typeName(): TypeNameContext | undefined {
		return this.tryGetRuleContext(0, TypeNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_valueSetDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterValueSetDeclaration) {
			listener.enterValueSetDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitValueSetDeclaration) {
			listener.exitValueSetDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitValueSetDeclaration) {
			return visitor.visitValueSetDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ControlDeclarationContext extends ParserRuleContext {
	public controlTypeDeclaration(): ControlTypeDeclarationContext {
		return this.getRuleContext(0, ControlTypeDeclarationContext);
	}
	public optConstructorParameters(): OptConstructorParametersContext {
		return this.getRuleContext(0, OptConstructorParametersContext);
	}
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public controlLocalDeclarations(): ControlLocalDeclarationsContext {
		return this.getRuleContext(0, ControlLocalDeclarationsContext);
	}
	public APPLY(): TerminalNode { return this.getToken(P4Parser.APPLY, 0); }
	public controlBody(): ControlBodyContext {
		return this.getRuleContext(0, ControlBodyContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_controlDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterControlDeclaration) {
			listener.enterControlDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitControlDeclaration) {
			listener.exitControlDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitControlDeclaration) {
			return visitor.visitControlDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ControlTypeDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public CONTROL(): TerminalNode { return this.getToken(P4Parser.CONTROL, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public optTypeParameters(): OptTypeParametersContext {
		return this.getRuleContext(0, OptTypeParametersContext);
	}
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public parameterList(): ParameterListContext {
		return this.getRuleContext(0, ParameterListContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_controlTypeDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterControlTypeDeclaration) {
			listener.enterControlTypeDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitControlTypeDeclaration) {
			listener.exitControlTypeDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitControlTypeDeclaration) {
			return visitor.visitControlTypeDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ControlLocalDeclarationsContext extends ParserRuleContext {
	public controlLocalDeclarations(): ControlLocalDeclarationsContext | undefined {
		return this.tryGetRuleContext(0, ControlLocalDeclarationsContext);
	}
	public controlLocalDeclaration(): ControlLocalDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ControlLocalDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_controlLocalDeclarations; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterControlLocalDeclarations) {
			listener.enterControlLocalDeclarations(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitControlLocalDeclarations) {
			listener.exitControlLocalDeclarations(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitControlLocalDeclarations) {
			return visitor.visitControlLocalDeclarations(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ControlLocalDeclarationContext extends ParserRuleContext {
	public constantDeclaration(): ConstantDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ConstantDeclarationContext);
	}
	public actionDeclaration(): ActionDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ActionDeclarationContext);
	}
	public tableDeclaration(): TableDeclarationContext | undefined {
		return this.tryGetRuleContext(0, TableDeclarationContext);
	}
	public instantiation(): InstantiationContext | undefined {
		return this.tryGetRuleContext(0, InstantiationContext);
	}
	public variableDeclaration(): VariableDeclarationContext | undefined {
		return this.tryGetRuleContext(0, VariableDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_controlLocalDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterControlLocalDeclaration) {
			listener.enterControlLocalDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitControlLocalDeclaration) {
			listener.exitControlLocalDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitControlLocalDeclaration) {
			return visitor.visitControlLocalDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ControlBodyContext extends ParserRuleContext {
	public blockStatement(): BlockStatementContext {
		return this.getRuleContext(0, BlockStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_controlBody; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterControlBody) {
			listener.enterControlBody(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitControlBody) {
			listener.exitControlBody(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitControlBody) {
			return visitor.visitControlBody(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExternDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public EXTERN(): TerminalNode { return this.getToken(P4Parser.EXTERN, 0); }
	public nonTypeName(): NonTypeNameContext | undefined {
		return this.tryGetRuleContext(0, NonTypeNameContext);
	}
	public optTypeParameters(): OptTypeParametersContext | undefined {
		return this.tryGetRuleContext(0, OptTypeParametersContext);
	}
	public L_BRACE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_BRACE, 0); }
	public methodPrototypes(): MethodPrototypesContext | undefined {
		return this.tryGetRuleContext(0, MethodPrototypesContext);
	}
	public R_BRACE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_BRACE, 0); }
	public functionPrototype(): FunctionPrototypeContext | undefined {
		return this.tryGetRuleContext(0, FunctionPrototypeContext);
	}
	public SEMICOLON(): TerminalNode | undefined { return this.tryGetToken(P4Parser.SEMICOLON, 0); }
	public name(): NameContext | undefined {
		return this.tryGetRuleContext(0, NameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_externDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterExternDeclaration) {
			listener.enterExternDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitExternDeclaration) {
			listener.exitExternDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitExternDeclaration) {
			return visitor.visitExternDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MethodPrototypesContext extends ParserRuleContext {
	public methodPrototypes(): MethodPrototypesContext | undefined {
		return this.tryGetRuleContext(0, MethodPrototypesContext);
	}
	public methodPrototype(): MethodPrototypeContext | undefined {
		return this.tryGetRuleContext(0, MethodPrototypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_methodPrototypes; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterMethodPrototypes) {
			listener.enterMethodPrototypes(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitMethodPrototypes) {
			listener.exitMethodPrototypes(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitMethodPrototypes) {
			return visitor.visitMethodPrototypes(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionPrototypeContext extends ParserRuleContext {
	public typeOrVoid(): TypeOrVoidContext {
		return this.getRuleContext(0, TypeOrVoidContext);
	}
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public optTypeParameters(): OptTypeParametersContext {
		return this.getRuleContext(0, OptTypeParametersContext);
	}
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public parameterList(): ParameterListContext {
		return this.getRuleContext(0, ParameterListContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_functionPrototype; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterFunctionPrototype) {
			listener.enterFunctionPrototype(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitFunctionPrototype) {
			listener.exitFunctionPrototype(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitFunctionPrototype) {
			return visitor.visitFunctionPrototype(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MethodPrototypeContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public functionPrototype(): FunctionPrototypeContext | undefined {
		return this.tryGetRuleContext(0, FunctionPrototypeContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	public ABSTRACT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ABSTRACT, 0); }
	public type_or_id(): Type_or_idContext | undefined {
		return this.tryGetRuleContext(0, Type_or_idContext);
	}
	public L_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_PAREN, 0); }
	public parameterList(): ParameterListContext | undefined {
		return this.tryGetRuleContext(0, ParameterListContext);
	}
	public R_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_methodPrototype; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterMethodPrototype) {
			listener.enterMethodPrototype(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitMethodPrototype) {
			listener.exitMethodPrototype(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitMethodPrototype) {
			return visitor.visitMethodPrototype(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeRefContext extends ParserRuleContext {
	public baseType(): BaseTypeContext | undefined {
		return this.tryGetRuleContext(0, BaseTypeContext);
	}
	public typeName(): TypeNameContext | undefined {
		return this.tryGetRuleContext(0, TypeNameContext);
	}
	public specializedType(): SpecializedTypeContext | undefined {
		return this.tryGetRuleContext(0, SpecializedTypeContext);
	}
	public headerStackType(): HeaderStackTypeContext | undefined {
		return this.tryGetRuleContext(0, HeaderStackTypeContext);
	}
	public tupleType(): TupleTypeContext | undefined {
		return this.tryGetRuleContext(0, TupleTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_typeRef; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTypeRef) {
			listener.enterTypeRef(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTypeRef) {
			listener.exitTypeRef(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTypeRef) {
			return visitor.visitTypeRef(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NamedTypeContext extends ParserRuleContext {
	public typeName(): TypeNameContext | undefined {
		return this.tryGetRuleContext(0, TypeNameContext);
	}
	public specializedType(): SpecializedTypeContext | undefined {
		return this.tryGetRuleContext(0, SpecializedTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_namedType; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterNamedType) {
			listener.enterNamedType(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitNamedType) {
			listener.exitNamedType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitNamedType) {
			return visitor.visitNamedType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PrefixedTypeContext extends ParserRuleContext {
	public type_or_id(): Type_or_idContext {
		return this.getRuleContext(0, Type_or_idContext);
	}
	public dotPrefix(): DotPrefixContext | undefined {
		return this.tryGetRuleContext(0, DotPrefixContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_prefixedType; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterPrefixedType) {
			listener.enterPrefixedType(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitPrefixedType) {
			listener.exitPrefixedType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitPrefixedType) {
			return visitor.visitPrefixedType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeNameContext extends ParserRuleContext {
	public prefixedType(): PrefixedTypeContext {
		return this.getRuleContext(0, PrefixedTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_typeName; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTypeName) {
			listener.enterTypeName(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTypeName) {
			listener.exitTypeName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTypeName) {
			return visitor.visitTypeName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TupleTypeContext extends ParserRuleContext {
	public TUPLE(): TerminalNode { return this.getToken(P4Parser.TUPLE, 0); }
	public L_ANGLE(): TerminalNode { return this.getToken(P4Parser.L_ANGLE, 0); }
	public typeArgumentList(): TypeArgumentListContext {
		return this.getRuleContext(0, TypeArgumentListContext);
	}
	public R_ANGLE(): TerminalNode { return this.getToken(P4Parser.R_ANGLE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_tupleType; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTupleType) {
			listener.enterTupleType(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTupleType) {
			listener.exitTupleType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTupleType) {
			return visitor.visitTupleType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class HeaderStackTypeContext extends ParserRuleContext {
	public typeName(): TypeNameContext {
		return this.getRuleContext(0, TypeNameContext);
	}
	public L_BRACKET(): TerminalNode { return this.getToken(P4Parser.L_BRACKET, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public R_BRACKET(): TerminalNode { return this.getToken(P4Parser.R_BRACKET, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_headerStackType; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterHeaderStackType) {
			listener.enterHeaderStackType(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitHeaderStackType) {
			listener.exitHeaderStackType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitHeaderStackType) {
			return visitor.visitHeaderStackType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SpecializedTypeContext extends ParserRuleContext {
	public typeName(): TypeNameContext {
		return this.getRuleContext(0, TypeNameContext);
	}
	public L_ANGLE(): TerminalNode { return this.getToken(P4Parser.L_ANGLE, 0); }
	public typeArgumentList(): TypeArgumentListContext {
		return this.getRuleContext(0, TypeArgumentListContext);
	}
	public R_ANGLE(): TerminalNode { return this.getToken(P4Parser.R_ANGLE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_specializedType; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSpecializedType) {
			listener.enterSpecializedType(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSpecializedType) {
			listener.exitSpecializedType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSpecializedType) {
			return visitor.visitSpecializedType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BaseTypeContext extends ParserRuleContext {
	public BOOL(): TerminalNode | undefined { return this.tryGetToken(P4Parser.BOOL, 0); }
	public ERROR(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ERROR, 0); }
	public BIT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.BIT, 0); }
	public INT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.INT, 0); }
	public L_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_ANGLE, 0); }
	public INTEGER(): TerminalNode | undefined { return this.tryGetToken(P4Parser.INTEGER, 0); }
	public R_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_ANGLE, 0); }
	public VARBIT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.VARBIT, 0); }
	public L_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_PAREN, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public R_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_baseType; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterBaseType) {
			listener.enterBaseType(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitBaseType) {
			listener.exitBaseType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitBaseType) {
			return visitor.visitBaseType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeOrVoidContext extends ParserRuleContext {
	public typeRef(): TypeRefContext | undefined {
		return this.tryGetRuleContext(0, TypeRefContext);
	}
	public VOID(): TerminalNode | undefined { return this.tryGetToken(P4Parser.VOID, 0); }
	public type_or_id(): Type_or_idContext | undefined {
		return this.tryGetRuleContext(0, Type_or_idContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_typeOrVoid; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTypeOrVoid) {
			listener.enterTypeOrVoid(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTypeOrVoid) {
			listener.exitTypeOrVoid(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTypeOrVoid) {
			return visitor.visitTypeOrVoid(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OptTypeParametersContext extends ParserRuleContext {
	public L_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_ANGLE, 0); }
	public typeParameterList(): TypeParameterListContext | undefined {
		return this.tryGetRuleContext(0, TypeParameterListContext);
	}
	public R_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_ANGLE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_optTypeParameters; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterOptTypeParameters) {
			listener.enterOptTypeParameters(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitOptTypeParameters) {
			listener.exitOptTypeParameters(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitOptTypeParameters) {
			return visitor.visitOptTypeParameters(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeParameterListContext extends ParserRuleContext {
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public typeParameterList(): TypeParameterListContext | undefined {
		return this.tryGetRuleContext(0, TypeParameterListContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_typeParameterList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTypeParameterList) {
			listener.enterTypeParameterList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTypeParameterList) {
			listener.exitTypeParameterList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTypeParameterList) {
			return visitor.visitTypeParameterList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeArgContext extends ParserRuleContext {
	public typeRef(): TypeRefContext | undefined {
		return this.tryGetRuleContext(0, TypeRefContext);
	}
	public nonTypeName(): NonTypeNameContext | undefined {
		return this.tryGetRuleContext(0, NonTypeNameContext);
	}
	public VOID(): TerminalNode | undefined { return this.tryGetToken(P4Parser.VOID, 0); }
	public DONTCARE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DONTCARE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_typeArg; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTypeArg) {
			listener.enterTypeArg(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTypeArg) {
			listener.exitTypeArg(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTypeArg) {
			return visitor.visitTypeArg(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeArgumentListContext extends ParserRuleContext {
	public typeArg(): TypeArgContext | undefined {
		return this.tryGetRuleContext(0, TypeArgContext);
	}
	public typeArgumentList(): TypeArgumentListContext | undefined {
		return this.tryGetRuleContext(0, TypeArgumentListContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_typeArgumentList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTypeArgumentList) {
			listener.enterTypeArgumentList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTypeArgumentList) {
			listener.exitTypeArgumentList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTypeArgumentList) {
			return visitor.visitTypeArgumentList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RealTypeArgContext extends ParserRuleContext {
	public typeRef(): TypeRefContext | undefined {
		return this.tryGetRuleContext(0, TypeRefContext);
	}
	public VOID(): TerminalNode | undefined { return this.tryGetToken(P4Parser.VOID, 0); }
	public DONTCARE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DONTCARE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_realTypeArg; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterRealTypeArg) {
			listener.enterRealTypeArg(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitRealTypeArg) {
			listener.exitRealTypeArg(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitRealTypeArg) {
			return visitor.visitRealTypeArg(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RealTypeArgumentListContext extends ParserRuleContext {
	public realTypeArg(): RealTypeArgContext | undefined {
		return this.tryGetRuleContext(0, RealTypeArgContext);
	}
	public realTypeArgumentList(): RealTypeArgumentListContext | undefined {
		return this.tryGetRuleContext(0, RealTypeArgumentListContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMMA, 0); }
	public typeArg(): TypeArgContext | undefined {
		return this.tryGetRuleContext(0, TypeArgContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_realTypeArgumentList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterRealTypeArgumentList) {
			listener.enterRealTypeArgumentList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitRealTypeArgumentList) {
			listener.exitRealTypeArgumentList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitRealTypeArgumentList) {
			return visitor.visitRealTypeArgumentList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeDeclarationContext extends ParserRuleContext {
	public derivedTypeDeclaration(): DerivedTypeDeclarationContext | undefined {
		return this.tryGetRuleContext(0, DerivedTypeDeclarationContext);
	}
	public typedefDeclaration(): TypedefDeclarationContext | undefined {
		return this.tryGetRuleContext(0, TypedefDeclarationContext);
	}
	public SEMICOLON(): TerminalNode | undefined { return this.tryGetToken(P4Parser.SEMICOLON, 0); }
	public parserTypeDeclaration(): ParserTypeDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ParserTypeDeclarationContext);
	}
	public controlTypeDeclaration(): ControlTypeDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ControlTypeDeclarationContext);
	}
	public packageTypeDeclaration(): PackageTypeDeclarationContext | undefined {
		return this.tryGetRuleContext(0, PackageTypeDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_typeDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTypeDeclaration) {
			listener.enterTypeDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTypeDeclaration) {
			listener.exitTypeDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTypeDeclaration) {
			return visitor.visitTypeDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DerivedTypeDeclarationContext extends ParserRuleContext {
	public headerTypeDeclaration(): HeaderTypeDeclarationContext | undefined {
		return this.tryGetRuleContext(0, HeaderTypeDeclarationContext);
	}
	public headerUnionDeclaration(): HeaderUnionDeclarationContext | undefined {
		return this.tryGetRuleContext(0, HeaderUnionDeclarationContext);
	}
	public structTypeDeclaration(): StructTypeDeclarationContext | undefined {
		return this.tryGetRuleContext(0, StructTypeDeclarationContext);
	}
	public enumDeclaration(): EnumDeclarationContext | undefined {
		return this.tryGetRuleContext(0, EnumDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_derivedTypeDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterDerivedTypeDeclaration) {
			listener.enterDerivedTypeDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitDerivedTypeDeclaration) {
			listener.exitDerivedTypeDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitDerivedTypeDeclaration) {
			return visitor.visitDerivedTypeDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class HeaderTypeDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public HEADER(): TerminalNode { return this.getToken(P4Parser.HEADER, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public structFieldList(): StructFieldListContext {
		return this.getRuleContext(0, StructFieldListContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_headerTypeDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterHeaderTypeDeclaration) {
			listener.enterHeaderTypeDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitHeaderTypeDeclaration) {
			listener.exitHeaderTypeDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitHeaderTypeDeclaration) {
			return visitor.visitHeaderTypeDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StructTypeDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public STRUCT(): TerminalNode { return this.getToken(P4Parser.STRUCT, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public structFieldList(): StructFieldListContext {
		return this.getRuleContext(0, StructFieldListContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_structTypeDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterStructTypeDeclaration) {
			listener.enterStructTypeDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitStructTypeDeclaration) {
			listener.exitStructTypeDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitStructTypeDeclaration) {
			return visitor.visitStructTypeDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class HeaderUnionDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public HEADER_UNION(): TerminalNode { return this.getToken(P4Parser.HEADER_UNION, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public structFieldList(): StructFieldListContext {
		return this.getRuleContext(0, StructFieldListContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_headerUnionDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterHeaderUnionDeclaration) {
			listener.enterHeaderUnionDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitHeaderUnionDeclaration) {
			listener.exitHeaderUnionDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitHeaderUnionDeclaration) {
			return visitor.visitHeaderUnionDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StructFieldListContext extends ParserRuleContext {
	public structFieldList(): StructFieldListContext | undefined {
		return this.tryGetRuleContext(0, StructFieldListContext);
	}
	public structField(): StructFieldContext | undefined {
		return this.tryGetRuleContext(0, StructFieldContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_structFieldList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterStructFieldList) {
			listener.enterStructFieldList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitStructFieldList) {
			listener.exitStructFieldList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitStructFieldList) {
			return visitor.visitStructFieldList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StructFieldContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public typeRef(): TypeRefContext {
		return this.getRuleContext(0, TypeRefContext);
	}
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_structField; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterStructField) {
			listener.enterStructField(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitStructField) {
			listener.exitStructField(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitStructField) {
			return visitor.visitStructField(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EnumDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public ENUM(): TerminalNode { return this.getToken(P4Parser.ENUM, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public identifierList(): IdentifierListContext | undefined {
		return this.tryGetRuleContext(0, IdentifierListContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	public BIT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.BIT, 0); }
	public L_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_ANGLE, 0); }
	public INTEGER(): TerminalNode | undefined { return this.tryGetToken(P4Parser.INTEGER, 0); }
	public R_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_ANGLE, 0); }
	public specifiedIdentifierList(): SpecifiedIdentifierListContext | undefined {
		return this.tryGetRuleContext(0, SpecifiedIdentifierListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_enumDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterEnumDeclaration) {
			listener.enterEnumDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitEnumDeclaration) {
			listener.exitEnumDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitEnumDeclaration) {
			return visitor.visitEnumDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SpecifiedIdentifierListContext extends ParserRuleContext {
	public specifiedIdentifier(): SpecifiedIdentifierContext {
		return this.getRuleContext(0, SpecifiedIdentifierContext);
	}
	public specifiedIdentifierList(): SpecifiedIdentifierListContext | undefined {
		return this.tryGetRuleContext(0, SpecifiedIdentifierListContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_specifiedIdentifierList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSpecifiedIdentifierList) {
			listener.enterSpecifiedIdentifierList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSpecifiedIdentifierList) {
			listener.exitSpecifiedIdentifierList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSpecifiedIdentifierList) {
			return visitor.visitSpecifiedIdentifierList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SpecifiedIdentifierContext extends ParserRuleContext {
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public ASSIGN(): TerminalNode { return this.getToken(P4Parser.ASSIGN, 0); }
	public initializer(): InitializerContext {
		return this.getRuleContext(0, InitializerContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_specifiedIdentifier; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSpecifiedIdentifier) {
			listener.enterSpecifiedIdentifier(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSpecifiedIdentifier) {
			listener.exitSpecifiedIdentifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSpecifiedIdentifier) {
			return visitor.visitSpecifiedIdentifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ErrorDeclarationContext extends ParserRuleContext {
	public ERROR(): TerminalNode { return this.getToken(P4Parser.ERROR, 0); }
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public identifierList(): IdentifierListContext {
		return this.getRuleContext(0, IdentifierListContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_errorDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterErrorDeclaration) {
			listener.enterErrorDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitErrorDeclaration) {
			listener.exitErrorDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitErrorDeclaration) {
			return visitor.visitErrorDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MatchKindDeclarationContext extends ParserRuleContext {
	public MATCH_KIND(): TerminalNode { return this.getToken(P4Parser.MATCH_KIND, 0); }
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public identifierList(): IdentifierListContext {
		return this.getRuleContext(0, IdentifierListContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_matchKindDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterMatchKindDeclaration) {
			listener.enterMatchKindDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitMatchKindDeclaration) {
			listener.exitMatchKindDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitMatchKindDeclaration) {
			return visitor.visitMatchKindDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentifierListContext extends ParserRuleContext {
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public identifierList(): IdentifierListContext | undefined {
		return this.tryGetRuleContext(0, IdentifierListContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_identifierList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterIdentifierList) {
			listener.enterIdentifierList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitIdentifierList) {
			listener.exitIdentifierList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitIdentifierList) {
			return visitor.visitIdentifierList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypedefDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public TYPEDEF(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TYPEDEF, 0); }
	public typeRef(): TypeRefContext | undefined {
		return this.tryGetRuleContext(0, TypeRefContext);
	}
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public derivedTypeDeclaration(): DerivedTypeDeclarationContext | undefined {
		return this.tryGetRuleContext(0, DerivedTypeDeclarationContext);
	}
	public TYPE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TYPE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_typedefDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTypedefDeclaration) {
			listener.enterTypedefDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTypedefDeclaration) {
			listener.exitTypedefDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTypedefDeclaration) {
			return visitor.visitTypedefDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AssignmentOrMethodCallStatementContext extends ParserRuleContext {
	public lvalue(): LvalueContext {
		return this.getRuleContext(0, LvalueContext);
	}
	public L_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_PAREN, 0); }
	public argumentList(): ArgumentListContext | undefined {
		return this.tryGetRuleContext(0, ArgumentListContext);
	}
	public R_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_PAREN, 0); }
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	public L_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_ANGLE, 0); }
	public typeArgumentList(): TypeArgumentListContext | undefined {
		return this.tryGetRuleContext(0, TypeArgumentListContext);
	}
	public R_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_ANGLE, 0); }
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ASSIGN, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_assignmentOrMethodCallStatement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterAssignmentOrMethodCallStatement) {
			listener.enterAssignmentOrMethodCallStatement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitAssignmentOrMethodCallStatement) {
			listener.exitAssignmentOrMethodCallStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitAssignmentOrMethodCallStatement) {
			return visitor.visitAssignmentOrMethodCallStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EmptyStatementContext extends ParserRuleContext {
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_emptyStatement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterEmptyStatement) {
			listener.enterEmptyStatement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitEmptyStatement) {
			listener.exitEmptyStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitEmptyStatement) {
			return visitor.visitEmptyStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExitStatementContext extends ParserRuleContext {
	public EXIT(): TerminalNode { return this.getToken(P4Parser.EXIT, 0); }
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_exitStatement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterExitStatement) {
			listener.enterExitStatement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitExitStatement) {
			listener.exitExitStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitExitStatement) {
			return visitor.visitExitStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ReturnStatementContext extends ParserRuleContext {
	public RETURN(): TerminalNode { return this.getToken(P4Parser.RETURN, 0); }
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_returnStatement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterReturnStatement) {
			listener.enterReturnStatement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitReturnStatement) {
			listener.exitReturnStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitReturnStatement) {
			return visitor.visitReturnStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConditionalStatementContext extends ParserRuleContext {
	public IF(): TerminalNode { return this.getToken(P4Parser.IF, 0); }
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	public ELSE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ELSE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_conditionalStatement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterConditionalStatement) {
			listener.enterConditionalStatement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitConditionalStatement) {
			listener.exitConditionalStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitConditionalStatement) {
			return visitor.visitConditionalStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DirectApplicationContext extends ParserRuleContext {
	public typeName(): TypeNameContext {
		return this.getRuleContext(0, TypeNameContext);
	}
	public DOT(): TerminalNode { return this.getToken(P4Parser.DOT, 0); }
	public APPLY(): TerminalNode { return this.getToken(P4Parser.APPLY, 0); }
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public argumentList(): ArgumentListContext {
		return this.getRuleContext(0, ArgumentListContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_directApplication; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterDirectApplication) {
			listener.enterDirectApplication(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitDirectApplication) {
			listener.exitDirectApplication(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitDirectApplication) {
			return visitor.visitDirectApplication(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatementContext extends ParserRuleContext {
	public directApplication(): DirectApplicationContext | undefined {
		return this.tryGetRuleContext(0, DirectApplicationContext);
	}
	public assignmentOrMethodCallStatement(): AssignmentOrMethodCallStatementContext | undefined {
		return this.tryGetRuleContext(0, AssignmentOrMethodCallStatementContext);
	}
	public conditionalStatement(): ConditionalStatementContext | undefined {
		return this.tryGetRuleContext(0, ConditionalStatementContext);
	}
	public emptyStatement(): EmptyStatementContext | undefined {
		return this.tryGetRuleContext(0, EmptyStatementContext);
	}
	public blockStatement(): BlockStatementContext | undefined {
		return this.tryGetRuleContext(0, BlockStatementContext);
	}
	public returnStatement(): ReturnStatementContext | undefined {
		return this.tryGetRuleContext(0, ReturnStatementContext);
	}
	public exitStatement(): ExitStatementContext | undefined {
		return this.tryGetRuleContext(0, ExitStatementContext);
	}
	public switchStatement(): SwitchStatementContext | undefined {
		return this.tryGetRuleContext(0, SwitchStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_statement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterStatement) {
			listener.enterStatement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitStatement) {
			listener.exitStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitStatement) {
			return visitor.visitStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BlockStatementContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public statOrDeclList(): StatOrDeclListContext {
		return this.getRuleContext(0, StatOrDeclListContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_blockStatement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterBlockStatement) {
			listener.enterBlockStatement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitBlockStatement) {
			listener.exitBlockStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitBlockStatement) {
			return visitor.visitBlockStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatOrDeclListContext extends ParserRuleContext {
	public statOrDeclList(): StatOrDeclListContext | undefined {
		return this.tryGetRuleContext(0, StatOrDeclListContext);
	}
	public statementOrDeclaration(): StatementOrDeclarationContext | undefined {
		return this.tryGetRuleContext(0, StatementOrDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_statOrDeclList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterStatOrDeclList) {
			listener.enterStatOrDeclList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitStatOrDeclList) {
			listener.exitStatOrDeclList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitStatOrDeclList) {
			return visitor.visitStatOrDeclList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SwitchStatementContext extends ParserRuleContext {
	public SWITCH(): TerminalNode { return this.getToken(P4Parser.SWITCH, 0); }
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public switchCases(): SwitchCasesContext {
		return this.getRuleContext(0, SwitchCasesContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_switchStatement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSwitchStatement) {
			listener.enterSwitchStatement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSwitchStatement) {
			listener.exitSwitchStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSwitchStatement) {
			return visitor.visitSwitchStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SwitchCasesContext extends ParserRuleContext {
	public switchCases(): SwitchCasesContext | undefined {
		return this.tryGetRuleContext(0, SwitchCasesContext);
	}
	public switchCase(): SwitchCaseContext | undefined {
		return this.tryGetRuleContext(0, SwitchCaseContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_switchCases; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSwitchCases) {
			listener.enterSwitchCases(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSwitchCases) {
			listener.exitSwitchCases(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSwitchCases) {
			return visitor.visitSwitchCases(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SwitchCaseContext extends ParserRuleContext {
	public switchLabel(): SwitchLabelContext {
		return this.getRuleContext(0, SwitchLabelContext);
	}
	public COLON(): TerminalNode { return this.getToken(P4Parser.COLON, 0); }
	public blockStatement(): BlockStatementContext | undefined {
		return this.tryGetRuleContext(0, BlockStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_switchCase; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSwitchCase) {
			listener.enterSwitchCase(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSwitchCase) {
			listener.exitSwitchCase(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSwitchCase) {
			return visitor.visitSwitchCase(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SwitchLabelContext extends ParserRuleContext {
	public name(): NameContext | undefined {
		return this.tryGetRuleContext(0, NameContext);
	}
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DEFAULT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_switchLabel; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterSwitchLabel) {
			listener.enterSwitchLabel(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitSwitchLabel) {
			listener.exitSwitchLabel(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitSwitchLabel) {
			return visitor.visitSwitchLabel(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatementOrDeclarationContext extends ParserRuleContext {
	public variableDeclaration(): VariableDeclarationContext | undefined {
		return this.tryGetRuleContext(0, VariableDeclarationContext);
	}
	public constantDeclaration(): ConstantDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ConstantDeclarationContext);
	}
	public statement(): StatementContext | undefined {
		return this.tryGetRuleContext(0, StatementContext);
	}
	public instantiation(): InstantiationContext | undefined {
		return this.tryGetRuleContext(0, InstantiationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_statementOrDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterStatementOrDeclaration) {
			listener.enterStatementOrDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitStatementOrDeclaration) {
			listener.exitStatementOrDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitStatementOrDeclaration) {
			return visitor.visitStatementOrDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TableDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public TABLE(): TerminalNode { return this.getToken(P4Parser.TABLE, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public L_BRACE(): TerminalNode { return this.getToken(P4Parser.L_BRACE, 0); }
	public tablePropertyList(): TablePropertyListContext {
		return this.getRuleContext(0, TablePropertyListContext);
	}
	public R_BRACE(): TerminalNode { return this.getToken(P4Parser.R_BRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_tableDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTableDeclaration) {
			listener.enterTableDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTableDeclaration) {
			listener.exitTableDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTableDeclaration) {
			return visitor.visitTableDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TablePropertyListContext extends ParserRuleContext {
	public tableProperty(): TablePropertyContext {
		return this.getRuleContext(0, TablePropertyContext);
	}
	public tablePropertyList(): TablePropertyListContext | undefined {
		return this.tryGetRuleContext(0, TablePropertyListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_tablePropertyList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTablePropertyList) {
			listener.enterTablePropertyList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTablePropertyList) {
			listener.exitTablePropertyList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTablePropertyList) {
			return visitor.visitTablePropertyList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TablePropertyContext extends ParserRuleContext {
	public KEY(): TerminalNode | undefined { return this.tryGetToken(P4Parser.KEY, 0); }
	public ASSIGN(): TerminalNode { return this.getToken(P4Parser.ASSIGN, 0); }
	public L_BRACE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_BRACE, 0); }
	public keyElementList(): KeyElementListContext | undefined {
		return this.tryGetRuleContext(0, KeyElementListContext);
	}
	public R_BRACE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_BRACE, 0); }
	public ACTIONS(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ACTIONS, 0); }
	public actionList(): ActionListContext | undefined {
		return this.tryGetRuleContext(0, ActionListContext);
	}
	public optAnnotations(): OptAnnotationsContext | undefined {
		return this.tryGetRuleContext(0, OptAnnotationsContext);
	}
	public optCONST(): OptCONSTContext | undefined {
		return this.tryGetRuleContext(0, OptCONSTContext);
	}
	public ENTRIES(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ENTRIES, 0); }
	public entriesList(): EntriesListContext | undefined {
		return this.tryGetRuleContext(0, EntriesListContext);
	}
	public nonTableKwName(): NonTableKwNameContext | undefined {
		return this.tryGetRuleContext(0, NonTableKwNameContext);
	}
	public initializer(): InitializerContext | undefined {
		return this.tryGetRuleContext(0, InitializerContext);
	}
	public SEMICOLON(): TerminalNode | undefined { return this.tryGetToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_tableProperty; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterTableProperty) {
			listener.enterTableProperty(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitTableProperty) {
			listener.exitTableProperty(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitTableProperty) {
			return visitor.visitTableProperty(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KeyElementListContext extends ParserRuleContext {
	public keyElementList(): KeyElementListContext | undefined {
		return this.tryGetRuleContext(0, KeyElementListContext);
	}
	public keyElement(): KeyElementContext | undefined {
		return this.tryGetRuleContext(0, KeyElementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_keyElementList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterKeyElementList) {
			listener.enterKeyElementList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitKeyElementList) {
			listener.exitKeyElementList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitKeyElementList) {
			return visitor.visitKeyElementList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KeyElementContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public COLON(): TerminalNode { return this.getToken(P4Parser.COLON, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_keyElement; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterKeyElement) {
			listener.enterKeyElement(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitKeyElement) {
			listener.exitKeyElement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitKeyElement) {
			return visitor.visitKeyElement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ActionListContext extends ParserRuleContext {
	public actionList(): ActionListContext | undefined {
		return this.tryGetRuleContext(0, ActionListContext);
	}
	public actionRef(): ActionRefContext | undefined {
		return this.tryGetRuleContext(0, ActionRefContext);
	}
	public SEMICOLON(): TerminalNode | undefined { return this.tryGetToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_actionList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterActionList) {
			listener.enterActionList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitActionList) {
			listener.exitActionList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitActionList) {
			return visitor.visitActionList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ActionRefContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public L_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_PAREN, 0); }
	public argumentList(): ArgumentListContext | undefined {
		return this.tryGetRuleContext(0, ArgumentListContext);
	}
	public R_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_actionRef; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterActionRef) {
			listener.enterActionRef(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitActionRef) {
			listener.exitActionRef(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitActionRef) {
			return visitor.visitActionRef(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EntryContext extends ParserRuleContext {
	public keysetExpression(): KeysetExpressionContext {
		return this.getRuleContext(0, KeysetExpressionContext);
	}
	public COLON(): TerminalNode { return this.getToken(P4Parser.COLON, 0); }
	public actionBinding(): ActionBindingContext {
		return this.getRuleContext(0, ActionBindingContext);
	}
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_entry; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterEntry) {
			listener.enterEntry(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitEntry) {
			listener.exitEntry(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitEntry) {
			return visitor.visitEntry(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ActionBindingContext extends ParserRuleContext {
	public lvalue(): LvalueContext {
		return this.getRuleContext(0, LvalueContext);
	}
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public argumentList(): ArgumentListContext {
		return this.getRuleContext(0, ArgumentListContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	public L_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_ANGLE, 0); }
	public typeArgumentList(): TypeArgumentListContext | undefined {
		return this.tryGetRuleContext(0, TypeArgumentListContext);
	}
	public R_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_ANGLE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_actionBinding; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterActionBinding) {
			listener.enterActionBinding(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitActionBinding) {
			listener.exitActionBinding(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitActionBinding) {
			return visitor.visitActionBinding(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EntriesListContext extends ParserRuleContext {
	public entry(): EntryContext {
		return this.getRuleContext(0, EntryContext);
	}
	public entriesList(): EntriesListContext | undefined {
		return this.tryGetRuleContext(0, EntriesListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_entriesList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterEntriesList) {
			listener.enterEntriesList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitEntriesList) {
			listener.exitEntriesList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitEntriesList) {
			return visitor.visitEntriesList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ActionDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public ACTION(): TerminalNode { return this.getToken(P4Parser.ACTION, 0); }
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public L_PAREN(): TerminalNode { return this.getToken(P4Parser.L_PAREN, 0); }
	public parameterList(): ParameterListContext {
		return this.getRuleContext(0, ParameterListContext);
	}
	public R_PAREN(): TerminalNode { return this.getToken(P4Parser.R_PAREN, 0); }
	public blockStatement(): BlockStatementContext {
		return this.getRuleContext(0, BlockStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_actionDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterActionDeclaration) {
			listener.enterActionDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitActionDeclaration) {
			listener.exitActionDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitActionDeclaration) {
			return visitor.visitActionDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableDeclarationContext extends ParserRuleContext {
	public annotations(): AnnotationsContext | undefined {
		return this.tryGetRuleContext(0, AnnotationsContext);
	}
	public typeRef(): TypeRefContext {
		return this.getRuleContext(0, TypeRefContext);
	}
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public optInitializer(): OptInitializerContext {
		return this.getRuleContext(0, OptInitializerContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_variableDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterVariableDeclaration) {
			listener.enterVariableDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitVariableDeclaration) {
			listener.exitVariableDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitVariableDeclaration) {
			return visitor.visitVariableDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstantDeclarationContext extends ParserRuleContext {
	public optAnnotations(): OptAnnotationsContext {
		return this.getRuleContext(0, OptAnnotationsContext);
	}
	public CONST(): TerminalNode { return this.getToken(P4Parser.CONST, 0); }
	public typeRef(): TypeRefContext {
		return this.getRuleContext(0, TypeRefContext);
	}
	public name(): NameContext {
		return this.getRuleContext(0, NameContext);
	}
	public ASSIGN(): TerminalNode { return this.getToken(P4Parser.ASSIGN, 0); }
	public initializer(): InitializerContext {
		return this.getRuleContext(0, InitializerContext);
	}
	public SEMICOLON(): TerminalNode { return this.getToken(P4Parser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_constantDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterConstantDeclaration) {
			listener.enterConstantDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitConstantDeclaration) {
			listener.exitConstantDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitConstantDeclaration) {
			return visitor.visitConstantDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OptInitializerContext extends ParserRuleContext {
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ASSIGN, 0); }
	public initializer(): InitializerContext | undefined {
		return this.tryGetRuleContext(0, InitializerContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_optInitializer; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterOptInitializer) {
			listener.enterOptInitializer(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitOptInitializer) {
			listener.exitOptInitializer(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitOptInitializer) {
			return visitor.visitOptInitializer(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InitializerContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_initializer; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterInitializer) {
			listener.enterInitializer(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitInitializer) {
			listener.exitInitializer(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitInitializer) {
			return visitor.visitInitializer(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionDeclarationContext extends ParserRuleContext {
	public functionPrototype(): FunctionPrototypeContext {
		return this.getRuleContext(0, FunctionPrototypeContext);
	}
	public blockStatement(): BlockStatementContext {
		return this.getRuleContext(0, BlockStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_functionDeclaration; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterFunctionDeclaration) {
			listener.enterFunctionDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitFunctionDeclaration) {
			listener.exitFunctionDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitFunctionDeclaration) {
			return visitor.visitFunctionDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ArgumentListContext extends ParserRuleContext {
	public nonEmptyArgList(): NonEmptyArgListContext | undefined {
		return this.tryGetRuleContext(0, NonEmptyArgListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_argumentList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterArgumentList) {
			listener.enterArgumentList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitArgumentList) {
			listener.exitArgumentList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitArgumentList) {
			return visitor.visitArgumentList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NonEmptyArgListContext extends ParserRuleContext {
	public argument(): ArgumentContext {
		return this.getRuleContext(0, ArgumentContext);
	}
	public nonEmptyArgList(): NonEmptyArgListContext | undefined {
		return this.tryGetRuleContext(0, NonEmptyArgListContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_nonEmptyArgList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterNonEmptyArgList) {
			listener.enterNonEmptyArgList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitNonEmptyArgList) {
			listener.exitNonEmptyArgList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitNonEmptyArgList) {
			return visitor.visitNonEmptyArgList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ArgumentContext extends ParserRuleContext {
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public name(): NameContext | undefined {
		return this.tryGetRuleContext(0, NameContext);
	}
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ASSIGN, 0); }
	public DONTCARE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DONTCARE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_argument; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterArgument) {
			listener.enterArgument(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitArgument) {
			listener.exitArgument(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitArgument) {
			return visitor.visitArgument(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionListContext extends ParserRuleContext {
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public expressionList(): ExpressionListContext | undefined {
		return this.tryGetRuleContext(0, ExpressionListContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_expressionList; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterExpressionList) {
			listener.enterExpressionList(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitExpressionList) {
			listener.exitExpressionList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitExpressionList) {
			return visitor.visitExpressionList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PrefixedNonTypeNameContext extends ParserRuleContext {
	public nonTypeName(): NonTypeNameContext {
		return this.getRuleContext(0, NonTypeNameContext);
	}
	public dotPrefix(): DotPrefixContext | undefined {
		return this.tryGetRuleContext(0, DotPrefixContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_prefixedNonTypeName; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterPrefixedNonTypeName) {
			listener.enterPrefixedNonTypeName(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitPrefixedNonTypeName) {
			listener.exitPrefixedNonTypeName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitPrefixedNonTypeName) {
			return visitor.visitPrefixedNonTypeName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LvalueContext extends ParserRuleContext {
	public prefixedNonTypeName(): PrefixedNonTypeNameContext | undefined {
		return this.tryGetRuleContext(0, PrefixedNonTypeNameContext);
	}
	public THIS(): TerminalNode | undefined { return this.tryGetToken(P4Parser.THIS, 0); }
	public lvalue(): LvalueContext | undefined {
		return this.tryGetRuleContext(0, LvalueContext);
	}
	public DOT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DOT, 0); }
	public name(): NameContext | undefined {
		return this.tryGetRuleContext(0, NameContext);
	}
	public L_BRACKET(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_BRACKET, 0); }
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public R_BRACKET(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_BRACKET, 0); }
	public COLON(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_lvalue; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterLvalue) {
			listener.enterLvalue(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitLvalue) {
			listener.exitLvalue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitLvalue) {
			return visitor.visitLvalue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionContext extends ParserRuleContext {
	public INTEGER(): TerminalNode | undefined { return this.tryGetToken(P4Parser.INTEGER, 0); }
	public STRING_LITERAL(): TerminalNode | undefined { return this.tryGetToken(P4Parser.STRING_LITERAL, 0); }
	public TRUE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TRUE, 0); }
	public FALSE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.FALSE, 0); }
	public THIS(): TerminalNode | undefined { return this.tryGetToken(P4Parser.THIS, 0); }
	public nonTypeName(): NonTypeNameContext | undefined {
		return this.tryGetRuleContext(0, NonTypeNameContext);
	}
	public dotPrefix(): DotPrefixContext | undefined {
		return this.tryGetRuleContext(0, DotPrefixContext);
	}
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public L_BRACKET(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_BRACKET, 0); }
	public R_BRACKET(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_BRACKET, 0); }
	public COLON(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COLON, 0); }
	public L_BRACE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_BRACE, 0); }
	public expressionList(): ExpressionListContext | undefined {
		return this.tryGetRuleContext(0, ExpressionListContext);
	}
	public R_BRACE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_BRACE, 0); }
	public L_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_PAREN, 0); }
	public R_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_PAREN, 0); }
	public NOT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.NOT, 0); }
	public COMPLEMENT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.COMPLEMENT, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(P4Parser.MINUS, 0); }
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PLUS, 0); }
	public typeName(): TypeNameContext | undefined {
		return this.tryGetRuleContext(0, TypeNameContext);
	}
	public DOT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DOT, 0); }
	public name(): NameContext | undefined {
		return this.tryGetRuleContext(0, NameContext);
	}
	public ERROR(): TerminalNode | undefined { return this.tryGetToken(P4Parser.ERROR, 0); }
	public MUL(): TerminalNode | undefined { return this.tryGetToken(P4Parser.MUL, 0); }
	public DIV(): TerminalNode | undefined { return this.tryGetToken(P4Parser.DIV, 0); }
	public MOD(): TerminalNode | undefined { return this.tryGetToken(P4Parser.MOD, 0); }
	public PLUS_SAT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PLUS_SAT, 0); }
	public MINUS_SAT(): TerminalNode | undefined { return this.tryGetToken(P4Parser.MINUS_SAT, 0); }
	public SHL(): TerminalNode | undefined { return this.tryGetToken(P4Parser.SHL, 0); }
	public R_ANGLE(): TerminalNode[];
	public R_ANGLE(i: number): TerminalNode;
	public R_ANGLE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(P4Parser.R_ANGLE);
		} else {
			return this.getToken(P4Parser.R_ANGLE, i);
		}
	}
	public LE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.LE, 0); }
	public GE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.GE, 0); }
	public L_ANGLE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_ANGLE, 0); }
	public NE(): TerminalNode | undefined { return this.tryGetToken(P4Parser.NE, 0); }
	public EQ(): TerminalNode | undefined { return this.tryGetToken(P4Parser.EQ, 0); }
	public BIT_AND(): TerminalNode | undefined { return this.tryGetToken(P4Parser.BIT_AND, 0); }
	public BIT_XOR(): TerminalNode | undefined { return this.tryGetToken(P4Parser.BIT_XOR, 0); }
	public BIT_OR(): TerminalNode | undefined { return this.tryGetToken(P4Parser.BIT_OR, 0); }
	public PP(): TerminalNode | undefined { return this.tryGetToken(P4Parser.PP, 0); }
	public AND(): TerminalNode | undefined { return this.tryGetToken(P4Parser.AND, 0); }
	public OR(): TerminalNode | undefined { return this.tryGetToken(P4Parser.OR, 0); }
	public QUESTION(): TerminalNode | undefined { return this.tryGetToken(P4Parser.QUESTION, 0); }
	public realTypeArgumentList(): RealTypeArgumentListContext | undefined {
		return this.tryGetRuleContext(0, RealTypeArgumentListContext);
	}
	public argumentList(): ArgumentListContext | undefined {
		return this.tryGetRuleContext(0, ArgumentListContext);
	}
	public namedType(): NamedTypeContext | undefined {
		return this.tryGetRuleContext(0, NamedTypeContext);
	}
	public typeRef(): TypeRefContext | undefined {
		return this.tryGetRuleContext(0, TypeRefContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_expression; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterExpression) {
			listener.enterExpression(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitExpression) {
			listener.exitExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitExpression) {
			return visitor.visitExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Type_or_idContext extends ParserRuleContext {
	public IDENTIFIER(): TerminalNode | undefined { return this.tryGetToken(P4Parser.IDENTIFIER, 0); }
	public TYPE_IDENTIFIER(): TerminalNode | undefined { return this.tryGetToken(P4Parser.TYPE_IDENTIFIER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_type_or_id; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterType_or_id) {
			listener.enterType_or_id(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitType_or_id) {
			listener.exitType_or_id(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitType_or_id) {
			return visitor.visitType_or_id(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParserStateConditionContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public EQ(): TerminalNode | undefined { return this.tryGetToken(P4Parser.EQ, 0); }
	public keysetExpression(): KeysetExpressionContext | undefined {
		return this.tryGetRuleContext(0, KeysetExpressionContext);
	}
	public L_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.L_PAREN, 0); }
	public R_PAREN(): TerminalNode | undefined { return this.tryGetToken(P4Parser.R_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return P4Parser.RULE_parserStateCondition; }
	// @Override
	public enterRule(listener: P4Listener): void {
		if (listener.enterParserStateCondition) {
			listener.enterParserStateCondition(this);
		}
	}
	// @Override
	public exitRule(listener: P4Listener): void {
		if (listener.exitParserStateCondition) {
			listener.exitParserStateCondition(this);
		}
	}
	// @Override
	public accept<Result>(visitor: P4Visitor<Result>): Result {
		if (visitor.visitParserStateCondition) {
			return visitor.visitParserStateCondition(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


