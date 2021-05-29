// Generated from /home/hank/vscode-extension/p4-lang/src/grammar/P4.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class P4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PRAGMA=3, ABSTRACT=4, ACTION=5, ACTIONS=6, APPLY=7, BOOL=8, 
		BIT=9, CONST=10, CONTROL=11, DEFAULT=12, DEFAULT_ACTION=13, ELSE=14, ENTRIES=15, 
		ENUM=16, ERROR=17, EXIT=18, EXTERN=19, FALSE=20, HEADER=21, HEADER_UNION=22, 
		IF=23, IN=24, INOUT=25, INT=26, KEY=27, MAIN=28, MATCH_KIND=29, TYPE=30, 
		OUT=31, PARSER=32, PACKAGE=33, RETURN=34, SELECT=35, STATE=36, MEGA_STATE=37, 
		STRUCT=38, SWITCH=39, TABLE=40, THIS=41, TRANSITION=42, TRUE=43, TUPLE=44, 
		TYPEDEF=45, VARBIT=46, VALUESET=47, VOID=48, DONTCARE=49, MASK=50, RANGE=51, 
		SHL=52, AND=53, OR=54, EQ=55, NE=56, GE=57, LE=58, PP=59, PLUS=60, PLUS_SAT=61, 
		MINUS=62, MINUS_SAT=63, MUL=64, DIV=65, MOD=66, BIT_OR=67, BIT_AND=68, 
		BIT_XOR=69, COMPLEMENT=70, L_PAREN=71, R_PAREN=72, L_BRACKET=73, R_BRACKET=74, 
		L_BRACE=75, R_BRACE=76, L_ANGLE=77, R_ANGLE=78, NOT=79, COLON=80, COMMA=81, 
		QUESTION=82, DOT=83, ASSIGN=84, SEMICOLON=85, AT=86, UNEXPECTED_TOKEN=87, 
		WS=88, COMMENT=89, LINE_COMMENT=90, STRING_LITERAL=91, PREPROC_INCLUDE=92, 
		PREPROC_DEFINE=93, PREPROC_UNDEF=94, PREPROC_IFDEF=95, PREPROC_IFNDEF=96, 
		PREPROC_ELSEIF=97, PREPROC_ENDIF=98, PREPROC_LINE=99, PREPROC_IF=100, 
		PREPROC_ELSE=101, PREPROC_ARG=102, IDENTIFIER=103, TYPE_IDENTIFIER=104, 
		INTEGER=105;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_input = 2, RULE_declaration = 3, 
		RULE_preprocessorLine = 4, RULE_ppIncludeFileName = 5, RULE_nonTypeName = 6, 
		RULE_name = 7, RULE_nonTableKwName = 8, RULE_optCONST = 9, RULE_optAnnotations = 10, 
		RULE_annotations = 11, RULE_annotation = 12, RULE_annotationBody = 13, 
		RULE_annotationToken = 14, RULE_kvList = 15, RULE_kvPair = 16, RULE_parameterList = 17, 
		RULE_nonEmptyParameterList = 18, RULE_parameter = 19, RULE_direction = 20, 
		RULE_packageTypeDeclaration = 21, RULE_instantiation = 22, RULE_objInitializer = 23, 
		RULE_objDeclarations = 24, RULE_objDeclaration = 25, RULE_optConstructorParameters = 26, 
		RULE_dotPrefix = 27, RULE_parserDeclaration = 28, RULE_parserLocalElements = 29, 
		RULE_parserLocalElement = 30, RULE_parserTypeDeclaration = 31, RULE_parserStates = 32, 
		RULE_parserState = 33, RULE_parserStatements = 34, RULE_parserStatement = 35, 
		RULE_parserBlockStatement = 36, RULE_transitionStatement = 37, RULE_stateExpression = 38, 
		RULE_selectExpression = 39, RULE_selectCaseList = 40, RULE_selectCase = 41, 
		RULE_keysetExpression = 42, RULE_tupleKeysetExpression = 43, RULE_simpleExpressionList = 44, 
		RULE_simpleKeysetExpression = 45, RULE_valueSetDeclaration = 46, RULE_controlDeclaration = 47, 
		RULE_controlTypeDeclaration = 48, RULE_controlLocalDeclarations = 49, 
		RULE_controlLocalDeclaration = 50, RULE_controlBody = 51, RULE_externDeclaration = 52, 
		RULE_methodPrototypes = 53, RULE_functionPrototype = 54, RULE_methodPrototype = 55, 
		RULE_typeRef = 56, RULE_namedType = 57, RULE_prefixedType = 58, RULE_typeName = 59, 
		RULE_tupleType = 60, RULE_headerStackType = 61, RULE_specializedType = 62, 
		RULE_baseType = 63, RULE_typeOrVoid = 64, RULE_optTypeParameters = 65, 
		RULE_typeParameterList = 66, RULE_typeArg = 67, RULE_typeArgumentList = 68, 
		RULE_realTypeArg = 69, RULE_realTypeArgumentList = 70, RULE_typeDeclaration = 71, 
		RULE_derivedTypeDeclaration = 72, RULE_headerTypeDeclaration = 73, RULE_structTypeDeclaration = 74, 
		RULE_headerUnionDeclaration = 75, RULE_structFieldList = 76, RULE_structField = 77, 
		RULE_enumDeclaration = 78, RULE_specifiedIdentifierList = 79, RULE_specifiedIdentifier = 80, 
		RULE_errorDeclaration = 81, RULE_matchKindDeclaration = 82, RULE_identifierList = 83, 
		RULE_typedefDeclaration = 84, RULE_methodCall = 85, RULE_assignmentOrMethodCallStatement = 86, 
		RULE_emptyStatement = 87, RULE_exitStatement = 88, RULE_returnStatement = 89, 
		RULE_conditionalStatement = 90, RULE_directApplication = 91, RULE_statement = 92, 
		RULE_blockStatement = 93, RULE_statOrDeclList = 94, RULE_switchStatement = 95, 
		RULE_switchCases = 96, RULE_switchCase = 97, RULE_switchLabel = 98, RULE_statementOrDeclaration = 99, 
		RULE_tableDeclaration = 100, RULE_tablePropertyList = 101, RULE_tableProperty = 102, 
		RULE_keyElementList = 103, RULE_keyElement = 104, RULE_actionList = 105, 
		RULE_actionRef = 106, RULE_entry = 107, RULE_actionBinding = 108, RULE_entriesList = 109, 
		RULE_actionDeclaration = 110, RULE_variableDeclaration = 111, RULE_constantDeclaration = 112, 
		RULE_optInitializer = 113, RULE_initializer = 114, RULE_functionDeclaration = 115, 
		RULE_argumentList = 116, RULE_nonEmptyArgList = 117, RULE_argument = 118, 
		RULE_expressionList = 119, RULE_prefixedNonTypeName = 120, RULE_lvalue = 121, 
		RULE_expression = 122, RULE_type_or_id = 123, RULE_parserStateCondition = 124;
	private static String[] makeRuleNames() {
		return new String[] {
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
			"typedefDeclaration", "methodCall", "assignmentOrMethodCallStatement", 
			"emptyStatement", "exitStatement", "returnStatement", "conditionalStatement", 
			"directApplication", "statement", "blockStatement", "statOrDeclList", 
			"switchStatement", "switchCases", "switchCase", "switchLabel", "statementOrDeclaration", 
			"tableDeclaration", "tablePropertyList", "tableProperty", "keyElementList", 
			"keyElement", "actionList", "actionRef", "entry", "actionBinding", "entriesList", 
			"actionDeclaration", "variableDeclaration", "constantDeclaration", "optInitializer", 
			"initializer", "functionDeclaration", "argumentList", "nonEmptyArgList", 
			"argument", "expressionList", "prefixedNonTypeName", "lvalue", "expression", 
			"type_or_id", "parserStateCondition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'./'", "'../'", "'@pragma'", "'abstract'", "'action'", "'actions'", 
			"'apply'", "'bool'", "'bit'", "'const'", "'control'", "'default'", "'default_action'", 
			"'else'", "'entries'", "'enum'", "'error'", "'exit'", "'extern'", "'false'", 
			"'header'", "'header_union'", "'if'", "'in'", "'inout'", "'int'", "'key'", 
			"'main'", "'match_kind'", "'type'", "'out'", "'parser'", "'package'", 
			"'return'", "'select'", "'state'", "'mega_state'", "'struct'", "'switch'", 
			"'table'", "'this'", "'transition'", "'true'", "'tuple'", "'typedef'", 
			"'varbit'", "'value_set'", "'void'", "'_'", "'&&&'", "'..'", "'<<'", 
			"'&&'", "'||'", "'=='", "'!='", "'>='", "'<='", "'++'", "'+'", "'|+|'", 
			"'-'", "'|-|'", "'*'", "'/'", "'%'", "'|'", "'&'", "'^'", "'~'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'!'", "':'", "','", 
			"'?'", "'.'", "'='", "';'", "'@'", "'<*>.|\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PRAGMA", "ABSTRACT", "ACTION", "ACTIONS", "APPLY", 
			"BOOL", "BIT", "CONST", "CONTROL", "DEFAULT", "DEFAULT_ACTION", "ELSE", 
			"ENTRIES", "ENUM", "ERROR", "EXIT", "EXTERN", "FALSE", "HEADER", "HEADER_UNION", 
			"IF", "IN", "INOUT", "INT", "KEY", "MAIN", "MATCH_KIND", "TYPE", "OUT", 
			"PARSER", "PACKAGE", "RETURN", "SELECT", "STATE", "MEGA_STATE", "STRUCT", 
			"SWITCH", "TABLE", "THIS", "TRANSITION", "TRUE", "TUPLE", "TYPEDEF", 
			"VARBIT", "VALUESET", "VOID", "DONTCARE", "MASK", "RANGE", "SHL", "AND", 
			"OR", "EQ", "NE", "GE", "LE", "PP", "PLUS", "PLUS_SAT", "MINUS", "MINUS_SAT", 
			"MUL", "DIV", "MOD", "BIT_OR", "BIT_AND", "BIT_XOR", "COMPLEMENT", "L_PAREN", 
			"R_PAREN", "L_BRACKET", "R_BRACKET", "L_BRACE", "R_BRACE", "L_ANGLE", 
			"R_ANGLE", "NOT", "COLON", "COMMA", "QUESTION", "DOT", "ASSIGN", "SEMICOLON", 
			"AT", "UNEXPECTED_TOKEN", "WS", "COMMENT", "LINE_COMMENT", "STRING_LITERAL", 
			"PREPROC_INCLUDE", "PREPROC_DEFINE", "PREPROC_UNDEF", "PREPROC_IFDEF", 
			"PREPROC_IFNDEF", "PREPROC_ELSEIF", "PREPROC_ENDIF", "PREPROC_LINE", 
			"PREPROC_IF", "PREPROC_ELSE", "PREPROC_ARG", "IDENTIFIER", "TYPE_IDENTIFIER", 
			"INTEGER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "P4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public P4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			input(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		return input(0);
	}

	private InputContext input(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InputContext _localctx = new InputContext(_ctx, _parentState);
		InputContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_input, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new InputContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_input);
						setState(255);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(256);
						declaration();
						}
						break;
					case 2:
						{
						_localctx = new InputContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_input);
						setState(257);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(258);
						match(SEMICOLON);
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ExternDeclarationContext externDeclaration() {
			return getRuleContext(ExternDeclarationContext.class,0);
		}
		public ActionDeclarationContext actionDeclaration() {
			return getRuleContext(ActionDeclarationContext.class,0);
		}
		public ParserDeclarationContext parserDeclaration() {
			return getRuleContext(ParserDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public ControlDeclarationContext controlDeclaration() {
			return getRuleContext(ControlDeclarationContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public ErrorDeclarationContext errorDeclaration() {
			return getRuleContext(ErrorDeclarationContext.class,0);
		}
		public MatchKindDeclarationContext matchKindDeclaration() {
			return getRuleContext(MatchKindDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PreprocessorLineContext preprocessorLine() {
			return getRuleContext(PreprocessorLineContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				externDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				actionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				parserDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				typeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				controlDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				instantiation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				errorDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				matchKindDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(273);
				functionDeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(274);
				preprocessorLine();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreprocessorLineContext extends ParserRuleContext {
		public TerminalNode PREPROC_INCLUDE() { return getToken(P4Parser.PREPROC_INCLUDE, 0); }
		public PpIncludeFileNameContext ppIncludeFileName() {
			return getRuleContext(PpIncludeFileNameContext.class,0);
		}
		public TerminalNode PREPROC_DEFINE() { return getToken(P4Parser.PREPROC_DEFINE, 0); }
		public Type_or_idContext type_or_id() {
			return getRuleContext(Type_or_idContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PREPROC_UNDEF() { return getToken(P4Parser.PREPROC_UNDEF, 0); }
		public TerminalNode PREPROC_LINE() { return getToken(P4Parser.PREPROC_LINE, 0); }
		public TerminalNode PREPROC_IFDEF() { return getToken(P4Parser.PREPROC_IFDEF, 0); }
		public TerminalNode PREPROC_IFNDEF() { return getToken(P4Parser.PREPROC_IFNDEF, 0); }
		public TerminalNode PREPROC_IF() { return getToken(P4Parser.PREPROC_IF, 0); }
		public TerminalNode PREPROC_ELSEIF() { return getToken(P4Parser.PREPROC_ELSEIF, 0); }
		public TerminalNode PREPROC_ELSE() { return getToken(P4Parser.PREPROC_ELSE, 0); }
		public TerminalNode PREPROC_ENDIF() { return getToken(P4Parser.PREPROC_ENDIF, 0); }
		public PreprocessorLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessorLine; }
	}

	public final PreprocessorLineContext preprocessorLine() throws RecognitionException {
		PreprocessorLineContext _localctx = new PreprocessorLineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_preprocessorLine);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(PREPROC_INCLUDE);
				setState(278);
				ppIncludeFileName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(PREPROC_DEFINE);
				setState(280);
				type_or_id();
				setState(281);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(PREPROC_DEFINE);
				setState(284);
				type_or_id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(PREPROC_DEFINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(PREPROC_UNDEF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(PREPROC_LINE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				match(PREPROC_IFDEF);
				setState(289);
				type_or_id();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				match(PREPROC_IFDEF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(291);
				match(PREPROC_IFNDEF);
				setState(292);
				type_or_id();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(293);
				match(PREPROC_IFNDEF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(294);
				match(PREPROC_IF);
				setState(295);
				expression(0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(296);
				match(PREPROC_ELSEIF);
				setState(297);
				expression(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(298);
				match(PREPROC_ELSE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(299);
				match(PREPROC_ENDIF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PpIncludeFileNameContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(P4Parser.STRING_LITERAL, 0); }
		public TerminalNode L_ANGLE() { return getToken(P4Parser.L_ANGLE, 0); }
		public PpIncludeFileNameContext ppIncludeFileName() {
			return getRuleContext(PpIncludeFileNameContext.class,0);
		}
		public TerminalNode R_ANGLE() { return getToken(P4Parser.R_ANGLE, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode DOT() { return getToken(P4Parser.DOT, 0); }
		public TerminalNode DIV() { return getToken(P4Parser.DIV, 0); }
		public PpIncludeFileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ppIncludeFileName; }
	}

	public final PpIncludeFileNameContext ppIncludeFileName() throws RecognitionException {
		PpIncludeFileNameContext _localctx = new PpIncludeFileNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ppIncludeFileName);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(L_ANGLE);
				setState(304);
				ppIncludeFileName();
				setState(305);
				match(R_ANGLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				name();
				setState(309);
				match(DOT);
				setState(310);
				name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				match(T__0);
				setState(313);
				ppIncludeFileName();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				match(T__1);
				setState(315);
				ppIncludeFileName();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(316);
				match(DIV);
				setState(317);
				ppIncludeFileName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonTypeNameContext extends ParserRuleContext {
		public Type_or_idContext type_or_id() {
			return getRuleContext(Type_or_idContext.class,0);
		}
		public TerminalNode APPLY() { return getToken(P4Parser.APPLY, 0); }
		public TerminalNode KEY() { return getToken(P4Parser.KEY, 0); }
		public TerminalNode ACTIONS() { return getToken(P4Parser.ACTIONS, 0); }
		public TerminalNode STATE() { return getToken(P4Parser.STATE, 0); }
		public TerminalNode ENTRIES() { return getToken(P4Parser.ENTRIES, 0); }
		public TerminalNode TYPE() { return getToken(P4Parser.TYPE, 0); }
		public NonTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTypeName; }
	}

	public final NonTypeNameContext nonTypeName() throws RecognitionException {
		NonTypeNameContext _localctx = new NonTypeNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonTypeName);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				type_or_id();
				}
				break;
			case APPLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(APPLY);
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(KEY);
				}
				break;
			case ACTIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				match(ACTIONS);
				}
				break;
			case STATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				match(STATE);
				}
				break;
			case ENTRIES:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				match(ENTRIES);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(326);
				match(TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public NonTypeNameContext nonTypeName() {
			return getRuleContext(NonTypeNameContext.class,0);
		}
		public Type_or_idContext type_or_id() {
			return getRuleContext(Type_or_idContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_name);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				nonTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				type_or_id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonTableKwNameContext extends ParserRuleContext {
		public Type_or_idContext type_or_id() {
			return getRuleContext(Type_or_idContext.class,0);
		}
		public TerminalNode APPLY() { return getToken(P4Parser.APPLY, 0); }
		public TerminalNode STATE() { return getToken(P4Parser.STATE, 0); }
		public TerminalNode TYPE() { return getToken(P4Parser.TYPE, 0); }
		public NonTableKwNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTableKwName; }
	}

	public final NonTableKwNameContext nonTableKwName() throws RecognitionException {
		NonTableKwNameContext _localctx = new NonTableKwNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nonTableKwName);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				type_or_id();
				}
				break;
			case APPLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(APPLY);
				}
				break;
			case STATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(STATE);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				match(TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptCONSTContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(P4Parser.CONST, 0); }
		public OptCONSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optCONST; }
	}

	public final OptCONSTContext optCONST() throws RecognitionException {
		OptCONSTContext _localctx = new OptCONSTContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_optCONST);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPLY:
			case DEFAULT_ACTION:
			case ENTRIES:
			case TYPE:
			case STATE:
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(CONST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptAnnotationsContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public OptAnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optAnnotations; }
	}

	public final OptAnnotationsContext optAnnotations() throws RecognitionException {
		OptAnnotationsContext _localctx = new OptAnnotationsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_optAnnotations);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case ACTION:
			case ACTIONS:
			case APPLY:
			case BOOL:
			case BIT:
			case CONST:
			case CONTROL:
			case DEFAULT_ACTION:
			case ENTRIES:
			case ENUM:
			case ERROR:
			case EXTERN:
			case HEADER:
			case HEADER_UNION:
			case IN:
			case INOUT:
			case INT:
			case KEY:
			case TYPE:
			case OUT:
			case PARSER:
			case PACKAGE:
			case STATE:
			case STRUCT:
			case TABLE:
			case TUPLE:
			case TYPEDEF:
			case VARBIT:
			case VALUESET:
			case VOID:
			case L_BRACE:
			case DOT:
			case SEMICOLON:
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PRAGMA:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				annotations(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		return annotations(0);
	}

	private AnnotationsContext annotations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, _parentState);
		AnnotationsContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_annotations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(348);
			annotation();
			}
			_ctx.stop = _input.LT(-1);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AnnotationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_annotations);
					setState(350);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(351);
					annotation();
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(P4Parser.AT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public AnnotationBodyContext annotationBody() {
			return getRuleContext(AnnotationBodyContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public TerminalNode PRAGMA() { return getToken(P4Parser.PRAGMA, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_annotation);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(AT);
				setState(358);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(AT);
				setState(360);
				name();
				setState(361);
				match(L_PAREN);
				setState(362);
				annotationBody(0);
				setState(363);
				match(R_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(PRAGMA);
				setState(366);
				name();
				setState(367);
				annotationBody(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationBodyContext extends ParserRuleContext {
		public List<AnnotationBodyContext> annotationBody() {
			return getRuleContexts(AnnotationBodyContext.class);
		}
		public AnnotationBodyContext annotationBody(int i) {
			return getRuleContext(AnnotationBodyContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public AnnotationTokenContext annotationToken() {
			return getRuleContext(AnnotationTokenContext.class,0);
		}
		public AnnotationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationBody; }
	}

	public final AnnotationBodyContext annotationBody() throws RecognitionException {
		return annotationBody(0);
	}

	private AnnotationBodyContext annotationBody(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AnnotationBodyContext _localctx = new AnnotationBodyContext(_ctx, _parentState);
		AnnotationBodyContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_annotationBody, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(379);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new AnnotationBodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationBody);
						setState(372);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(373);
						match(L_PAREN);
						setState(374);
						annotationBody(0);
						setState(375);
						match(R_PAREN);
						}
						break;
					case 2:
						{
						_localctx = new AnnotationBodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationBody);
						setState(377);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(378);
						annotationToken();
						}
						break;
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AnnotationTokenContext extends ParserRuleContext {
		public TerminalNode UNEXPECTED_TOKEN() { return getToken(P4Parser.UNEXPECTED_TOKEN, 0); }
		public TerminalNode ABSTRACT() { return getToken(P4Parser.ABSTRACT, 0); }
		public TerminalNode ACTION() { return getToken(P4Parser.ACTION, 0); }
		public TerminalNode ACTIONS() { return getToken(P4Parser.ACTIONS, 0); }
		public TerminalNode APPLY() { return getToken(P4Parser.APPLY, 0); }
		public TerminalNode BOOL() { return getToken(P4Parser.BOOL, 0); }
		public TerminalNode BIT() { return getToken(P4Parser.BIT, 0); }
		public TerminalNode CONST() { return getToken(P4Parser.CONST, 0); }
		public TerminalNode CONTROL() { return getToken(P4Parser.CONTROL, 0); }
		public TerminalNode DEFAULT() { return getToken(P4Parser.DEFAULT, 0); }
		public TerminalNode ELSE() { return getToken(P4Parser.ELSE, 0); }
		public TerminalNode ENTRIES() { return getToken(P4Parser.ENTRIES, 0); }
		public TerminalNode ENUM() { return getToken(P4Parser.ENUM, 0); }
		public TerminalNode ERROR() { return getToken(P4Parser.ERROR, 0); }
		public TerminalNode EXIT() { return getToken(P4Parser.EXIT, 0); }
		public TerminalNode EXTERN() { return getToken(P4Parser.EXTERN, 0); }
		public TerminalNode FALSE() { return getToken(P4Parser.FALSE, 0); }
		public TerminalNode HEADER() { return getToken(P4Parser.HEADER, 0); }
		public TerminalNode HEADER_UNION() { return getToken(P4Parser.HEADER_UNION, 0); }
		public TerminalNode IF() { return getToken(P4Parser.IF, 0); }
		public TerminalNode IN() { return getToken(P4Parser.IN, 0); }
		public TerminalNode INOUT() { return getToken(P4Parser.INOUT, 0); }
		public TerminalNode INT() { return getToken(P4Parser.INT, 0); }
		public TerminalNode KEY() { return getToken(P4Parser.KEY, 0); }
		public TerminalNode MATCH_KIND() { return getToken(P4Parser.MATCH_KIND, 0); }
		public TerminalNode TYPE() { return getToken(P4Parser.TYPE, 0); }
		public TerminalNode OUT() { return getToken(P4Parser.OUT, 0); }
		public TerminalNode PARSER() { return getToken(P4Parser.PARSER, 0); }
		public TerminalNode PACKAGE() { return getToken(P4Parser.PACKAGE, 0); }
		public TerminalNode PRAGMA() { return getToken(P4Parser.PRAGMA, 0); }
		public TerminalNode RETURN() { return getToken(P4Parser.RETURN, 0); }
		public TerminalNode SELECT() { return getToken(P4Parser.SELECT, 0); }
		public TerminalNode STATE() { return getToken(P4Parser.STATE, 0); }
		public TerminalNode STRUCT() { return getToken(P4Parser.STRUCT, 0); }
		public TerminalNode SWITCH() { return getToken(P4Parser.SWITCH, 0); }
		public TerminalNode TABLE() { return getToken(P4Parser.TABLE, 0); }
		public TerminalNode THIS() { return getToken(P4Parser.THIS, 0); }
		public TerminalNode TRANSITION() { return getToken(P4Parser.TRANSITION, 0); }
		public TerminalNode TRUE() { return getToken(P4Parser.TRUE, 0); }
		public TerminalNode TUPLE() { return getToken(P4Parser.TUPLE, 0); }
		public TerminalNode TYPEDEF() { return getToken(P4Parser.TYPEDEF, 0); }
		public TerminalNode VARBIT() { return getToken(P4Parser.VARBIT, 0); }
		public TerminalNode VALUESET() { return getToken(P4Parser.VALUESET, 0); }
		public TerminalNode VOID() { return getToken(P4Parser.VOID, 0); }
		public TerminalNode DONTCARE() { return getToken(P4Parser.DONTCARE, 0); }
		public Type_or_idContext type_or_id() {
			return getRuleContext(Type_or_idContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(P4Parser.STRING_LITERAL, 0); }
		public TerminalNode INTEGER() { return getToken(P4Parser.INTEGER, 0); }
		public TerminalNode MASK() { return getToken(P4Parser.MASK, 0); }
		public TerminalNode RANGE() { return getToken(P4Parser.RANGE, 0); }
		public TerminalNode SHL() { return getToken(P4Parser.SHL, 0); }
		public TerminalNode AND() { return getToken(P4Parser.AND, 0); }
		public TerminalNode OR() { return getToken(P4Parser.OR, 0); }
		public TerminalNode EQ() { return getToken(P4Parser.EQ, 0); }
		public TerminalNode NE() { return getToken(P4Parser.NE, 0); }
		public TerminalNode GE() { return getToken(P4Parser.GE, 0); }
		public TerminalNode LE() { return getToken(P4Parser.LE, 0); }
		public TerminalNode PP() { return getToken(P4Parser.PP, 0); }
		public TerminalNode PLUS() { return getToken(P4Parser.PLUS, 0); }
		public TerminalNode PLUS_SAT() { return getToken(P4Parser.PLUS_SAT, 0); }
		public TerminalNode MINUS() { return getToken(P4Parser.MINUS, 0); }
		public TerminalNode MINUS_SAT() { return getToken(P4Parser.MINUS_SAT, 0); }
		public TerminalNode MUL() { return getToken(P4Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(P4Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(P4Parser.MOD, 0); }
		public TerminalNode BIT_OR() { return getToken(P4Parser.BIT_OR, 0); }
		public TerminalNode BIT_AND() { return getToken(P4Parser.BIT_AND, 0); }
		public TerminalNode BIT_XOR() { return getToken(P4Parser.BIT_XOR, 0); }
		public TerminalNode COMPLEMENT() { return getToken(P4Parser.COMPLEMENT, 0); }
		public TerminalNode L_BRACKET() { return getToken(P4Parser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(P4Parser.R_BRACKET, 0); }
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public TerminalNode L_ANGLE() { return getToken(P4Parser.L_ANGLE, 0); }
		public TerminalNode R_ANGLE() { return getToken(P4Parser.R_ANGLE, 0); }
		public TerminalNode NOT() { return getToken(P4Parser.NOT, 0); }
		public TerminalNode COLON() { return getToken(P4Parser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public TerminalNode QUESTION() { return getToken(P4Parser.QUESTION, 0); }
		public TerminalNode DOT() { return getToken(P4Parser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(P4Parser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public TerminalNode AT() { return getToken(P4Parser.AT, 0); }
		public AnnotationTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationToken; }
	}

	public final AnnotationTokenContext annotationToken() throws RecognitionException {
		AnnotationTokenContext _localctx = new AnnotationTokenContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_annotationToken);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNEXPECTED_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(UNEXPECTED_TOKEN);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(ABSTRACT);
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(ACTION);
				}
				break;
			case ACTIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(ACTIONS);
				}
				break;
			case APPLY:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				match(APPLY);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(389);
				match(BOOL);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 7);
				{
				setState(390);
				match(BIT);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 8);
				{
				setState(391);
				match(CONST);
				}
				break;
			case CONTROL:
				enterOuterAlt(_localctx, 9);
				{
				setState(392);
				match(CONTROL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 10);
				{
				setState(393);
				match(DEFAULT);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 11);
				{
				setState(394);
				match(ELSE);
				}
				break;
			case ENTRIES:
				enterOuterAlt(_localctx, 12);
				{
				setState(395);
				match(ENTRIES);
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 13);
				{
				setState(396);
				match(ENUM);
				}
				break;
			case ERROR:
				enterOuterAlt(_localctx, 14);
				{
				setState(397);
				match(ERROR);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 15);
				{
				setState(398);
				match(EXIT);
				}
				break;
			case EXTERN:
				enterOuterAlt(_localctx, 16);
				{
				setState(399);
				match(EXTERN);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 17);
				{
				setState(400);
				match(FALSE);
				}
				break;
			case HEADER:
				enterOuterAlt(_localctx, 18);
				{
				setState(401);
				match(HEADER);
				}
				break;
			case HEADER_UNION:
				enterOuterAlt(_localctx, 19);
				{
				setState(402);
				match(HEADER_UNION);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 20);
				{
				setState(403);
				match(IF);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 21);
				{
				setState(404);
				match(IN);
				}
				break;
			case INOUT:
				enterOuterAlt(_localctx, 22);
				{
				setState(405);
				match(INOUT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 23);
				{
				setState(406);
				match(INT);
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 24);
				{
				setState(407);
				match(KEY);
				}
				break;
			case MATCH_KIND:
				enterOuterAlt(_localctx, 25);
				{
				setState(408);
				match(MATCH_KIND);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 26);
				{
				setState(409);
				match(TYPE);
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 27);
				{
				setState(410);
				match(OUT);
				}
				break;
			case PARSER:
				enterOuterAlt(_localctx, 28);
				{
				setState(411);
				match(PARSER);
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 29);
				{
				setState(412);
				match(PACKAGE);
				}
				break;
			case PRAGMA:
				enterOuterAlt(_localctx, 30);
				{
				setState(413);
				match(PRAGMA);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 31);
				{
				setState(414);
				match(RETURN);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 32);
				{
				setState(415);
				match(SELECT);
				}
				break;
			case STATE:
				enterOuterAlt(_localctx, 33);
				{
				setState(416);
				match(STATE);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 34);
				{
				setState(417);
				match(STRUCT);
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 35);
				{
				setState(418);
				match(SWITCH);
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 36);
				{
				setState(419);
				match(TABLE);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 37);
				{
				setState(420);
				match(THIS);
				}
				break;
			case TRANSITION:
				enterOuterAlt(_localctx, 38);
				{
				setState(421);
				match(TRANSITION);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 39);
				{
				setState(422);
				match(TRUE);
				}
				break;
			case TUPLE:
				enterOuterAlt(_localctx, 40);
				{
				setState(423);
				match(TUPLE);
				}
				break;
			case TYPEDEF:
				enterOuterAlt(_localctx, 41);
				{
				setState(424);
				match(TYPEDEF);
				}
				break;
			case VARBIT:
				enterOuterAlt(_localctx, 42);
				{
				setState(425);
				match(VARBIT);
				}
				break;
			case VALUESET:
				enterOuterAlt(_localctx, 43);
				{
				setState(426);
				match(VALUESET);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 44);
				{
				setState(427);
				match(VOID);
				}
				break;
			case DONTCARE:
				enterOuterAlt(_localctx, 45);
				{
				setState(428);
				match(DONTCARE);
				}
				break;
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 46);
				{
				setState(429);
				type_or_id();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 47);
				{
				setState(430);
				match(STRING_LITERAL);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 48);
				{
				setState(431);
				match(INTEGER);
				}
				break;
			case MASK:
				enterOuterAlt(_localctx, 49);
				{
				setState(432);
				match(MASK);
				}
				break;
			case RANGE:
				enterOuterAlt(_localctx, 50);
				{
				setState(433);
				match(RANGE);
				}
				break;
			case SHL:
				enterOuterAlt(_localctx, 51);
				{
				setState(434);
				match(SHL);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 52);
				{
				setState(435);
				match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 53);
				{
				setState(436);
				match(OR);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 54);
				{
				setState(437);
				match(EQ);
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 55);
				{
				setState(438);
				match(NE);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 56);
				{
				setState(439);
				match(GE);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 57);
				{
				setState(440);
				match(LE);
				}
				break;
			case PP:
				enterOuterAlt(_localctx, 58);
				{
				setState(441);
				match(PP);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 59);
				{
				setState(442);
				match(PLUS);
				}
				break;
			case PLUS_SAT:
				enterOuterAlt(_localctx, 60);
				{
				setState(443);
				match(PLUS_SAT);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 61);
				{
				setState(444);
				match(MINUS);
				}
				break;
			case MINUS_SAT:
				enterOuterAlt(_localctx, 62);
				{
				setState(445);
				match(MINUS_SAT);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 63);
				{
				setState(446);
				match(MUL);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 64);
				{
				setState(447);
				match(DIV);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 65);
				{
				setState(448);
				match(MOD);
				}
				break;
			case BIT_OR:
				enterOuterAlt(_localctx, 66);
				{
				setState(449);
				match(BIT_OR);
				}
				break;
			case BIT_AND:
				enterOuterAlt(_localctx, 67);
				{
				setState(450);
				match(BIT_AND);
				}
				break;
			case BIT_XOR:
				enterOuterAlt(_localctx, 68);
				{
				setState(451);
				match(BIT_XOR);
				}
				break;
			case COMPLEMENT:
				enterOuterAlt(_localctx, 69);
				{
				setState(452);
				match(COMPLEMENT);
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 70);
				{
				setState(453);
				match(L_BRACKET);
				}
				break;
			case R_BRACKET:
				enterOuterAlt(_localctx, 71);
				{
				setState(454);
				match(R_BRACKET);
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 72);
				{
				setState(455);
				match(L_BRACE);
				}
				break;
			case R_BRACE:
				enterOuterAlt(_localctx, 73);
				{
				setState(456);
				match(R_BRACE);
				}
				break;
			case L_ANGLE:
				enterOuterAlt(_localctx, 74);
				{
				setState(457);
				match(L_ANGLE);
				}
				break;
			case R_ANGLE:
				enterOuterAlt(_localctx, 75);
				{
				setState(458);
				match(R_ANGLE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 76);
				{
				setState(459);
				match(NOT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 77);
				{
				setState(460);
				match(COLON);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 78);
				{
				setState(461);
				match(COMMA);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 79);
				{
				setState(462);
				match(QUESTION);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 80);
				{
				setState(463);
				match(DOT);
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 81);
				{
				setState(464);
				match(ASSIGN);
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 82);
				{
				setState(465);
				match(SEMICOLON);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 83);
				{
				setState(466);
				match(AT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KvListContext extends ParserRuleContext {
		public KvPairContext kvPair() {
			return getRuleContext(KvPairContext.class,0);
		}
		public KvListContext kvList() {
			return getRuleContext(KvListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public KvListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kvList; }
	}

	public final KvListContext kvList() throws RecognitionException {
		return kvList(0);
	}

	private KvListContext kvList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		KvListContext _localctx = new KvListContext(_ctx, _parentState);
		KvListContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_kvList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(470);
			kvPair();
			}
			_ctx.stop = _input.LT(-1);
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new KvListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_kvList);
					setState(472);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(473);
					match(COMMA);
					setState(474);
					kvPair();
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class KvPairContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(P4Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KvPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kvPair; }
	}

	public final KvPairContext kvPair() throws RecognitionException {
		KvPairContext _localctx = new KvPairContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_kvPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			name();
			setState(481);
			match(ASSIGN);
			setState(482);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public NonEmptyParameterListContext nonEmptyParameterList() {
			return getRuleContext(NonEmptyParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterList);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PRAGMA:
			case BOOL:
			case BIT:
			case ERROR:
			case IN:
			case INOUT:
			case INT:
			case OUT:
			case TUPLE:
			case VARBIT:
			case DOT:
			case AT:
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				nonEmptyParameterList(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonEmptyParameterListContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public NonEmptyParameterListContext nonEmptyParameterList() {
			return getRuleContext(NonEmptyParameterListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public NonEmptyParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyParameterList; }
	}

	public final NonEmptyParameterListContext nonEmptyParameterList() throws RecognitionException {
		return nonEmptyParameterList(0);
	}

	private NonEmptyParameterListContext nonEmptyParameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NonEmptyParameterListContext _localctx = new NonEmptyParameterListContext(_ctx, _parentState);
		NonEmptyParameterListContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_nonEmptyParameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(489);
			parameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NonEmptyParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nonEmptyParameterList);
					setState(491);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(492);
					match(COMMA);
					setState(493);
					parameter();
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(P4Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				optAnnotations();
				setState(500);
				direction();
				setState(501);
				typeRef();
				setState(502);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				optAnnotations();
				setState(505);
				direction();
				setState(506);
				typeRef();
				setState(507);
				name();
				setState(508);
				match(ASSIGN);
				setState(509);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(P4Parser.IN, 0); }
		public TerminalNode OUT() { return getToken(P4Parser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(P4Parser.INOUT, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_direction);
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(IN);
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(OUT);
				}
				break;
			case INOUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				match(INOUT);
				}
				break;
			case BOOL:
			case BIT:
			case ERROR:
			case INT:
			case TUPLE:
			case VARBIT:
			case DOT:
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageTypeDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode PACKAGE() { return getToken(P4Parser.PACKAGE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OptTypeParametersContext optTypeParameters() {
			return getRuleContext(OptTypeParametersContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public PackageTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageTypeDeclaration; }
	}

	public final PackageTypeDeclarationContext packageTypeDeclaration() throws RecognitionException {
		PackageTypeDeclarationContext _localctx = new PackageTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_packageTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			optAnnotations();
			setState(520);
			match(PACKAGE);
			setState(521);
			name();
			setState(522);
			optTypeParameters();
			setState(523);
			match(L_PAREN);
			setState(524);
			parameterList();
			setState(525);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstantiationContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(P4Parser.ASSIGN, 0); }
		public ObjInitializerContext objInitializer() {
			return getRuleContext(ObjInitializerContext.class,0);
		}
		public InstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation; }
	}

	public final InstantiationContext instantiation() throws RecognitionException {
		InstantiationContext _localctx = new InstantiationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instantiation);
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				annotations(0);
				setState(528);
				typeRef();
				setState(529);
				match(L_PAREN);
				setState(530);
				argumentList();
				setState(531);
				match(R_PAREN);
				setState(532);
				name();
				setState(533);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				typeRef();
				setState(536);
				match(L_PAREN);
				setState(537);
				argumentList();
				setState(538);
				match(R_PAREN);
				setState(539);
				name();
				setState(540);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				annotations(0);
				setState(543);
				typeRef();
				setState(544);
				match(L_PAREN);
				setState(545);
				argumentList();
				setState(546);
				match(R_PAREN);
				setState(547);
				name();
				setState(548);
				match(ASSIGN);
				setState(549);
				objInitializer();
				setState(550);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(552);
				typeRef();
				setState(553);
				match(L_PAREN);
				setState(554);
				argumentList();
				setState(555);
				match(R_PAREN);
				setState(556);
				name();
				setState(557);
				match(ASSIGN);
				setState(558);
				objInitializer();
				setState(559);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjInitializerContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public ObjDeclarationsContext objDeclarations() {
			return getRuleContext(ObjDeclarationsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public ObjInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objInitializer; }
	}

	public final ObjInitializerContext objInitializer() throws RecognitionException {
		ObjInitializerContext _localctx = new ObjInitializerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_objInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(L_BRACE);
			setState(564);
			objDeclarations(0);
			setState(565);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjDeclarationsContext extends ParserRuleContext {
		public ObjDeclarationsContext objDeclarations() {
			return getRuleContext(ObjDeclarationsContext.class,0);
		}
		public ObjDeclarationContext objDeclaration() {
			return getRuleContext(ObjDeclarationContext.class,0);
		}
		public ObjDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objDeclarations; }
	}

	public final ObjDeclarationsContext objDeclarations() throws RecognitionException {
		return objDeclarations(0);
	}

	private ObjDeclarationsContext objDeclarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObjDeclarationsContext _localctx = new ObjDeclarationsContext(_ctx, _parentState);
		ObjDeclarationsContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_objDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObjDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_objDeclarations);
					setState(568);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(569);
					objDeclaration();
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ObjDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public ObjDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objDeclaration; }
	}

	public final ObjDeclarationContext objDeclaration() throws RecognitionException {
		ObjDeclarationContext _localctx = new ObjDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_objDeclaration);
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				instantiation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptConstructorParametersContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public OptConstructorParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optConstructorParameters; }
	}

	public final OptConstructorParametersContext optConstructorParameters() throws RecognitionException {
		OptConstructorParametersContext _localctx = new OptConstructorParametersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_optConstructorParameters);
		try {
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(L_PAREN);
				setState(581);
				parameterList();
				setState(582);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotPrefixContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(P4Parser.DOT, 0); }
		public DotPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotPrefix; }
	}

	public final DotPrefixContext dotPrefix() throws RecognitionException {
		DotPrefixContext _localctx = new DotPrefixContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dotPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParserDeclarationContext extends ParserRuleContext {
		public ParserTypeDeclarationContext parserTypeDeclaration() {
			return getRuleContext(ParserTypeDeclarationContext.class,0);
		}
		public OptConstructorParametersContext optConstructorParameters() {
			return getRuleContext(OptConstructorParametersContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public ParserLocalElementsContext parserLocalElements() {
			return getRuleContext(ParserLocalElementsContext.class,0);
		}
		public ParserStatesContext parserStates() {
			return getRuleContext(ParserStatesContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public ParserDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserDeclaration; }
	}

	public final ParserDeclarationContext parserDeclaration() throws RecognitionException {
		ParserDeclarationContext _localctx = new ParserDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parserDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			parserTypeDeclaration();
			setState(589);
			optConstructorParameters();
			setState(590);
			match(L_BRACE);
			setState(591);
			parserLocalElements(0);
			setState(592);
			parserStates(0);
			setState(593);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParserLocalElementsContext extends ParserRuleContext {
		public ParserLocalElementsContext parserLocalElements() {
			return getRuleContext(ParserLocalElementsContext.class,0);
		}
		public ParserLocalElementContext parserLocalElement() {
			return getRuleContext(ParserLocalElementContext.class,0);
		}
		public ParserLocalElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserLocalElements; }
	}

	public final ParserLocalElementsContext parserLocalElements() throws RecognitionException {
		return parserLocalElements(0);
	}

	private ParserLocalElementsContext parserLocalElements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParserLocalElementsContext _localctx = new ParserLocalElementsContext(_ctx, _parentState);
		ParserLocalElementsContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_parserLocalElements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParserLocalElementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parserLocalElements);
					setState(596);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(597);
					parserLocalElement();
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParserLocalElementContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ValueSetDeclarationContext valueSetDeclaration() {
			return getRuleContext(ValueSetDeclarationContext.class,0);
		}
		public ParserLocalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserLocalElement; }
	}

	public final ParserLocalElementContext parserLocalElement() throws RecognitionException {
		ParserLocalElementContext _localctx = new ParserLocalElementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parserLocalElement);
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				instantiation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				valueSetDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParserTypeDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode PARSER() { return getToken(P4Parser.PARSER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OptTypeParametersContext optTypeParameters() {
			return getRuleContext(OptTypeParametersContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public ParserTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserTypeDeclaration; }
	}

	public final ParserTypeDeclarationContext parserTypeDeclaration() throws RecognitionException {
		ParserTypeDeclarationContext _localctx = new ParserTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parserTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			optAnnotations();
			setState(610);
			match(PARSER);
			setState(611);
			name();
			setState(612);
			optTypeParameters();
			setState(613);
			match(L_PAREN);
			setState(614);
			parameterList();
			setState(615);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParserStatesContext extends ParserRuleContext {
		public ParserStateContext parserState() {
			return getRuleContext(ParserStateContext.class,0);
		}
		public ParserStatesContext parserStates() {
			return getRuleContext(ParserStatesContext.class,0);
		}
		public ParserStatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserStates; }
	}

	public final ParserStatesContext parserStates() throws RecognitionException {
		return parserStates(0);
	}

	private ParserStatesContext parserStates(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParserStatesContext _localctx = new ParserStatesContext(_ctx, _parentState);
		ParserStatesContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_parserStates, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(618);
			parserState();
			}
			_ctx.stop = _input.LT(-1);
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParserStatesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parserStates);
					setState(620);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(621);
					parserState();
					}
					} 
				}
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParserStateContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode STATE() { return getToken(P4Parser.STATE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public ParserStatementsContext parserStatements() {
			return getRuleContext(ParserStatementsContext.class,0);
		}
		public TransitionStatementContext transitionStatement() {
			return getRuleContext(TransitionStatementContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public ParserStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserState; }
	}

	public final ParserStateContext parserState() throws RecognitionException {
		ParserStateContext _localctx = new ParserStateContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parserState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			optAnnotations();
			setState(628);
			match(STATE);
			setState(629);
			name();
			setState(630);
			match(L_BRACE);
			setState(631);
			parserStatements(0);
			setState(632);
			transitionStatement();
			setState(633);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParserStatementsContext extends ParserRuleContext {
		public ParserStatementsContext parserStatements() {
			return getRuleContext(ParserStatementsContext.class,0);
		}
		public ParserStatementContext parserStatement() {
			return getRuleContext(ParserStatementContext.class,0);
		}
		public ParserStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserStatements; }
	}

	public final ParserStatementsContext parserStatements() throws RecognitionException {
		return parserStatements(0);
	}

	private ParserStatementsContext parserStatements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParserStatementsContext _localctx = new ParserStatementsContext(_ctx, _parentState);
		ParserStatementsContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_parserStatements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParserStatementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parserStatements);
					setState(636);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(637);
					parserStatement();
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParserStatementContext extends ParserRuleContext {
		public AssignmentOrMethodCallStatementContext assignmentOrMethodCallStatement() {
			return getRuleContext(AssignmentOrMethodCallStatementContext.class,0);
		}
		public DirectApplicationContext directApplication() {
			return getRuleContext(DirectApplicationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ParserBlockStatementContext parserBlockStatement() {
			return getRuleContext(ParserBlockStatementContext.class,0);
		}
		public ParserStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserStatement; }
	}

	public final ParserStatementContext parserStatement() throws RecognitionException {
		ParserStatementContext _localctx = new ParserStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parserStatement);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				assignmentOrMethodCallStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				directApplication();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
				constantDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(647);
				parserBlockStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParserBlockStatementContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public ParserStatementsContext parserStatements() {
			return getRuleContext(ParserStatementsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public ParserBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserBlockStatement; }
	}

	public final ParserBlockStatementContext parserBlockStatement() throws RecognitionException {
		ParserBlockStatementContext _localctx = new ParserBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parserBlockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			optAnnotations();
			setState(651);
			match(L_BRACE);
			setState(652);
			parserStatements(0);
			setState(653);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransitionStatementContext extends ParserRuleContext {
		public TerminalNode TRANSITION() { return getToken(P4Parser.TRANSITION, 0); }
		public StateExpressionContext stateExpression() {
			return getRuleContext(StateExpressionContext.class,0);
		}
		public TransitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionStatement; }
	}

	public final TransitionStatementContext transitionStatement() throws RecognitionException {
		TransitionStatementContext _localctx = new TransitionStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_transitionStatement);
		try {
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TRANSITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(TRANSITION);
				setState(657);
				stateExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateExpressionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public SelectExpressionContext selectExpression() {
			return getRuleContext(SelectExpressionContext.class,0);
		}
		public StateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateExpression; }
	}

	public final StateExpressionContext stateExpression() throws RecognitionException {
		StateExpressionContext _localctx = new StateExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_stateExpression);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIONS:
			case APPLY:
			case ENTRIES:
			case KEY:
			case TYPE:
			case STATE:
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				name();
				setState(661);
				match(SEMICOLON);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				selectExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExpressionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(P4Parser.SELECT, 0); }
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public SelectCaseListContext selectCaseList() {
			return getRuleContext(SelectCaseListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_selectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(SELECT);
			setState(667);
			match(L_PAREN);
			setState(668);
			expressionList(0);
			setState(669);
			match(R_PAREN);
			setState(670);
			match(L_BRACE);
			setState(671);
			selectCaseList(0);
			setState(672);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectCaseListContext extends ParserRuleContext {
		public SelectCaseListContext selectCaseList() {
			return getRuleContext(SelectCaseListContext.class,0);
		}
		public SelectCaseContext selectCase() {
			return getRuleContext(SelectCaseContext.class,0);
		}
		public SelectCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectCaseList; }
	}

	public final SelectCaseListContext selectCaseList() throws RecognitionException {
		return selectCaseList(0);
	}

	private SelectCaseListContext selectCaseList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SelectCaseListContext _localctx = new SelectCaseListContext(_ctx, _parentState);
		SelectCaseListContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_selectCaseList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectCaseListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_selectCaseList);
					setState(675);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(676);
					selectCase();
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectCaseContext extends ParserRuleContext {
		public KeysetExpressionContext keysetExpression() {
			return getRuleContext(KeysetExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(P4Parser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public SelectCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectCase; }
	}

	public final SelectCaseContext selectCase() throws RecognitionException {
		SelectCaseContext _localctx = new SelectCaseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_selectCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			keysetExpression();
			setState(683);
			match(COLON);
			setState(684);
			name();
			setState(685);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeysetExpressionContext extends ParserRuleContext {
		public TupleKeysetExpressionContext tupleKeysetExpression() {
			return getRuleContext(TupleKeysetExpressionContext.class,0);
		}
		public SimpleKeysetExpressionContext simpleKeysetExpression() {
			return getRuleContext(SimpleKeysetExpressionContext.class,0);
		}
		public KeysetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keysetExpression; }
	}

	public final KeysetExpressionContext keysetExpression() throws RecognitionException {
		KeysetExpressionContext _localctx = new KeysetExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_keysetExpression);
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				tupleKeysetExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				simpleKeysetExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleKeysetExpressionContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public SimpleKeysetExpressionContext simpleKeysetExpression() {
			return getRuleContext(SimpleKeysetExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public SimpleExpressionListContext simpleExpressionList() {
			return getRuleContext(SimpleExpressionListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public TupleKeysetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleKeysetExpression; }
	}

	public final TupleKeysetExpressionContext tupleKeysetExpression() throws RecognitionException {
		TupleKeysetExpressionContext _localctx = new TupleKeysetExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tupleKeysetExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(L_PAREN);
			setState(692);
			simpleKeysetExpression();
			setState(693);
			match(COMMA);
			setState(694);
			simpleExpressionList(0);
			setState(695);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionListContext extends ParserRuleContext {
		public SimpleKeysetExpressionContext simpleKeysetExpression() {
			return getRuleContext(SimpleKeysetExpressionContext.class,0);
		}
		public SimpleExpressionListContext simpleExpressionList() {
			return getRuleContext(SimpleExpressionListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public SimpleExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpressionList; }
	}

	public final SimpleExpressionListContext simpleExpressionList() throws RecognitionException {
		return simpleExpressionList(0);
	}

	private SimpleExpressionListContext simpleExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpressionListContext _localctx = new SimpleExpressionListContext(_ctx, _parentState);
		SimpleExpressionListContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_simpleExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(698);
			simpleKeysetExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpressionList);
					setState(700);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(701);
					match(COMMA);
					setState(702);
					simpleKeysetExpression();
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleKeysetExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MASK() { return getToken(P4Parser.MASK, 0); }
		public TerminalNode RANGE() { return getToken(P4Parser.RANGE, 0); }
		public TerminalNode DEFAULT() { return getToken(P4Parser.DEFAULT, 0); }
		public TerminalNode DONTCARE() { return getToken(P4Parser.DONTCARE, 0); }
		public SimpleKeysetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleKeysetExpression; }
	}

	public final SimpleKeysetExpressionContext simpleKeysetExpression() throws RecognitionException {
		SimpleKeysetExpressionContext _localctx = new SimpleKeysetExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_simpleKeysetExpression);
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				expression(0);
				setState(710);
				match(MASK);
				setState(711);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				expression(0);
				setState(714);
				match(RANGE);
				setState(715);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				match(DEFAULT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				match(DONTCARE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueSetDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode VALUESET() { return getToken(P4Parser.VALUESET, 0); }
		public TerminalNode L_ANGLE() { return getToken(P4Parser.L_ANGLE, 0); }
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TerminalNode R_ANGLE() { return getToken(P4Parser.R_ANGLE, 0); }
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ValueSetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueSetDeclaration; }
	}

	public final ValueSetDeclarationContext valueSetDeclaration() throws RecognitionException {
		ValueSetDeclarationContext _localctx = new ValueSetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_valueSetDeclaration);
		try {
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				optAnnotations();
				setState(722);
				match(VALUESET);
				setState(723);
				match(L_ANGLE);
				setState(724);
				baseType();
				setState(725);
				match(R_ANGLE);
				setState(726);
				match(L_PAREN);
				setState(727);
				expression(0);
				setState(728);
				match(R_PAREN);
				setState(729);
				name();
				setState(730);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				optAnnotations();
				setState(733);
				match(VALUESET);
				setState(734);
				match(L_ANGLE);
				setState(735);
				tupleType();
				setState(736);
				match(R_ANGLE);
				setState(737);
				match(L_PAREN);
				setState(738);
				expression(0);
				setState(739);
				match(R_PAREN);
				setState(740);
				name();
				setState(741);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				optAnnotations();
				setState(744);
				match(VALUESET);
				setState(745);
				match(L_ANGLE);
				setState(746);
				typeName();
				setState(747);
				match(R_ANGLE);
				setState(748);
				match(L_PAREN);
				setState(749);
				expression(0);
				setState(750);
				match(R_PAREN);
				setState(751);
				name();
				setState(752);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlDeclarationContext extends ParserRuleContext {
		public ControlTypeDeclarationContext controlTypeDeclaration() {
			return getRuleContext(ControlTypeDeclarationContext.class,0);
		}
		public OptConstructorParametersContext optConstructorParameters() {
			return getRuleContext(OptConstructorParametersContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public ControlLocalDeclarationsContext controlLocalDeclarations() {
			return getRuleContext(ControlLocalDeclarationsContext.class,0);
		}
		public TerminalNode APPLY() { return getToken(P4Parser.APPLY, 0); }
		public ControlBodyContext controlBody() {
			return getRuleContext(ControlBodyContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public ControlDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlDeclaration; }
	}

	public final ControlDeclarationContext controlDeclaration() throws RecognitionException {
		ControlDeclarationContext _localctx = new ControlDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_controlDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			controlTypeDeclaration();
			setState(757);
			optConstructorParameters();
			setState(758);
			match(L_BRACE);
			setState(759);
			controlLocalDeclarations(0);
			setState(760);
			match(APPLY);
			setState(761);
			controlBody();
			setState(762);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlTypeDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode CONTROL() { return getToken(P4Parser.CONTROL, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OptTypeParametersContext optTypeParameters() {
			return getRuleContext(OptTypeParametersContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public ControlTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlTypeDeclaration; }
	}

	public final ControlTypeDeclarationContext controlTypeDeclaration() throws RecognitionException {
		ControlTypeDeclarationContext _localctx = new ControlTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_controlTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			optAnnotations();
			setState(765);
			match(CONTROL);
			setState(766);
			name();
			setState(767);
			optTypeParameters();
			setState(768);
			match(L_PAREN);
			setState(769);
			parameterList();
			setState(770);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlLocalDeclarationsContext extends ParserRuleContext {
		public ControlLocalDeclarationsContext controlLocalDeclarations() {
			return getRuleContext(ControlLocalDeclarationsContext.class,0);
		}
		public ControlLocalDeclarationContext controlLocalDeclaration() {
			return getRuleContext(ControlLocalDeclarationContext.class,0);
		}
		public ControlLocalDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlLocalDeclarations; }
	}

	public final ControlLocalDeclarationsContext controlLocalDeclarations() throws RecognitionException {
		return controlLocalDeclarations(0);
	}

	private ControlLocalDeclarationsContext controlLocalDeclarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ControlLocalDeclarationsContext _localctx = new ControlLocalDeclarationsContext(_ctx, _parentState);
		ControlLocalDeclarationsContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_controlLocalDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ControlLocalDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_controlLocalDeclarations);
					setState(773);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(774);
					controlLocalDeclaration();
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ControlLocalDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ActionDeclarationContext actionDeclaration() {
			return getRuleContext(ActionDeclarationContext.class,0);
		}
		public TableDeclarationContext tableDeclaration() {
			return getRuleContext(TableDeclarationContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ControlLocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlLocalDeclaration; }
	}

	public final ControlLocalDeclarationContext controlLocalDeclaration() throws RecognitionException {
		ControlLocalDeclarationContext _localctx = new ControlLocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_controlLocalDeclaration);
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				actionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
				tableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				instantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(784);
				variableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlBodyContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ControlBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlBody; }
	}

	public final ControlBodyContext controlBody() throws RecognitionException {
		ControlBodyContext _localctx = new ControlBodyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_controlBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode EXTERN() { return getToken(P4Parser.EXTERN, 0); }
		public NonTypeNameContext nonTypeName() {
			return getRuleContext(NonTypeNameContext.class,0);
		}
		public OptTypeParametersContext optTypeParameters() {
			return getRuleContext(OptTypeParametersContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public MethodPrototypesContext methodPrototypes() {
			return getRuleContext(MethodPrototypesContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExternDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externDeclaration; }
	}

	public final ExternDeclarationContext externDeclaration() throws RecognitionException {
		ExternDeclarationContext _localctx = new ExternDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_externDeclaration);
		try {
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				optAnnotations();
				setState(790);
				match(EXTERN);
				setState(791);
				nonTypeName();
				setState(792);
				optTypeParameters();
				setState(793);
				match(L_BRACE);
				setState(794);
				methodPrototypes(0);
				setState(795);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				optAnnotations();
				setState(798);
				match(EXTERN);
				setState(799);
				functionPrototype();
				setState(800);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				optAnnotations();
				setState(803);
				match(EXTERN);
				setState(804);
				name();
				setState(805);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodPrototypesContext extends ParserRuleContext {
		public MethodPrototypesContext methodPrototypes() {
			return getRuleContext(MethodPrototypesContext.class,0);
		}
		public MethodPrototypeContext methodPrototype() {
			return getRuleContext(MethodPrototypeContext.class,0);
		}
		public MethodPrototypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodPrototypes; }
	}

	public final MethodPrototypesContext methodPrototypes() throws RecognitionException {
		return methodPrototypes(0);
	}

	private MethodPrototypesContext methodPrototypes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MethodPrototypesContext _localctx = new MethodPrototypesContext(_ctx, _parentState);
		MethodPrototypesContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_methodPrototypes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MethodPrototypesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_methodPrototypes);
					setState(810);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(811);
					methodPrototype();
					}
					} 
				}
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionPrototypeContext extends ParserRuleContext {
		public TypeOrVoidContext typeOrVoid() {
			return getRuleContext(TypeOrVoidContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OptTypeParametersContext optTypeParameters() {
			return getRuleContext(OptTypeParametersContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public FunctionPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPrototype; }
	}

	public final FunctionPrototypeContext functionPrototype() throws RecognitionException {
		FunctionPrototypeContext _localctx = new FunctionPrototypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_functionPrototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			typeOrVoid();
			setState(818);
			name();
			setState(819);
			optTypeParameters();
			setState(820);
			match(L_PAREN);
			setState(821);
			parameterList();
			setState(822);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodPrototypeContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public TerminalNode ABSTRACT() { return getToken(P4Parser.ABSTRACT, 0); }
		public Type_or_idContext type_or_id() {
			return getRuleContext(Type_or_idContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public MethodPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodPrototype; }
	}

	public final MethodPrototypeContext methodPrototype() throws RecognitionException {
		MethodPrototypeContext _localctx = new MethodPrototypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_methodPrototype);
		try {
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				optAnnotations();
				setState(825);
				functionPrototype();
				setState(826);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				optAnnotations();
				setState(829);
				match(ABSTRACT);
				setState(830);
				functionPrototype();
				setState(831);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(833);
				optAnnotations();
				setState(834);
				type_or_id();
				setState(835);
				match(L_PAREN);
				setState(836);
				parameterList();
				setState(837);
				match(R_PAREN);
				setState(838);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeRefContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SpecializedTypeContext specializedType() {
			return getRuleContext(SpecializedTypeContext.class,0);
		}
		public HeaderStackTypeContext headerStackType() {
			return getRuleContext(HeaderStackTypeContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeRef);
		try {
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				baseType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				typeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				specializedType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(845);
				headerStackType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(846);
				tupleType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SpecializedTypeContext specializedType() {
			return getRuleContext(SpecializedTypeContext.class,0);
		}
		public NamedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedType; }
	}

	public final NamedTypeContext namedType() throws RecognitionException {
		NamedTypeContext _localctx = new NamedTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_namedType);
		try {
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				specializedType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixedTypeContext extends ParserRuleContext {
		public Type_or_idContext type_or_id() {
			return getRuleContext(Type_or_idContext.class,0);
		}
		public DotPrefixContext dotPrefix() {
			return getRuleContext(DotPrefixContext.class,0);
		}
		public PrefixedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedType; }
	}

	public final PrefixedTypeContext prefixedType() throws RecognitionException {
		PrefixedTypeContext _localctx = new PrefixedTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_prefixedType);
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				type_or_id();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				dotPrefix();
				setState(855);
				type_or_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public PrefixedTypeContext prefixedType() {
			return getRuleContext(PrefixedTypeContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			prefixedType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeContext extends ParserRuleContext {
		public TerminalNode TUPLE() { return getToken(P4Parser.TUPLE, 0); }
		public TerminalNode L_ANGLE() { return getToken(P4Parser.L_ANGLE, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode R_ANGLE() { return getToken(P4Parser.R_ANGLE, 0); }
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(TUPLE);
			setState(862);
			match(L_ANGLE);
			setState(863);
			typeArgumentList(0);
			setState(864);
			match(R_ANGLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderStackTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(P4Parser.L_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(P4Parser.R_BRACKET, 0); }
		public HeaderStackTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerStackType; }
	}

	public final HeaderStackTypeContext headerStackType() throws RecognitionException {
		HeaderStackTypeContext _localctx = new HeaderStackTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_headerStackType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			typeName();
			setState(867);
			match(L_BRACKET);
			setState(868);
			expression(0);
			setState(869);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecializedTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode L_ANGLE() { return getToken(P4Parser.L_ANGLE, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode R_ANGLE() { return getToken(P4Parser.R_ANGLE, 0); }
		public SpecializedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specializedType; }
	}

	public final SpecializedTypeContext specializedType() throws RecognitionException {
		SpecializedTypeContext _localctx = new SpecializedTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_specializedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			typeName();
			setState(872);
			match(L_ANGLE);
			setState(873);
			typeArgumentList(0);
			setState(874);
			match(R_ANGLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(P4Parser.BOOL, 0); }
		public TerminalNode ERROR() { return getToken(P4Parser.ERROR, 0); }
		public TerminalNode BIT() { return getToken(P4Parser.BIT, 0); }
		public TerminalNode INT() { return getToken(P4Parser.INT, 0); }
		public TerminalNode L_ANGLE() { return getToken(P4Parser.L_ANGLE, 0); }
		public TerminalNode INTEGER() { return getToken(P4Parser.INTEGER, 0); }
		public TerminalNode R_ANGLE() { return getToken(P4Parser.R_ANGLE, 0); }
		public TerminalNode VARBIT() { return getToken(P4Parser.VARBIT, 0); }
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_baseType);
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				match(BOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				match(ERROR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				match(BIT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(879);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(880);
				match(BIT);
				setState(881);
				match(L_ANGLE);
				setState(882);
				match(INTEGER);
				setState(883);
				match(R_ANGLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(884);
				match(INT);
				setState(885);
				match(L_ANGLE);
				setState(886);
				match(INTEGER);
				setState(887);
				match(R_ANGLE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(888);
				match(VARBIT);
				setState(889);
				match(L_ANGLE);
				setState(890);
				match(INTEGER);
				setState(891);
				match(R_ANGLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(892);
				match(BIT);
				setState(893);
				match(L_ANGLE);
				setState(894);
				match(L_PAREN);
				setState(895);
				expression(0);
				setState(896);
				match(R_PAREN);
				setState(897);
				match(R_ANGLE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(899);
				match(INT);
				setState(900);
				match(L_ANGLE);
				setState(901);
				match(L_PAREN);
				setState(902);
				expression(0);
				setState(903);
				match(R_PAREN);
				setState(904);
				match(R_ANGLE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(906);
				match(VARBIT);
				setState(907);
				match(L_ANGLE);
				setState(908);
				match(L_PAREN);
				setState(909);
				expression(0);
				setState(910);
				match(R_PAREN);
				setState(911);
				match(R_ANGLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeOrVoidContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode VOID() { return getToken(P4Parser.VOID, 0); }
		public Type_or_idContext type_or_id() {
			return getRuleContext(Type_or_idContext.class,0);
		}
		public TypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOrVoid; }
	}

	public final TypeOrVoidContext typeOrVoid() throws RecognitionException {
		TypeOrVoidContext _localctx = new TypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typeOrVoid);
		try {
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				typeRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				match(VOID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				type_or_id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptTypeParametersContext extends ParserRuleContext {
		public TerminalNode L_ANGLE() { return getToken(P4Parser.L_ANGLE, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode R_ANGLE() { return getToken(P4Parser.R_ANGLE, 0); }
		public OptTypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optTypeParameters; }
	}

	public final OptTypeParametersContext optTypeParameters() throws RecognitionException {
		OptTypeParametersContext _localctx = new OptTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_optTypeParameters);
		try {
			setState(925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PAREN:
			case L_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case L_ANGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				match(L_ANGLE);
				setState(922);
				typeParameterList(0);
				setState(923);
				match(R_ANGLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		return typeParameterList(0);
	}

	private TypeParameterListContext typeParameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, _parentState);
		TypeParameterListContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_typeParameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(928);
			name();
			}
			_ctx.stop = _input.LT(-1);
			setState(935);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeParameterList);
					setState(930);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(931);
					match(COMMA);
					setState(932);
					name();
					}
					} 
				}
				setState(937);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeArgContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public NonTypeNameContext nonTypeName() {
			return getRuleContext(NonTypeNameContext.class,0);
		}
		public TerminalNode VOID() { return getToken(P4Parser.VOID, 0); }
		public TerminalNode DONTCARE() { return getToken(P4Parser.DONTCARE, 0); }
		public TypeArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArg; }
	}

	public final TypeArgContext typeArg() throws RecognitionException {
		TypeArgContext _localctx = new TypeArgContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typeArg);
		try {
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				typeRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				nonTypeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(940);
				match(VOID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(941);
				match(DONTCARE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public TypeArgContext typeArg() {
			return getRuleContext(TypeArgContext.class,0);
		}
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		return typeArgumentList(0);
	}

	private TypeArgumentListContext typeArgumentList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, _parentState);
		TypeArgumentListContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_typeArgumentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(945);
				typeArg();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeArgumentListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeArgumentList);
					setState(948);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(949);
					match(COMMA);
					setState(950);
					typeArg();
					}
					} 
				}
				setState(955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RealTypeArgContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode VOID() { return getToken(P4Parser.VOID, 0); }
		public TerminalNode DONTCARE() { return getToken(P4Parser.DONTCARE, 0); }
		public RealTypeArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realTypeArg; }
	}

	public final RealTypeArgContext realTypeArg() throws RecognitionException {
		RealTypeArgContext _localctx = new RealTypeArgContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_realTypeArg);
		try {
			setState(959);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BIT:
			case ERROR:
			case INT:
			case TUPLE:
			case VARBIT:
			case DOT:
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				typeRef();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				match(VOID);
				}
				break;
			case DONTCARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				match(DONTCARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealTypeArgumentListContext extends ParserRuleContext {
		public RealTypeArgContext realTypeArg() {
			return getRuleContext(RealTypeArgContext.class,0);
		}
		public RealTypeArgumentListContext realTypeArgumentList() {
			return getRuleContext(RealTypeArgumentListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public TypeArgContext typeArg() {
			return getRuleContext(TypeArgContext.class,0);
		}
		public RealTypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realTypeArgumentList; }
	}

	public final RealTypeArgumentListContext realTypeArgumentList() throws RecognitionException {
		return realTypeArgumentList(0);
	}

	private RealTypeArgumentListContext realTypeArgumentList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RealTypeArgumentListContext _localctx = new RealTypeArgumentListContext(_ctx, _parentState);
		RealTypeArgumentListContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_realTypeArgumentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(962);
			realTypeArg();
			}
			_ctx.stop = _input.LT(-1);
			setState(969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RealTypeArgumentListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_realTypeArgumentList);
					setState(964);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(965);
					match(COMMA);
					setState(966);
					typeArg();
					}
					} 
				}
				setState(971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public DerivedTypeDeclarationContext derivedTypeDeclaration() {
			return getRuleContext(DerivedTypeDeclarationContext.class,0);
		}
		public TypedefDeclarationContext typedefDeclaration() {
			return getRuleContext(TypedefDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public ParserTypeDeclarationContext parserTypeDeclaration() {
			return getRuleContext(ParserTypeDeclarationContext.class,0);
		}
		public ControlTypeDeclarationContext controlTypeDeclaration() {
			return getRuleContext(ControlTypeDeclarationContext.class,0);
		}
		public PackageTypeDeclarationContext packageTypeDeclaration() {
			return getRuleContext(PackageTypeDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_typeDeclaration);
		try {
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				derivedTypeDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(973);
				typedefDeclaration();
				setState(974);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(976);
				parserTypeDeclaration();
				setState(977);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(979);
				controlTypeDeclaration();
				setState(980);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(982);
				packageTypeDeclaration();
				setState(983);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DerivedTypeDeclarationContext extends ParserRuleContext {
		public HeaderTypeDeclarationContext headerTypeDeclaration() {
			return getRuleContext(HeaderTypeDeclarationContext.class,0);
		}
		public HeaderUnionDeclarationContext headerUnionDeclaration() {
			return getRuleContext(HeaderUnionDeclarationContext.class,0);
		}
		public StructTypeDeclarationContext structTypeDeclaration() {
			return getRuleContext(StructTypeDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public DerivedTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivedTypeDeclaration; }
	}

	public final DerivedTypeDeclarationContext derivedTypeDeclaration() throws RecognitionException {
		DerivedTypeDeclarationContext _localctx = new DerivedTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_derivedTypeDeclaration);
		try {
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				headerTypeDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				headerUnionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(989);
				structTypeDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(990);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderTypeDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode HEADER() { return getToken(P4Parser.HEADER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public StructFieldListContext structFieldList() {
			return getRuleContext(StructFieldListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public HeaderTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerTypeDeclaration; }
	}

	public final HeaderTypeDeclarationContext headerTypeDeclaration() throws RecognitionException {
		HeaderTypeDeclarationContext _localctx = new HeaderTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_headerTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			optAnnotations();
			setState(994);
			match(HEADER);
			setState(995);
			name();
			setState(996);
			match(L_BRACE);
			setState(997);
			structFieldList(0);
			setState(998);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructTypeDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(P4Parser.STRUCT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public StructFieldListContext structFieldList() {
			return getRuleContext(StructFieldListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public StructTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structTypeDeclaration; }
	}

	public final StructTypeDeclarationContext structTypeDeclaration() throws RecognitionException {
		StructTypeDeclarationContext _localctx = new StructTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_structTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			optAnnotations();
			setState(1001);
			match(STRUCT);
			setState(1002);
			name();
			setState(1003);
			match(L_BRACE);
			setState(1004);
			structFieldList(0);
			setState(1005);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderUnionDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode HEADER_UNION() { return getToken(P4Parser.HEADER_UNION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public StructFieldListContext structFieldList() {
			return getRuleContext(StructFieldListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public HeaderUnionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerUnionDeclaration; }
	}

	public final HeaderUnionDeclarationContext headerUnionDeclaration() throws RecognitionException {
		HeaderUnionDeclarationContext _localctx = new HeaderUnionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_headerUnionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			optAnnotations();
			setState(1008);
			match(HEADER_UNION);
			setState(1009);
			name();
			setState(1010);
			match(L_BRACE);
			setState(1011);
			structFieldList(0);
			setState(1012);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructFieldListContext extends ParserRuleContext {
		public StructFieldListContext structFieldList() {
			return getRuleContext(StructFieldListContext.class,0);
		}
		public PreprocessorLineContext preprocessorLine() {
			return getRuleContext(PreprocessorLineContext.class,0);
		}
		public StructFieldContext structField() {
			return getRuleContext(StructFieldContext.class,0);
		}
		public StructFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldList; }
	}

	public final StructFieldListContext structFieldList() throws RecognitionException {
		return structFieldList(0);
	}

	private StructFieldListContext structFieldList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructFieldListContext _localctx = new StructFieldListContext(_ctx, _parentState);
		StructFieldListContext _prevctx = _localctx;
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_structFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1019);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new StructFieldListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_structFieldList);
						setState(1015);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1016);
						preprocessorLine();
						}
						break;
					case 2:
						{
						_localctx = new StructFieldListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_structFieldList);
						setState(1017);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1018);
						structField();
						}
						break;
					}
					} 
				}
				setState(1023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructFieldContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_structField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			optAnnotations();
			setState(1025);
			typeRef();
			setState(1026);
			name();
			setState(1027);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(P4Parser.ENUM, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public TerminalNode BIT() { return getToken(P4Parser.BIT, 0); }
		public TerminalNode L_ANGLE() { return getToken(P4Parser.L_ANGLE, 0); }
		public TerminalNode INTEGER() { return getToken(P4Parser.INTEGER, 0); }
		public TerminalNode R_ANGLE() { return getToken(P4Parser.R_ANGLE, 0); }
		public SpecifiedIdentifierListContext specifiedIdentifierList() {
			return getRuleContext(SpecifiedIdentifierListContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_enumDeclaration);
		try {
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				optAnnotations();
				setState(1030);
				match(ENUM);
				setState(1031);
				name();
				setState(1032);
				match(L_BRACE);
				setState(1033);
				identifierList(0);
				setState(1034);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				optAnnotations();
				setState(1037);
				match(ENUM);
				setState(1038);
				match(BIT);
				setState(1039);
				match(L_ANGLE);
				setState(1040);
				match(INTEGER);
				setState(1041);
				match(R_ANGLE);
				setState(1042);
				name();
				setState(1043);
				match(L_BRACE);
				setState(1044);
				specifiedIdentifierList(0);
				setState(1045);
				match(R_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifiedIdentifierListContext extends ParserRuleContext {
		public SpecifiedIdentifierContext specifiedIdentifier() {
			return getRuleContext(SpecifiedIdentifierContext.class,0);
		}
		public SpecifiedIdentifierListContext specifiedIdentifierList() {
			return getRuleContext(SpecifiedIdentifierListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public SpecifiedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifiedIdentifierList; }
	}

	public final SpecifiedIdentifierListContext specifiedIdentifierList() throws RecognitionException {
		return specifiedIdentifierList(0);
	}

	private SpecifiedIdentifierListContext specifiedIdentifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SpecifiedIdentifierListContext _localctx = new SpecifiedIdentifierListContext(_ctx, _parentState);
		SpecifiedIdentifierListContext _prevctx = _localctx;
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_specifiedIdentifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1050);
			specifiedIdentifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SpecifiedIdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_specifiedIdentifierList);
					setState(1052);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1053);
					match(COMMA);
					setState(1054);
					specifiedIdentifier();
					}
					} 
				}
				setState(1059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SpecifiedIdentifierContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(P4Parser.ASSIGN, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public SpecifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifiedIdentifier; }
	}

	public final SpecifiedIdentifierContext specifiedIdentifier() throws RecognitionException {
		SpecifiedIdentifierContext _localctx = new SpecifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_specifiedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			name();
			setState(1061);
			match(ASSIGN);
			setState(1062);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorDeclarationContext extends ParserRuleContext {
		public TerminalNode ERROR() { return getToken(P4Parser.ERROR, 0); }
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public ErrorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorDeclaration; }
	}

	public final ErrorDeclarationContext errorDeclaration() throws RecognitionException {
		ErrorDeclarationContext _localctx = new ErrorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_errorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(ERROR);
			setState(1065);
			match(L_BRACE);
			setState(1066);
			identifierList(0);
			setState(1067);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchKindDeclarationContext extends ParserRuleContext {
		public TerminalNode MATCH_KIND() { return getToken(P4Parser.MATCH_KIND, 0); }
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public MatchKindDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchKindDeclaration; }
	}

	public final MatchKindDeclarationContext matchKindDeclaration() throws RecognitionException {
		MatchKindDeclarationContext _localctx = new MatchKindDeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_matchKindDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(MATCH_KIND);
			setState(1070);
			match(L_BRACE);
			setState(1071);
			identifierList(0);
			setState(1072);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1075);
			name();
			}
			_ctx.stop = _input.LT(-1);
			setState(1082);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(1077);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1078);
					match(COMMA);
					setState(1079);
					name();
					}
					} 
				}
				setState(1084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(P4Parser.TYPEDEF, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DerivedTypeDeclarationContext derivedTypeDeclaration() {
			return getRuleContext(DerivedTypeDeclarationContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(P4Parser.TYPE, 0); }
		public TypedefDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefDeclaration; }
	}

	public final TypedefDeclarationContext typedefDeclaration() throws RecognitionException {
		TypedefDeclarationContext _localctx = new TypedefDeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_typedefDeclaration);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				optAnnotations();
				setState(1086);
				match(TYPEDEF);
				setState(1087);
				typeRef();
				setState(1088);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1090);
				optAnnotations();
				setState(1091);
				match(TYPEDEF);
				setState(1092);
				derivedTypeDeclaration();
				setState(1093);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1095);
				optAnnotations();
				setState(1096);
				match(TYPE);
				setState(1097);
				typeRef();
				setState(1098);
				name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1100);
				optAnnotations();
				setState(1101);
				match(TYPE);
				setState(1102);
				derivedTypeDeclaration();
				setState(1103);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public TerminalNode L_ANGLE() { return getToken(P4Parser.L_ANGLE, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode R_ANGLE() { return getToken(P4Parser.R_ANGLE, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_methodCall);
		try {
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				lvalue(0);
				setState(1108);
				match(L_PAREN);
				setState(1109);
				argumentList();
				setState(1110);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				lvalue(0);
				setState(1113);
				match(L_ANGLE);
				setState(1114);
				typeArgumentList(0);
				setState(1115);
				match(R_ANGLE);
				setState(1116);
				match(L_PAREN);
				setState(1117);
				argumentList();
				setState(1118);
				match(R_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOrMethodCallStatementContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(P4Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOrMethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOrMethodCallStatement; }
	}

	public final AssignmentOrMethodCallStatementContext assignmentOrMethodCallStatement() throws RecognitionException {
		AssignmentOrMethodCallStatementContext _localctx = new AssignmentOrMethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_assignmentOrMethodCallStatement);
		try {
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				methodCall();
				setState(1123);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1125);
				lvalue(0);
				setState(1126);
				match(ASSIGN);
				setState(1127);
				expression(0);
				setState(1128);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitStatementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(P4Parser.EXIT, 0); }
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public ExitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStatement; }
	}

	public final ExitStatementContext exitStatement() throws RecognitionException {
		ExitStatementContext _localctx = new ExitStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_exitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			match(EXIT);
			setState(1135);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(P4Parser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_returnStatement);
		try {
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				match(RETURN);
				setState(1138);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1139);
				match(RETURN);
				setState(1140);
				expression(0);
				setState(1141);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(P4Parser.IF, 0); }
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(P4Parser.ELSE, 0); }
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_conditionalStatement);
		try {
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1145);
				match(IF);
				setState(1146);
				match(L_PAREN);
				setState(1147);
				expression(0);
				setState(1148);
				match(R_PAREN);
				setState(1149);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				match(IF);
				setState(1152);
				match(L_PAREN);
				setState(1153);
				expression(0);
				setState(1154);
				match(R_PAREN);
				setState(1155);
				statement();
				setState(1156);
				match(ELSE);
				setState(1157);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectApplicationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(P4Parser.DOT, 0); }
		public TerminalNode APPLY() { return getToken(P4Parser.APPLY, 0); }
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public DirectApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directApplication; }
	}

	public final DirectApplicationContext directApplication() throws RecognitionException {
		DirectApplicationContext _localctx = new DirectApplicationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_directApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			typeName();
			setState(1162);
			match(DOT);
			setState(1163);
			match(APPLY);
			setState(1164);
			match(L_PAREN);
			setState(1165);
			argumentList();
			setState(1166);
			match(R_PAREN);
			setState(1167);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DirectApplicationContext directApplication() {
			return getRuleContext(DirectApplicationContext.class,0);
		}
		public AssignmentOrMethodCallStatementContext assignmentOrMethodCallStatement() {
			return getRuleContext(AssignmentOrMethodCallStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExitStatementContext exitStatement() {
			return getRuleContext(ExitStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_statement);
		try {
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1169);
				directApplication();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1170);
				assignmentOrMethodCallStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1171);
				conditionalStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1172);
				emptyStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1173);
				blockStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1174);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1175);
				exitStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1176);
				switchStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public StatOrDeclListContext statOrDeclList() {
			return getRuleContext(StatOrDeclListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			optAnnotations();
			setState(1180);
			match(L_BRACE);
			setState(1181);
			statOrDeclList(0);
			setState(1182);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatOrDeclListContext extends ParserRuleContext {
		public StatOrDeclListContext statOrDeclList() {
			return getRuleContext(StatOrDeclListContext.class,0);
		}
		public StatementOrDeclarationContext statementOrDeclaration() {
			return getRuleContext(StatementOrDeclarationContext.class,0);
		}
		public StatOrDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statOrDeclList; }
	}

	public final StatOrDeclListContext statOrDeclList() throws RecognitionException {
		return statOrDeclList(0);
	}

	private StatOrDeclListContext statOrDeclList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatOrDeclListContext _localctx = new StatOrDeclListContext(_ctx, _parentState);
		StatOrDeclListContext _prevctx = _localctx;
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_statOrDeclList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatOrDeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statOrDeclList);
					setState(1185);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1186);
					statementOrDeclaration();
					}
					} 
				}
				setState(1191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(P4Parser.SWITCH, 0); }
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public SwitchCasesContext switchCases() {
			return getRuleContext(SwitchCasesContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(SWITCH);
			setState(1193);
			match(L_PAREN);
			setState(1194);
			expression(0);
			setState(1195);
			match(R_PAREN);
			setState(1196);
			match(L_BRACE);
			setState(1197);
			switchCases(0);
			setState(1198);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCasesContext extends ParserRuleContext {
		public SwitchCasesContext switchCases() {
			return getRuleContext(SwitchCasesContext.class,0);
		}
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public SwitchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCases; }
	}

	public final SwitchCasesContext switchCases() throws RecognitionException {
		return switchCases(0);
	}

	private SwitchCasesContext switchCases(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SwitchCasesContext _localctx = new SwitchCasesContext(_ctx, _parentState);
		SwitchCasesContext _prevctx = _localctx;
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_switchCases, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SwitchCasesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_switchCases);
					setState(1201);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1202);
					switchCase();
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SwitchCaseContext extends ParserRuleContext {
		public SwitchLabelContext switchLabel() {
			return getRuleContext(SwitchLabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(P4Parser.COLON, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_switchCase);
		try {
			setState(1215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				switchLabel();
				setState(1209);
				match(COLON);
				setState(1210);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1212);
				switchLabel();
				setState(1213);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(P4Parser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_switchLabel);
		try {
			setState(1219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIONS:
			case APPLY:
			case ENTRIES:
			case KEY:
			case TYPE:
			case STATE:
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				name();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1218);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementOrDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public StatementOrDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementOrDeclaration; }
	}

	public final StatementOrDeclarationContext statementOrDeclaration() throws RecognitionException {
		StatementOrDeclarationContext _localctx = new StatementOrDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_statementOrDeclaration);
		try {
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1221);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1222);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1223);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1224);
				instantiation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(P4Parser.TABLE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public TableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableDeclaration; }
	}

	public final TableDeclarationContext tableDeclaration() throws RecognitionException {
		TableDeclarationContext _localctx = new TableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_tableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			optAnnotations();
			setState(1228);
			match(TABLE);
			setState(1229);
			name();
			setState(1230);
			match(L_BRACE);
			setState(1231);
			tablePropertyList(0);
			setState(1232);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public TablePropertyContext tableProperty() {
			return getRuleContext(TablePropertyContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		return tablePropertyList(0);
	}

	private TablePropertyListContext tablePropertyList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, _parentState);
		TablePropertyListContext _prevctx = _localctx;
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_tablePropertyList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1235);
			tableProperty();
			}
			_ctx.stop = _input.LT(-1);
			setState(1241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TablePropertyListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tablePropertyList);
					setState(1237);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1238);
					tableProperty();
					}
					} 
				}
				setState(1243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(P4Parser.KEY, 0); }
		public TerminalNode ASSIGN() { return getToken(P4Parser.ASSIGN, 0); }
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public KeyElementListContext keyElementList() {
			return getRuleContext(KeyElementListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public TerminalNode ACTIONS() { return getToken(P4Parser.ACTIONS, 0); }
		public ActionListContext actionList() {
			return getRuleContext(ActionListContext.class,0);
		}
		public List<OptAnnotationsContext> optAnnotations() {
			return getRuleContexts(OptAnnotationsContext.class);
		}
		public OptAnnotationsContext optAnnotations(int i) {
			return getRuleContext(OptAnnotationsContext.class,i);
		}
		public OptCONSTContext optCONST() {
			return getRuleContext(OptCONSTContext.class,0);
		}
		public TerminalNode DEFAULT_ACTION() { return getToken(P4Parser.DEFAULT_ACTION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public ActionBindingContext actionBinding() {
			return getRuleContext(ActionBindingContext.class,0);
		}
		public TerminalNode ENTRIES() { return getToken(P4Parser.ENTRIES, 0); }
		public EntriesListContext entriesList() {
			return getRuleContext(EntriesListContext.class,0);
		}
		public NonTableKwNameContext nonTableKwName() {
			return getRuleContext(NonTableKwNameContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_tableProperty);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1244);
				match(KEY);
				setState(1245);
				match(ASSIGN);
				setState(1246);
				match(L_BRACE);
				setState(1247);
				keyElementList(0);
				setState(1248);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250);
				match(ACTIONS);
				setState(1251);
				match(ASSIGN);
				setState(1252);
				match(L_BRACE);
				setState(1253);
				actionList(0);
				setState(1254);
				match(R_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1256);
				optAnnotations();
				setState(1257);
				optCONST();
				setState(1258);
				match(DEFAULT_ACTION);
				setState(1259);
				match(ASSIGN);
				setState(1260);
				name();
				setState(1261);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1263);
				optAnnotations();
				setState(1264);
				optCONST();
				setState(1265);
				match(DEFAULT_ACTION);
				setState(1266);
				match(ASSIGN);
				setState(1267);
				actionBinding();
				setState(1268);
				optAnnotations();
				setState(1269);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1271);
				optAnnotations();
				setState(1272);
				optCONST();
				setState(1273);
				match(ENTRIES);
				setState(1274);
				match(ASSIGN);
				setState(1275);
				match(L_BRACE);
				setState(1276);
				entriesList(0);
				setState(1277);
				match(R_BRACE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1279);
				optAnnotations();
				setState(1280);
				optCONST();
				setState(1281);
				nonTableKwName();
				setState(1282);
				match(ASSIGN);
				setState(1283);
				initializer();
				setState(1284);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyElementListContext extends ParserRuleContext {
		public KeyElementListContext keyElementList() {
			return getRuleContext(KeyElementListContext.class,0);
		}
		public KeyElementContext keyElement() {
			return getRuleContext(KeyElementContext.class,0);
		}
		public KeyElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyElementList; }
	}

	public final KeyElementListContext keyElementList() throws RecognitionException {
		return keyElementList(0);
	}

	private KeyElementListContext keyElementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		KeyElementListContext _localctx = new KeyElementListContext(_ctx, _parentState);
		KeyElementListContext _prevctx = _localctx;
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_keyElementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new KeyElementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_keyElementList);
					setState(1289);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1290);
					keyElement();
					}
					} 
				}
				setState(1295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class KeyElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(P4Parser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public KeyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyElement; }
	}

	public final KeyElementContext keyElement() throws RecognitionException {
		KeyElementContext _localctx = new KeyElementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_keyElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			expression(0);
			setState(1297);
			match(COLON);
			setState(1298);
			name();
			setState(1299);
			optAnnotations();
			setState(1300);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionListContext extends ParserRuleContext {
		public ActionListContext actionList() {
			return getRuleContext(ActionListContext.class,0);
		}
		public ActionRefContext actionRef() {
			return getRuleContext(ActionRefContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public ActionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionList; }
	}

	public final ActionListContext actionList() throws RecognitionException {
		return actionList(0);
	}

	private ActionListContext actionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ActionListContext _localctx = new ActionListContext(_ctx, _parentState);
		ActionListContext _prevctx = _localctx;
		int _startState = 210;
		enterRecursionRule(_localctx, 210, RULE_actionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ActionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_actionList);
					setState(1303);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1304);
					actionRef();
					setState(1305);
					match(SEMICOLON);
					}
					} 
				}
				setState(1311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ActionRefContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public ActionRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionRef; }
	}

	public final ActionRefContext actionRef() throws RecognitionException {
		ActionRefContext _localctx = new ActionRefContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_actionRef);
		try {
			setState(1321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312);
				optAnnotations();
				setState(1313);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
				optAnnotations();
				setState(1316);
				name();
				setState(1317);
				match(L_PAREN);
				setState(1318);
				argumentList();
				setState(1319);
				match(R_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntryContext extends ParserRuleContext {
		public KeysetExpressionContext keysetExpression() {
			return getRuleContext(KeysetExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(P4Parser.COLON, 0); }
		public ActionBindingContext actionBinding() {
			return getRuleContext(ActionBindingContext.class,0);
		}
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			keysetExpression();
			setState(1324);
			match(COLON);
			setState(1325);
			actionBinding();
			setState(1326);
			optAnnotations();
			setState(1327);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionBindingContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public TerminalNode L_ANGLE() { return getToken(P4Parser.L_ANGLE, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode R_ANGLE() { return getToken(P4Parser.R_ANGLE, 0); }
		public ActionBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionBinding; }
	}

	public final ActionBindingContext actionBinding() throws RecognitionException {
		ActionBindingContext _localctx = new ActionBindingContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_actionBinding);
		try {
			setState(1342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				lvalue(0);
				setState(1330);
				match(L_PAREN);
				setState(1331);
				argumentList();
				setState(1332);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334);
				lvalue(0);
				setState(1335);
				match(L_ANGLE);
				setState(1336);
				typeArgumentList(0);
				setState(1337);
				match(R_ANGLE);
				setState(1338);
				match(L_PAREN);
				setState(1339);
				argumentList();
				setState(1340);
				match(R_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntriesListContext extends ParserRuleContext {
		public EntryContext entry() {
			return getRuleContext(EntryContext.class,0);
		}
		public EntriesListContext entriesList() {
			return getRuleContext(EntriesListContext.class,0);
		}
		public EntriesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entriesList; }
	}

	public final EntriesListContext entriesList() throws RecognitionException {
		return entriesList(0);
	}

	private EntriesListContext entriesList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EntriesListContext _localctx = new EntriesListContext(_ctx, _parentState);
		EntriesListContext _prevctx = _localctx;
		int _startState = 218;
		enterRecursionRule(_localctx, 218, RULE_entriesList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1345);
			entry();
			}
			_ctx.stop = _input.LT(-1);
			setState(1351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EntriesListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_entriesList);
					setState(1347);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1348);
					entry();
					}
					} 
				}
				setState(1353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ActionDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(P4Parser.ACTION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ActionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDeclaration; }
	}

	public final ActionDeclarationContext actionDeclaration() throws RecognitionException {
		ActionDeclarationContext _localctx = new ActionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_actionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			optAnnotations();
			setState(1355);
			match(ACTION);
			setState(1356);
			name();
			setState(1357);
			match(L_PAREN);
			setState(1358);
			parameterList();
			setState(1359);
			match(R_PAREN);
			setState(1360);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OptInitializerContext optInitializer() {
			return getRuleContext(OptInitializerContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_variableDeclaration);
		try {
			setState(1373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRAGMA:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1362);
				annotations(0);
				setState(1363);
				typeRef();
				setState(1364);
				name();
				setState(1365);
				optInitializer();
				setState(1366);
				match(SEMICOLON);
				}
				break;
			case BOOL:
			case BIT:
			case ERROR:
			case INT:
			case TUPLE:
			case VARBIT:
			case DOT:
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368);
				typeRef();
				setState(1369);
				name();
				setState(1370);
				optInitializer();
				setState(1371);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode CONST() { return getToken(P4Parser.CONST, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(P4Parser.ASSIGN, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			optAnnotations();
			setState(1376);
			match(CONST);
			setState(1377);
			typeRef();
			setState(1378);
			name();
			setState(1379);
			match(ASSIGN);
			setState(1380);
			initializer();
			setState(1381);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptInitializerContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(P4Parser.ASSIGN, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public OptInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optInitializer; }
	}

	public final OptInitializerContext optInitializer() throws RecognitionException {
		OptInitializerContext _localctx = new OptInitializerContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_optInitializer);
		try {
			setState(1386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				match(ASSIGN);
				setState(1385);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			functionPrototype();
			setState(1391);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public NonEmptyArgListContext nonEmptyArgList() {
			return getRuleContext(NonEmptyArgListContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_argumentList);
		try {
			setState(1395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ACTIONS:
			case APPLY:
			case ENTRIES:
			case ERROR:
			case FALSE:
			case KEY:
			case TYPE:
			case STATE:
			case THIS:
			case TRUE:
			case DONTCARE:
			case PLUS:
			case MINUS:
			case COMPLEMENT:
			case L_PAREN:
			case L_BRACE:
			case NOT:
			case DOT:
			case STRING_LITERAL:
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394);
				nonEmptyArgList(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonEmptyArgListContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public NonEmptyArgListContext nonEmptyArgList() {
			return getRuleContext(NonEmptyArgListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public NonEmptyArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyArgList; }
	}

	public final NonEmptyArgListContext nonEmptyArgList() throws RecognitionException {
		return nonEmptyArgList(0);
	}

	private NonEmptyArgListContext nonEmptyArgList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NonEmptyArgListContext _localctx = new NonEmptyArgListContext(_ctx, _parentState);
		NonEmptyArgListContext _prevctx = _localctx;
		int _startState = 234;
		enterRecursionRule(_localctx, 234, RULE_nonEmptyArgList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1398);
			argument();
			}
			_ctx.stop = _input.LT(-1);
			setState(1405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NonEmptyArgListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nonEmptyArgList);
					setState(1400);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1401);
					match(COMMA);
					setState(1402);
					argument();
					}
					} 
				}
				setState(1407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(P4Parser.ASSIGN, 0); }
		public TerminalNode DONTCARE() { return getToken(P4Parser.DONTCARE, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_argument);
		try {
			setState(1414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1408);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1409);
				name();
				setState(1410);
				match(ASSIGN);
				setState(1411);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1413);
				match(DONTCARE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(P4Parser.COMMA, 0); }
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		return expressionList(0);
	}

	private ExpressionListContext expressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, _parentState);
		ExpressionListContext _prevctx = _localctx;
		int _startState = 238;
		enterRecursionRule(_localctx, 238, RULE_expressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(1417);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(1420);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1421);
					match(COMMA);
					setState(1422);
					expression(0);
					}
					} 
				}
				setState(1427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrefixedNonTypeNameContext extends ParserRuleContext {
		public NonTypeNameContext nonTypeName() {
			return getRuleContext(NonTypeNameContext.class,0);
		}
		public DotPrefixContext dotPrefix() {
			return getRuleContext(DotPrefixContext.class,0);
		}
		public PrefixedNonTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedNonTypeName; }
	}

	public final PrefixedNonTypeNameContext prefixedNonTypeName() throws RecognitionException {
		PrefixedNonTypeNameContext _localctx = new PrefixedNonTypeNameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_prefixedNonTypeName);
		try {
			setState(1432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIONS:
			case APPLY:
			case ENTRIES:
			case KEY:
			case TYPE:
			case STATE:
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428);
				nonTypeName();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				dotPrefix();
				setState(1430);
				nonTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public PrefixedNonTypeNameContext prefixedNonTypeName() {
			return getRuleContext(PrefixedNonTypeNameContext.class,0);
		}
		public TerminalNode THIS() { return getToken(P4Parser.THIS, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode DOT() { return getToken(P4Parser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(P4Parser.L_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_BRACKET() { return getToken(P4Parser.R_BRACKET, 0); }
		public TerminalNode COLON() { return getToken(P4Parser.COLON, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIONS:
			case APPLY:
			case ENTRIES:
			case KEY:
			case TYPE:
			case STATE:
			case DOT:
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				{
				setState(1435);
				prefixedNonTypeName();
				}
				break;
			case THIS:
				{
				setState(1436);
				match(THIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1454);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(1439);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1440);
						match(DOT);
						setState(1441);
						name();
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(1442);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1443);
						match(L_BRACKET);
						setState(1444);
						expression(0);
						setState(1445);
						match(R_BRACKET);
						}
						break;
					case 3:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(1447);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1448);
						match(L_BRACKET);
						setState(1449);
						expression(0);
						setState(1450);
						match(COLON);
						setState(1451);
						expression(0);
						setState(1452);
						match(R_BRACKET);
						}
						break;
					}
					} 
				}
				setState(1458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(P4Parser.INTEGER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(P4Parser.STRING_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(P4Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(P4Parser.FALSE, 0); }
		public TerminalNode THIS() { return getToken(P4Parser.THIS, 0); }
		public NonTypeNameContext nonTypeName() {
			return getRuleContext(NonTypeNameContext.class,0);
		}
		public DotPrefixContext dotPrefix() {
			return getRuleContext(DotPrefixContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(P4Parser.L_BRACE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(P4Parser.R_BRACE, 0); }
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public TerminalNode NOT() { return getToken(P4Parser.NOT, 0); }
		public TerminalNode COMPLEMENT() { return getToken(P4Parser.COMPLEMENT, 0); }
		public TerminalNode MINUS() { return getToken(P4Parser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(P4Parser.PLUS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(P4Parser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ERROR() { return getToken(P4Parser.ERROR, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode MUL() { return getToken(P4Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(P4Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(P4Parser.MOD, 0); }
		public TerminalNode PLUS_SAT() { return getToken(P4Parser.PLUS_SAT, 0); }
		public TerminalNode MINUS_SAT() { return getToken(P4Parser.MINUS_SAT, 0); }
		public TerminalNode SHL() { return getToken(P4Parser.SHL, 0); }
		public List<TerminalNode> R_ANGLE() { return getTokens(P4Parser.R_ANGLE); }
		public TerminalNode R_ANGLE(int i) {
			return getToken(P4Parser.R_ANGLE, i);
		}
		public TerminalNode LE() { return getToken(P4Parser.LE, 0); }
		public TerminalNode GE() { return getToken(P4Parser.GE, 0); }
		public TerminalNode L_ANGLE() { return getToken(P4Parser.L_ANGLE, 0); }
		public TerminalNode NE() { return getToken(P4Parser.NE, 0); }
		public TerminalNode EQ() { return getToken(P4Parser.EQ, 0); }
		public TerminalNode BIT_AND() { return getToken(P4Parser.BIT_AND, 0); }
		public TerminalNode BIT_XOR() { return getToken(P4Parser.BIT_XOR, 0); }
		public TerminalNode BIT_OR() { return getToken(P4Parser.BIT_OR, 0); }
		public TerminalNode PP() { return getToken(P4Parser.PP, 0); }
		public TerminalNode AND() { return getToken(P4Parser.AND, 0); }
		public TerminalNode OR() { return getToken(P4Parser.OR, 0); }
		public TerminalNode QUESTION() { return getToken(P4Parser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(P4Parser.COLON, 0); }
		public TerminalNode L_BRACKET() { return getToken(P4Parser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(P4Parser.R_BRACKET, 0); }
		public RealTypeArgumentListContext realTypeArgumentList() {
			return getRuleContext(RealTypeArgumentListContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(1460);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(1461);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(1462);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(1463);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(1464);
				match(THIS);
				}
				break;
			case 6:
				{
				setState(1465);
				nonTypeName();
				}
				break;
			case 7:
				{
				setState(1466);
				dotPrefix();
				setState(1467);
				nonTypeName();
				}
				break;
			case 8:
				{
				setState(1469);
				match(L_BRACE);
				setState(1470);
				expressionList(0);
				setState(1471);
				match(R_BRACE);
				}
				break;
			case 9:
				{
				setState(1473);
				match(L_PAREN);
				setState(1474);
				expression(0);
				setState(1475);
				match(R_PAREN);
				}
				break;
			case 10:
				{
				setState(1477);
				match(NOT);
				setState(1478);
				expression(32);
				}
				break;
			case 11:
				{
				setState(1479);
				match(COMPLEMENT);
				setState(1480);
				expression(31);
				}
				break;
			case 12:
				{
				setState(1481);
				match(MINUS);
				setState(1482);
				expression(30);
				}
				break;
			case 13:
				{
				setState(1483);
				match(PLUS);
				setState(1484);
				expression(29);
				}
				break;
			case 14:
				{
				setState(1485);
				typeName();
				setState(1486);
				match(DOT);
				setState(1487);
				name();
				}
				break;
			case 15:
				{
				setState(1489);
				match(ERROR);
				setState(1490);
				match(DOT);
				setState(1491);
				name();
				}
				break;
			case 16:
				{
				setState(1492);
				methodCall();
				}
				break;
			case 17:
				{
				setState(1493);
				match(L_PAREN);
				setState(1494);
				typeRef();
				setState(1495);
				match(R_PAREN);
				setState(1496);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1593);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1500);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1501);
						match(MUL);
						setState(1502);
						expression(26);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1503);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1504);
						match(DIV);
						setState(1505);
						expression(25);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1506);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1507);
						match(MOD);
						setState(1508);
						expression(24);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1509);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1510);
						match(PLUS);
						setState(1511);
						expression(23);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1512);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1513);
						match(MINUS);
						setState(1514);
						expression(22);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1515);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1516);
						match(PLUS_SAT);
						setState(1517);
						expression(21);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1518);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1519);
						match(MINUS_SAT);
						setState(1520);
						expression(20);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1521);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1522);
						match(SHL);
						setState(1523);
						expression(19);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1524);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1525);
						match(R_ANGLE);
						setState(1526);
						match(R_ANGLE);
						setState(1527);
						expression(18);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1528);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1529);
						match(LE);
						setState(1530);
						expression(17);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1531);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1532);
						match(GE);
						setState(1533);
						expression(16);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1534);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1535);
						match(L_ANGLE);
						setState(1536);
						expression(15);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1537);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1538);
						match(R_ANGLE);
						setState(1539);
						expression(14);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1540);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1541);
						match(NE);
						setState(1542);
						expression(13);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1543);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1544);
						match(EQ);
						setState(1545);
						expression(12);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1546);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1547);
						match(BIT_AND);
						setState(1548);
						expression(11);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1549);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1550);
						match(BIT_XOR);
						setState(1551);
						expression(10);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1552);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1553);
						match(BIT_OR);
						setState(1554);
						expression(9);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1555);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1556);
						match(PP);
						setState(1557);
						expression(8);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1558);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1559);
						match(AND);
						setState(1560);
						expression(7);
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1561);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1562);
						match(OR);
						setState(1563);
						expression(6);
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1564);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1565);
						match(QUESTION);
						setState(1566);
						expression(0);
						setState(1567);
						match(COLON);
						setState(1568);
						expression(5);
						}
						break;
					case 23:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1570);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1571);
						match(L_BRACKET);
						setState(1572);
						expression(0);
						setState(1573);
						match(R_BRACKET);
						}
						break;
					case 24:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1575);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1576);
						match(L_BRACKET);
						setState(1577);
						expression(0);
						setState(1578);
						match(COLON);
						setState(1579);
						expression(0);
						setState(1580);
						match(R_BRACKET);
						}
						break;
					case 25:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1582);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1583);
						match(DOT);
						setState(1584);
						name();
						}
						break;
					case 26:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1585);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1586);
						match(L_ANGLE);
						setState(1587);
						realTypeArgumentList(0);
						setState(1588);
						match(R_ANGLE);
						setState(1589);
						match(L_PAREN);
						setState(1590);
						argumentList();
						setState(1591);
						match(R_PAREN);
						}
						break;
					}
					} 
				}
				setState(1597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type_or_idContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(P4Parser.IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(P4Parser.TYPE_IDENTIFIER, 0); }
		public Type_or_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_or_id; }
	}

	public final Type_or_idContext type_or_id() throws RecognitionException {
		Type_or_idContext _localctx = new Type_or_idContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_type_or_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==TYPE_IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParserStateConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(P4Parser.EQ, 0); }
		public KeysetExpressionContext keysetExpression() {
			return getRuleContext(KeysetExpressionContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public ParserStateConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserStateCondition; }
	}

	public final ParserStateConditionContext parserStateCondition() throws RecognitionException {
		ParserStateConditionContext _localctx = new ParserStateConditionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_parserStateCondition);
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1601);
				expression(0);
				setState(1602);
				match(EQ);
				setState(1603);
				keysetExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1605);
				expression(0);
				setState(1606);
				match(EQ);
				setState(1607);
				match(L_PAREN);
				setState(1608);
				keysetExpression();
				setState(1609);
				match(R_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1611);
				keysetExpression();
				setState(1612);
				match(EQ);
				setState(1613);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1615);
				match(L_PAREN);
				setState(1616);
				keysetExpression();
				setState(1617);
				match(R_PAREN);
				setState(1618);
				match(EQ);
				setState(1619);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return input_sempred((InputContext)_localctx, predIndex);
		case 11:
			return annotations_sempred((AnnotationsContext)_localctx, predIndex);
		case 13:
			return annotationBody_sempred((AnnotationBodyContext)_localctx, predIndex);
		case 15:
			return kvList_sempred((KvListContext)_localctx, predIndex);
		case 18:
			return nonEmptyParameterList_sempred((NonEmptyParameterListContext)_localctx, predIndex);
		case 24:
			return objDeclarations_sempred((ObjDeclarationsContext)_localctx, predIndex);
		case 29:
			return parserLocalElements_sempred((ParserLocalElementsContext)_localctx, predIndex);
		case 32:
			return parserStates_sempred((ParserStatesContext)_localctx, predIndex);
		case 34:
			return parserStatements_sempred((ParserStatementsContext)_localctx, predIndex);
		case 40:
			return selectCaseList_sempred((SelectCaseListContext)_localctx, predIndex);
		case 44:
			return simpleExpressionList_sempred((SimpleExpressionListContext)_localctx, predIndex);
		case 49:
			return controlLocalDeclarations_sempred((ControlLocalDeclarationsContext)_localctx, predIndex);
		case 53:
			return methodPrototypes_sempred((MethodPrototypesContext)_localctx, predIndex);
		case 66:
			return typeParameterList_sempred((TypeParameterListContext)_localctx, predIndex);
		case 68:
			return typeArgumentList_sempred((TypeArgumentListContext)_localctx, predIndex);
		case 70:
			return realTypeArgumentList_sempred((RealTypeArgumentListContext)_localctx, predIndex);
		case 76:
			return structFieldList_sempred((StructFieldListContext)_localctx, predIndex);
		case 79:
			return specifiedIdentifierList_sempred((SpecifiedIdentifierListContext)_localctx, predIndex);
		case 83:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 94:
			return statOrDeclList_sempred((StatOrDeclListContext)_localctx, predIndex);
		case 96:
			return switchCases_sempred((SwitchCasesContext)_localctx, predIndex);
		case 101:
			return tablePropertyList_sempred((TablePropertyListContext)_localctx, predIndex);
		case 103:
			return keyElementList_sempred((KeyElementListContext)_localctx, predIndex);
		case 105:
			return actionList_sempred((ActionListContext)_localctx, predIndex);
		case 109:
			return entriesList_sempred((EntriesListContext)_localctx, predIndex);
		case 117:
			return nonEmptyArgList_sempred((NonEmptyArgListContext)_localctx, predIndex);
		case 119:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 121:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		case 122:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean input_sempred(InputContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean annotations_sempred(AnnotationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean annotationBody_sempred(AnnotationBodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean kvList_sempred(KvListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean nonEmptyParameterList_sempred(NonEmptyParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean objDeclarations_sempred(ObjDeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parserLocalElements_sempred(ParserLocalElementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parserStates_sempred(ParserStatesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parserStatements_sempred(ParserStatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean selectCaseList_sempred(SelectCaseListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean simpleExpressionList_sempred(SimpleExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean controlLocalDeclarations_sempred(ControlLocalDeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean methodPrototypes_sempred(MethodPrototypesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeParameterList_sempred(TypeParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeArgumentList_sempred(TypeArgumentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean realTypeArgumentList_sempred(RealTypeArgumentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structFieldList_sempred(StructFieldListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean specifiedIdentifierList_sempred(SpecifiedIdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statOrDeclList_sempred(StatOrDeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean switchCases_sempred(SwitchCasesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tablePropertyList_sempred(TablePropertyListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean keyElementList_sempred(KeyElementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean actionList_sempred(ActionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean entriesList_sempred(EntriesListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean nonEmptyArgList_sempred(NonEmptyArgListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionList_sempred(ExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 3);
		case 31:
			return precpred(_ctx, 2);
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 25);
		case 34:
			return precpred(_ctx, 24);
		case 35:
			return precpred(_ctx, 23);
		case 36:
			return precpred(_ctx, 22);
		case 37:
			return precpred(_ctx, 21);
		case 38:
			return precpred(_ctx, 20);
		case 39:
			return precpred(_ctx, 19);
		case 40:
			return precpred(_ctx, 18);
		case 41:
			return precpred(_ctx, 17);
		case 42:
			return precpred(_ctx, 16);
		case 43:
			return precpred(_ctx, 15);
		case 44:
			return precpred(_ctx, 14);
		case 45:
			return precpred(_ctx, 13);
		case 46:
			return precpred(_ctx, 12);
		case 47:
			return precpred(_ctx, 11);
		case 48:
			return precpred(_ctx, 10);
		case 49:
			return precpred(_ctx, 9);
		case 50:
			return precpred(_ctx, 8);
		case 51:
			return precpred(_ctx, 7);
		case 52:
			return precpred(_ctx, 6);
		case 53:
			return precpred(_ctx, 5);
		case 54:
			return precpred(_ctx, 4);
		case 55:
			return precpred(_ctx, 36);
		case 56:
			return precpred(_ctx, 35);
		case 57:
			return precpred(_ctx, 26);
		case 58:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3k\u065a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\7\4\u0106\n\4\f\4\16\4\u0109\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u0116\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u012f\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0141"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u014a\n\b\3\t\3\t\5\t\u014e\n\t\3"+
		"\n\3\n\3\n\3\n\5\n\u0154\n\n\3\13\3\13\5\13\u0158\n\13\3\f\3\f\5\f\u015c"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u0163\n\r\f\r\16\r\u0166\13\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0174\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u017e\n\17\f\17\16\17\u0181\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u01d6\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01de\n\21\f\21\16\21"+
		"\u01e1\13\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u01e9\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u01f1\n\24\f\24\16\24\u01f4\13\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0202\n\25\3\26"+
		"\3\26\3\26\3\26\5\26\u0208\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0234\n\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\7\32\u023d\n\32\f\32\16\32\u0240\13\32\3\33\3\33\5\33\u0244"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u024b\n\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u0259\n\37\f\37\16\37\u025c\13"+
		"\37\3 \3 \3 \3 \5 \u0262\n \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\7\"\u0271\n\"\f\"\16\"\u0274\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\7$\u0281\n$\f$\16$\u0284\13$\3%\3%\3%\3%\3%\5%\u028b\n%\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\5\'\u0295\n\'\3(\3(\3(\3(\5(\u029b\n(\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3*\3*\3*\7*\u02a8\n*\f*\16*\u02ab\13*\3+\3+\3+\3+\3+\3,\3,\5,\u02b4"+
		"\n,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\7.\u02c2\n.\f.\16.\u02c5\13.\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02d2\n/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u02f5\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u030a\n\63\f\63\16\63\u030d"+
		"\13\63\3\64\3\64\3\64\3\64\3\64\5\64\u0314\n\64\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u032a\n\66\3\67\3\67\3\67\7\67\u032f\n\67\f\67\16\67\u0332"+
		"\13\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\59\u034b\n9\3:\3:\3:\3:\3:\5:\u0352\n:\3;\3;\5;\u0356\n;\3<\3<"+
		"\3<\3<\5<\u035c\n<\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0394\nA\3B\3B\3B\5B\u0399"+
		"\nB\3C\3C\3C\3C\3C\5C\u03a0\nC\3D\3D\3D\3D\3D\3D\7D\u03a8\nD\fD\16D\u03ab"+
		"\13D\3E\3E\3E\3E\5E\u03b1\nE\3F\3F\5F\u03b5\nF\3F\3F\3F\7F\u03ba\nF\f"+
		"F\16F\u03bd\13F\3G\3G\3G\5G\u03c2\nG\3H\3H\3H\3H\3H\3H\7H\u03ca\nH\fH"+
		"\16H\u03cd\13H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03dc\nI\3J\3"+
		"J\3J\3J\5J\u03e2\nJ\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3M\3M\3"+
		"M\3M\3M\3M\3M\3N\3N\3N\3N\3N\7N\u03fe\nN\fN\16N\u0401\13N\3O\3O\3O\3O"+
		"\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u041a\nP"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u0422\nQ\fQ\16Q\u0425\13Q\3R\3R\3R\3R\3S\3S\3S\3"+
		"S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\7U\u043b\nU\fU\16U\u043e\13U\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0454\nV"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0463\nW\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\5X\u046d\nX\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\5[\u047a\n[\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u048a\n\\\3]\3"+
		"]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\5^\u049c\n^\3_\3_\3_\3_\3"+
		"_\3`\3`\3`\7`\u04a6\n`\f`\16`\u04a9\13`\3a\3a\3a\3a\3a\3a\3a\3a\3b\3b"+
		"\3b\7b\u04b6\nb\fb\16b\u04b9\13b\3c\3c\3c\3c\3c\3c\3c\5c\u04c2\nc\3d\3"+
		"d\5d\u04c6\nd\3e\3e\3e\3e\5e\u04cc\ne\3f\3f\3f\3f\3f\3f\3f\3g\3g\3g\3"+
		"g\3g\7g\u04da\ng\fg\16g\u04dd\13g\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\5h\u0509\nh\3i\3i\3i\7i\u050e\ni\fi\16i\u0511\13"+
		"i\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3k\7k\u051e\nk\fk\16k\u0521\13k\3l\3l"+
		"\3l\3l\3l\3l\3l\3l\3l\5l\u052c\nl\3m\3m\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n"+
		"\3n\3n\3n\3n\3n\3n\3n\5n\u0541\nn\3o\3o\3o\3o\3o\7o\u0548\no\fo\16o\u054b"+
		"\13o\3p\3p\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u0560"+
		"\nq\3r\3r\3r\3r\3r\3r\3r\3r\3s\3s\3s\5s\u056d\ns\3t\3t\3u\3u\3u\3v\3v"+
		"\5v\u0576\nv\3w\3w\3w\3w\3w\3w\7w\u057e\nw\fw\16w\u0581\13w\3x\3x\3x\3"+
		"x\3x\3x\5x\u0589\nx\3y\3y\5y\u058d\ny\3y\3y\3y\7y\u0592\ny\fy\16y\u0595"+
		"\13y\3z\3z\3z\3z\5z\u059b\nz\3{\3{\3{\5{\u05a0\n{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\3{\3{\3{\3{\3{\7{\u05b1\n{\f{\16{\u05b4\13{\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u05dd\n|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\7|\u063c\n|\f|\16|\u063f"+
		"\13|\3}\3}\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3"+
		"~\3~\5~\u0658\n~\3~\2\37\6\30\34 &\62<BFRZdl\u0086\u008a\u008e\u009a\u00a0"+
		"\u00a8\u00be\u00c2\u00cc\u00d0\u00d4\u00dc\u00ec\u00f0\u00f4\u00f6\177"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\2\3\3\2ij\2\u070c\2\u00fc\3"+
		"\2\2\2\4\u00fe\3\2\2\2\6\u0100\3\2\2\2\b\u0115\3\2\2\2\n\u012e\3\2\2\2"+
		"\f\u0140\3\2\2\2\16\u0149\3\2\2\2\20\u014d\3\2\2\2\22\u0153\3\2\2\2\24"+
		"\u0157\3\2\2\2\26\u015b\3\2\2\2\30\u015d\3\2\2\2\32\u0173\3\2\2\2\34\u0175"+
		"\3\2\2\2\36\u01d5\3\2\2\2 \u01d7\3\2\2\2\"\u01e2\3\2\2\2$\u01e8\3\2\2"+
		"\2&\u01ea\3\2\2\2(\u0201\3\2\2\2*\u0207\3\2\2\2,\u0209\3\2\2\2.\u0233"+
		"\3\2\2\2\60\u0235\3\2\2\2\62\u0239\3\2\2\2\64\u0243\3\2\2\2\66\u024a\3"+
		"\2\2\28\u024c\3\2\2\2:\u024e\3\2\2\2<\u0255\3\2\2\2>\u0261\3\2\2\2@\u0263"+
		"\3\2\2\2B\u026b\3\2\2\2D\u0275\3\2\2\2F\u027d\3\2\2\2H\u028a\3\2\2\2J"+
		"\u028c\3\2\2\2L\u0294\3\2\2\2N\u029a\3\2\2\2P\u029c\3\2\2\2R\u02a4\3\2"+
		"\2\2T\u02ac\3\2\2\2V\u02b3\3\2\2\2X\u02b5\3\2\2\2Z\u02bb\3\2\2\2\\\u02d1"+
		"\3\2\2\2^\u02f4\3\2\2\2`\u02f6\3\2\2\2b\u02fe\3\2\2\2d\u0306\3\2\2\2f"+
		"\u0313\3\2\2\2h\u0315\3\2\2\2j\u0329\3\2\2\2l\u032b\3\2\2\2n\u0333\3\2"+
		"\2\2p\u034a\3\2\2\2r\u0351\3\2\2\2t\u0355\3\2\2\2v\u035b\3\2\2\2x\u035d"+
		"\3\2\2\2z\u035f\3\2\2\2|\u0364\3\2\2\2~\u0369\3\2\2\2\u0080\u0393\3\2"+
		"\2\2\u0082\u0398\3\2\2\2\u0084\u039f\3\2\2\2\u0086\u03a1\3\2\2\2\u0088"+
		"\u03b0\3\2\2\2\u008a\u03b4\3\2\2\2\u008c\u03c1\3\2\2\2\u008e\u03c3\3\2"+
		"\2\2\u0090\u03db\3\2\2\2\u0092\u03e1\3\2\2\2\u0094\u03e3\3\2\2\2\u0096"+
		"\u03ea\3\2\2\2\u0098\u03f1\3\2\2\2\u009a\u03f8\3\2\2\2\u009c\u0402\3\2"+
		"\2\2\u009e\u0419\3\2\2\2\u00a0\u041b\3\2\2\2\u00a2\u0426\3\2\2\2\u00a4"+
		"\u042a\3\2\2\2\u00a6\u042f\3\2\2\2\u00a8\u0434\3\2\2\2\u00aa\u0453\3\2"+
		"\2\2\u00ac\u0462\3\2\2\2\u00ae\u046c\3\2\2\2\u00b0\u046e\3\2\2\2\u00b2"+
		"\u0470\3\2\2\2\u00b4\u0479\3\2\2\2\u00b6\u0489\3\2\2\2\u00b8\u048b\3\2"+
		"\2\2\u00ba\u049b\3\2\2\2\u00bc\u049d\3\2\2\2\u00be\u04a2\3\2\2\2\u00c0"+
		"\u04aa\3\2\2\2\u00c2\u04b2\3\2\2\2\u00c4\u04c1\3\2\2\2\u00c6\u04c5\3\2"+
		"\2\2\u00c8\u04cb\3\2\2\2\u00ca\u04cd\3\2\2\2\u00cc\u04d4\3\2\2\2\u00ce"+
		"\u0508\3\2\2\2\u00d0\u050a\3\2\2\2\u00d2\u0512\3\2\2\2\u00d4\u0518\3\2"+
		"\2\2\u00d6\u052b\3\2\2\2\u00d8\u052d\3\2\2\2\u00da\u0540\3\2\2\2\u00dc"+
		"\u0542\3\2\2\2\u00de\u054c\3\2\2\2\u00e0\u055f\3\2\2\2\u00e2\u0561\3\2"+
		"\2\2\u00e4\u056c\3\2\2\2\u00e6\u056e\3\2\2\2\u00e8\u0570\3\2\2\2\u00ea"+
		"\u0575\3\2\2\2\u00ec\u0577\3\2\2\2\u00ee\u0588\3\2\2\2\u00f0\u058c\3\2"+
		"\2\2\u00f2\u059a\3\2\2\2\u00f4\u059f\3\2\2\2\u00f6\u05dc\3\2\2\2\u00f8"+
		"\u0640\3\2\2\2\u00fa\u0657\3\2\2\2\u00fc\u00fd\5\4\3\2\u00fd\3\3\2\2\2"+
		"\u00fe\u00ff\5\6\4\2\u00ff\5\3\2\2\2\u0100\u0107\b\4\1\2\u0101\u0102\f"+
		"\4\2\2\u0102\u0106\5\b\5\2\u0103\u0104\f\3\2\2\u0104\u0106\7W\2\2\u0105"+
		"\u0101\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\7\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u0116"+
		"\5\u00e2r\2\u010b\u0116\5j\66\2\u010c\u0116\5\u00dep\2\u010d\u0116\5:"+
		"\36\2\u010e\u0116\5\u0090I\2\u010f\u0116\5`\61\2\u0110\u0116\5.\30\2\u0111"+
		"\u0116\5\u00a4S\2\u0112\u0116\5\u00a6T\2\u0113\u0116\5\u00e8u\2\u0114"+
		"\u0116\5\n\6\2\u0115\u010a\3\2\2\2\u0115\u010b\3\2\2\2\u0115\u010c\3\2"+
		"\2\2\u0115\u010d\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0115"+
		"\u0110\3\2\2\2\u0115\u0111\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0114\3\2\2\2\u0116\t\3\2\2\2\u0117\u0118\7^\2\2\u0118\u012f"+
		"\5\f\7\2\u0119\u011a\7_\2\2\u011a\u011b\5\u00f8}\2\u011b\u011c\5\u00f6"+
		"|\2\u011c\u012f\3\2\2\2\u011d\u011e\7_\2\2\u011e\u012f\5\u00f8}\2\u011f"+
		"\u012f\7_\2\2\u0120\u012f\7`\2\2\u0121\u012f\7e\2\2\u0122\u0123\7a\2\2"+
		"\u0123\u012f\5\u00f8}\2\u0124\u012f\7a\2\2\u0125\u0126\7b\2\2\u0126\u012f"+
		"\5\u00f8}\2\u0127\u012f\7b\2\2\u0128\u0129\7f\2\2\u0129\u012f\5\u00f6"+
		"|\2\u012a\u012b\7c\2\2\u012b\u012f\5\u00f6|\2\u012c\u012f\7g\2\2\u012d"+
		"\u012f\7d\2\2\u012e\u0117\3\2\2\2\u012e\u0119\3\2\2\2\u012e\u011d\3\2"+
		"\2\2\u012e\u011f\3\2\2\2\u012e\u0120\3\2\2\2\u012e\u0121\3\2\2\2\u012e"+
		"\u0122\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u0127\3\2"+
		"\2\2\u012e\u0128\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\13\3\2\2\2\u0130\u0141\7]\2\2\u0131\u0132\7O\2\2"+
		"\u0132\u0133\5\f\7\2\u0133\u0134\7P\2\2\u0134\u0141\3\2\2\2\u0135\u0141"+
		"\5\20\t\2\u0136\u0137\5\20\t\2\u0137\u0138\7U\2\2\u0138\u0139\5\20\t\2"+
		"\u0139\u0141\3\2\2\2\u013a\u013b\7\3\2\2\u013b\u0141\5\f\7\2\u013c\u013d"+
		"\7\4\2\2\u013d\u0141\5\f\7\2\u013e\u013f\7C\2\2\u013f\u0141\5\f\7\2\u0140"+
		"\u0130\3\2\2\2\u0140\u0131\3\2\2\2\u0140\u0135\3\2\2\2\u0140\u0136\3\2"+
		"\2\2\u0140\u013a\3\2\2\2\u0140\u013c\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\r\3\2\2\2\u0142\u014a\5\u00f8}\2\u0143\u014a\7\t\2\2\u0144\u014a\7\35"+
		"\2\2\u0145\u014a\7\b\2\2\u0146\u014a\7&\2\2\u0147\u014a\7\21\2\2\u0148"+
		"\u014a\7 \2\2\u0149\u0142\3\2\2\2\u0149\u0143\3\2\2\2\u0149\u0144\3\2"+
		"\2\2\u0149\u0145\3\2\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\17\3\2\2\2\u014b\u014e\5\16\b\2\u014c\u014e\5\u00f8"+
		"}\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\21\3\2\2\2\u014f\u0154"+
		"\5\u00f8}\2\u0150\u0154\7\t\2\2\u0151\u0154\7&\2\2\u0152\u0154\7 \2\2"+
		"\u0153\u014f\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0152"+
		"\3\2\2\2\u0154\23\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0158\7\f\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\25\3\2\2\2\u0159\u015c\3\2\2"+
		"\2\u015a\u015c\5\30\r\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\27\3\2\2\2\u015d\u015e\b\r\1\2\u015e\u015f\5\32\16\2\u015f\u0164\3\2"+
		"\2\2\u0160\u0161\f\3\2\2\u0161\u0163\5\32\16\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\31\3\2\2"+
		"\2\u0166\u0164\3\2\2\2\u0167\u0168\7X\2\2\u0168\u0174\5\20\t\2\u0169\u016a"+
		"\7X\2\2\u016a\u016b\5\20\t\2\u016b\u016c\7I\2\2\u016c\u016d\5\34\17\2"+
		"\u016d\u016e\7J\2\2\u016e\u0174\3\2\2\2\u016f\u0170\7\5\2\2\u0170\u0171"+
		"\5\20\t\2\u0171\u0172\5\34\17\2\u0172\u0174\3\2\2\2\u0173\u0167\3\2\2"+
		"\2\u0173\u0169\3\2\2\2\u0173\u016f\3\2\2\2\u0174\33\3\2\2\2\u0175\u017f"+
		"\b\17\1\2\u0176\u0177\f\4\2\2\u0177\u0178\7I\2\2\u0178\u0179\5\34\17\2"+
		"\u0179\u017a\7J\2\2\u017a\u017e\3\2\2\2\u017b\u017c\f\3\2\2\u017c\u017e"+
		"\5\36\20\2\u017d\u0176\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2"+
		"\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\35\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0182\u01d6\7Y\2\2\u0183\u01d6\7\6\2\2\u0184\u01d6\7\7\2\2\u0185"+
		"\u01d6\7\b\2\2\u0186\u01d6\7\t\2\2\u0187\u01d6\7\n\2\2\u0188\u01d6\7\13"+
		"\2\2\u0189\u01d6\7\f\2\2\u018a\u01d6\7\r\2\2\u018b\u01d6\7\16\2\2\u018c"+
		"\u01d6\7\20\2\2\u018d\u01d6\7\21\2\2\u018e\u01d6\7\22\2\2\u018f\u01d6"+
		"\7\23\2\2\u0190\u01d6\7\24\2\2\u0191\u01d6\7\25\2\2\u0192\u01d6\7\26\2"+
		"\2\u0193\u01d6\7\27\2\2\u0194\u01d6\7\30\2\2\u0195\u01d6\7\31\2\2\u0196"+
		"\u01d6\7\32\2\2\u0197\u01d6\7\33\2\2\u0198\u01d6\7\34\2\2\u0199\u01d6"+
		"\7\35\2\2\u019a\u01d6\7\37\2\2\u019b\u01d6\7 \2\2\u019c\u01d6\7!\2\2\u019d"+
		"\u01d6\7\"\2\2\u019e\u01d6\7#\2\2\u019f\u01d6\7\5\2\2\u01a0\u01d6\7$\2"+
		"\2\u01a1\u01d6\7%\2\2\u01a2\u01d6\7&\2\2\u01a3\u01d6\7(\2\2\u01a4\u01d6"+
		"\7)\2\2\u01a5\u01d6\7*\2\2\u01a6\u01d6\7+\2\2\u01a7\u01d6\7,\2\2\u01a8"+
		"\u01d6\7-\2\2\u01a9\u01d6\7.\2\2\u01aa\u01d6\7/\2\2\u01ab\u01d6\7\60\2"+
		"\2\u01ac\u01d6\7\61\2\2\u01ad\u01d6\7\62\2\2\u01ae\u01d6\7\63\2\2\u01af"+
		"\u01d6\5\u00f8}\2\u01b0\u01d6\7]\2\2\u01b1\u01d6\7k\2\2\u01b2\u01d6\7"+
		"\64\2\2\u01b3\u01d6\7\65\2\2\u01b4\u01d6\7\66\2\2\u01b5\u01d6\7\67\2\2"+
		"\u01b6\u01d6\78\2\2\u01b7\u01d6\79\2\2\u01b8\u01d6\7:\2\2\u01b9\u01d6"+
		"\7;\2\2\u01ba\u01d6\7<\2\2\u01bb\u01d6\7=\2\2\u01bc\u01d6\7>\2\2\u01bd"+
		"\u01d6\7?\2\2\u01be\u01d6\7@\2\2\u01bf\u01d6\7A\2\2\u01c0\u01d6\7B\2\2"+
		"\u01c1\u01d6\7C\2\2\u01c2\u01d6\7D\2\2\u01c3\u01d6\7E\2\2\u01c4\u01d6"+
		"\7F\2\2\u01c5\u01d6\7G\2\2\u01c6\u01d6\7H\2\2\u01c7\u01d6\7K\2\2\u01c8"+
		"\u01d6\7L\2\2\u01c9\u01d6\7M\2\2\u01ca\u01d6\7N\2\2\u01cb\u01d6\7O\2\2"+
		"\u01cc\u01d6\7P\2\2\u01cd\u01d6\7Q\2\2\u01ce\u01d6\7R\2\2\u01cf\u01d6"+
		"\7S\2\2\u01d0\u01d6\7T\2\2\u01d1\u01d6\7U\2\2\u01d2\u01d6\7V\2\2\u01d3"+
		"\u01d6\7W\2\2\u01d4\u01d6\7X\2\2\u01d5\u0182\3\2\2\2\u01d5\u0183\3\2\2"+
		"\2\u01d5\u0184\3\2\2\2\u01d5\u0185\3\2\2\2\u01d5\u0186\3\2\2\2\u01d5\u0187"+
		"\3\2\2\2\u01d5\u0188\3\2\2\2\u01d5\u0189\3\2\2\2\u01d5\u018a\3\2\2\2\u01d5"+
		"\u018b\3\2\2\2\u01d5\u018c\3\2\2\2\u01d5\u018d\3\2\2\2\u01d5\u018e\3\2"+
		"\2\2\u01d5\u018f\3\2\2\2\u01d5\u0190\3\2\2\2\u01d5\u0191\3\2\2\2\u01d5"+
		"\u0192\3\2\2\2\u01d5\u0193\3\2\2\2\u01d5\u0194\3\2\2\2\u01d5\u0195\3\2"+
		"\2\2\u01d5\u0196\3\2\2\2\u01d5\u0197\3\2\2\2\u01d5\u0198\3\2\2\2\u01d5"+
		"\u0199\3\2\2\2\u01d5\u019a\3\2\2\2\u01d5\u019b\3\2\2\2\u01d5\u019c\3\2"+
		"\2\2\u01d5\u019d\3\2\2\2\u01d5\u019e\3\2\2\2\u01d5\u019f\3\2\2\2\u01d5"+
		"\u01a0\3\2\2\2\u01d5\u01a1\3\2\2\2\u01d5\u01a2\3\2\2\2\u01d5\u01a3\3\2"+
		"\2\2\u01d5\u01a4\3\2\2\2\u01d5\u01a5\3\2\2\2\u01d5\u01a6\3\2\2\2\u01d5"+
		"\u01a7\3\2\2\2\u01d5\u01a8\3\2\2\2\u01d5\u01a9\3\2\2\2\u01d5\u01aa\3\2"+
		"\2\2\u01d5\u01ab\3\2\2\2\u01d5\u01ac\3\2\2\2\u01d5\u01ad\3\2\2\2\u01d5"+
		"\u01ae\3\2\2\2\u01d5\u01af\3\2\2\2\u01d5\u01b0\3\2\2\2\u01d5\u01b1\3\2"+
		"\2\2\u01d5\u01b2\3\2\2\2\u01d5\u01b3\3\2\2\2\u01d5\u01b4\3\2\2\2\u01d5"+
		"\u01b5\3\2\2\2\u01d5\u01b6\3\2\2\2\u01d5\u01b7\3\2\2\2\u01d5\u01b8\3\2"+
		"\2\2\u01d5\u01b9\3\2\2\2\u01d5\u01ba\3\2\2\2\u01d5\u01bb\3\2\2\2\u01d5"+
		"\u01bc\3\2\2\2\u01d5\u01bd\3\2\2\2\u01d5\u01be\3\2\2\2\u01d5\u01bf\3\2"+
		"\2\2\u01d5\u01c0\3\2\2\2\u01d5\u01c1\3\2\2\2\u01d5\u01c2\3\2\2\2\u01d5"+
		"\u01c3\3\2\2\2\u01d5\u01c4\3\2\2\2\u01d5\u01c5\3\2\2\2\u01d5\u01c6\3\2"+
		"\2\2\u01d5\u01c7\3\2\2\2\u01d5\u01c8\3\2\2\2\u01d5\u01c9\3\2\2\2\u01d5"+
		"\u01ca\3\2\2\2\u01d5\u01cb\3\2\2\2\u01d5\u01cc\3\2\2\2\u01d5\u01cd\3\2"+
		"\2\2\u01d5\u01ce\3\2\2\2\u01d5\u01cf\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d5"+
		"\u01d1\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2"+
		"\2\2\u01d6\37\3\2\2\2\u01d7\u01d8\b\21\1\2\u01d8\u01d9\5\"\22\2\u01d9"+
		"\u01df\3\2\2\2\u01da\u01db\f\3\2\2\u01db\u01dc\7S\2\2\u01dc\u01de\5\""+
		"\22\2\u01dd\u01da\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0!\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\5\20\t\2"+
		"\u01e3\u01e4\7V\2\2\u01e4\u01e5\5\u00f6|\2\u01e5#\3\2\2\2\u01e6\u01e9"+
		"\3\2\2\2\u01e7\u01e9\5&\24\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"%\3\2\2\2\u01ea\u01eb\b\24\1\2\u01eb\u01ec\5(\25\2\u01ec\u01f2\3\2\2\2"+
		"\u01ed\u01ee\f\3\2\2\u01ee\u01ef\7S\2\2\u01ef\u01f1\5(\25\2\u01f0\u01ed"+
		"\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\'\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\5\26\f\2\u01f6\u01f7\5*\26"+
		"\2\u01f7\u01f8\5r:\2\u01f8\u01f9\5\20\t\2\u01f9\u0202\3\2\2\2\u01fa\u01fb"+
		"\5\26\f\2\u01fb\u01fc\5*\26\2\u01fc\u01fd\5r:\2\u01fd\u01fe\5\20\t\2\u01fe"+
		"\u01ff\7V\2\2\u01ff\u0200\5\u00f6|\2\u0200\u0202\3\2\2\2\u0201\u01f5\3"+
		"\2\2\2\u0201\u01fa\3\2\2\2\u0202)\3\2\2\2\u0203\u0208\7\32\2\2\u0204\u0208"+
		"\7!\2\2\u0205\u0208\7\33\2\2\u0206\u0208\3\2\2\2\u0207\u0203\3\2\2\2\u0207"+
		"\u0204\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208+\3\2\2\2"+
		"\u0209\u020a\5\26\f\2\u020a\u020b\7#\2\2\u020b\u020c\5\20\t\2\u020c\u020d"+
		"\5\u0084C\2\u020d\u020e\7I\2\2\u020e\u020f\5$\23\2\u020f\u0210\7J\2\2"+
		"\u0210-\3\2\2\2\u0211\u0212\5\30\r\2\u0212\u0213\5r:\2\u0213\u0214\7I"+
		"\2\2\u0214\u0215\5\u00eav\2\u0215\u0216\7J\2\2\u0216\u0217\5\20\t\2\u0217"+
		"\u0218\7W\2\2\u0218\u0234\3\2\2\2\u0219\u021a\5r:\2\u021a\u021b\7I\2\2"+
		"\u021b\u021c\5\u00eav\2\u021c\u021d\7J\2\2\u021d\u021e\5\20\t\2\u021e"+
		"\u021f\7W\2\2\u021f\u0234\3\2\2\2\u0220\u0221\5\30\r\2\u0221\u0222\5r"+
		":\2\u0222\u0223\7I\2\2\u0223\u0224\5\u00eav\2\u0224\u0225\7J\2\2\u0225"+
		"\u0226\5\20\t\2\u0226\u0227\7V\2\2\u0227\u0228\5\60\31\2\u0228\u0229\7"+
		"W\2\2\u0229\u0234\3\2\2\2\u022a\u022b\5r:\2\u022b\u022c\7I\2\2\u022c\u022d"+
		"\5\u00eav\2\u022d\u022e\7J\2\2\u022e\u022f\5\20\t\2\u022f\u0230\7V\2\2"+
		"\u0230\u0231\5\60\31\2\u0231\u0232\7W\2\2\u0232\u0234\3\2\2\2\u0233\u0211"+
		"\3\2\2\2\u0233\u0219\3\2\2\2\u0233\u0220\3\2\2\2\u0233\u022a\3\2\2\2\u0234"+
		"/\3\2\2\2\u0235\u0236\7M\2\2\u0236\u0237\5\62\32\2\u0237\u0238\7N\2\2"+
		"\u0238\61\3\2\2\2\u0239\u023e\b\32\1\2\u023a\u023b\f\3\2\2\u023b\u023d"+
		"\5\64\33\2\u023c\u023a\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2"+
		"\u023e\u023f\3\2\2\2\u023f\63\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0244"+
		"\5\u00e8u\2\u0242\u0244\5.\30\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2"+
		"\2\u0244\65\3\2\2\2\u0245\u024b\3\2\2\2\u0246\u0247\7I\2\2\u0247\u0248"+
		"\5$\23\2\u0248\u0249\7J\2\2\u0249\u024b\3\2\2\2\u024a\u0245\3\2\2\2\u024a"+
		"\u0246\3\2\2\2\u024b\67\3\2\2\2\u024c\u024d\7U\2\2\u024d9\3\2\2\2\u024e"+
		"\u024f\5@!\2\u024f\u0250\5\66\34\2\u0250\u0251\7M\2\2\u0251\u0252\5<\37"+
		"\2\u0252\u0253\5B\"\2\u0253\u0254\7N\2\2\u0254;\3\2\2\2\u0255\u025a\b"+
		"\37\1\2\u0256\u0257\f\3\2\2\u0257\u0259\5> \2\u0258\u0256\3\2\2\2\u0259"+
		"\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b=\3\2\2\2"+
		"\u025c\u025a\3\2\2\2\u025d\u0262\5\u00e2r\2\u025e\u0262\5.\30\2\u025f"+
		"\u0262\5\u00e0q\2\u0260\u0262\5^\60\2\u0261\u025d\3\2\2\2\u0261\u025e"+
		"\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0260\3\2\2\2\u0262?\3\2\2\2\u0263"+
		"\u0264\5\26\f\2\u0264\u0265\7\"\2\2\u0265\u0266\5\20\t\2\u0266\u0267\5"+
		"\u0084C\2\u0267\u0268\7I\2\2\u0268\u0269\5$\23\2\u0269\u026a\7J\2\2\u026a"+
		"A\3\2\2\2\u026b\u026c\b\"\1\2\u026c\u026d\5D#\2\u026d\u0272\3\2\2\2\u026e"+
		"\u026f\f\3\2\2\u026f\u0271\5D#\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2"+
		"\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273C\3\2\2\2\u0274\u0272"+
		"\3\2\2\2\u0275\u0276\5\26\f\2\u0276\u0277\7&\2\2\u0277\u0278\5\20\t\2"+
		"\u0278\u0279\7M\2\2\u0279\u027a\5F$\2\u027a\u027b\5L\'\2\u027b\u027c\7"+
		"N\2\2\u027cE\3\2\2\2\u027d\u0282\b$\1\2\u027e\u027f\f\3\2\2\u027f\u0281"+
		"\5H%\2\u0280\u027e\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283G\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u028b\5\u00ae"+
		"X\2\u0286\u028b\5\u00b8]\2\u0287\u028b\5\u00e0q\2\u0288\u028b\5\u00e2"+
		"r\2\u0289\u028b\5J&\2\u028a\u0285\3\2\2\2\u028a\u0286\3\2\2\2\u028a\u0287"+
		"\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u0289\3\2\2\2\u028bI\3\2\2\2\u028c"+
		"\u028d\5\26\f\2\u028d\u028e\7M\2\2\u028e\u028f\5F$\2\u028f\u0290\7N\2"+
		"\2\u0290K\3\2\2\2\u0291\u0295\3\2\2\2\u0292\u0293\7,\2\2\u0293\u0295\5"+
		"N(\2\u0294\u0291\3\2\2\2\u0294\u0292\3\2\2\2\u0295M\3\2\2\2\u0296\u0297"+
		"\5\20\t\2\u0297\u0298\7W\2\2\u0298\u029b\3\2\2\2\u0299\u029b\5P)\2\u029a"+
		"\u0296\3\2\2\2\u029a\u0299\3\2\2\2\u029bO\3\2\2\2\u029c\u029d\7%\2\2\u029d"+
		"\u029e\7I\2\2\u029e\u029f\5\u00f0y\2\u029f\u02a0\7J\2\2\u02a0\u02a1\7"+
		"M\2\2\u02a1\u02a2\5R*\2\u02a2\u02a3\7N\2\2\u02a3Q\3\2\2\2\u02a4\u02a9"+
		"\b*\1\2\u02a5\u02a6\f\3\2\2\u02a6\u02a8\5T+\2\u02a7\u02a5\3\2\2\2\u02a8"+
		"\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aaS\3\2\2\2"+
		"\u02ab\u02a9\3\2\2\2\u02ac\u02ad\5V,\2\u02ad\u02ae\7R\2\2\u02ae\u02af"+
		"\5\20\t\2\u02af\u02b0\7W\2\2\u02b0U\3\2\2\2\u02b1\u02b4\5X-\2\u02b2\u02b4"+
		"\5\\/\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4W\3\2\2\2\u02b5\u02b6"+
		"\7I\2\2\u02b6\u02b7\5\\/\2\u02b7\u02b8\7S\2\2\u02b8\u02b9\5Z.\2\u02b9"+
		"\u02ba\7J\2\2\u02baY\3\2\2\2\u02bb\u02bc\b.\1\2\u02bc\u02bd\5\\/\2\u02bd"+
		"\u02c3\3\2\2\2\u02be\u02bf\f\3\2\2\u02bf\u02c0\7S\2\2\u02c0\u02c2\5\\"+
		"/\2\u02c1\u02be\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4[\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02d2\5\u00f6"+
		"|\2\u02c7\u02c8\5\u00f6|\2\u02c8\u02c9\7\64\2\2\u02c9\u02ca\5\u00f6|\2"+
		"\u02ca\u02d2\3\2\2\2\u02cb\u02cc\5\u00f6|\2\u02cc\u02cd\7\65\2\2\u02cd"+
		"\u02ce\5\u00f6|\2\u02ce\u02d2\3\2\2\2\u02cf\u02d2\7\16\2\2\u02d0\u02d2"+
		"\7\63\2\2\u02d1\u02c6\3\2\2\2\u02d1\u02c7\3\2\2\2\u02d1\u02cb\3\2\2\2"+
		"\u02d1\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2]\3\2\2\2\u02d3\u02d4\5"+
		"\26\f\2\u02d4\u02d5\7\61\2\2\u02d5\u02d6\7O\2\2\u02d6\u02d7\5\u0080A\2"+
		"\u02d7\u02d8\7P\2\2\u02d8\u02d9\7I\2\2\u02d9\u02da\5\u00f6|\2\u02da\u02db"+
		"\7J\2\2\u02db\u02dc\5\20\t\2\u02dc\u02dd\7W\2\2\u02dd\u02f5\3\2\2\2\u02de"+
		"\u02df\5\26\f\2\u02df\u02e0\7\61\2\2\u02e0\u02e1\7O\2\2\u02e1\u02e2\5"+
		"z>\2\u02e2\u02e3\7P\2\2\u02e3\u02e4\7I\2\2\u02e4\u02e5\5\u00f6|\2\u02e5"+
		"\u02e6\7J\2\2\u02e6\u02e7\5\20\t\2\u02e7\u02e8\7W\2\2\u02e8\u02f5\3\2"+
		"\2\2\u02e9\u02ea\5\26\f\2\u02ea\u02eb\7\61\2\2\u02eb\u02ec\7O\2\2\u02ec"+
		"\u02ed\5x=\2\u02ed\u02ee\7P\2\2\u02ee\u02ef\7I\2\2\u02ef\u02f0\5\u00f6"+
		"|\2\u02f0\u02f1\7J\2\2\u02f1\u02f2\5\20\t\2\u02f2\u02f3\7W\2\2\u02f3\u02f5"+
		"\3\2\2\2\u02f4\u02d3\3\2\2\2\u02f4\u02de\3\2\2\2\u02f4\u02e9\3\2\2\2\u02f5"+
		"_\3\2\2\2\u02f6\u02f7\5b\62\2\u02f7\u02f8\5\66\34\2\u02f8\u02f9\7M\2\2"+
		"\u02f9\u02fa\5d\63\2\u02fa\u02fb\7\t\2\2\u02fb\u02fc\5h\65\2\u02fc\u02fd"+
		"\7N\2\2\u02fda\3\2\2\2\u02fe\u02ff\5\26\f\2\u02ff\u0300\7\r\2\2\u0300"+
		"\u0301\5\20\t\2\u0301\u0302\5\u0084C\2\u0302\u0303\7I\2\2\u0303\u0304"+
		"\5$\23\2\u0304\u0305\7J\2\2\u0305c\3\2\2\2\u0306\u030b\b\63\1\2\u0307"+
		"\u0308\f\3\2\2\u0308\u030a\5f\64\2\u0309\u0307\3\2\2\2\u030a\u030d\3\2"+
		"\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030ce\3\2\2\2\u030d\u030b"+
		"\3\2\2\2\u030e\u0314\5\u00e2r\2\u030f\u0314\5\u00dep\2\u0310\u0314\5\u00ca"+
		"f\2\u0311\u0314\5.\30\2\u0312\u0314\5\u00e0q\2\u0313\u030e\3\2\2\2\u0313"+
		"\u030f\3\2\2\2\u0313\u0310\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0312\3\2"+
		"\2\2\u0314g\3\2\2\2\u0315\u0316\5\u00bc_\2\u0316i\3\2\2\2\u0317\u0318"+
		"\5\26\f\2\u0318\u0319\7\25\2\2\u0319\u031a\5\16\b\2\u031a\u031b\5\u0084"+
		"C\2\u031b\u031c\7M\2\2\u031c\u031d\5l\67\2\u031d\u031e\7N\2\2\u031e\u032a"+
		"\3\2\2\2\u031f\u0320\5\26\f\2\u0320\u0321\7\25\2\2\u0321\u0322\5n8\2\u0322"+
		"\u0323\7W\2\2\u0323\u032a\3\2\2\2\u0324\u0325\5\26\f\2\u0325\u0326\7\25"+
		"\2\2\u0326\u0327\5\20\t\2\u0327\u0328\7W\2\2\u0328\u032a\3\2\2\2\u0329"+
		"\u0317\3\2\2\2\u0329\u031f\3\2\2\2\u0329\u0324\3\2\2\2\u032ak\3\2\2\2"+
		"\u032b\u0330\b\67\1\2\u032c\u032d\f\3\2\2\u032d\u032f\5p9\2\u032e\u032c"+
		"\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"m\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\5\u0082B\2\u0334\u0335\5\20"+
		"\t\2\u0335\u0336\5\u0084C\2\u0336\u0337\7I\2\2\u0337\u0338\5$\23\2\u0338"+
		"\u0339\7J\2\2\u0339o\3\2\2\2\u033a\u033b\5\26\f\2\u033b\u033c\5n8\2\u033c"+
		"\u033d\7W\2\2\u033d\u034b\3\2\2\2\u033e\u033f\5\26\f\2\u033f\u0340\7\6"+
		"\2\2\u0340\u0341\5n8\2\u0341\u0342\7W\2\2\u0342\u034b\3\2\2\2\u0343\u0344"+
		"\5\26\f\2\u0344\u0345\5\u00f8}\2\u0345\u0346\7I\2\2\u0346\u0347\5$\23"+
		"\2\u0347\u0348\7J\2\2\u0348\u0349\7W\2\2\u0349\u034b\3\2\2\2\u034a\u033a"+
		"\3\2\2\2\u034a\u033e\3\2\2\2\u034a\u0343\3\2\2\2\u034bq\3\2\2\2\u034c"+
		"\u0352\5\u0080A\2\u034d\u0352\5x=\2\u034e\u0352\5~@\2\u034f\u0352\5|?"+
		"\2\u0350\u0352\5z>\2\u0351\u034c\3\2\2\2\u0351\u034d\3\2\2\2\u0351\u034e"+
		"\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0350\3\2\2\2\u0352s\3\2\2\2\u0353"+
		"\u0356\5x=\2\u0354\u0356\5~@\2\u0355\u0353\3\2\2\2\u0355\u0354\3\2\2\2"+
		"\u0356u\3\2\2\2\u0357\u035c\5\u00f8}\2\u0358\u0359\58\35\2\u0359\u035a"+
		"\5\u00f8}\2\u035a\u035c\3\2\2\2\u035b\u0357\3\2\2\2\u035b\u0358\3\2\2"+
		"\2\u035cw\3\2\2\2\u035d\u035e\5v<\2\u035ey\3\2\2\2\u035f\u0360\7.\2\2"+
		"\u0360\u0361\7O\2\2\u0361\u0362\5\u008aF\2\u0362\u0363\7P\2\2\u0363{\3"+
		"\2\2\2\u0364\u0365\5x=\2\u0365\u0366\7K\2\2\u0366\u0367\5\u00f6|\2\u0367"+
		"\u0368\7L\2\2\u0368}\3\2\2\2\u0369\u036a\5x=\2\u036a\u036b\7O\2\2\u036b"+
		"\u036c\5\u008aF\2\u036c\u036d\7P\2\2\u036d\177\3\2\2\2\u036e\u0394\7\n"+
		"\2\2\u036f\u0394\7\23\2\2\u0370\u0394\7\13\2\2\u0371\u0394\7\34\2\2\u0372"+
		"\u0373\7\13\2\2\u0373\u0374\7O\2\2\u0374\u0375\7k\2\2\u0375\u0394\7P\2"+
		"\2\u0376\u0377\7\34\2\2\u0377\u0378\7O\2\2\u0378\u0379\7k\2\2\u0379\u0394"+
		"\7P\2\2\u037a\u037b\7\60\2\2\u037b\u037c\7O\2\2\u037c\u037d\7k\2\2\u037d"+
		"\u0394\7P\2\2\u037e\u037f\7\13\2\2\u037f\u0380\7O\2\2\u0380\u0381\7I\2"+
		"\2\u0381\u0382\5\u00f6|\2\u0382\u0383\7J\2\2\u0383\u0384\7P\2\2\u0384"+
		"\u0394\3\2\2\2\u0385\u0386\7\34\2\2\u0386\u0387\7O\2\2\u0387\u0388\7I"+
		"\2\2\u0388\u0389\5\u00f6|\2\u0389\u038a\7J\2\2\u038a\u038b\7P\2\2\u038b"+
		"\u0394\3\2\2\2\u038c\u038d\7\60\2\2\u038d\u038e\7O\2\2\u038e\u038f\7I"+
		"\2\2\u038f\u0390\5\u00f6|\2\u0390\u0391\7J\2\2\u0391\u0392\7P\2\2\u0392"+
		"\u0394\3\2\2\2\u0393\u036e\3\2\2\2\u0393\u036f\3\2\2\2\u0393\u0370\3\2"+
		"\2\2\u0393\u0371\3\2\2\2\u0393\u0372\3\2\2\2\u0393\u0376\3\2\2\2\u0393"+
		"\u037a\3\2\2\2\u0393\u037e\3\2\2\2\u0393\u0385\3\2\2\2\u0393\u038c\3\2"+
		"\2\2\u0394\u0081\3\2\2\2\u0395\u0399\5r:\2\u0396\u0399\7\62\2\2\u0397"+
		"\u0399\5\u00f8}\2\u0398\u0395\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0397"+
		"\3\2\2\2\u0399\u0083\3\2\2\2\u039a\u03a0\3\2\2\2\u039b\u039c\7O\2\2\u039c"+
		"\u039d\5\u0086D\2\u039d\u039e\7P\2\2\u039e\u03a0\3\2\2\2\u039f\u039a\3"+
		"\2\2\2\u039f\u039b\3\2\2\2\u03a0\u0085\3\2\2\2\u03a1\u03a2\bD\1\2\u03a2"+
		"\u03a3\5\20\t\2\u03a3\u03a9\3\2\2\2\u03a4\u03a5\f\3\2\2\u03a5\u03a6\7"+
		"S\2\2\u03a6\u03a8\5\20\t\2\u03a7\u03a4\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9"+
		"\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u0087\3\2\2\2\u03ab\u03a9\3\2"+
		"\2\2\u03ac\u03b1\5r:\2\u03ad\u03b1\5\16\b\2\u03ae\u03b1\7\62\2\2\u03af"+
		"\u03b1\7\63\2\2\u03b0\u03ac\3\2\2\2\u03b0\u03ad\3\2\2\2\u03b0\u03ae\3"+
		"\2\2\2\u03b0\u03af\3\2\2\2\u03b1\u0089\3\2\2\2\u03b2\u03b5\bF\1\2\u03b3"+
		"\u03b5\5\u0088E\2\u03b4\u03b2\3\2\2\2\u03b4\u03b3\3\2\2\2\u03b5\u03bb"+
		"\3\2\2\2\u03b6\u03b7\f\3\2\2\u03b7\u03b8\7S\2\2\u03b8\u03ba\5\u0088E\2"+
		"\u03b9\u03b6\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc"+
		"\3\2\2\2\u03bc\u008b\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03c2\5r:\2\u03bf"+
		"\u03c2\7\62\2\2\u03c0\u03c2\7\63\2\2\u03c1\u03be\3\2\2\2\u03c1\u03bf\3"+
		"\2\2\2\u03c1\u03c0\3\2\2\2\u03c2\u008d\3\2\2\2\u03c3\u03c4\bH\1\2\u03c4"+
		"\u03c5\5\u008cG\2\u03c5\u03cb\3\2\2\2\u03c6\u03c7\f\3\2\2\u03c7\u03c8"+
		"\7S\2\2\u03c8\u03ca\5\u0088E\2\u03c9\u03c6\3\2\2\2\u03ca\u03cd\3\2\2\2"+
		"\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u008f\3\2\2\2\u03cd\u03cb"+
		"\3\2\2\2\u03ce\u03dc\5\u0092J\2\u03cf\u03d0\5\u00aaV\2\u03d0\u03d1\7W"+
		"\2\2\u03d1\u03dc\3\2\2\2\u03d2\u03d3\5@!\2\u03d3\u03d4\7W\2\2\u03d4\u03dc"+
		"\3\2\2\2\u03d5\u03d6\5b\62\2\u03d6\u03d7\7W\2\2\u03d7\u03dc\3\2\2\2\u03d8"+
		"\u03d9\5,\27\2\u03d9\u03da\7W\2\2\u03da\u03dc\3\2\2\2\u03db\u03ce\3\2"+
		"\2\2\u03db\u03cf\3\2\2\2\u03db\u03d2\3\2\2\2\u03db\u03d5\3\2\2\2\u03db"+
		"\u03d8\3\2\2\2\u03dc\u0091\3\2\2\2\u03dd\u03e2\5\u0094K\2\u03de\u03e2"+
		"\5\u0098M\2\u03df\u03e2\5\u0096L\2\u03e0\u03e2\5\u009eP\2\u03e1\u03dd"+
		"\3\2\2\2\u03e1\u03de\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e0\3\2\2\2\u03e2"+
		"\u0093\3\2\2\2\u03e3\u03e4\5\26\f\2\u03e4\u03e5\7\27\2\2\u03e5\u03e6\5"+
		"\20\t\2\u03e6\u03e7\7M\2\2\u03e7\u03e8\5\u009aN\2\u03e8\u03e9\7N\2\2\u03e9"+
		"\u0095\3\2\2\2\u03ea\u03eb\5\26\f\2\u03eb\u03ec\7(\2\2\u03ec\u03ed\5\20"+
		"\t\2\u03ed\u03ee\7M\2\2\u03ee\u03ef\5\u009aN\2\u03ef\u03f0\7N\2\2\u03f0"+
		"\u0097\3\2\2\2\u03f1\u03f2\5\26\f\2\u03f2\u03f3\7\30\2\2\u03f3\u03f4\5"+
		"\20\t\2\u03f4\u03f5\7M\2\2\u03f5\u03f6\5\u009aN\2\u03f6\u03f7\7N\2\2\u03f7"+
		"\u0099\3\2\2\2\u03f8\u03ff\bN\1\2\u03f9\u03fa\f\4\2\2\u03fa\u03fe\5\n"+
		"\6\2\u03fb\u03fc\f\3\2\2\u03fc\u03fe\5\u009cO\2\u03fd\u03f9\3\2\2\2\u03fd"+
		"\u03fb\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2"+
		"\2\2\u0400\u009b\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u0403\5\26\f\2\u0403"+
		"\u0404\5r:\2\u0404\u0405\5\20\t\2\u0405\u0406\7W\2\2\u0406\u009d\3\2\2"+
		"\2\u0407\u0408\5\26\f\2\u0408\u0409\7\22\2\2\u0409\u040a\5\20\t\2\u040a"+
		"\u040b\7M\2\2\u040b\u040c\5\u00a8U\2\u040c\u040d\7N\2\2\u040d\u041a\3"+
		"\2\2\2\u040e\u040f\5\26\f\2\u040f\u0410\7\22\2\2\u0410\u0411\7\13\2\2"+
		"\u0411\u0412\7O\2\2\u0412\u0413\7k\2\2\u0413\u0414\7P\2\2\u0414\u0415"+
		"\5\20\t\2\u0415\u0416\7M\2\2\u0416\u0417\5\u00a0Q\2\u0417\u0418\7N\2\2"+
		"\u0418\u041a\3\2\2\2\u0419\u0407\3\2\2\2\u0419\u040e\3\2\2\2\u041a\u009f"+
		"\3\2\2\2\u041b\u041c\bQ\1\2\u041c\u041d\5\u00a2R\2\u041d\u0423\3\2\2\2"+
		"\u041e\u041f\f\3\2\2\u041f\u0420\7S\2\2\u0420\u0422\5\u00a2R\2\u0421\u041e"+
		"\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424"+
		"\u00a1\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0427\5\20\t\2\u0427\u0428\7"+
		"V\2\2\u0428\u0429\5\u00e6t\2\u0429\u00a3\3\2\2\2\u042a\u042b\7\23\2\2"+
		"\u042b\u042c\7M\2\2\u042c\u042d\5\u00a8U\2\u042d\u042e\7N\2\2\u042e\u00a5"+
		"\3\2\2\2\u042f\u0430\7\37\2\2\u0430\u0431\7M\2\2\u0431\u0432\5\u00a8U"+
		"\2\u0432\u0433\7N\2\2\u0433\u00a7\3\2\2\2\u0434\u0435\bU\1\2\u0435\u0436"+
		"\5\20\t\2\u0436\u043c\3\2\2\2\u0437\u0438\f\3\2\2\u0438\u0439\7S\2\2\u0439"+
		"\u043b\5\20\t\2\u043a\u0437\3\2\2\2\u043b\u043e\3\2\2\2\u043c\u043a\3"+
		"\2\2\2\u043c\u043d\3\2\2\2\u043d\u00a9\3\2\2\2\u043e\u043c\3\2\2\2\u043f"+
		"\u0440\5\26\f\2\u0440\u0441\7/\2\2\u0441\u0442\5r:\2\u0442\u0443\5\20"+
		"\t\2\u0443\u0454\3\2\2\2\u0444\u0445\5\26\f\2\u0445\u0446\7/\2\2\u0446"+
		"\u0447\5\u0092J\2\u0447\u0448\5\20\t\2\u0448\u0454\3\2\2\2\u0449\u044a"+
		"\5\26\f\2\u044a\u044b\7 \2\2\u044b\u044c\5r:\2\u044c\u044d\5\20\t\2\u044d"+
		"\u0454\3\2\2\2\u044e\u044f\5\26\f\2\u044f\u0450\7 \2\2\u0450\u0451\5\u0092"+
		"J\2\u0451\u0452\5\20\t\2\u0452\u0454\3\2\2\2\u0453\u043f\3\2\2\2\u0453"+
		"\u0444\3\2\2\2\u0453\u0449\3\2\2\2\u0453\u044e\3\2\2\2\u0454\u00ab\3\2"+
		"\2\2\u0455\u0456\5\u00f4{\2\u0456\u0457\7I\2\2\u0457\u0458\5\u00eav\2"+
		"\u0458\u0459\7J\2\2\u0459\u0463\3\2\2\2\u045a\u045b\5\u00f4{\2\u045b\u045c"+
		"\7O\2\2\u045c\u045d\5\u008aF\2\u045d\u045e\7P\2\2\u045e\u045f\7I\2\2\u045f"+
		"\u0460\5\u00eav\2\u0460\u0461\7J\2\2\u0461\u0463\3\2\2\2\u0462\u0455\3"+
		"\2\2\2\u0462\u045a\3\2\2\2\u0463\u00ad\3\2\2\2\u0464\u0465\5\u00acW\2"+
		"\u0465\u0466\7W\2\2\u0466\u046d\3\2\2\2\u0467\u0468\5\u00f4{\2\u0468\u0469"+
		"\7V\2\2\u0469\u046a\5\u00f6|\2\u046a\u046b\7W\2\2\u046b\u046d\3\2\2\2"+
		"\u046c\u0464\3\2\2\2\u046c\u0467\3\2\2\2\u046d\u00af\3\2\2\2\u046e\u046f"+
		"\7W\2\2\u046f\u00b1\3\2\2\2\u0470\u0471\7\24\2\2\u0471\u0472\7W\2\2\u0472"+
		"\u00b3\3\2\2\2\u0473\u0474\7$\2\2\u0474\u047a\7W\2\2\u0475\u0476\7$\2"+
		"\2\u0476\u0477\5\u00f6|\2\u0477\u0478\7W\2\2\u0478\u047a\3\2\2\2\u0479"+
		"\u0473\3\2\2\2\u0479\u0475\3\2\2\2\u047a\u00b5\3\2\2\2\u047b\u047c\7\31"+
		"\2\2\u047c\u047d\7I\2\2\u047d\u047e\5\u00f6|\2\u047e\u047f\7J\2\2\u047f"+
		"\u0480\5\u00ba^\2\u0480\u048a\3\2\2\2\u0481\u0482\7\31\2\2\u0482\u0483"+
		"\7I\2\2\u0483\u0484\5\u00f6|\2\u0484\u0485\7J\2\2\u0485\u0486\5\u00ba"+
		"^\2\u0486\u0487\7\20\2\2\u0487\u0488\5\u00ba^\2\u0488\u048a\3\2\2\2\u0489"+
		"\u047b\3\2\2\2\u0489\u0481\3\2\2\2\u048a\u00b7\3\2\2\2\u048b\u048c\5x"+
		"=\2\u048c\u048d\7U\2\2\u048d\u048e\7\t\2\2\u048e\u048f\7I\2\2\u048f\u0490"+
		"\5\u00eav\2\u0490\u0491\7J\2\2\u0491\u0492\7W\2\2\u0492\u00b9\3\2\2\2"+
		"\u0493\u049c\5\u00b8]\2\u0494\u049c\5\u00aeX\2\u0495\u049c\5\u00b6\\\2"+
		"\u0496\u049c\5\u00b0Y\2\u0497\u049c\5\u00bc_\2\u0498\u049c\5\u00b4[\2"+
		"\u0499\u049c\5\u00b2Z\2\u049a\u049c\5\u00c0a\2\u049b\u0493\3\2\2\2\u049b"+
		"\u0494\3\2\2\2\u049b\u0495\3\2\2\2\u049b\u0496\3\2\2\2\u049b\u0497\3\2"+
		"\2\2\u049b\u0498\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049a\3\2\2\2\u049c"+
		"\u00bb\3\2\2\2\u049d\u049e\5\26\f\2\u049e\u049f\7M\2\2\u049f\u04a0\5\u00be"+
		"`\2\u04a0\u04a1\7N\2\2\u04a1\u00bd\3\2\2\2\u04a2\u04a7\b`\1\2\u04a3\u04a4"+
		"\f\3\2\2\u04a4\u04a6\5\u00c8e\2\u04a5\u04a3\3\2\2\2\u04a6\u04a9\3\2\2"+
		"\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u00bf\3\2\2\2\u04a9\u04a7"+
		"\3\2\2\2\u04aa\u04ab\7)\2\2\u04ab\u04ac\7I\2\2\u04ac\u04ad\5\u00f6|\2"+
		"\u04ad\u04ae\7J\2\2\u04ae\u04af\7M\2\2\u04af\u04b0\5\u00c2b\2\u04b0\u04b1"+
		"\7N\2\2\u04b1\u00c1\3\2\2\2\u04b2\u04b7\bb\1\2\u04b3\u04b4\f\3\2\2\u04b4"+
		"\u04b6\5\u00c4c\2\u04b5\u04b3\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5"+
		"\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u00c3\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba"+
		"\u04bb\5\u00c6d\2\u04bb\u04bc\7R\2\2\u04bc\u04bd\5\u00bc_\2\u04bd\u04c2"+
		"\3\2\2\2\u04be\u04bf\5\u00c6d\2\u04bf\u04c0\7R\2\2\u04c0\u04c2\3\2\2\2"+
		"\u04c1\u04ba\3\2\2\2\u04c1\u04be\3\2\2\2\u04c2\u00c5\3\2\2\2\u04c3\u04c6"+
		"\5\20\t\2\u04c4\u04c6\7\16\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c4\3\2\2\2"+
		"\u04c6\u00c7\3\2\2\2\u04c7\u04cc\5\u00e0q\2\u04c8\u04cc\5\u00e2r\2\u04c9"+
		"\u04cc\5\u00ba^\2\u04ca\u04cc\5.\30\2\u04cb\u04c7\3\2\2\2\u04cb\u04c8"+
		"\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cb\u04ca\3\2\2\2\u04cc\u00c9\3\2\2\2\u04cd"+
		"\u04ce\5\26\f\2\u04ce\u04cf\7*\2\2\u04cf\u04d0\5\20\t\2\u04d0\u04d1\7"+
		"M\2\2\u04d1\u04d2\5\u00ccg\2\u04d2\u04d3\7N\2\2\u04d3\u00cb\3\2\2\2\u04d4"+
		"\u04d5\bg\1\2\u04d5\u04d6\5\u00ceh\2\u04d6\u04db\3\2\2\2\u04d7\u04d8\f"+
		"\3\2\2\u04d8\u04da\5\u00ceh\2\u04d9\u04d7\3\2\2\2\u04da\u04dd\3\2\2\2"+
		"\u04db\u04d9\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u00cd\3\2\2\2\u04dd\u04db"+
		"\3\2\2\2\u04de\u04df\7\35\2\2\u04df\u04e0\7V\2\2\u04e0\u04e1\7M\2\2\u04e1"+
		"\u04e2\5\u00d0i\2\u04e2\u04e3\7N\2\2\u04e3\u0509\3\2\2\2\u04e4\u04e5\7"+
		"\b\2\2\u04e5\u04e6\7V\2\2\u04e6\u04e7\7M\2\2\u04e7\u04e8\5\u00d4k\2\u04e8"+
		"\u04e9\7N\2\2\u04e9\u0509\3\2\2\2\u04ea\u04eb\5\26\f\2\u04eb\u04ec\5\24"+
		"\13\2\u04ec\u04ed\7\17\2\2\u04ed\u04ee\7V\2\2\u04ee\u04ef\5\20\t\2\u04ef"+
		"\u04f0\7W\2\2\u04f0\u0509\3\2\2\2\u04f1\u04f2\5\26\f\2\u04f2\u04f3\5\24"+
		"\13\2\u04f3\u04f4\7\17\2\2\u04f4\u04f5\7V\2\2\u04f5\u04f6\5\u00dan\2\u04f6"+
		"\u04f7\5\26\f\2\u04f7\u04f8\7W\2\2\u04f8\u0509\3\2\2\2\u04f9\u04fa\5\26"+
		"\f\2\u04fa\u04fb\5\24\13\2\u04fb\u04fc\7\21\2\2\u04fc\u04fd\7V\2\2\u04fd"+
		"\u04fe\7M\2\2\u04fe\u04ff\5\u00dco\2\u04ff\u0500\7N\2\2\u0500\u0509\3"+
		"\2\2\2\u0501\u0502\5\26\f\2\u0502\u0503\5\24\13\2\u0503\u0504\5\22\n\2"+
		"\u0504\u0505\7V\2\2\u0505\u0506\5\u00e6t\2\u0506\u0507\7W\2\2\u0507\u0509"+
		"\3\2\2\2\u0508\u04de\3\2\2\2\u0508\u04e4\3\2\2\2\u0508\u04ea\3\2\2\2\u0508"+
		"\u04f1\3\2\2\2\u0508\u04f9\3\2\2\2\u0508\u0501\3\2\2\2\u0509\u00cf\3\2"+
		"\2\2\u050a\u050f\bi\1\2\u050b\u050c\f\3\2\2\u050c\u050e\5\u00d2j\2\u050d"+
		"\u050b\3\2\2\2\u050e\u0511\3\2\2\2\u050f\u050d\3\2\2\2\u050f\u0510\3\2"+
		"\2\2\u0510\u00d1\3\2\2\2\u0511\u050f\3\2\2\2\u0512\u0513\5\u00f6|\2\u0513"+
		"\u0514\7R\2\2\u0514\u0515\5\20\t\2\u0515\u0516\5\26\f\2\u0516\u0517\7"+
		"W\2\2\u0517\u00d3\3\2\2\2\u0518\u051f\bk\1\2\u0519\u051a\f\3\2\2\u051a"+
		"\u051b\5\u00d6l\2\u051b\u051c\7W\2\2\u051c\u051e\3\2\2\2\u051d\u0519\3"+
		"\2\2\2\u051e\u0521\3\2\2\2\u051f\u051d\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u00d5\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u0523\5\26\f\2\u0523\u0524\5"+
		"\20\t\2\u0524\u052c\3\2\2\2\u0525\u0526\5\26\f\2\u0526\u0527\5\20\t\2"+
		"\u0527\u0528\7I\2\2\u0528\u0529\5\u00eav\2\u0529\u052a\7J\2\2\u052a\u052c"+
		"\3\2\2\2\u052b\u0522\3\2\2\2\u052b\u0525\3\2\2\2\u052c\u00d7\3\2\2\2\u052d"+
		"\u052e\5V,\2\u052e\u052f\7R\2\2\u052f\u0530\5\u00dan\2\u0530\u0531\5\26"+
		"\f\2\u0531\u0532\7W\2\2\u0532\u00d9\3\2\2\2\u0533\u0534\5\u00f4{\2\u0534"+
		"\u0535\7I\2\2\u0535\u0536\5\u00eav\2\u0536\u0537\7J\2\2\u0537\u0541\3"+
		"\2\2\2\u0538\u0539\5\u00f4{\2\u0539\u053a\7O\2\2\u053a\u053b\5\u008aF"+
		"\2\u053b\u053c\7P\2\2\u053c\u053d\7I\2\2\u053d\u053e\5\u00eav\2\u053e"+
		"\u053f\7J\2\2\u053f\u0541\3\2\2\2\u0540\u0533\3\2\2\2\u0540\u0538\3\2"+
		"\2\2\u0541\u00db\3\2\2\2\u0542\u0543\bo\1\2\u0543\u0544\5\u00d8m\2\u0544"+
		"\u0549\3\2\2\2\u0545\u0546\f\3\2\2\u0546\u0548\5\u00d8m\2\u0547\u0545"+
		"\3\2\2\2\u0548\u054b\3\2\2\2\u0549\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a"+
		"\u00dd\3\2\2\2\u054b\u0549\3\2\2\2\u054c\u054d\5\26\f\2\u054d\u054e\7"+
		"\7\2\2\u054e\u054f\5\20\t\2\u054f\u0550\7I\2\2\u0550\u0551\5$\23\2\u0551"+
		"\u0552\7J\2\2\u0552\u0553\5\u00bc_\2\u0553\u00df\3\2\2\2\u0554\u0555\5"+
		"\30\r\2\u0555\u0556\5r:\2\u0556\u0557\5\20\t\2\u0557\u0558\5\u00e4s\2"+
		"\u0558\u0559\7W\2\2\u0559\u0560\3\2\2\2\u055a\u055b\5r:\2\u055b\u055c"+
		"\5\20\t\2\u055c\u055d\5\u00e4s\2\u055d\u055e\7W\2\2\u055e\u0560\3\2\2"+
		"\2\u055f\u0554\3\2\2\2\u055f\u055a\3\2\2\2\u0560\u00e1\3\2\2\2\u0561\u0562"+
		"\5\26\f\2\u0562\u0563\7\f\2\2\u0563\u0564\5r:\2\u0564\u0565\5\20\t\2\u0565"+
		"\u0566\7V\2\2\u0566\u0567\5\u00e6t\2\u0567\u0568\7W\2\2\u0568\u00e3\3"+
		"\2\2\2\u0569\u056d\3\2\2\2\u056a\u056b\7V\2\2\u056b\u056d\5\u00e6t\2\u056c"+
		"\u0569\3\2\2\2\u056c\u056a\3\2\2\2\u056d\u00e5\3\2\2\2\u056e\u056f\5\u00f6"+
		"|\2\u056f\u00e7\3\2\2\2\u0570\u0571\5n8\2\u0571\u0572\5\u00bc_\2\u0572"+
		"\u00e9\3\2\2\2\u0573\u0576\3\2\2\2\u0574\u0576\5\u00ecw\2\u0575\u0573"+
		"\3\2\2\2\u0575\u0574\3\2\2\2\u0576\u00eb\3\2\2\2\u0577\u0578\bw\1\2\u0578"+
		"\u0579\5\u00eex\2\u0579\u057f\3\2\2\2\u057a\u057b\f\3\2\2\u057b\u057c"+
		"\7S\2\2\u057c\u057e\5\u00eex\2\u057d\u057a\3\2\2\2\u057e\u0581\3\2\2\2"+
		"\u057f\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u00ed\3\2\2\2\u0581\u057f"+
		"\3\2\2\2\u0582\u0589\5\u00f6|\2\u0583\u0584\5\20\t\2\u0584\u0585\7V\2"+
		"\2\u0585\u0586\5\u00f6|\2\u0586\u0589\3\2\2\2\u0587\u0589\7\63\2\2\u0588"+
		"\u0582\3\2\2\2\u0588\u0583\3\2\2\2\u0588\u0587\3\2\2\2\u0589\u00ef\3\2"+
		"\2\2\u058a\u058d\by\1\2\u058b\u058d\5\u00f6|\2\u058c\u058a\3\2\2\2\u058c"+
		"\u058b\3\2\2\2\u058d\u0593\3\2\2\2\u058e\u058f\f\3\2\2\u058f\u0590\7S"+
		"\2\2\u0590\u0592\5\u00f6|\2\u0591\u058e\3\2\2\2\u0592\u0595\3\2\2\2\u0593"+
		"\u0591\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u00f1\3\2\2\2\u0595\u0593\3\2"+
		"\2\2\u0596\u059b\5\16\b\2\u0597\u0598\58\35\2\u0598\u0599\5\16\b\2\u0599"+
		"\u059b\3\2\2\2\u059a\u0596\3\2\2\2\u059a\u0597\3\2\2\2\u059b\u00f3\3\2"+
		"\2\2\u059c\u059d\b{\1\2\u059d\u05a0\5\u00f2z\2\u059e\u05a0\7+\2\2\u059f"+
		"\u059c\3\2\2\2\u059f\u059e\3\2\2\2\u05a0\u05b2\3\2\2\2\u05a1\u05a2\f\5"+
		"\2\2\u05a2\u05a3\7U\2\2\u05a3\u05b1\5\20\t\2\u05a4\u05a5\f\4\2\2\u05a5"+
		"\u05a6\7K\2\2\u05a6\u05a7\5\u00f6|\2\u05a7\u05a8\7L\2\2\u05a8\u05b1\3"+
		"\2\2\2\u05a9\u05aa\f\3\2\2\u05aa\u05ab\7K\2\2\u05ab\u05ac\5\u00f6|\2\u05ac"+
		"\u05ad\7R\2\2\u05ad\u05ae\5\u00f6|\2\u05ae\u05af\7L\2\2\u05af\u05b1\3"+
		"\2\2\2\u05b0\u05a1\3\2\2\2\u05b0\u05a4\3\2\2\2\u05b0\u05a9\3\2\2\2\u05b1"+
		"\u05b4\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u00f5\3\2"+
		"\2\2\u05b4\u05b2\3\2\2\2\u05b5\u05b6\b|\1\2\u05b6\u05dd\7k\2\2\u05b7\u05dd"+
		"\7]\2\2\u05b8\u05dd\7-\2\2\u05b9\u05dd\7\26\2\2\u05ba\u05dd\7+\2\2\u05bb"+
		"\u05dd\5\16\b\2\u05bc\u05bd\58\35\2\u05bd\u05be\5\16\b\2\u05be\u05dd\3"+
		"\2\2\2\u05bf\u05c0\7M\2\2\u05c0\u05c1\5\u00f0y\2\u05c1\u05c2\7N\2\2\u05c2"+
		"\u05dd\3\2\2\2\u05c3\u05c4\7I\2\2\u05c4\u05c5\5\u00f6|\2\u05c5\u05c6\7"+
		"J\2\2\u05c6\u05dd\3\2\2\2\u05c7\u05c8\7Q\2\2\u05c8\u05dd\5\u00f6|\"\u05c9"+
		"\u05ca\7H\2\2\u05ca\u05dd\5\u00f6|!\u05cb\u05cc\7@\2\2\u05cc\u05dd\5\u00f6"+
		"| \u05cd\u05ce\7>\2\2\u05ce\u05dd\5\u00f6|\37\u05cf\u05d0\5x=\2\u05d0"+
		"\u05d1\7U\2\2\u05d1\u05d2\5\20\t\2\u05d2\u05dd\3\2\2\2\u05d3\u05d4\7\23"+
		"\2\2\u05d4\u05d5\7U\2\2\u05d5\u05dd\5\20\t\2\u05d6\u05dd\5\u00acW\2\u05d7"+
		"\u05d8\7I\2\2\u05d8\u05d9\5r:\2\u05d9\u05da\7J\2\2\u05da\u05db\5\u00f6"+
		"|\3\u05db\u05dd\3\2\2\2\u05dc\u05b5\3\2\2\2\u05dc\u05b7\3\2\2\2\u05dc"+
		"\u05b8\3\2\2\2\u05dc\u05b9\3\2\2\2\u05dc\u05ba\3\2\2\2\u05dc\u05bb\3\2"+
		"\2\2\u05dc\u05bc\3\2\2\2\u05dc\u05bf\3\2\2\2\u05dc\u05c3\3\2\2\2\u05dc"+
		"\u05c7\3\2\2\2\u05dc\u05c9\3\2\2\2\u05dc\u05cb\3\2\2\2\u05dc\u05cd\3\2"+
		"\2\2\u05dc\u05cf\3\2\2\2\u05dc\u05d3\3\2\2\2\u05dc\u05d6\3\2\2\2\u05dc"+
		"\u05d7\3\2\2\2\u05dd\u063d\3\2\2\2\u05de\u05df\f\33\2\2\u05df\u05e0\7"+
		"B\2\2\u05e0\u063c\5\u00f6|\34\u05e1\u05e2\f\32\2\2\u05e2\u05e3\7C\2\2"+
		"\u05e3\u063c\5\u00f6|\33\u05e4\u05e5\f\31\2\2\u05e5\u05e6\7D\2\2\u05e6"+
		"\u063c\5\u00f6|\32\u05e7\u05e8\f\30\2\2\u05e8\u05e9\7>\2\2\u05e9\u063c"+
		"\5\u00f6|\31\u05ea\u05eb\f\27\2\2\u05eb\u05ec\7@\2\2\u05ec\u063c\5\u00f6"+
		"|\30\u05ed\u05ee\f\26\2\2\u05ee\u05ef\7?\2\2\u05ef\u063c\5\u00f6|\27\u05f0"+
		"\u05f1\f\25\2\2\u05f1\u05f2\7A\2\2\u05f2\u063c\5\u00f6|\26\u05f3\u05f4"+
		"\f\24\2\2\u05f4\u05f5\7\66\2\2\u05f5\u063c\5\u00f6|\25\u05f6\u05f7\f\23"+
		"\2\2\u05f7\u05f8\7P\2\2\u05f8\u05f9\7P\2\2\u05f9\u063c\5\u00f6|\24\u05fa"+
		"\u05fb\f\22\2\2\u05fb\u05fc\7<\2\2\u05fc\u063c\5\u00f6|\23\u05fd\u05fe"+
		"\f\21\2\2\u05fe\u05ff\7;\2\2\u05ff\u063c\5\u00f6|\22\u0600\u0601\f\20"+
		"\2\2\u0601\u0602\7O\2\2\u0602\u063c\5\u00f6|\21\u0603\u0604\f\17\2\2\u0604"+
		"\u0605\7P\2\2\u0605\u063c\5\u00f6|\20\u0606\u0607\f\16\2\2\u0607\u0608"+
		"\7:\2\2\u0608\u063c\5\u00f6|\17\u0609\u060a\f\r\2\2\u060a\u060b\79\2\2"+
		"\u060b\u063c\5\u00f6|\16\u060c\u060d\f\f\2\2\u060d\u060e\7F\2\2\u060e"+
		"\u063c\5\u00f6|\r\u060f\u0610\f\13\2\2\u0610\u0611\7G\2\2\u0611\u063c"+
		"\5\u00f6|\f\u0612\u0613\f\n\2\2\u0613\u0614\7E\2\2\u0614\u063c\5\u00f6"+
		"|\13\u0615\u0616\f\t\2\2\u0616\u0617\7=\2\2\u0617\u063c\5\u00f6|\n\u0618"+
		"\u0619\f\b\2\2\u0619\u061a\7\67\2\2\u061a\u063c\5\u00f6|\t\u061b\u061c"+
		"\f\7\2\2\u061c\u061d\78\2\2\u061d\u063c\5\u00f6|\b\u061e\u061f\f\6\2\2"+
		"\u061f\u0620\7T\2\2\u0620\u0621\5\u00f6|\2\u0621\u0622\7R\2\2\u0622\u0623"+
		"\5\u00f6|\7\u0623\u063c\3\2\2\2\u0624\u0625\f&\2\2\u0625\u0626\7K\2\2"+
		"\u0626\u0627\5\u00f6|\2\u0627\u0628\7L\2\2\u0628\u063c\3\2\2\2\u0629\u062a"+
		"\f%\2\2\u062a\u062b\7K\2\2\u062b\u062c\5\u00f6|\2\u062c\u062d\7R\2\2\u062d"+
		"\u062e\5\u00f6|\2\u062e\u062f\7L\2\2\u062f\u063c\3\2\2\2\u0630\u0631\f"+
		"\34\2\2\u0631\u0632\7U\2\2\u0632\u063c\5\20\t\2\u0633\u0634\f\4\2\2\u0634"+
		"\u0635\7O\2\2\u0635\u0636\5\u008eH\2\u0636\u0637\7P\2\2\u0637\u0638\7"+
		"I\2\2\u0638\u0639\5\u00eav\2\u0639\u063a\7J\2\2\u063a\u063c\3\2\2\2\u063b"+
		"\u05de\3\2\2\2\u063b\u05e1\3\2\2\2\u063b\u05e4\3\2\2\2\u063b\u05e7\3\2"+
		"\2\2\u063b\u05ea\3\2\2\2\u063b\u05ed\3\2\2\2\u063b\u05f0\3\2\2\2\u063b"+
		"\u05f3\3\2\2\2\u063b\u05f6\3\2\2\2\u063b\u05fa\3\2\2\2\u063b\u05fd\3\2"+
		"\2\2\u063b\u0600\3\2\2\2\u063b\u0603\3\2\2\2\u063b\u0606\3\2\2\2\u063b"+
		"\u0609\3\2\2\2\u063b\u060c\3\2\2\2\u063b\u060f\3\2\2\2\u063b\u0612\3\2"+
		"\2\2\u063b\u0615\3\2\2\2\u063b\u0618\3\2\2\2\u063b\u061b\3\2\2\2\u063b"+
		"\u061e\3\2\2\2\u063b\u0624\3\2\2\2\u063b\u0629\3\2\2\2\u063b\u0630\3\2"+
		"\2\2\u063b\u0633\3\2\2\2\u063c\u063f\3\2\2\2\u063d\u063b\3\2\2\2\u063d"+
		"\u063e\3\2\2\2\u063e\u00f7\3\2\2\2\u063f\u063d\3\2\2\2\u0640\u0641\t\2"+
		"\2\2\u0641\u00f9\3\2\2\2\u0642\u0658\5\u00f6|\2\u0643\u0644\5\u00f6|\2"+
		"\u0644\u0645\79\2\2\u0645\u0646\5V,\2\u0646\u0658\3\2\2\2\u0647\u0648"+
		"\5\u00f6|\2\u0648\u0649\79\2\2\u0649\u064a\7I\2\2\u064a\u064b\5V,\2\u064b"+
		"\u064c\7J\2\2\u064c\u0658\3\2\2\2\u064d\u064e\5V,\2\u064e\u064f\79\2\2"+
		"\u064f\u0650\5\u00f6|\2\u0650\u0658\3\2\2\2\u0651\u0652\7I\2\2\u0652\u0653"+
		"\5V,\2\u0653\u0654\7J\2\2\u0654\u0655\79\2\2\u0655\u0656\5\u00f6|\2\u0656"+
		"\u0658\3\2\2\2\u0657\u0642\3\2\2\2\u0657\u0643\3\2\2\2\u0657\u0647\3\2"+
		"\2\2\u0657\u064d\3\2\2\2\u0657\u0651\3\2\2\2\u0658\u00fb\3\2\2\2_\u0105"+
		"\u0107\u0115\u012e\u0140\u0149\u014d\u0153\u0157\u015b\u0164\u0173\u017d"+
		"\u017f\u01d5\u01df\u01e8\u01f2\u0201\u0207\u0233\u023e\u0243\u024a\u025a"+
		"\u0261\u0272\u0282\u028a\u0294\u029a\u02a9\u02b3\u02c3\u02d1\u02f4\u030b"+
		"\u0313\u0329\u0330\u034a\u0351\u0355\u035b\u0393\u0398\u039f\u03a9\u03b0"+
		"\u03b4\u03bb\u03c1\u03cb\u03db\u03e1\u03fd\u03ff\u0419\u0423\u043c\u0453"+
		"\u0462\u046c\u0479\u0489\u049b\u04a7\u04b7\u04c1\u04c5\u04cb\u04db\u0508"+
		"\u050f\u051f\u052b\u0540\u0549\u055f\u056c\u0575\u057f\u0588\u058c\u0593"+
		"\u059a\u059f\u05b0\u05b2\u05dc\u063b\u063d\u0657";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}