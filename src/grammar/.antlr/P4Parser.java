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
		RULE_packageTypeDeclaration = 21, RULE_instantiation = 22, RULE_mainInstantiation = 23, 
		RULE_objInitializer = 24, RULE_objDeclarations = 25, RULE_objDeclaration = 26, 
		RULE_optConstructorParameters = 27, RULE_dotPrefix = 28, RULE_parserDeclaration = 29, 
		RULE_parserLocalElements = 30, RULE_parserLocalElement = 31, RULE_parserTypeDeclaration = 32, 
		RULE_parserStates = 33, RULE_parserState = 34, RULE_parserStatements = 35, 
		RULE_parserStatement = 36, RULE_parserBlockStatement = 37, RULE_transitionStatement = 38, 
		RULE_stateExpression = 39, RULE_selectExpression = 40, RULE_selectCaseList = 41, 
		RULE_selectCase = 42, RULE_keysetExpression = 43, RULE_tupleKeysetExpression = 44, 
		RULE_simpleExpressionList = 45, RULE_simpleKeysetExpression = 46, RULE_valueSetDeclaration = 47, 
		RULE_controlDeclaration = 48, RULE_controlTypeDeclaration = 49, RULE_controlLocalDeclarations = 50, 
		RULE_controlLocalDeclaration = 51, RULE_controlBody = 52, RULE_externDeclaration = 53, 
		RULE_methodPrototypes = 54, RULE_functionPrototype = 55, RULE_methodPrototype = 56, 
		RULE_typeRef = 57, RULE_namedType = 58, RULE_prefixedType = 59, RULE_typeName = 60, 
		RULE_tupleType = 61, RULE_headerStackType = 62, RULE_specializedType = 63, 
		RULE_baseType = 64, RULE_typeOrVoid = 65, RULE_optTypeParameters = 66, 
		RULE_typeParameterList = 67, RULE_typeArg = 68, RULE_typeArgumentList = 69, 
		RULE_realTypeArg = 70, RULE_realTypeArgumentList = 71, RULE_typeDeclaration = 72, 
		RULE_derivedTypeDeclaration = 73, RULE_headerTypeDeclaration = 74, RULE_structTypeDeclaration = 75, 
		RULE_headerUnionDeclaration = 76, RULE_structFieldList = 77, RULE_structField = 78, 
		RULE_enumDeclaration = 79, RULE_specifiedIdentifierList = 80, RULE_specifiedIdentifier = 81, 
		RULE_errorDeclaration = 82, RULE_matchKindDeclaration = 83, RULE_identifierList = 84, 
		RULE_typedefDeclaration = 85, RULE_methodCall = 86, RULE_assignmentOrMethodCallStatement = 87, 
		RULE_emptyStatement = 88, RULE_exitStatement = 89, RULE_returnStatement = 90, 
		RULE_conditionalStatement = 91, RULE_directApplication = 92, RULE_statement = 93, 
		RULE_blockStatement = 94, RULE_statOrDeclList = 95, RULE_switchStatement = 96, 
		RULE_switchCases = 97, RULE_switchCase = 98, RULE_switchLabel = 99, RULE_statementOrDeclaration = 100, 
		RULE_tableDeclaration = 101, RULE_tablePropertyList = 102, RULE_tableProperty = 103, 
		RULE_keyElementList = 104, RULE_keyElement = 105, RULE_actionList = 106, 
		RULE_actionRef = 107, RULE_entry = 108, RULE_actionBinding = 109, RULE_entriesList = 110, 
		RULE_actionDeclaration = 111, RULE_variableDeclaration = 112, RULE_constantDeclaration = 113, 
		RULE_optInitializer = 114, RULE_initializer = 115, RULE_functionDeclaration = 116, 
		RULE_argumentList = 117, RULE_nonEmptyArgList = 118, RULE_argument = 119, 
		RULE_expressionList = 120, RULE_prefixedNonTypeName = 121, RULE_lvalue = 122, 
		RULE_expression = 123, RULE_type_or_id = 124, RULE_parserStateCondition = 125;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "input", "declaration", "preprocessorLine", "ppIncludeFileName", 
			"nonTypeName", "name", "nonTableKwName", "optCONST", "optAnnotations", 
			"annotations", "annotation", "annotationBody", "annotationToken", "kvList", 
			"kvPair", "parameterList", "nonEmptyParameterList", "parameter", "direction", 
			"packageTypeDeclaration", "instantiation", "mainInstantiation", "objInitializer", 
			"objDeclarations", "objDeclaration", "optConstructorParameters", "dotPrefix", 
			"parserDeclaration", "parserLocalElements", "parserLocalElement", "parserTypeDeclaration", 
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
			setState(252);
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
			setState(254);
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
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new InputContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_input);
						setState(257);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(258);
						declaration();
						}
						break;
					case 2:
						{
						_localctx = new InputContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_input);
						setState(259);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(260);
						match(SEMICOLON);
						}
						break;
					}
					} 
				}
				setState(265);
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
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				externDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				actionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				parserDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				typeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				controlDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(272);
				instantiation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(273);
				errorDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(274);
				matchKindDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(275);
				functionDeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(276);
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
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(PREPROC_INCLUDE);
				setState(280);
				ppIncludeFileName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(PREPROC_DEFINE);
				setState(282);
				type_or_id();
				setState(283);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(PREPROC_DEFINE);
				setState(286);
				type_or_id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(PREPROC_DEFINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				match(PREPROC_UNDEF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(289);
				match(PREPROC_LINE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(290);
				match(PREPROC_IFDEF);
				setState(291);
				type_or_id();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(292);
				match(PREPROC_IFDEF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(293);
				match(PREPROC_IFNDEF);
				setState(294);
				type_or_id();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(295);
				match(PREPROC_IFNDEF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(296);
				match(PREPROC_IF);
				setState(297);
				expression(0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(298);
				match(PREPROC_ELSEIF);
				setState(299);
				expression(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(300);
				match(PREPROC_ELSE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(301);
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
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(L_ANGLE);
				setState(306);
				ppIncludeFileName();
				setState(307);
				match(R_ANGLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				name();
				setState(311);
				match(DOT);
				setState(312);
				name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				match(T__0);
				setState(315);
				ppIncludeFileName();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				match(T__1);
				setState(317);
				ppIncludeFileName();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				match(DIV);
				setState(319);
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
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				type_or_id();
				}
				break;
			case APPLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(APPLY);
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(KEY);
				}
				break;
			case ACTIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(ACTIONS);
				}
				break;
			case STATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				match(STATE);
				}
				break;
			case ENTRIES:
				enterOuterAlt(_localctx, 6);
				{
				setState(327);
				match(ENTRIES);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(328);
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
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				nonTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
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
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				type_or_id();
				}
				break;
			case APPLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(APPLY);
				}
				break;
			case STATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				match(STATE);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
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
			setState(343);
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
				setState(342);
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
			setState(347);
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
				setState(346);
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
			setState(350);
			annotation();
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
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
					setState(352);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(353);
					annotation();
					}
					} 
				}
				setState(358);
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
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(AT);
				setState(360);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(AT);
				setState(362);
				name();
				setState(363);
				match(L_PAREN);
				setState(364);
				annotationBody(0);
				setState(365);
				match(R_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(PRAGMA);
				setState(368);
				name();
				setState(369);
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
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(381);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new AnnotationBodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationBody);
						setState(374);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(375);
						match(L_PAREN);
						setState(376);
						annotationBody(0);
						setState(377);
						match(R_PAREN);
						}
						break;
					case 2:
						{
						_localctx = new AnnotationBodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationBody);
						setState(379);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(380);
						annotationToken();
						}
						break;
					}
					} 
				}
				setState(385);
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
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNEXPECTED_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(UNEXPECTED_TOKEN);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(ABSTRACT);
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(ACTION);
				}
				break;
			case ACTIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				match(ACTIONS);
				}
				break;
			case APPLY:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				match(APPLY);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				match(BOOL);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 7);
				{
				setState(392);
				match(BIT);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 8);
				{
				setState(393);
				match(CONST);
				}
				break;
			case CONTROL:
				enterOuterAlt(_localctx, 9);
				{
				setState(394);
				match(CONTROL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 10);
				{
				setState(395);
				match(DEFAULT);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 11);
				{
				setState(396);
				match(ELSE);
				}
				break;
			case ENTRIES:
				enterOuterAlt(_localctx, 12);
				{
				setState(397);
				match(ENTRIES);
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 13);
				{
				setState(398);
				match(ENUM);
				}
				break;
			case ERROR:
				enterOuterAlt(_localctx, 14);
				{
				setState(399);
				match(ERROR);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 15);
				{
				setState(400);
				match(EXIT);
				}
				break;
			case EXTERN:
				enterOuterAlt(_localctx, 16);
				{
				setState(401);
				match(EXTERN);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 17);
				{
				setState(402);
				match(FALSE);
				}
				break;
			case HEADER:
				enterOuterAlt(_localctx, 18);
				{
				setState(403);
				match(HEADER);
				}
				break;
			case HEADER_UNION:
				enterOuterAlt(_localctx, 19);
				{
				setState(404);
				match(HEADER_UNION);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 20);
				{
				setState(405);
				match(IF);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 21);
				{
				setState(406);
				match(IN);
				}
				break;
			case INOUT:
				enterOuterAlt(_localctx, 22);
				{
				setState(407);
				match(INOUT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 23);
				{
				setState(408);
				match(INT);
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 24);
				{
				setState(409);
				match(KEY);
				}
				break;
			case MATCH_KIND:
				enterOuterAlt(_localctx, 25);
				{
				setState(410);
				match(MATCH_KIND);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 26);
				{
				setState(411);
				match(TYPE);
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 27);
				{
				setState(412);
				match(OUT);
				}
				break;
			case PARSER:
				enterOuterAlt(_localctx, 28);
				{
				setState(413);
				match(PARSER);
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 29);
				{
				setState(414);
				match(PACKAGE);
				}
				break;
			case PRAGMA:
				enterOuterAlt(_localctx, 30);
				{
				setState(415);
				match(PRAGMA);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 31);
				{
				setState(416);
				match(RETURN);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 32);
				{
				setState(417);
				match(SELECT);
				}
				break;
			case STATE:
				enterOuterAlt(_localctx, 33);
				{
				setState(418);
				match(STATE);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 34);
				{
				setState(419);
				match(STRUCT);
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 35);
				{
				setState(420);
				match(SWITCH);
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 36);
				{
				setState(421);
				match(TABLE);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 37);
				{
				setState(422);
				match(THIS);
				}
				break;
			case TRANSITION:
				enterOuterAlt(_localctx, 38);
				{
				setState(423);
				match(TRANSITION);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 39);
				{
				setState(424);
				match(TRUE);
				}
				break;
			case TUPLE:
				enterOuterAlt(_localctx, 40);
				{
				setState(425);
				match(TUPLE);
				}
				break;
			case TYPEDEF:
				enterOuterAlt(_localctx, 41);
				{
				setState(426);
				match(TYPEDEF);
				}
				break;
			case VARBIT:
				enterOuterAlt(_localctx, 42);
				{
				setState(427);
				match(VARBIT);
				}
				break;
			case VALUESET:
				enterOuterAlt(_localctx, 43);
				{
				setState(428);
				match(VALUESET);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 44);
				{
				setState(429);
				match(VOID);
				}
				break;
			case DONTCARE:
				enterOuterAlt(_localctx, 45);
				{
				setState(430);
				match(DONTCARE);
				}
				break;
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 46);
				{
				setState(431);
				type_or_id();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 47);
				{
				setState(432);
				match(STRING_LITERAL);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 48);
				{
				setState(433);
				match(INTEGER);
				}
				break;
			case MASK:
				enterOuterAlt(_localctx, 49);
				{
				setState(434);
				match(MASK);
				}
				break;
			case RANGE:
				enterOuterAlt(_localctx, 50);
				{
				setState(435);
				match(RANGE);
				}
				break;
			case SHL:
				enterOuterAlt(_localctx, 51);
				{
				setState(436);
				match(SHL);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 52);
				{
				setState(437);
				match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 53);
				{
				setState(438);
				match(OR);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 54);
				{
				setState(439);
				match(EQ);
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 55);
				{
				setState(440);
				match(NE);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 56);
				{
				setState(441);
				match(GE);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 57);
				{
				setState(442);
				match(LE);
				}
				break;
			case PP:
				enterOuterAlt(_localctx, 58);
				{
				setState(443);
				match(PP);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 59);
				{
				setState(444);
				match(PLUS);
				}
				break;
			case PLUS_SAT:
				enterOuterAlt(_localctx, 60);
				{
				setState(445);
				match(PLUS_SAT);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 61);
				{
				setState(446);
				match(MINUS);
				}
				break;
			case MINUS_SAT:
				enterOuterAlt(_localctx, 62);
				{
				setState(447);
				match(MINUS_SAT);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 63);
				{
				setState(448);
				match(MUL);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 64);
				{
				setState(449);
				match(DIV);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 65);
				{
				setState(450);
				match(MOD);
				}
				break;
			case BIT_OR:
				enterOuterAlt(_localctx, 66);
				{
				setState(451);
				match(BIT_OR);
				}
				break;
			case BIT_AND:
				enterOuterAlt(_localctx, 67);
				{
				setState(452);
				match(BIT_AND);
				}
				break;
			case BIT_XOR:
				enterOuterAlt(_localctx, 68);
				{
				setState(453);
				match(BIT_XOR);
				}
				break;
			case COMPLEMENT:
				enterOuterAlt(_localctx, 69);
				{
				setState(454);
				match(COMPLEMENT);
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 70);
				{
				setState(455);
				match(L_BRACKET);
				}
				break;
			case R_BRACKET:
				enterOuterAlt(_localctx, 71);
				{
				setState(456);
				match(R_BRACKET);
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 72);
				{
				setState(457);
				match(L_BRACE);
				}
				break;
			case R_BRACE:
				enterOuterAlt(_localctx, 73);
				{
				setState(458);
				match(R_BRACE);
				}
				break;
			case L_ANGLE:
				enterOuterAlt(_localctx, 74);
				{
				setState(459);
				match(L_ANGLE);
				}
				break;
			case R_ANGLE:
				enterOuterAlt(_localctx, 75);
				{
				setState(460);
				match(R_ANGLE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 76);
				{
				setState(461);
				match(NOT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 77);
				{
				setState(462);
				match(COLON);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 78);
				{
				setState(463);
				match(COMMA);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 79);
				{
				setState(464);
				match(QUESTION);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 80);
				{
				setState(465);
				match(DOT);
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 81);
				{
				setState(466);
				match(ASSIGN);
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 82);
				{
				setState(467);
				match(SEMICOLON);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 83);
				{
				setState(468);
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
			setState(472);
			kvPair();
			}
			_ctx.stop = _input.LT(-1);
			setState(479);
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
					setState(474);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(475);
					match(COMMA);
					setState(476);
					kvPair();
					}
					} 
				}
				setState(481);
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
			setState(482);
			name();
			setState(483);
			match(ASSIGN);
			setState(484);
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
			setState(488);
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
				setState(487);
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
			setState(491);
			parameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(498);
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
					setState(493);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(494);
					match(COMMA);
					setState(495);
					parameter();
					}
					} 
				}
				setState(500);
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
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				optAnnotations();
				setState(502);
				direction();
				setState(503);
				typeRef();
				setState(504);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				optAnnotations();
				setState(507);
				direction();
				setState(508);
				typeRef();
				setState(509);
				name();
				setState(510);
				match(ASSIGN);
				setState(511);
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
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(IN);
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(OUT);
				}
				break;
			case INOUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
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
			setState(521);
			optAnnotations();
			setState(522);
			match(PACKAGE);
			setState(523);
			name();
			setState(524);
			optTypeParameters();
			setState(525);
			match(L_PAREN);
			setState(526);
			parameterList();
			setState(527);
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
		public MainInstantiationContext mainInstantiation() {
			return getRuleContext(MainInstantiationContext.class,0);
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
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				annotations(0);
				setState(530);
				typeRef();
				setState(531);
				match(L_PAREN);
				setState(532);
				argumentList();
				setState(533);
				match(R_PAREN);
				setState(534);
				name();
				setState(535);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				typeRef();
				setState(538);
				match(L_PAREN);
				setState(539);
				argumentList();
				setState(540);
				match(R_PAREN);
				setState(541);
				name();
				setState(542);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				annotations(0);
				setState(545);
				typeRef();
				setState(546);
				match(L_PAREN);
				setState(547);
				argumentList();
				setState(548);
				match(R_PAREN);
				setState(549);
				name();
				setState(550);
				match(ASSIGN);
				setState(551);
				objInitializer();
				setState(552);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(554);
				typeRef();
				setState(555);
				match(L_PAREN);
				setState(556);
				argumentList();
				setState(557);
				match(R_PAREN);
				setState(558);
				name();
				setState(559);
				match(ASSIGN);
				setState(560);
				objInitializer();
				setState(561);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(563);
				mainInstantiation();
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

	public static class MainInstantiationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(P4Parser.L_PAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(P4Parser.R_PAREN, 0); }
		public TerminalNode MAIN() { return getToken(P4Parser.MAIN, 0); }
		public TerminalNode SEMICOLON() { return getToken(P4Parser.SEMICOLON, 0); }
		public MainInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainInstantiation; }
	}

	public final MainInstantiationContext mainInstantiation() throws RecognitionException {
		MainInstantiationContext _localctx = new MainInstantiationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mainInstantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			name();
			setState(567);
			match(L_PAREN);
			setState(568);
			argumentList();
			setState(569);
			match(R_PAREN);
			setState(570);
			match(MAIN);
			setState(571);
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
		enterRule(_localctx, 48, RULE_objInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(L_BRACE);
			setState(574);
			objDeclarations(0);
			setState(575);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_objDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(582);
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
					setState(578);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(579);
					objDeclaration();
					}
					} 
				}
				setState(584);
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
		enterRule(_localctx, 52, RULE_objDeclaration);
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
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
		enterRule(_localctx, 54, RULE_optConstructorParameters);
		try {
			setState(594);
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
				setState(590);
				match(L_PAREN);
				setState(591);
				parameterList();
				setState(592);
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
		enterRule(_localctx, 56, RULE_dotPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
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
		enterRule(_localctx, 58, RULE_parserDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			parserTypeDeclaration();
			setState(599);
			optConstructorParameters();
			setState(600);
			match(L_BRACE);
			setState(601);
			parserLocalElements(0);
			setState(602);
			parserStates(0);
			setState(603);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_parserLocalElements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(610);
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
					setState(606);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(607);
					parserLocalElement();
					}
					} 
				}
				setState(612);
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
		enterRule(_localctx, 62, RULE_parserLocalElement);
		try {
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				instantiation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(616);
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
		enterRule(_localctx, 64, RULE_parserTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			optAnnotations();
			setState(620);
			match(PARSER);
			setState(621);
			name();
			setState(622);
			optTypeParameters();
			setState(623);
			match(L_PAREN);
			setState(624);
			parameterList();
			setState(625);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_parserStates, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(628);
			parserState();
			}
			_ctx.stop = _input.LT(-1);
			setState(634);
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
					setState(630);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(631);
					parserState();
					}
					} 
				}
				setState(636);
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
		enterRule(_localctx, 68, RULE_parserState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			optAnnotations();
			setState(638);
			match(STATE);
			setState(639);
			name();
			setState(640);
			match(L_BRACE);
			setState(641);
			parserStatements(0);
			setState(642);
			transitionStatement();
			setState(643);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_parserStatements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(650);
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
					setState(646);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(647);
					parserStatement();
					}
					} 
				}
				setState(652);
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
		enterRule(_localctx, 72, RULE_parserStatement);
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				assignmentOrMethodCallStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				directApplication();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				constantDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(657);
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
		enterRule(_localctx, 74, RULE_parserBlockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			optAnnotations();
			setState(661);
			match(L_BRACE);
			setState(662);
			parserStatements(0);
			setState(663);
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
		enterRule(_localctx, 76, RULE_transitionStatement);
		try {
			setState(668);
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
				setState(666);
				match(TRANSITION);
				setState(667);
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
		enterRule(_localctx, 78, RULE_stateExpression);
		try {
			setState(674);
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
				setState(670);
				name();
				setState(671);
				match(SEMICOLON);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
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
		enterRule(_localctx, 80, RULE_selectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(SELECT);
			setState(677);
			match(L_PAREN);
			setState(678);
			expressionList(0);
			setState(679);
			match(R_PAREN);
			setState(680);
			match(L_BRACE);
			setState(681);
			selectCaseList(0);
			setState(682);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_selectCaseList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(689);
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
					setState(685);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(686);
					selectCase();
					}
					} 
				}
				setState(691);
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
		enterRule(_localctx, 84, RULE_selectCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			keysetExpression();
			setState(693);
			match(COLON);
			setState(694);
			name();
			setState(695);
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
		enterRule(_localctx, 86, RULE_keysetExpression);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				tupleKeysetExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
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
		enterRule(_localctx, 88, RULE_tupleKeysetExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(L_PAREN);
			setState(702);
			simpleKeysetExpression();
			setState(703);
			match(COMMA);
			setState(704);
			simpleExpressionList(0);
			setState(705);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_simpleExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(708);
			simpleKeysetExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(715);
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
					setState(710);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(711);
					match(COMMA);
					setState(712);
					simpleKeysetExpression();
					}
					} 
				}
				setState(717);
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
		enterRule(_localctx, 92, RULE_simpleKeysetExpression);
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				expression(0);
				setState(720);
				match(MASK);
				setState(721);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				expression(0);
				setState(724);
				match(RANGE);
				setState(725);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				match(DEFAULT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
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
		enterRule(_localctx, 94, RULE_valueSetDeclaration);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				optAnnotations();
				setState(732);
				match(VALUESET);
				setState(733);
				match(L_ANGLE);
				setState(734);
				baseType();
				setState(735);
				match(R_ANGLE);
				setState(736);
				match(L_PAREN);
				setState(737);
				expression(0);
				setState(738);
				match(R_PAREN);
				setState(739);
				name();
				setState(740);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				optAnnotations();
				setState(743);
				match(VALUESET);
				setState(744);
				match(L_ANGLE);
				setState(745);
				tupleType();
				setState(746);
				match(R_ANGLE);
				setState(747);
				match(L_PAREN);
				setState(748);
				expression(0);
				setState(749);
				match(R_PAREN);
				setState(750);
				name();
				setState(751);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				optAnnotations();
				setState(754);
				match(VALUESET);
				setState(755);
				match(L_ANGLE);
				setState(756);
				typeName();
				setState(757);
				match(R_ANGLE);
				setState(758);
				match(L_PAREN);
				setState(759);
				expression(0);
				setState(760);
				match(R_PAREN);
				setState(761);
				name();
				setState(762);
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
		enterRule(_localctx, 96, RULE_controlDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			controlTypeDeclaration();
			setState(767);
			optConstructorParameters();
			setState(768);
			match(L_BRACE);
			setState(769);
			controlLocalDeclarations(0);
			setState(770);
			match(APPLY);
			setState(771);
			controlBody();
			setState(772);
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
		enterRule(_localctx, 98, RULE_controlTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			optAnnotations();
			setState(775);
			match(CONTROL);
			setState(776);
			name();
			setState(777);
			optTypeParameters();
			setState(778);
			match(L_PAREN);
			setState(779);
			parameterList();
			setState(780);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_controlLocalDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(787);
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
					setState(783);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(784);
					controlLocalDeclaration();
					}
					} 
				}
				setState(789);
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
		enterRule(_localctx, 102, RULE_controlLocalDeclaration);
		try {
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				actionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				tableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(793);
				instantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(794);
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
		enterRule(_localctx, 104, RULE_controlBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
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
		enterRule(_localctx, 106, RULE_externDeclaration);
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				optAnnotations();
				setState(800);
				match(EXTERN);
				setState(801);
				nonTypeName();
				setState(802);
				optTypeParameters();
				setState(803);
				match(L_BRACE);
				setState(804);
				methodPrototypes(0);
				setState(805);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				optAnnotations();
				setState(808);
				match(EXTERN);
				setState(809);
				functionPrototype();
				setState(810);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(812);
				optAnnotations();
				setState(813);
				match(EXTERN);
				setState(814);
				name();
				setState(815);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_methodPrototypes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(824);
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
					setState(820);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(821);
					methodPrototype();
					}
					} 
				}
				setState(826);
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
		enterRule(_localctx, 110, RULE_functionPrototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			typeOrVoid();
			setState(828);
			name();
			setState(829);
			optTypeParameters();
			setState(830);
			match(L_PAREN);
			setState(831);
			parameterList();
			setState(832);
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
		enterRule(_localctx, 112, RULE_methodPrototype);
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				optAnnotations();
				setState(835);
				functionPrototype();
				setState(836);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				optAnnotations();
				setState(839);
				match(ABSTRACT);
				setState(840);
				functionPrototype();
				setState(841);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				optAnnotations();
				setState(844);
				type_or_id();
				setState(845);
				match(L_PAREN);
				setState(846);
				parameterList();
				setState(847);
				match(R_PAREN);
				setState(848);
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
		enterRule(_localctx, 114, RULE_typeRef);
		try {
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				baseType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				typeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				specializedType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				headerStackType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(856);
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
		enterRule(_localctx, 116, RULE_namedType);
		try {
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
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
		enterRule(_localctx, 118, RULE_prefixedType);
		try {
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				type_or_id();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(864);
				dotPrefix();
				setState(865);
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
		enterRule(_localctx, 120, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
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
		enterRule(_localctx, 122, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(TUPLE);
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
		enterRule(_localctx, 124, RULE_headerStackType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			typeName();
			setState(877);
			match(L_BRACKET);
			setState(878);
			expression(0);
			setState(879);
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
		enterRule(_localctx, 126, RULE_specializedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			typeName();
			setState(882);
			match(L_ANGLE);
			setState(883);
			typeArgumentList(0);
			setState(884);
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
		enterRule(_localctx, 128, RULE_baseType);
		try {
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				match(BOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				match(ERROR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(888);
				match(BIT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(889);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(890);
				match(BIT);
				setState(891);
				match(L_ANGLE);
				setState(892);
				match(INTEGER);
				setState(893);
				match(R_ANGLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(894);
				match(INT);
				setState(895);
				match(L_ANGLE);
				setState(896);
				match(INTEGER);
				setState(897);
				match(R_ANGLE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(898);
				match(VARBIT);
				setState(899);
				match(L_ANGLE);
				setState(900);
				match(INTEGER);
				setState(901);
				match(R_ANGLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(902);
				match(BIT);
				setState(903);
				match(L_ANGLE);
				setState(904);
				match(L_PAREN);
				setState(905);
				expression(0);
				setState(906);
				match(R_PAREN);
				setState(907);
				match(R_ANGLE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(909);
				match(INT);
				setState(910);
				match(L_ANGLE);
				setState(911);
				match(L_PAREN);
				setState(912);
				expression(0);
				setState(913);
				match(R_PAREN);
				setState(914);
				match(R_ANGLE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(916);
				match(VARBIT);
				setState(917);
				match(L_ANGLE);
				setState(918);
				match(L_PAREN);
				setState(919);
				expression(0);
				setState(920);
				match(R_PAREN);
				setState(921);
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
		enterRule(_localctx, 130, RULE_typeOrVoid);
		try {
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				typeRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(VOID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
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
		enterRule(_localctx, 132, RULE_optTypeParameters);
		try {
			setState(935);
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
				setState(931);
				match(L_ANGLE);
				setState(932);
				typeParameterList(0);
				setState(933);
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
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_typeParameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(938);
			name();
			}
			_ctx.stop = _input.LT(-1);
			setState(945);
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
					setState(940);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(941);
					match(COMMA);
					setState(942);
					name();
					}
					} 
				}
				setState(947);
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
		enterRule(_localctx, 136, RULE_typeArg);
		try {
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				typeRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				nonTypeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(950);
				match(VOID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(951);
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
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_typeArgumentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(955);
				typeArg();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(963);
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
					setState(958);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(959);
					match(COMMA);
					setState(960);
					typeArg();
					}
					} 
				}
				setState(965);
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
		enterRule(_localctx, 140, RULE_realTypeArg);
		try {
			setState(969);
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
				setState(966);
				typeRef();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				match(VOID);
				}
				break;
			case DONTCARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(968);
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_realTypeArgumentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(972);
			realTypeArg();
			}
			_ctx.stop = _input.LT(-1);
			setState(979);
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
					setState(974);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(975);
					match(COMMA);
					setState(976);
					typeArg();
					}
					} 
				}
				setState(981);
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
		enterRule(_localctx, 144, RULE_typeDeclaration);
		try {
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				derivedTypeDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				typedefDeclaration();
				setState(984);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(986);
				parserTypeDeclaration();
				setState(987);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(989);
				controlTypeDeclaration();
				setState(990);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(992);
				packageTypeDeclaration();
				setState(993);
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
		enterRule(_localctx, 146, RULE_derivedTypeDeclaration);
		try {
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				headerTypeDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				headerUnionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(999);
				structTypeDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1000);
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
		enterRule(_localctx, 148, RULE_headerTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			optAnnotations();
			setState(1004);
			match(HEADER);
			setState(1005);
			name();
			setState(1006);
			match(L_BRACE);
			setState(1007);
			structFieldList(0);
			setState(1008);
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
		enterRule(_localctx, 150, RULE_structTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			optAnnotations();
			setState(1011);
			match(STRUCT);
			setState(1012);
			name();
			setState(1013);
			match(L_BRACE);
			setState(1014);
			structFieldList(0);
			setState(1015);
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
		enterRule(_localctx, 152, RULE_headerUnionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			optAnnotations();
			setState(1018);
			match(HEADER_UNION);
			setState(1019);
			name();
			setState(1020);
			match(L_BRACE);
			setState(1021);
			structFieldList(0);
			setState(1022);
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
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_structFieldList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1031);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1029);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new StructFieldListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_structFieldList);
						setState(1025);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1026);
						preprocessorLine();
						}
						break;
					case 2:
						{
						_localctx = new StructFieldListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_structFieldList);
						setState(1027);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1028);
						structField();
						}
						break;
					}
					} 
				}
				setState(1033);
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
		enterRule(_localctx, 156, RULE_structField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			optAnnotations();
			setState(1035);
			typeRef();
			setState(1036);
			name();
			setState(1037);
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
		enterRule(_localctx, 158, RULE_enumDeclaration);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1039);
				optAnnotations();
				setState(1040);
				match(ENUM);
				setState(1041);
				name();
				setState(1042);
				match(L_BRACE);
				setState(1043);
				identifierList(0);
				setState(1044);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1046);
				optAnnotations();
				setState(1047);
				match(ENUM);
				setState(1048);
				match(BIT);
				setState(1049);
				match(L_ANGLE);
				setState(1050);
				match(INTEGER);
				setState(1051);
				match(R_ANGLE);
				setState(1052);
				name();
				setState(1053);
				match(L_BRACE);
				setState(1054);
				specifiedIdentifierList(0);
				setState(1055);
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
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_specifiedIdentifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1060);
			specifiedIdentifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1067);
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
					setState(1062);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1063);
					match(COMMA);
					setState(1064);
					specifiedIdentifier();
					}
					} 
				}
				setState(1069);
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
		enterRule(_localctx, 162, RULE_specifiedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			name();
			setState(1071);
			match(ASSIGN);
			setState(1072);
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
		enterRule(_localctx, 164, RULE_errorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(ERROR);
			setState(1075);
			match(L_BRACE);
			setState(1076);
			identifierList(0);
			setState(1077);
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
		enterRule(_localctx, 166, RULE_matchKindDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(MATCH_KIND);
			setState(1080);
			match(L_BRACE);
			setState(1081);
			identifierList(0);
			setState(1082);
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
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1085);
			name();
			}
			_ctx.stop = _input.LT(-1);
			setState(1092);
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
					setState(1087);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1088);
					match(COMMA);
					setState(1089);
					name();
					}
					} 
				}
				setState(1094);
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
		enterRule(_localctx, 170, RULE_typedefDeclaration);
		try {
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095);
				optAnnotations();
				setState(1096);
				match(TYPEDEF);
				setState(1097);
				typeRef();
				setState(1098);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				optAnnotations();
				setState(1101);
				match(TYPEDEF);
				setState(1102);
				derivedTypeDeclaration();
				setState(1103);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1105);
				optAnnotations();
				setState(1106);
				match(TYPE);
				setState(1107);
				typeRef();
				setState(1108);
				name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1110);
				optAnnotations();
				setState(1111);
				match(TYPE);
				setState(1112);
				derivedTypeDeclaration();
				setState(1113);
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
		enterRule(_localctx, 172, RULE_methodCall);
		try {
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1117);
				lvalue(0);
				setState(1118);
				match(L_PAREN);
				setState(1119);
				argumentList();
				setState(1120);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				lvalue(0);
				setState(1123);
				match(L_ANGLE);
				setState(1124);
				typeArgumentList(0);
				setState(1125);
				match(R_ANGLE);
				setState(1126);
				match(L_PAREN);
				setState(1127);
				argumentList();
				setState(1128);
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
		enterRule(_localctx, 174, RULE_assignmentOrMethodCallStatement);
		try {
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132);
				methodCall();
				setState(1133);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				lvalue(0);
				setState(1136);
				match(ASSIGN);
				setState(1137);
				expression(0);
				setState(1138);
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
		enterRule(_localctx, 176, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
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
		enterRule(_localctx, 178, RULE_exitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(EXIT);
			setState(1145);
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
		enterRule(_localctx, 180, RULE_returnStatement);
		try {
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				match(RETURN);
				setState(1148);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149);
				match(RETURN);
				setState(1150);
				expression(0);
				setState(1151);
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
		enterRule(_localctx, 182, RULE_conditionalStatement);
		try {
			setState(1169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				match(IF);
				setState(1156);
				match(L_PAREN);
				setState(1157);
				expression(0);
				setState(1158);
				match(R_PAREN);
				setState(1159);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				match(IF);
				setState(1162);
				match(L_PAREN);
				setState(1163);
				expression(0);
				setState(1164);
				match(R_PAREN);
				setState(1165);
				statement();
				setState(1166);
				match(ELSE);
				setState(1167);
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
		enterRule(_localctx, 184, RULE_directApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			typeName();
			setState(1172);
			match(DOT);
			setState(1173);
			match(APPLY);
			setState(1174);
			match(L_PAREN);
			setState(1175);
			argumentList();
			setState(1176);
			match(R_PAREN);
			setState(1177);
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
		enterRule(_localctx, 186, RULE_statement);
		try {
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1179);
				directApplication();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180);
				assignmentOrMethodCallStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1181);
				conditionalStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1182);
				emptyStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1183);
				blockStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1184);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1185);
				exitStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1186);
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
		enterRule(_localctx, 188, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			optAnnotations();
			setState(1190);
			match(L_BRACE);
			setState(1191);
			statOrDeclList(0);
			setState(1192);
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
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_statOrDeclList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1199);
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
					setState(1195);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1196);
					statementOrDeclaration();
					}
					} 
				}
				setState(1201);
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
		enterRule(_localctx, 192, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(SWITCH);
			setState(1203);
			match(L_PAREN);
			setState(1204);
			expression(0);
			setState(1205);
			match(R_PAREN);
			setState(1206);
			match(L_BRACE);
			setState(1207);
			switchCases(0);
			setState(1208);
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
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_switchCases, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1215);
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
					setState(1211);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1212);
					switchCase();
					}
					} 
				}
				setState(1217);
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
		enterRule(_localctx, 196, RULE_switchCase);
		try {
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				switchLabel();
				setState(1219);
				match(COLON);
				setState(1220);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1222);
				switchLabel();
				setState(1223);
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
		enterRule(_localctx, 198, RULE_switchLabel);
		try {
			setState(1229);
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
				setState(1227);
				name();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
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
		enterRule(_localctx, 200, RULE_statementOrDeclaration);
		try {
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1233);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1234);
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
		enterRule(_localctx, 202, RULE_tableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			optAnnotations();
			setState(1238);
			match(TABLE);
			setState(1239);
			name();
			setState(1240);
			match(L_BRACE);
			setState(1241);
			tablePropertyList(0);
			setState(1242);
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
		int _startState = 204;
		enterRecursionRule(_localctx, 204, RULE_tablePropertyList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1245);
			tableProperty();
			}
			_ctx.stop = _input.LT(-1);
			setState(1251);
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
					setState(1247);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1248);
					tableProperty();
					}
					} 
				}
				setState(1253);
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
		enterRule(_localctx, 206, RULE_tableProperty);
		try {
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1254);
				match(KEY);
				setState(1255);
				match(ASSIGN);
				setState(1256);
				match(L_BRACE);
				setState(1257);
				keyElementList(0);
				setState(1258);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				match(ACTIONS);
				setState(1261);
				match(ASSIGN);
				setState(1262);
				match(L_BRACE);
				setState(1263);
				actionList(0);
				setState(1264);
				match(R_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1266);
				optAnnotations();
				setState(1267);
				optCONST();
				setState(1268);
				match(DEFAULT_ACTION);
				setState(1269);
				match(ASSIGN);
				setState(1270);
				name();
				setState(1271);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1273);
				optAnnotations();
				setState(1274);
				optCONST();
				setState(1275);
				match(DEFAULT_ACTION);
				setState(1276);
				match(ASSIGN);
				setState(1277);
				actionBinding();
				setState(1278);
				optAnnotations();
				setState(1279);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1281);
				optAnnotations();
				setState(1282);
				optCONST();
				setState(1283);
				match(ENTRIES);
				setState(1284);
				match(ASSIGN);
				setState(1285);
				match(L_BRACE);
				setState(1286);
				entriesList(0);
				setState(1287);
				match(R_BRACE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1289);
				optAnnotations();
				setState(1290);
				optCONST();
				setState(1291);
				nonTableKwName();
				setState(1292);
				match(ASSIGN);
				setState(1293);
				initializer();
				setState(1294);
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
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_keyElementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1303);
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
					setState(1299);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1300);
					keyElement();
					}
					} 
				}
				setState(1305);
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
		enterRule(_localctx, 210, RULE_keyElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			expression(0);
			setState(1307);
			match(COLON);
			setState(1308);
			name();
			setState(1309);
			optAnnotations();
			setState(1310);
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
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_actionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1319);
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
					setState(1313);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1314);
					actionRef();
					setState(1315);
					match(SEMICOLON);
					}
					} 
				}
				setState(1321);
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
		enterRule(_localctx, 214, RULE_actionRef);
		try {
			setState(1331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				optAnnotations();
				setState(1323);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1325);
				optAnnotations();
				setState(1326);
				name();
				setState(1327);
				match(L_PAREN);
				setState(1328);
				argumentList();
				setState(1329);
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
		enterRule(_localctx, 216, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			keysetExpression();
			setState(1334);
			match(COLON);
			setState(1335);
			actionBinding();
			setState(1336);
			optAnnotations();
			setState(1337);
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
		enterRule(_localctx, 218, RULE_actionBinding);
		try {
			setState(1352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1339);
				lvalue(0);
				setState(1340);
				match(L_PAREN);
				setState(1341);
				argumentList();
				setState(1342);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344);
				lvalue(0);
				setState(1345);
				match(L_ANGLE);
				setState(1346);
				typeArgumentList(0);
				setState(1347);
				match(R_ANGLE);
				setState(1348);
				match(L_PAREN);
				setState(1349);
				argumentList();
				setState(1350);
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
		int _startState = 220;
		enterRecursionRule(_localctx, 220, RULE_entriesList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1355);
			entry();
			}
			_ctx.stop = _input.LT(-1);
			setState(1361);
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
					setState(1357);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1358);
					entry();
					}
					} 
				}
				setState(1363);
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
		enterRule(_localctx, 222, RULE_actionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			optAnnotations();
			setState(1365);
			match(ACTION);
			setState(1366);
			name();
			setState(1367);
			match(L_PAREN);
			setState(1368);
			parameterList();
			setState(1369);
			match(R_PAREN);
			setState(1370);
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
		enterRule(_localctx, 224, RULE_variableDeclaration);
		try {
			setState(1383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRAGMA:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1372);
				annotations(0);
				setState(1373);
				typeRef();
				setState(1374);
				name();
				setState(1375);
				optInitializer();
				setState(1376);
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
				setState(1378);
				typeRef();
				setState(1379);
				name();
				setState(1380);
				optInitializer();
				setState(1381);
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
		enterRule(_localctx, 226, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			optAnnotations();
			setState(1386);
			match(CONST);
			setState(1387);
			typeRef();
			setState(1388);
			name();
			setState(1389);
			match(ASSIGN);
			setState(1390);
			initializer();
			setState(1391);
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
		enterRule(_localctx, 228, RULE_optInitializer);
		try {
			setState(1396);
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
				setState(1394);
				match(ASSIGN);
				setState(1395);
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
		enterRule(_localctx, 230, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
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
		enterRule(_localctx, 232, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			functionPrototype();
			setState(1401);
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
		enterRule(_localctx, 234, RULE_argumentList);
		try {
			setState(1405);
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
				setState(1404);
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
		int _startState = 236;
		enterRecursionRule(_localctx, 236, RULE_nonEmptyArgList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1408);
			argument();
			}
			_ctx.stop = _input.LT(-1);
			setState(1415);
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
					setState(1410);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1411);
					match(COMMA);
					setState(1412);
					argument();
					}
					} 
				}
				setState(1417);
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
		enterRule(_localctx, 238, RULE_argument);
		try {
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1418);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1419);
				name();
				setState(1420);
				match(ASSIGN);
				setState(1421);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1423);
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
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_expressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(1427);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1435);
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
					setState(1430);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1431);
					match(COMMA);
					setState(1432);
					expression(0);
					}
					} 
				}
				setState(1437);
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
		enterRule(_localctx, 242, RULE_prefixedNonTypeName);
		try {
			setState(1442);
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
				setState(1438);
				nonTypeName();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				dotPrefix();
				setState(1440);
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
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
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
				setState(1445);
				prefixedNonTypeName();
				}
				break;
			case THIS:
				{
				setState(1446);
				match(THIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1464);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(1449);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1450);
						match(DOT);
						setState(1451);
						name();
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(1452);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1453);
						match(L_BRACKET);
						setState(1454);
						expression(0);
						setState(1455);
						match(R_BRACKET);
						}
						break;
					case 3:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(1457);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1458);
						match(L_BRACKET);
						setState(1459);
						expression(0);
						setState(1460);
						match(COLON);
						setState(1461);
						expression(0);
						setState(1462);
						match(R_BRACKET);
						}
						break;
					}
					} 
				}
				setState(1468);
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
		int _startState = 246;
		enterRecursionRule(_localctx, 246, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(1470);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(1471);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(1472);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(1473);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(1474);
				match(THIS);
				}
				break;
			case 6:
				{
				setState(1475);
				nonTypeName();
				}
				break;
			case 7:
				{
				setState(1476);
				dotPrefix();
				setState(1477);
				nonTypeName();
				}
				break;
			case 8:
				{
				setState(1479);
				match(L_BRACE);
				setState(1480);
				expressionList(0);
				setState(1481);
				match(R_BRACE);
				}
				break;
			case 9:
				{
				setState(1483);
				match(L_PAREN);
				setState(1484);
				expression(0);
				setState(1485);
				match(R_PAREN);
				}
				break;
			case 10:
				{
				setState(1487);
				match(NOT);
				setState(1488);
				expression(32);
				}
				break;
			case 11:
				{
				setState(1489);
				match(COMPLEMENT);
				setState(1490);
				expression(31);
				}
				break;
			case 12:
				{
				setState(1491);
				match(MINUS);
				setState(1492);
				expression(30);
				}
				break;
			case 13:
				{
				setState(1493);
				match(PLUS);
				setState(1494);
				expression(29);
				}
				break;
			case 14:
				{
				setState(1495);
				typeName();
				setState(1496);
				match(DOT);
				setState(1497);
				name();
				}
				break;
			case 15:
				{
				setState(1499);
				match(ERROR);
				setState(1500);
				match(DOT);
				setState(1501);
				name();
				}
				break;
			case 16:
				{
				setState(1502);
				methodCall();
				}
				break;
			case 17:
				{
				setState(1503);
				match(L_PAREN);
				setState(1504);
				typeRef();
				setState(1505);
				match(R_PAREN);
				setState(1506);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1603);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1510);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1511);
						match(MUL);
						setState(1512);
						expression(26);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1513);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1514);
						match(DIV);
						setState(1515);
						expression(25);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1516);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1517);
						match(MOD);
						setState(1518);
						expression(24);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1519);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1520);
						match(PLUS);
						setState(1521);
						expression(23);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1522);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1523);
						match(MINUS);
						setState(1524);
						expression(22);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1525);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1526);
						match(PLUS_SAT);
						setState(1527);
						expression(21);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1528);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1529);
						match(MINUS_SAT);
						setState(1530);
						expression(20);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1531);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1532);
						match(SHL);
						setState(1533);
						expression(19);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1534);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1535);
						match(R_ANGLE);
						setState(1536);
						match(R_ANGLE);
						setState(1537);
						expression(18);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1538);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1539);
						match(LE);
						setState(1540);
						expression(17);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1541);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1542);
						match(GE);
						setState(1543);
						expression(16);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1544);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1545);
						match(L_ANGLE);
						setState(1546);
						expression(15);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1547);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1548);
						match(R_ANGLE);
						setState(1549);
						expression(14);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1550);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1551);
						match(NE);
						setState(1552);
						expression(13);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1553);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1554);
						match(EQ);
						setState(1555);
						expression(12);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1556);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1557);
						match(BIT_AND);
						setState(1558);
						expression(11);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1559);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1560);
						match(BIT_XOR);
						setState(1561);
						expression(10);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1562);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1563);
						match(BIT_OR);
						setState(1564);
						expression(9);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1565);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1566);
						match(PP);
						setState(1567);
						expression(8);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1568);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1569);
						match(AND);
						setState(1570);
						expression(7);
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1571);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1572);
						match(OR);
						setState(1573);
						expression(6);
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1574);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1575);
						match(QUESTION);
						setState(1576);
						expression(0);
						setState(1577);
						match(COLON);
						setState(1578);
						expression(5);
						}
						break;
					case 23:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1580);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1581);
						match(L_BRACKET);
						setState(1582);
						expression(0);
						setState(1583);
						match(R_BRACKET);
						}
						break;
					case 24:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1585);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1586);
						match(L_BRACKET);
						setState(1587);
						expression(0);
						setState(1588);
						match(COLON);
						setState(1589);
						expression(0);
						setState(1590);
						match(R_BRACKET);
						}
						break;
					case 25:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1592);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1593);
						match(DOT);
						setState(1594);
						name();
						}
						break;
					case 26:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1595);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1596);
						match(L_ANGLE);
						setState(1597);
						realTypeArgumentList(0);
						setState(1598);
						match(R_ANGLE);
						setState(1599);
						match(L_PAREN);
						setState(1600);
						argumentList();
						setState(1601);
						match(R_PAREN);
						}
						break;
					}
					} 
				}
				setState(1607);
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
		enterRule(_localctx, 248, RULE_type_or_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
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
		enterRule(_localctx, 250, RULE_parserStateCondition);
		try {
			setState(1631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1611);
				expression(0);
				setState(1612);
				match(EQ);
				setState(1613);
				keysetExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1615);
				expression(0);
				setState(1616);
				match(EQ);
				setState(1617);
				match(L_PAREN);
				setState(1618);
				keysetExpression();
				setState(1619);
				match(R_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1621);
				keysetExpression();
				setState(1622);
				match(EQ);
				setState(1623);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1625);
				match(L_PAREN);
				setState(1626);
				keysetExpression();
				setState(1627);
				match(R_PAREN);
				setState(1628);
				match(EQ);
				setState(1629);
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
		case 25:
			return objDeclarations_sempred((ObjDeclarationsContext)_localctx, predIndex);
		case 30:
			return parserLocalElements_sempred((ParserLocalElementsContext)_localctx, predIndex);
		case 33:
			return parserStates_sempred((ParserStatesContext)_localctx, predIndex);
		case 35:
			return parserStatements_sempred((ParserStatementsContext)_localctx, predIndex);
		case 41:
			return selectCaseList_sempred((SelectCaseListContext)_localctx, predIndex);
		case 45:
			return simpleExpressionList_sempred((SimpleExpressionListContext)_localctx, predIndex);
		case 50:
			return controlLocalDeclarations_sempred((ControlLocalDeclarationsContext)_localctx, predIndex);
		case 54:
			return methodPrototypes_sempred((MethodPrototypesContext)_localctx, predIndex);
		case 67:
			return typeParameterList_sempred((TypeParameterListContext)_localctx, predIndex);
		case 69:
			return typeArgumentList_sempred((TypeArgumentListContext)_localctx, predIndex);
		case 71:
			return realTypeArgumentList_sempred((RealTypeArgumentListContext)_localctx, predIndex);
		case 77:
			return structFieldList_sempred((StructFieldListContext)_localctx, predIndex);
		case 80:
			return specifiedIdentifierList_sempred((SpecifiedIdentifierListContext)_localctx, predIndex);
		case 84:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 95:
			return statOrDeclList_sempred((StatOrDeclListContext)_localctx, predIndex);
		case 97:
			return switchCases_sempred((SwitchCasesContext)_localctx, predIndex);
		case 102:
			return tablePropertyList_sempred((TablePropertyListContext)_localctx, predIndex);
		case 104:
			return keyElementList_sempred((KeyElementListContext)_localctx, predIndex);
		case 106:
			return actionList_sempred((ActionListContext)_localctx, predIndex);
		case 110:
			return entriesList_sempred((EntriesListContext)_localctx, predIndex);
		case 118:
			return nonEmptyArgList_sempred((NonEmptyArgListContext)_localctx, predIndex);
		case 120:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 122:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		case 123:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3k\u0664\4\2\t\2\4"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\7\4\u0108\n\4\f\4\16\4\u010b\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0118\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0131\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0143\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u014c\n\b\3\t\3\t"+
		"\5\t\u0150\n\t\3\n\3\n\3\n\3\n\5\n\u0156\n\n\3\13\3\13\5\13\u015a\n\13"+
		"\3\f\3\f\5\f\u015e\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u0165\n\r\f\r\16\r\u0168"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0176\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0180\n\17\f"+
		"\17\16\17\u0183\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u01d8\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01e0"+
		"\n\21\f\21\16\21\u01e3\13\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u01eb"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01f3\n\24\f\24\16\24\u01f6\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0204"+
		"\n\25\3\26\3\26\3\26\3\26\5\26\u020a\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0237\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u0247"+
		"\n\33\f\33\16\33\u024a\13\33\3\34\3\34\5\34\u024e\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0255\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \7 \u0263\n \f \16 \u0266\13 \3!\3!\3!\3!\5!\u026c\n!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\7#\u027b\n#\f#\16#\u027e\13#\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\7%\u028b\n%\f%\16%\u028e\13%\3&\3&\3&"+
		"\3&\3&\5&\u0295\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u029f\n(\3)\3)\3)\3"+
		")\5)\u02a5\n)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\7+\u02b2\n+\f+\16+\u02b5"+
		"\13+\3,\3,\3,\3,\3,\3-\3-\5-\u02be\n-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"/\3/\7/\u02cc\n/\f/\16/\u02cf\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\5\60\u02dc\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02ff"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u0314\n\64\f\64\16\64\u0317\13\64"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u031e\n\65\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u0334\n\67\38\38\38\78\u0339\n8\f8\168\u033c\138\39\39\39\39\39"+
		"\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0355\n:\3;"+
		"\3;\3;\3;\3;\5;\u035c\n;\3<\3<\5<\u0360\n<\3=\3=\3=\3=\5=\u0366\n=\3>"+
		"\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\5B\u039e\nB\3C\3C\3C\5C\u03a3\nC\3D\3D\3D\3D\3D"+
		"\5D\u03aa\nD\3E\3E\3E\3E\3E\3E\7E\u03b2\nE\fE\16E\u03b5\13E\3F\3F\3F\3"+
		"F\5F\u03bb\nF\3G\3G\5G\u03bf\nG\3G\3G\3G\7G\u03c4\nG\fG\16G\u03c7\13G"+
		"\3H\3H\3H\5H\u03cc\nH\3I\3I\3I\3I\3I\3I\7I\u03d4\nI\fI\16I\u03d7\13I\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u03e6\nJ\3K\3K\3K\3K\5K\u03ec"+
		"\nK\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3O"+
		"\3O\3O\3O\3O\7O\u0408\nO\fO\16O\u040b\13O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0424\nQ\3R\3R\3R\3R\3R\3"+
		"R\7R\u042c\nR\fR\16R\u042f\13R\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U"+
		"\3U\3V\3V\3V\3V\3V\3V\7V\u0445\nV\fV\16V\u0448\13V\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u045e\nW\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\5X\u046d\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0477\n"+
		"Y\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0484\n\\\3]\3]\3]\3]\3]"+
		"\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0494\n]\3^\3^\3^\3^\3^\3^\3^\3^\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\5_\u04a6\n_\3`\3`\3`\3`\3`\3a\3a\3a\7a\u04b0\na\fa"+
		"\16a\u04b3\13a\3b\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\7c\u04c0\nc\fc\16c\u04c3"+
		"\13c\3d\3d\3d\3d\3d\3d\3d\5d\u04cc\nd\3e\3e\5e\u04d0\ne\3f\3f\3f\3f\5"+
		"f\u04d6\nf\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\7h\u04e4\nh\fh\16h\u04e7"+
		"\13h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3"+
		"i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u0513"+
		"\ni\3j\3j\3j\7j\u0518\nj\fj\16j\u051b\13j\3k\3k\3k\3k\3k\3k\3l\3l\3l\3"+
		"l\3l\7l\u0528\nl\fl\16l\u052b\13l\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u0536"+
		"\nm\3n\3n\3n\3n\3n\3n\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u054b"+
		"\no\3p\3p\3p\3p\3p\7p\u0552\np\fp\16p\u0555\13p\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u056a\nr\3s\3s\3s\3s\3s\3s\3s\3"+
		"s\3t\3t\3t\5t\u0577\nt\3u\3u\3v\3v\3v\3w\3w\5w\u0580\nw\3x\3x\3x\3x\3"+
		"x\3x\7x\u0588\nx\fx\16x\u058b\13x\3y\3y\3y\3y\3y\3y\5y\u0593\ny\3z\3z"+
		"\5z\u0597\nz\3z\3z\3z\7z\u059c\nz\fz\16z\u059f\13z\3{\3{\3{\3{\5{\u05a5"+
		"\n{\3|\3|\3|\5|\u05aa\n|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\7|\u05bb\n|\f|\16|\u05be\13|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3"+
		"}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3"+
		"}\3}\3}\5}\u05e7\n}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3"+
		"}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3"+
		"}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3"+
		"}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3"+
		"}\3}\3}\3}\3}\3}\3}\3}\7}\u0646\n}\f}\16}\u0649\13}\3~\3~\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u0662\n\177\3\177\2\37"+
		"\6\30\34 &\64>DHT\\fn\u0088\u008c\u0090\u009c\u00a2\u00aa\u00c0\u00c4"+
		"\u00ce\u00d2\u00d6\u00de\u00ee\u00f2\u00f6\u00f8\u0080\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\2\3\3\2ij\2\u0716\2\u00fe\3\2\2\2\4\u0100"+
		"\3\2\2\2\6\u0102\3\2\2\2\b\u0117\3\2\2\2\n\u0130\3\2\2\2\f\u0142\3\2\2"+
		"\2\16\u014b\3\2\2\2\20\u014f\3\2\2\2\22\u0155\3\2\2\2\24\u0159\3\2\2\2"+
		"\26\u015d\3\2\2\2\30\u015f\3\2\2\2\32\u0175\3\2\2\2\34\u0177\3\2\2\2\36"+
		"\u01d7\3\2\2\2 \u01d9\3\2\2\2\"\u01e4\3\2\2\2$\u01ea\3\2\2\2&\u01ec\3"+
		"\2\2\2(\u0203\3\2\2\2*\u0209\3\2\2\2,\u020b\3\2\2\2.\u0236\3\2\2\2\60"+
		"\u0238\3\2\2\2\62\u023f\3\2\2\2\64\u0243\3\2\2\2\66\u024d\3\2\2\28\u0254"+
		"\3\2\2\2:\u0256\3\2\2\2<\u0258\3\2\2\2>\u025f\3\2\2\2@\u026b\3\2\2\2B"+
		"\u026d\3\2\2\2D\u0275\3\2\2\2F\u027f\3\2\2\2H\u0287\3\2\2\2J\u0294\3\2"+
		"\2\2L\u0296\3\2\2\2N\u029e\3\2\2\2P\u02a4\3\2\2\2R\u02a6\3\2\2\2T\u02ae"+
		"\3\2\2\2V\u02b6\3\2\2\2X\u02bd\3\2\2\2Z\u02bf\3\2\2\2\\\u02c5\3\2\2\2"+
		"^\u02db\3\2\2\2`\u02fe\3\2\2\2b\u0300\3\2\2\2d\u0308\3\2\2\2f\u0310\3"+
		"\2\2\2h\u031d\3\2\2\2j\u031f\3\2\2\2l\u0333\3\2\2\2n\u0335\3\2\2\2p\u033d"+
		"\3\2\2\2r\u0354\3\2\2\2t\u035b\3\2\2\2v\u035f\3\2\2\2x\u0365\3\2\2\2z"+
		"\u0367\3\2\2\2|\u0369\3\2\2\2~\u036e\3\2\2\2\u0080\u0373\3\2\2\2\u0082"+
		"\u039d\3\2\2\2\u0084\u03a2\3\2\2\2\u0086\u03a9\3\2\2\2\u0088\u03ab\3\2"+
		"\2\2\u008a\u03ba\3\2\2\2\u008c\u03be\3\2\2\2\u008e\u03cb\3\2\2\2\u0090"+
		"\u03cd\3\2\2\2\u0092\u03e5\3\2\2\2\u0094\u03eb\3\2\2\2\u0096\u03ed\3\2"+
		"\2\2\u0098\u03f4\3\2\2\2\u009a\u03fb\3\2\2\2\u009c\u0402\3\2\2\2\u009e"+
		"\u040c\3\2\2\2\u00a0\u0423\3\2\2\2\u00a2\u0425\3\2\2\2\u00a4\u0430\3\2"+
		"\2\2\u00a6\u0434\3\2\2\2\u00a8\u0439\3\2\2\2\u00aa\u043e\3\2\2\2\u00ac"+
		"\u045d\3\2\2\2\u00ae\u046c\3\2\2\2\u00b0\u0476\3\2\2\2\u00b2\u0478\3\2"+
		"\2\2\u00b4\u047a\3\2\2\2\u00b6\u0483\3\2\2\2\u00b8\u0493\3\2\2\2\u00ba"+
		"\u0495\3\2\2\2\u00bc\u04a5\3\2\2\2\u00be\u04a7\3\2\2\2\u00c0\u04ac\3\2"+
		"\2\2\u00c2\u04b4\3\2\2\2\u00c4\u04bc\3\2\2\2\u00c6\u04cb\3\2\2\2\u00c8"+
		"\u04cf\3\2\2\2\u00ca\u04d5\3\2\2\2\u00cc\u04d7\3\2\2\2\u00ce\u04de\3\2"+
		"\2\2\u00d0\u0512\3\2\2\2\u00d2\u0514\3\2\2\2\u00d4\u051c\3\2\2\2\u00d6"+
		"\u0522\3\2\2\2\u00d8\u0535\3\2\2\2\u00da\u0537\3\2\2\2\u00dc\u054a\3\2"+
		"\2\2\u00de\u054c\3\2\2\2\u00e0\u0556\3\2\2\2\u00e2\u0569\3\2\2\2\u00e4"+
		"\u056b\3\2\2\2\u00e6\u0576\3\2\2\2\u00e8\u0578\3\2\2\2\u00ea\u057a\3\2"+
		"\2\2\u00ec\u057f\3\2\2\2\u00ee\u0581\3\2\2\2\u00f0\u0592\3\2\2\2\u00f2"+
		"\u0596\3\2\2\2\u00f4\u05a4\3\2\2\2\u00f6\u05a9\3\2\2\2\u00f8\u05e6\3\2"+
		"\2\2\u00fa\u064a\3\2\2\2\u00fc\u0661\3\2\2\2\u00fe\u00ff\5\4\3\2\u00ff"+
		"\3\3\2\2\2\u0100\u0101\5\6\4\2\u0101\5\3\2\2\2\u0102\u0109\b\4\1\2\u0103"+
		"\u0104\f\4\2\2\u0104\u0108\5\b\5\2\u0105\u0106\f\3\2\2\u0106\u0108\7W"+
		"\2\2\u0107\u0103\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\7\3\2\2\2\u010b\u0109\3\2\2\2"+
		"\u010c\u0118\5\u00e4s\2\u010d\u0118\5l\67\2\u010e\u0118\5\u00e0q\2\u010f"+
		"\u0118\5<\37\2\u0110\u0118\5\u0092J\2\u0111\u0118\5b\62\2\u0112\u0118"+
		"\5.\30\2\u0113\u0118\5\u00a6T\2\u0114\u0118\5\u00a8U\2\u0115\u0118\5\u00ea"+
		"v\2\u0116\u0118\5\n\6\2\u0117\u010c\3\2\2\2\u0117\u010d\3\2\2\2\u0117"+
		"\u010e\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0110\3\2\2\2\u0117\u0111\3\2"+
		"\2\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\t\3\2\2\2\u0119\u011a\7^\2\2"+
		"\u011a\u0131\5\f\7\2\u011b\u011c\7_\2\2\u011c\u011d\5\u00fa~\2\u011d\u011e"+
		"\5\u00f8}\2\u011e\u0131\3\2\2\2\u011f\u0120\7_\2\2\u0120\u0131\5\u00fa"+
		"~\2\u0121\u0131\7_\2\2\u0122\u0131\7`\2\2\u0123\u0131\7e\2\2\u0124\u0125"+
		"\7a\2\2\u0125\u0131\5\u00fa~\2\u0126\u0131\7a\2\2\u0127\u0128\7b\2\2\u0128"+
		"\u0131\5\u00fa~\2\u0129\u0131\7b\2\2\u012a\u012b\7f\2\2\u012b\u0131\5"+
		"\u00f8}\2\u012c\u012d\7c\2\2\u012d\u0131\5\u00f8}\2\u012e\u0131\7g\2\2"+
		"\u012f\u0131\7d\2\2\u0130\u0119\3\2\2\2\u0130\u011b\3\2\2\2\u0130\u011f"+
		"\3\2\2\2\u0130\u0121\3\2\2\2\u0130\u0122\3\2\2\2\u0130\u0123\3\2\2\2\u0130"+
		"\u0124\3\2\2\2\u0130\u0126\3\2\2\2\u0130\u0127\3\2\2\2\u0130\u0129\3\2"+
		"\2\2\u0130\u012a\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u012f\3\2\2\2\u0131\13\3\2\2\2\u0132\u0143\7]\2\2\u0133\u0134\7O\2\2"+
		"\u0134\u0135\5\f\7\2\u0135\u0136\7P\2\2\u0136\u0143\3\2\2\2\u0137\u0143"+
		"\5\20\t\2\u0138\u0139\5\20\t\2\u0139\u013a\7U\2\2\u013a\u013b\5\20\t\2"+
		"\u013b\u0143\3\2\2\2\u013c\u013d\7\3\2\2\u013d\u0143\5\f\7\2\u013e\u013f"+
		"\7\4\2\2\u013f\u0143\5\f\7\2\u0140\u0141\7C\2\2\u0141\u0143\5\f\7\2\u0142"+
		"\u0132\3\2\2\2\u0142\u0133\3\2\2\2\u0142\u0137\3\2\2\2\u0142\u0138\3\2"+
		"\2\2\u0142\u013c\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\r\3\2\2\2\u0144\u014c\5\u00fa~\2\u0145\u014c\7\t\2\2\u0146\u014c\7\35"+
		"\2\2\u0147\u014c\7\b\2\2\u0148\u014c\7&\2\2\u0149\u014c\7\21\2\2\u014a"+
		"\u014c\7 \2\2\u014b\u0144\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0146\3\2"+
		"\2\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014a\3\2\2\2\u014c\17\3\2\2\2\u014d\u0150\5\16\b\2\u014e\u0150\5\u00fa"+
		"~\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\21\3\2\2\2\u0151\u0156"+
		"\5\u00fa~\2\u0152\u0156\7\t\2\2\u0153\u0156\7&\2\2\u0154\u0156\7 \2\2"+
		"\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154"+
		"\3\2\2\2\u0156\23\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u015a\7\f\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\25\3\2\2\2\u015b\u015e\3\2\2"+
		"\2\u015c\u015e\5\30\r\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\27\3\2\2\2\u015f\u0160\b\r\1\2\u0160\u0161\5\32\16\2\u0161\u0166\3\2"+
		"\2\2\u0162\u0163\f\3\2\2\u0163\u0165\5\32\16\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\31\3\2\2"+
		"\2\u0168\u0166\3\2\2\2\u0169\u016a\7X\2\2\u016a\u0176\5\20\t\2\u016b\u016c"+
		"\7X\2\2\u016c\u016d\5\20\t\2\u016d\u016e\7I\2\2\u016e\u016f\5\34\17\2"+
		"\u016f\u0170\7J\2\2\u0170\u0176\3\2\2\2\u0171\u0172\7\5\2\2\u0172\u0173"+
		"\5\20\t\2\u0173\u0174\5\34\17\2\u0174\u0176\3\2\2\2\u0175\u0169\3\2\2"+
		"\2\u0175\u016b\3\2\2\2\u0175\u0171\3\2\2\2\u0176\33\3\2\2\2\u0177\u0181"+
		"\b\17\1\2\u0178\u0179\f\4\2\2\u0179\u017a\7I\2\2\u017a\u017b\5\34\17\2"+
		"\u017b\u017c\7J\2\2\u017c\u0180\3\2\2\2\u017d\u017e\f\3\2\2\u017e\u0180"+
		"\5\36\20\2\u017f\u0178\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0183\3\2\2\2"+
		"\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\35\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0184\u01d8\7Y\2\2\u0185\u01d8\7\6\2\2\u0186\u01d8\7\7\2\2\u0187"+
		"\u01d8\7\b\2\2\u0188\u01d8\7\t\2\2\u0189\u01d8\7\n\2\2\u018a\u01d8\7\13"+
		"\2\2\u018b\u01d8\7\f\2\2\u018c\u01d8\7\r\2\2\u018d\u01d8\7\16\2\2\u018e"+
		"\u01d8\7\20\2\2\u018f\u01d8\7\21\2\2\u0190\u01d8\7\22\2\2\u0191\u01d8"+
		"\7\23\2\2\u0192\u01d8\7\24\2\2\u0193\u01d8\7\25\2\2\u0194\u01d8\7\26\2"+
		"\2\u0195\u01d8\7\27\2\2\u0196\u01d8\7\30\2\2\u0197\u01d8\7\31\2\2\u0198"+
		"\u01d8\7\32\2\2\u0199\u01d8\7\33\2\2\u019a\u01d8\7\34\2\2\u019b\u01d8"+
		"\7\35\2\2\u019c\u01d8\7\37\2\2\u019d\u01d8\7 \2\2\u019e\u01d8\7!\2\2\u019f"+
		"\u01d8\7\"\2\2\u01a0\u01d8\7#\2\2\u01a1\u01d8\7\5\2\2\u01a2\u01d8\7$\2"+
		"\2\u01a3\u01d8\7%\2\2\u01a4\u01d8\7&\2\2\u01a5\u01d8\7(\2\2\u01a6\u01d8"+
		"\7)\2\2\u01a7\u01d8\7*\2\2\u01a8\u01d8\7+\2\2\u01a9\u01d8\7,\2\2\u01aa"+
		"\u01d8\7-\2\2\u01ab\u01d8\7.\2\2\u01ac\u01d8\7/\2\2\u01ad\u01d8\7\60\2"+
		"\2\u01ae\u01d8\7\61\2\2\u01af\u01d8\7\62\2\2\u01b0\u01d8\7\63\2\2\u01b1"+
		"\u01d8\5\u00fa~\2\u01b2\u01d8\7]\2\2\u01b3\u01d8\7k\2\2\u01b4\u01d8\7"+
		"\64\2\2\u01b5\u01d8\7\65\2\2\u01b6\u01d8\7\66\2\2\u01b7\u01d8\7\67\2\2"+
		"\u01b8\u01d8\78\2\2\u01b9\u01d8\79\2\2\u01ba\u01d8\7:\2\2\u01bb\u01d8"+
		"\7;\2\2\u01bc\u01d8\7<\2\2\u01bd\u01d8\7=\2\2\u01be\u01d8\7>\2\2\u01bf"+
		"\u01d8\7?\2\2\u01c0\u01d8\7@\2\2\u01c1\u01d8\7A\2\2\u01c2\u01d8\7B\2\2"+
		"\u01c3\u01d8\7C\2\2\u01c4\u01d8\7D\2\2\u01c5\u01d8\7E\2\2\u01c6\u01d8"+
		"\7F\2\2\u01c7\u01d8\7G\2\2\u01c8\u01d8\7H\2\2\u01c9\u01d8\7K\2\2\u01ca"+
		"\u01d8\7L\2\2\u01cb\u01d8\7M\2\2\u01cc\u01d8\7N\2\2\u01cd\u01d8\7O\2\2"+
		"\u01ce\u01d8\7P\2\2\u01cf\u01d8\7Q\2\2\u01d0\u01d8\7R\2\2\u01d1\u01d8"+
		"\7S\2\2\u01d2\u01d8\7T\2\2\u01d3\u01d8\7U\2\2\u01d4\u01d8\7V\2\2\u01d5"+
		"\u01d8\7W\2\2\u01d6\u01d8\7X\2\2\u01d7\u0184\3\2\2\2\u01d7\u0185\3\2\2"+
		"\2\u01d7\u0186\3\2\2\2\u01d7\u0187\3\2\2\2\u01d7\u0188\3\2\2\2\u01d7\u0189"+
		"\3\2\2\2\u01d7\u018a\3\2\2\2\u01d7\u018b\3\2\2\2\u01d7\u018c\3\2\2\2\u01d7"+
		"\u018d\3\2\2\2\u01d7\u018e\3\2\2\2\u01d7\u018f\3\2\2\2\u01d7\u0190\3\2"+
		"\2\2\u01d7\u0191\3\2\2\2\u01d7\u0192\3\2\2\2\u01d7\u0193\3\2\2\2\u01d7"+
		"\u0194\3\2\2\2\u01d7\u0195\3\2\2\2\u01d7\u0196\3\2\2\2\u01d7\u0197\3\2"+
		"\2\2\u01d7\u0198\3\2\2\2\u01d7\u0199\3\2\2\2\u01d7\u019a\3\2\2\2\u01d7"+
		"\u019b\3\2\2\2\u01d7\u019c\3\2\2\2\u01d7\u019d\3\2\2\2\u01d7\u019e\3\2"+
		"\2\2\u01d7\u019f\3\2\2\2\u01d7\u01a0\3\2\2\2\u01d7\u01a1\3\2\2\2\u01d7"+
		"\u01a2\3\2\2\2\u01d7\u01a3\3\2\2\2\u01d7\u01a4\3\2\2\2\u01d7\u01a5\3\2"+
		"\2\2\u01d7\u01a6\3\2\2\2\u01d7\u01a7\3\2\2\2\u01d7\u01a8\3\2\2\2\u01d7"+
		"\u01a9\3\2\2\2\u01d7\u01aa\3\2\2\2\u01d7\u01ab\3\2\2\2\u01d7\u01ac\3\2"+
		"\2\2\u01d7\u01ad\3\2\2\2\u01d7\u01ae\3\2\2\2\u01d7\u01af\3\2\2\2\u01d7"+
		"\u01b0\3\2\2\2\u01d7\u01b1\3\2\2\2\u01d7\u01b2\3\2\2\2\u01d7\u01b3\3\2"+
		"\2\2\u01d7\u01b4\3\2\2\2\u01d7\u01b5\3\2\2\2\u01d7\u01b6\3\2\2\2\u01d7"+
		"\u01b7\3\2\2\2\u01d7\u01b8\3\2\2\2\u01d7\u01b9\3\2\2\2\u01d7\u01ba\3\2"+
		"\2\2\u01d7\u01bb\3\2\2\2\u01d7\u01bc\3\2\2\2\u01d7\u01bd\3\2\2\2\u01d7"+
		"\u01be\3\2\2\2\u01d7\u01bf\3\2\2\2\u01d7\u01c0\3\2\2\2\u01d7\u01c1\3\2"+
		"\2\2\u01d7\u01c2\3\2\2\2\u01d7\u01c3\3\2\2\2\u01d7\u01c4\3\2\2\2\u01d7"+
		"\u01c5\3\2\2\2\u01d7\u01c6\3\2\2\2\u01d7\u01c7\3\2\2\2\u01d7\u01c8\3\2"+
		"\2\2\u01d7\u01c9\3\2\2\2\u01d7\u01ca\3\2\2\2\u01d7\u01cb\3\2\2\2\u01d7"+
		"\u01cc\3\2\2\2\u01d7\u01cd\3\2\2\2\u01d7\u01ce\3\2\2\2\u01d7\u01cf\3\2"+
		"\2\2\u01d7\u01d0\3\2\2\2\u01d7\u01d1\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7"+
		"\u01d3\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2"+
		"\2\2\u01d8\37\3\2\2\2\u01d9\u01da\b\21\1\2\u01da\u01db\5\"\22\2\u01db"+
		"\u01e1\3\2\2\2\u01dc\u01dd\f\3\2\2\u01dd\u01de\7S\2\2\u01de\u01e0\5\""+
		"\22\2\u01df\u01dc\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2!\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\5\20\t\2"+
		"\u01e5\u01e6\7V\2\2\u01e6\u01e7\5\u00f8}\2\u01e7#\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01eb\5&\24\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb"+
		"%\3\2\2\2\u01ec\u01ed\b\24\1\2\u01ed\u01ee\5(\25\2\u01ee\u01f4\3\2\2\2"+
		"\u01ef\u01f0\f\3\2\2\u01f0\u01f1\7S\2\2\u01f1\u01f3\5(\25\2\u01f2\u01ef"+
		"\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\'\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\5\26\f\2\u01f8\u01f9\5*\26"+
		"\2\u01f9\u01fa\5t;\2\u01fa\u01fb\5\20\t\2\u01fb\u0204\3\2\2\2\u01fc\u01fd"+
		"\5\26\f\2\u01fd\u01fe\5*\26\2\u01fe\u01ff\5t;\2\u01ff\u0200\5\20\t\2\u0200"+
		"\u0201\7V\2\2\u0201\u0202\5\u00f8}\2\u0202\u0204\3\2\2\2\u0203\u01f7\3"+
		"\2\2\2\u0203\u01fc\3\2\2\2\u0204)\3\2\2\2\u0205\u020a\7\32\2\2\u0206\u020a"+
		"\7!\2\2\u0207\u020a\7\33\2\2\u0208\u020a\3\2\2\2\u0209\u0205\3\2\2\2\u0209"+
		"\u0206\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a+\3\2\2\2"+
		"\u020b\u020c\5\26\f\2\u020c\u020d\7#\2\2\u020d\u020e\5\20\t\2\u020e\u020f"+
		"\5\u0086D\2\u020f\u0210\7I\2\2\u0210\u0211\5$\23\2\u0211\u0212\7J\2\2"+
		"\u0212-\3\2\2\2\u0213\u0214\5\30\r\2\u0214\u0215\5t;\2\u0215\u0216\7I"+
		"\2\2\u0216\u0217\5\u00ecw\2\u0217\u0218\7J\2\2\u0218\u0219\5\20\t\2\u0219"+
		"\u021a\7W\2\2\u021a\u0237\3\2\2\2\u021b\u021c\5t;\2\u021c\u021d\7I\2\2"+
		"\u021d\u021e\5\u00ecw\2\u021e\u021f\7J\2\2\u021f\u0220\5\20\t\2\u0220"+
		"\u0221\7W\2\2\u0221\u0237\3\2\2\2\u0222\u0223\5\30\r\2\u0223\u0224\5t"+
		";\2\u0224\u0225\7I\2\2\u0225\u0226\5\u00ecw\2\u0226\u0227\7J\2\2\u0227"+
		"\u0228\5\20\t\2\u0228\u0229\7V\2\2\u0229\u022a\5\62\32\2\u022a\u022b\7"+
		"W\2\2\u022b\u0237\3\2\2\2\u022c\u022d\5t;\2\u022d\u022e\7I\2\2\u022e\u022f"+
		"\5\u00ecw\2\u022f\u0230\7J\2\2\u0230\u0231\5\20\t\2\u0231\u0232\7V\2\2"+
		"\u0232\u0233\5\62\32\2\u0233\u0234\7W\2\2\u0234\u0237\3\2\2\2\u0235\u0237"+
		"\5\60\31\2\u0236\u0213\3\2\2\2\u0236\u021b\3\2\2\2\u0236\u0222\3\2\2\2"+
		"\u0236\u022c\3\2\2\2\u0236\u0235\3\2\2\2\u0237/\3\2\2\2\u0238\u0239\5"+
		"\20\t\2\u0239\u023a\7I\2\2\u023a\u023b\5\u00ecw\2\u023b\u023c\7J\2\2\u023c"+
		"\u023d\7\36\2\2\u023d\u023e\7W\2\2\u023e\61\3\2\2\2\u023f\u0240\7M\2\2"+
		"\u0240\u0241\5\64\33\2\u0241\u0242\7N\2\2\u0242\63\3\2\2\2\u0243\u0248"+
		"\b\33\1\2\u0244\u0245\f\3\2\2\u0245\u0247\5\66\34\2\u0246\u0244\3\2\2"+
		"\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\65"+
		"\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024e\5\u00eav\2\u024c\u024e\5.\30"+
		"\2\u024d\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024e\67\3\2\2\2\u024f\u0255"+
		"\3\2\2\2\u0250\u0251\7I\2\2\u0251\u0252\5$\23\2\u0252\u0253\7J\2\2\u0253"+
		"\u0255\3\2\2\2\u0254\u024f\3\2\2\2\u0254\u0250\3\2\2\2\u02559\3\2\2\2"+
		"\u0256\u0257\7U\2\2\u0257;\3\2\2\2\u0258\u0259\5B\"\2\u0259\u025a\58\35"+
		"\2\u025a\u025b\7M\2\2\u025b\u025c\5> \2\u025c\u025d\5D#\2\u025d\u025e"+
		"\7N\2\2\u025e=\3\2\2\2\u025f\u0264\b \1\2\u0260\u0261\f\3\2\2\u0261\u0263"+
		"\5@!\2\u0262\u0260\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265?\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u026c\5\u00e4"+
		"s\2\u0268\u026c\5.\30\2\u0269\u026c\5\u00e2r\2\u026a\u026c\5`\61\2\u026b"+
		"\u0267\3\2\2\2\u026b\u0268\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2"+
		"\2\2\u026cA\3\2\2\2\u026d\u026e\5\26\f\2\u026e\u026f\7\"\2\2\u026f\u0270"+
		"\5\20\t\2\u0270\u0271\5\u0086D\2\u0271\u0272\7I\2\2\u0272\u0273\5$\23"+
		"\2\u0273\u0274\7J\2\2\u0274C\3\2\2\2\u0275\u0276\b#\1\2\u0276\u0277\5"+
		"F$\2\u0277\u027c\3\2\2\2\u0278\u0279\f\3\2\2\u0279\u027b\5F$\2\u027a\u0278"+
		"\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"E\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280\5\26\f\2\u0280\u0281\7&\2\2"+
		"\u0281\u0282\5\20\t\2\u0282\u0283\7M\2\2\u0283\u0284\5H%\2\u0284\u0285"+
		"\5N(\2\u0285\u0286\7N\2\2\u0286G\3\2\2\2\u0287\u028c\b%\1\2\u0288\u0289"+
		"\f\3\2\2\u0289\u028b\5J&\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028dI\3\2\2\2\u028e\u028c\3\2\2\2"+
		"\u028f\u0295\5\u00b0Y\2\u0290\u0295\5\u00ba^\2\u0291\u0295\5\u00e2r\2"+
		"\u0292\u0295\5\u00e4s\2\u0293\u0295\5L\'\2\u0294\u028f\3\2\2\2\u0294\u0290"+
		"\3\2\2\2\u0294\u0291\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295"+
		"K\3\2\2\2\u0296\u0297\5\26\f\2\u0297\u0298\7M\2\2\u0298\u0299\5H%\2\u0299"+
		"\u029a\7N\2\2\u029aM\3\2\2\2\u029b\u029f\3\2\2\2\u029c\u029d\7,\2\2\u029d"+
		"\u029f\5P)\2\u029e\u029b\3\2\2\2\u029e\u029c\3\2\2\2\u029fO\3\2\2\2\u02a0"+
		"\u02a1\5\20\t\2\u02a1\u02a2\7W\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a5\5R"+
		"*\2\u02a4\u02a0\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5Q\3\2\2\2\u02a6\u02a7"+
		"\7%\2\2\u02a7\u02a8\7I\2\2\u02a8\u02a9\5\u00f2z\2\u02a9\u02aa\7J\2\2\u02aa"+
		"\u02ab\7M\2\2\u02ab\u02ac\5T+\2\u02ac\u02ad\7N\2\2\u02adS\3\2\2\2\u02ae"+
		"\u02b3\b+\1\2\u02af\u02b0\f\3\2\2\u02b0\u02b2\5V,\2\u02b1\u02af\3\2\2"+
		"\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4U"+
		"\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\5X-\2\u02b7\u02b8\7R\2\2\u02b8"+
		"\u02b9\5\20\t\2\u02b9\u02ba\7W\2\2\u02baW\3\2\2\2\u02bb\u02be\5Z.\2\u02bc"+
		"\u02be\5^\60\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc\3\2\2\2\u02beY\3\2\2\2"+
		"\u02bf\u02c0\7I\2\2\u02c0\u02c1\5^\60\2\u02c1\u02c2\7S\2\2\u02c2\u02c3"+
		"\5\\/\2\u02c3\u02c4\7J\2\2\u02c4[\3\2\2\2\u02c5\u02c6\b/\1\2\u02c6\u02c7"+
		"\5^\60\2\u02c7\u02cd\3\2\2\2\u02c8\u02c9\f\3\2\2\u02c9\u02ca\7S\2\2\u02ca"+
		"\u02cc\5^\60\2\u02cb\u02c8\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2"+
		"\2\2\u02cd\u02ce\3\2\2\2\u02ce]\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02dc"+
		"\5\u00f8}\2\u02d1\u02d2\5\u00f8}\2\u02d2\u02d3\7\64\2\2\u02d3\u02d4\5"+
		"\u00f8}\2\u02d4\u02dc\3\2\2\2\u02d5\u02d6\5\u00f8}\2\u02d6\u02d7\7\65"+
		"\2\2\u02d7\u02d8\5\u00f8}\2\u02d8\u02dc\3\2\2\2\u02d9\u02dc\7\16\2\2\u02da"+
		"\u02dc\7\63\2\2\u02db\u02d0\3\2\2\2\u02db\u02d1\3\2\2\2\u02db\u02d5\3"+
		"\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02da\3\2\2\2\u02dc_\3\2\2\2\u02dd\u02de"+
		"\5\26\f\2\u02de\u02df\7\61\2\2\u02df\u02e0\7O\2\2\u02e0\u02e1\5\u0082"+
		"B\2\u02e1\u02e2\7P\2\2\u02e2\u02e3\7I\2\2\u02e3\u02e4\5\u00f8}\2\u02e4"+
		"\u02e5\7J\2\2\u02e5\u02e6\5\20\t\2\u02e6\u02e7\7W\2\2\u02e7\u02ff\3\2"+
		"\2\2\u02e8\u02e9\5\26\f\2\u02e9\u02ea\7\61\2\2\u02ea\u02eb\7O\2\2\u02eb"+
		"\u02ec\5|?\2\u02ec\u02ed\7P\2\2\u02ed\u02ee\7I\2\2\u02ee\u02ef\5\u00f8"+
		"}\2\u02ef\u02f0\7J\2\2\u02f0\u02f1\5\20\t\2\u02f1\u02f2\7W\2\2\u02f2\u02ff"+
		"\3\2\2\2\u02f3\u02f4\5\26\f\2\u02f4\u02f5\7\61\2\2\u02f5\u02f6\7O\2\2"+
		"\u02f6\u02f7\5z>\2\u02f7\u02f8\7P\2\2\u02f8\u02f9\7I\2\2\u02f9\u02fa\5"+
		"\u00f8}\2\u02fa\u02fb\7J\2\2\u02fb\u02fc\5\20\t\2\u02fc\u02fd\7W\2\2\u02fd"+
		"\u02ff\3\2\2\2\u02fe\u02dd\3\2\2\2\u02fe\u02e8\3\2\2\2\u02fe\u02f3\3\2"+
		"\2\2\u02ffa\3\2\2\2\u0300\u0301\5d\63\2\u0301\u0302\58\35\2\u0302\u0303"+
		"\7M\2\2\u0303\u0304\5f\64\2\u0304\u0305\7\t\2\2\u0305\u0306\5j\66\2\u0306"+
		"\u0307\7N\2\2\u0307c\3\2\2\2\u0308\u0309\5\26\f\2\u0309\u030a\7\r\2\2"+
		"\u030a\u030b\5\20\t\2\u030b\u030c\5\u0086D\2\u030c\u030d\7I\2\2\u030d"+
		"\u030e\5$\23\2\u030e\u030f\7J\2\2\u030fe\3\2\2\2\u0310\u0315\b\64\1\2"+
		"\u0311\u0312\f\3\2\2\u0312\u0314\5h\65\2\u0313\u0311\3\2\2\2\u0314\u0317"+
		"\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316g\3\2\2\2\u0317"+
		"\u0315\3\2\2\2\u0318\u031e\5\u00e4s\2\u0319\u031e\5\u00e0q\2\u031a\u031e"+
		"\5\u00ccg\2\u031b\u031e\5.\30\2\u031c\u031e\5\u00e2r\2\u031d\u0318\3\2"+
		"\2\2\u031d\u0319\3\2\2\2\u031d\u031a\3\2\2\2\u031d\u031b\3\2\2\2\u031d"+
		"\u031c\3\2\2\2\u031ei\3\2\2\2\u031f\u0320\5\u00be`\2\u0320k\3\2\2\2\u0321"+
		"\u0322\5\26\f\2\u0322\u0323\7\25\2\2\u0323\u0324\5\16\b\2\u0324\u0325"+
		"\5\u0086D\2\u0325\u0326\7M\2\2\u0326\u0327\5n8\2\u0327\u0328\7N\2\2\u0328"+
		"\u0334\3\2\2\2\u0329\u032a\5\26\f\2\u032a\u032b\7\25\2\2\u032b\u032c\5"+
		"p9\2\u032c\u032d\7W\2\2\u032d\u0334\3\2\2\2\u032e\u032f\5\26\f\2\u032f"+
		"\u0330\7\25\2\2\u0330\u0331\5\20\t\2\u0331\u0332\7W\2\2\u0332\u0334\3"+
		"\2\2\2\u0333\u0321\3\2\2\2\u0333\u0329\3\2\2\2\u0333\u032e\3\2\2\2\u0334"+
		"m\3\2\2\2\u0335\u033a\b8\1\2\u0336\u0337\f\3\2\2\u0337\u0339\5r:\2\u0338"+
		"\u0336\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033bo\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u033e\5\u0084C\2\u033e\u033f"+
		"\5\20\t\2\u033f\u0340\5\u0086D\2\u0340\u0341\7I\2\2\u0341\u0342\5$\23"+
		"\2\u0342\u0343\7J\2\2\u0343q\3\2\2\2\u0344\u0345\5\26\f\2\u0345\u0346"+
		"\5p9\2\u0346\u0347\7W\2\2\u0347\u0355\3\2\2\2\u0348\u0349\5\26\f\2\u0349"+
		"\u034a\7\6\2\2\u034a\u034b\5p9\2\u034b\u034c\7W\2\2\u034c\u0355\3\2\2"+
		"\2\u034d\u034e\5\26\f\2\u034e\u034f\5\u00fa~\2\u034f\u0350\7I\2\2\u0350"+
		"\u0351\5$\23\2\u0351\u0352\7J\2\2\u0352\u0353\7W\2\2\u0353\u0355\3\2\2"+
		"\2\u0354\u0344\3\2\2\2\u0354\u0348\3\2\2\2\u0354\u034d\3\2\2\2\u0355s"+
		"\3\2\2\2\u0356\u035c\5\u0082B\2\u0357\u035c\5z>\2\u0358\u035c\5\u0080"+
		"A\2\u0359\u035c\5~@\2\u035a\u035c\5|?\2\u035b\u0356\3\2\2\2\u035b\u0357"+
		"\3\2\2\2\u035b\u0358\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035a\3\2\2\2\u035c"+
		"u\3\2\2\2\u035d\u0360\5z>\2\u035e\u0360\5\u0080A\2\u035f\u035d\3\2\2\2"+
		"\u035f\u035e\3\2\2\2\u0360w\3\2\2\2\u0361\u0366\5\u00fa~\2\u0362\u0363"+
		"\5:\36\2\u0363\u0364\5\u00fa~\2\u0364\u0366\3\2\2\2\u0365\u0361\3\2\2"+
		"\2\u0365\u0362\3\2\2\2\u0366y\3\2\2\2\u0367\u0368\5x=\2\u0368{\3\2\2\2"+
		"\u0369\u036a\7.\2\2\u036a\u036b\7O\2\2\u036b\u036c\5\u008cG\2\u036c\u036d"+
		"\7P\2\2\u036d}\3\2\2\2\u036e\u036f\5z>\2\u036f\u0370\7K\2\2\u0370\u0371"+
		"\5\u00f8}\2\u0371\u0372\7L\2\2\u0372\177\3\2\2\2\u0373\u0374\5z>\2\u0374"+
		"\u0375\7O\2\2\u0375\u0376\5\u008cG\2\u0376\u0377\7P\2\2\u0377\u0081\3"+
		"\2\2\2\u0378\u039e\7\n\2\2\u0379\u039e\7\23\2\2\u037a\u039e\7\13\2\2\u037b"+
		"\u039e\7\34\2\2\u037c\u037d\7\13\2\2\u037d\u037e\7O\2\2\u037e\u037f\7"+
		"k\2\2\u037f\u039e\7P\2\2\u0380\u0381\7\34\2\2\u0381\u0382\7O\2\2\u0382"+
		"\u0383\7k\2\2\u0383\u039e\7P\2\2\u0384\u0385\7\60\2\2\u0385\u0386\7O\2"+
		"\2\u0386\u0387\7k\2\2\u0387\u039e\7P\2\2\u0388\u0389\7\13\2\2\u0389\u038a"+
		"\7O\2\2\u038a\u038b\7I\2\2\u038b\u038c\5\u00f8}\2\u038c\u038d\7J\2\2\u038d"+
		"\u038e\7P\2\2\u038e\u039e\3\2\2\2\u038f\u0390\7\34\2\2\u0390\u0391\7O"+
		"\2\2\u0391\u0392\7I\2\2\u0392\u0393\5\u00f8}\2\u0393\u0394\7J\2\2\u0394"+
		"\u0395\7P\2\2\u0395\u039e\3\2\2\2\u0396\u0397\7\60\2\2\u0397\u0398\7O"+
		"\2\2\u0398\u0399\7I\2\2\u0399\u039a\5\u00f8}\2\u039a\u039b\7J\2\2\u039b"+
		"\u039c\7P\2\2\u039c\u039e\3\2\2\2\u039d\u0378\3\2\2\2\u039d\u0379\3\2"+
		"\2\2\u039d\u037a\3\2\2\2\u039d\u037b\3\2\2\2\u039d\u037c\3\2\2\2\u039d"+
		"\u0380\3\2\2\2\u039d\u0384\3\2\2\2\u039d\u0388\3\2\2\2\u039d\u038f\3\2"+
		"\2\2\u039d\u0396\3\2\2\2\u039e\u0083\3\2\2\2\u039f\u03a3\5t;\2\u03a0\u03a3"+
		"\7\62\2\2\u03a1\u03a3\5\u00fa~\2\u03a2\u039f\3\2\2\2\u03a2\u03a0\3\2\2"+
		"\2\u03a2\u03a1\3\2\2\2\u03a3\u0085\3\2\2\2\u03a4\u03aa\3\2\2\2\u03a5\u03a6"+
		"\7O\2\2\u03a6\u03a7\5\u0088E\2\u03a7\u03a8\7P\2\2\u03a8\u03aa\3\2\2\2"+
		"\u03a9\u03a4\3\2\2\2\u03a9\u03a5\3\2\2\2\u03aa\u0087\3\2\2\2\u03ab\u03ac"+
		"\bE\1\2\u03ac\u03ad\5\20\t\2\u03ad\u03b3\3\2\2\2\u03ae\u03af\f\3\2\2\u03af"+
		"\u03b0\7S\2\2\u03b0\u03b2\5\20\t\2\u03b1\u03ae\3\2\2\2\u03b2\u03b5\3\2"+
		"\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u0089\3\2\2\2\u03b5"+
		"\u03b3\3\2\2\2\u03b6\u03bb\5t;\2\u03b7\u03bb\5\16\b\2\u03b8\u03bb\7\62"+
		"\2\2\u03b9\u03bb\7\63\2\2\u03ba\u03b6\3\2\2\2\u03ba\u03b7\3\2\2\2\u03ba"+
		"\u03b8\3\2\2\2\u03ba\u03b9\3\2\2\2\u03bb\u008b\3\2\2\2\u03bc\u03bf\bG"+
		"\1\2\u03bd\u03bf\5\u008aF\2\u03be\u03bc\3\2\2\2\u03be\u03bd\3\2\2\2\u03bf"+
		"\u03c5\3\2\2\2\u03c0\u03c1\f\3\2\2\u03c1\u03c2\7S\2\2\u03c2\u03c4\5\u008a"+
		"F\2\u03c3\u03c0\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5"+
		"\u03c6\3\2\2\2\u03c6\u008d\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03cc\5t"+
		";\2\u03c9\u03cc\7\62\2\2\u03ca\u03cc\7\63\2\2\u03cb\u03c8\3\2\2\2\u03cb"+
		"\u03c9\3\2\2\2\u03cb\u03ca\3\2\2\2\u03cc\u008f\3\2\2\2\u03cd\u03ce\bI"+
		"\1\2\u03ce\u03cf\5\u008eH\2\u03cf\u03d5\3\2\2\2\u03d0\u03d1\f\3\2\2\u03d1"+
		"\u03d2\7S\2\2\u03d2\u03d4\5\u008aF\2\u03d3\u03d0\3\2\2\2\u03d4\u03d7\3"+
		"\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u0091\3\2\2\2\u03d7"+
		"\u03d5\3\2\2\2\u03d8\u03e6\5\u0094K\2\u03d9\u03da\5\u00acW\2\u03da\u03db"+
		"\7W\2\2\u03db\u03e6\3\2\2\2\u03dc\u03dd\5B\"\2\u03dd\u03de\7W\2\2\u03de"+
		"\u03e6\3\2\2\2\u03df\u03e0\5d\63\2\u03e0\u03e1\7W\2\2\u03e1\u03e6\3\2"+
		"\2\2\u03e2\u03e3\5,\27\2\u03e3\u03e4\7W\2\2\u03e4\u03e6\3\2\2\2\u03e5"+
		"\u03d8\3\2\2\2\u03e5\u03d9\3\2\2\2\u03e5\u03dc\3\2\2\2\u03e5\u03df\3\2"+
		"\2\2\u03e5\u03e2\3\2\2\2\u03e6\u0093\3\2\2\2\u03e7\u03ec\5\u0096L\2\u03e8"+
		"\u03ec\5\u009aN\2\u03e9\u03ec\5\u0098M\2\u03ea\u03ec\5\u00a0Q\2\u03eb"+
		"\u03e7\3\2\2\2\u03eb\u03e8\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ea\3\2"+
		"\2\2\u03ec\u0095\3\2\2\2\u03ed\u03ee\5\26\f\2\u03ee\u03ef\7\27\2\2\u03ef"+
		"\u03f0\5\20\t\2\u03f0\u03f1\7M\2\2\u03f1\u03f2\5\u009cO\2\u03f2\u03f3"+
		"\7N\2\2\u03f3\u0097\3\2\2\2\u03f4\u03f5\5\26\f\2\u03f5\u03f6\7(\2\2\u03f6"+
		"\u03f7\5\20\t\2\u03f7\u03f8\7M\2\2\u03f8\u03f9\5\u009cO\2\u03f9\u03fa"+
		"\7N\2\2\u03fa\u0099\3\2\2\2\u03fb\u03fc\5\26\f\2\u03fc\u03fd\7\30\2\2"+
		"\u03fd\u03fe\5\20\t\2\u03fe\u03ff\7M\2\2\u03ff\u0400\5\u009cO\2\u0400"+
		"\u0401\7N\2\2\u0401\u009b\3\2\2\2\u0402\u0409\bO\1\2\u0403\u0404\f\4\2"+
		"\2\u0404\u0408\5\n\6\2\u0405\u0406\f\3\2\2\u0406\u0408\5\u009eP\2\u0407"+
		"\u0403\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2"+
		"\2\2\u0409\u040a\3\2\2\2\u040a\u009d\3\2\2\2\u040b\u0409\3\2\2\2\u040c"+
		"\u040d\5\26\f\2\u040d\u040e\5t;\2\u040e\u040f\5\20\t\2\u040f\u0410\7W"+
		"\2\2\u0410\u009f\3\2\2\2\u0411\u0412\5\26\f\2\u0412\u0413\7\22\2\2\u0413"+
		"\u0414\5\20\t\2\u0414\u0415\7M\2\2\u0415\u0416\5\u00aaV\2\u0416\u0417"+
		"\7N\2\2\u0417\u0424\3\2\2\2\u0418\u0419\5\26\f\2\u0419\u041a\7\22\2\2"+
		"\u041a\u041b\7\13\2\2\u041b\u041c\7O\2\2\u041c\u041d\7k\2\2\u041d\u041e"+
		"\7P\2\2\u041e\u041f\5\20\t\2\u041f\u0420\7M\2\2\u0420\u0421\5\u00a2R\2"+
		"\u0421\u0422\7N\2\2\u0422\u0424\3\2\2\2\u0423\u0411\3\2\2\2\u0423\u0418"+
		"\3\2\2\2\u0424\u00a1\3\2\2\2\u0425\u0426\bR\1\2\u0426\u0427\5\u00a4S\2"+
		"\u0427\u042d\3\2\2\2\u0428\u0429\f\3\2\2\u0429\u042a\7S\2\2\u042a\u042c"+
		"\5\u00a4S\2\u042b\u0428\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b\3\2\2"+
		"\2\u042d\u042e\3\2\2\2\u042e\u00a3\3\2\2\2\u042f\u042d\3\2\2\2\u0430\u0431"+
		"\5\20\t\2\u0431\u0432\7V\2\2\u0432\u0433\5\u00e8u\2\u0433\u00a5\3\2\2"+
		"\2\u0434\u0435\7\23\2\2\u0435\u0436\7M\2\2\u0436\u0437\5\u00aaV\2\u0437"+
		"\u0438\7N\2\2\u0438\u00a7\3\2\2\2\u0439\u043a\7\37\2\2\u043a\u043b\7M"+
		"\2\2\u043b\u043c\5\u00aaV\2\u043c\u043d\7N\2\2\u043d\u00a9\3\2\2\2\u043e"+
		"\u043f\bV\1\2\u043f\u0440\5\20\t\2\u0440\u0446\3\2\2\2\u0441\u0442\f\3"+
		"\2\2\u0442\u0443\7S\2\2\u0443\u0445\5\20\t\2\u0444\u0441\3\2\2\2\u0445"+
		"\u0448\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u00ab\3\2"+
		"\2\2\u0448\u0446\3\2\2\2\u0449\u044a\5\26\f\2\u044a\u044b\7/\2\2\u044b"+
		"\u044c\5t;\2\u044c\u044d\5\20\t\2\u044d\u045e\3\2\2\2\u044e\u044f\5\26"+
		"\f\2\u044f\u0450\7/\2\2\u0450\u0451\5\u0094K\2\u0451\u0452\5\20\t\2\u0452"+
		"\u045e\3\2\2\2\u0453\u0454\5\26\f\2\u0454\u0455\7 \2\2\u0455\u0456\5t"+
		";\2\u0456\u0457\5\20\t\2\u0457\u045e\3\2\2\2\u0458\u0459\5\26\f\2\u0459"+
		"\u045a\7 \2\2\u045a\u045b\5\u0094K\2\u045b\u045c\5\20\t\2\u045c\u045e"+
		"\3\2\2\2\u045d\u0449\3\2\2\2\u045d\u044e\3\2\2\2\u045d\u0453\3\2\2\2\u045d"+
		"\u0458\3\2\2\2\u045e\u00ad\3\2\2\2\u045f\u0460\5\u00f6|\2\u0460\u0461"+
		"\7I\2\2\u0461\u0462\5\u00ecw\2\u0462\u0463\7J\2\2\u0463\u046d\3\2\2\2"+
		"\u0464\u0465\5\u00f6|\2\u0465\u0466\7O\2\2\u0466\u0467\5\u008cG\2\u0467"+
		"\u0468\7P\2\2\u0468\u0469\7I\2\2\u0469\u046a\5\u00ecw\2\u046a\u046b\7"+
		"J\2\2\u046b\u046d\3\2\2\2\u046c\u045f\3\2\2\2\u046c\u0464\3\2\2\2\u046d"+
		"\u00af\3\2\2\2\u046e\u046f\5\u00aeX\2\u046f\u0470\7W\2\2\u0470\u0477\3"+
		"\2\2\2\u0471\u0472\5\u00f6|\2\u0472\u0473\7V\2\2\u0473\u0474\5\u00f8}"+
		"\2\u0474\u0475\7W\2\2\u0475\u0477\3\2\2\2\u0476\u046e\3\2\2\2\u0476\u0471"+
		"\3\2\2\2\u0477\u00b1\3\2\2\2\u0478\u0479\7W\2\2\u0479\u00b3\3\2\2\2\u047a"+
		"\u047b\7\24\2\2\u047b\u047c\7W\2\2\u047c\u00b5\3\2\2\2\u047d\u047e\7$"+
		"\2\2\u047e\u0484\7W\2\2\u047f\u0480\7$\2\2\u0480\u0481\5\u00f8}\2\u0481"+
		"\u0482\7W\2\2\u0482\u0484\3\2\2\2\u0483\u047d\3\2\2\2\u0483\u047f\3\2"+
		"\2\2\u0484\u00b7\3\2\2\2\u0485\u0486\7\31\2\2\u0486\u0487\7I\2\2\u0487"+
		"\u0488\5\u00f8}\2\u0488\u0489\7J\2\2\u0489\u048a\5\u00bc_\2\u048a\u0494"+
		"\3\2\2\2\u048b\u048c\7\31\2\2\u048c\u048d\7I\2\2\u048d\u048e\5\u00f8}"+
		"\2\u048e\u048f\7J\2\2\u048f\u0490\5\u00bc_\2\u0490\u0491\7\20\2\2\u0491"+
		"\u0492\5\u00bc_\2\u0492\u0494\3\2\2\2\u0493\u0485\3\2\2\2\u0493\u048b"+
		"\3\2\2\2\u0494\u00b9\3\2\2\2\u0495\u0496\5z>\2\u0496\u0497\7U\2\2\u0497"+
		"\u0498\7\t\2\2\u0498\u0499\7I\2\2\u0499\u049a\5\u00ecw\2\u049a\u049b\7"+
		"J\2\2\u049b\u049c\7W\2\2\u049c\u00bb\3\2\2\2\u049d\u04a6\5\u00ba^\2\u049e"+
		"\u04a6\5\u00b0Y\2\u049f\u04a6\5\u00b8]\2\u04a0\u04a6\5\u00b2Z\2\u04a1"+
		"\u04a6\5\u00be`\2\u04a2\u04a6\5\u00b6\\\2\u04a3\u04a6\5\u00b4[\2\u04a4"+
		"\u04a6\5\u00c2b\2\u04a5\u049d\3\2\2\2\u04a5\u049e\3\2\2\2\u04a5\u049f"+
		"\3\2\2\2\u04a5\u04a0\3\2\2\2\u04a5\u04a1\3\2\2\2\u04a5\u04a2\3\2\2\2\u04a5"+
		"\u04a3\3\2\2\2\u04a5\u04a4\3\2\2\2\u04a6\u00bd\3\2\2\2\u04a7\u04a8\5\26"+
		"\f\2\u04a8\u04a9\7M\2\2\u04a9\u04aa\5\u00c0a\2\u04aa\u04ab\7N\2\2\u04ab"+
		"\u00bf\3\2\2\2\u04ac\u04b1\ba\1\2\u04ad\u04ae\f\3\2\2\u04ae\u04b0\5\u00ca"+
		"f\2\u04af\u04ad\3\2\2\2\u04b0\u04b3\3\2\2\2\u04b1\u04af\3\2\2\2\u04b1"+
		"\u04b2\3\2\2\2\u04b2\u00c1\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b4\u04b5\7)"+
		"\2\2\u04b5\u04b6\7I\2\2\u04b6\u04b7\5\u00f8}\2\u04b7\u04b8\7J\2\2\u04b8"+
		"\u04b9\7M\2\2\u04b9\u04ba\5\u00c4c\2\u04ba\u04bb\7N\2\2\u04bb\u00c3\3"+
		"\2\2\2\u04bc\u04c1\bc\1\2\u04bd\u04be\f\3\2\2\u04be\u04c0\5\u00c6d\2\u04bf"+
		"\u04bd\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2"+
		"\2\2\u04c2\u00c5\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4\u04c5\5\u00c8e\2\u04c5"+
		"\u04c6\7R\2\2\u04c6\u04c7\5\u00be`\2\u04c7\u04cc\3\2\2\2\u04c8\u04c9\5"+
		"\u00c8e\2\u04c9\u04ca\7R\2\2\u04ca\u04cc\3\2\2\2\u04cb\u04c4\3\2\2\2\u04cb"+
		"\u04c8\3\2\2\2\u04cc\u00c7\3\2\2\2\u04cd\u04d0\5\20\t\2\u04ce\u04d0\7"+
		"\16\2\2\u04cf\u04cd\3\2\2\2\u04cf\u04ce\3\2\2\2\u04d0\u00c9\3\2\2\2\u04d1"+
		"\u04d6\5\u00e2r\2\u04d2\u04d6\5\u00e4s\2\u04d3\u04d6\5\u00bc_\2\u04d4"+
		"\u04d6\5.\30\2\u04d5\u04d1\3\2\2\2\u04d5\u04d2\3\2\2\2\u04d5\u04d3\3\2"+
		"\2\2\u04d5\u04d4\3\2\2\2\u04d6\u00cb\3\2\2\2\u04d7\u04d8\5\26\f\2\u04d8"+
		"\u04d9\7*\2\2\u04d9\u04da\5\20\t\2\u04da\u04db\7M\2\2\u04db\u04dc\5\u00ce"+
		"h\2\u04dc\u04dd\7N\2\2\u04dd\u00cd\3\2\2\2\u04de\u04df\bh\1\2\u04df\u04e0"+
		"\5\u00d0i\2\u04e0\u04e5\3\2\2\2\u04e1\u04e2\f\3\2\2\u04e2\u04e4\5\u00d0"+
		"i\2\u04e3\u04e1\3\2\2\2\u04e4\u04e7\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e5"+
		"\u04e6\3\2\2\2\u04e6\u00cf\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e8\u04e9\7\35"+
		"\2\2\u04e9\u04ea\7V\2\2\u04ea\u04eb\7M\2\2\u04eb\u04ec\5\u00d2j\2\u04ec"+
		"\u04ed\7N\2\2\u04ed\u0513\3\2\2\2\u04ee\u04ef\7\b\2\2\u04ef\u04f0\7V\2"+
		"\2\u04f0\u04f1\7M\2\2\u04f1\u04f2\5\u00d6l\2\u04f2\u04f3\7N\2\2\u04f3"+
		"\u0513\3\2\2\2\u04f4\u04f5\5\26\f\2\u04f5\u04f6\5\24\13\2\u04f6\u04f7"+
		"\7\17\2\2\u04f7\u04f8\7V\2\2\u04f8\u04f9\5\20\t\2\u04f9\u04fa\7W\2\2\u04fa"+
		"\u0513\3\2\2\2\u04fb\u04fc\5\26\f\2\u04fc\u04fd\5\24\13\2\u04fd\u04fe"+
		"\7\17\2\2\u04fe\u04ff\7V\2\2\u04ff\u0500\5\u00dco\2\u0500\u0501\5\26\f"+
		"\2\u0501\u0502\7W\2\2\u0502\u0513\3\2\2\2\u0503\u0504\5\26\f\2\u0504\u0505"+
		"\5\24\13\2\u0505\u0506\7\21\2\2\u0506\u0507\7V\2\2\u0507\u0508\7M\2\2"+
		"\u0508\u0509\5\u00dep\2\u0509\u050a\7N\2\2\u050a\u0513\3\2\2\2\u050b\u050c"+
		"\5\26\f\2\u050c\u050d\5\24\13\2\u050d\u050e\5\22\n\2\u050e\u050f\7V\2"+
		"\2\u050f\u0510\5\u00e8u\2\u0510\u0511\7W\2\2\u0511\u0513\3\2\2\2\u0512"+
		"\u04e8\3\2\2\2\u0512\u04ee\3\2\2\2\u0512\u04f4\3\2\2\2\u0512\u04fb\3\2"+
		"\2\2\u0512\u0503\3\2\2\2\u0512\u050b\3\2\2\2\u0513\u00d1\3\2\2\2\u0514"+
		"\u0519\bj\1\2\u0515\u0516\f\3\2\2\u0516\u0518\5\u00d4k\2\u0517\u0515\3"+
		"\2\2\2\u0518\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a"+
		"\u00d3\3\2\2\2\u051b\u0519\3\2\2\2\u051c\u051d\5\u00f8}\2\u051d\u051e"+
		"\7R\2\2\u051e\u051f\5\20\t\2\u051f\u0520\5\26\f\2\u0520\u0521\7W\2\2\u0521"+
		"\u00d5\3\2\2\2\u0522\u0529\bl\1\2\u0523\u0524\f\3\2\2\u0524\u0525\5\u00d8"+
		"m\2\u0525\u0526\7W\2\2\u0526\u0528\3\2\2\2\u0527\u0523\3\2\2\2\u0528\u052b"+
		"\3\2\2\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u00d7\3\2\2\2\u052b"+
		"\u0529\3\2\2\2\u052c\u052d\5\26\f\2\u052d\u052e\5\20\t\2\u052e\u0536\3"+
		"\2\2\2\u052f\u0530\5\26\f\2\u0530\u0531\5\20\t\2\u0531\u0532\7I\2\2\u0532"+
		"\u0533\5\u00ecw\2\u0533\u0534\7J\2\2\u0534\u0536\3\2\2\2\u0535\u052c\3"+
		"\2\2\2\u0535\u052f\3\2\2\2\u0536\u00d9\3\2\2\2\u0537\u0538\5X-\2\u0538"+
		"\u0539\7R\2\2\u0539\u053a\5\u00dco\2\u053a\u053b\5\26\f\2\u053b\u053c"+
		"\7W\2\2\u053c\u00db\3\2\2\2\u053d\u053e\5\u00f6|\2\u053e\u053f\7I\2\2"+
		"\u053f\u0540\5\u00ecw\2\u0540\u0541\7J\2\2\u0541\u054b\3\2\2\2\u0542\u0543"+
		"\5\u00f6|\2\u0543\u0544\7O\2\2\u0544\u0545\5\u008cG\2\u0545\u0546\7P\2"+
		"\2\u0546\u0547\7I\2\2\u0547\u0548\5\u00ecw\2\u0548\u0549\7J\2\2\u0549"+
		"\u054b\3\2\2\2\u054a\u053d\3\2\2\2\u054a\u0542\3\2\2\2\u054b\u00dd\3\2"+
		"\2\2\u054c\u054d\bp\1\2\u054d\u054e\5\u00dan\2\u054e\u0553\3\2\2\2\u054f"+
		"\u0550\f\3\2\2\u0550\u0552\5\u00dan\2\u0551\u054f\3\2\2\2\u0552\u0555"+
		"\3\2\2\2\u0553\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u00df\3\2\2\2\u0555"+
		"\u0553\3\2\2\2\u0556\u0557\5\26\f\2\u0557\u0558\7\7\2\2\u0558\u0559\5"+
		"\20\t\2\u0559\u055a\7I\2\2\u055a\u055b\5$\23\2\u055b\u055c\7J\2\2\u055c"+
		"\u055d\5\u00be`\2\u055d\u00e1\3\2\2\2\u055e\u055f\5\30\r\2\u055f\u0560"+
		"\5t;\2\u0560\u0561\5\20\t\2\u0561\u0562\5\u00e6t\2\u0562\u0563\7W\2\2"+
		"\u0563\u056a\3\2\2\2\u0564\u0565\5t;\2\u0565\u0566\5\20\t\2\u0566\u0567"+
		"\5\u00e6t\2\u0567\u0568\7W\2\2\u0568\u056a\3\2\2\2\u0569\u055e\3\2\2\2"+
		"\u0569\u0564\3\2\2\2\u056a\u00e3\3\2\2\2\u056b\u056c\5\26\f\2\u056c\u056d"+
		"\7\f\2\2\u056d\u056e\5t;\2\u056e\u056f\5\20\t\2\u056f\u0570\7V\2\2\u0570"+
		"\u0571\5\u00e8u\2\u0571\u0572\7W\2\2\u0572\u00e5\3\2\2\2\u0573\u0577\3"+
		"\2\2\2\u0574\u0575\7V\2\2\u0575\u0577\5\u00e8u\2\u0576\u0573\3\2\2\2\u0576"+
		"\u0574\3\2\2\2\u0577\u00e7\3\2\2\2\u0578\u0579\5\u00f8}\2\u0579\u00e9"+
		"\3\2\2\2\u057a\u057b\5p9\2\u057b\u057c\5\u00be`\2\u057c\u00eb\3\2\2\2"+
		"\u057d\u0580\3\2\2\2\u057e\u0580\5\u00eex\2\u057f\u057d\3\2\2\2\u057f"+
		"\u057e\3\2\2\2\u0580\u00ed\3\2\2\2\u0581\u0582\bx\1\2\u0582\u0583\5\u00f0"+
		"y\2\u0583\u0589\3\2\2\2\u0584\u0585\f\3\2\2\u0585\u0586\7S\2\2\u0586\u0588"+
		"\5\u00f0y\2\u0587\u0584\3\2\2\2\u0588\u058b\3\2\2\2\u0589\u0587\3\2\2"+
		"\2\u0589\u058a\3\2\2\2\u058a\u00ef\3\2\2\2\u058b\u0589\3\2\2\2\u058c\u0593"+
		"\5\u00f8}\2\u058d\u058e\5\20\t\2\u058e\u058f\7V\2\2\u058f\u0590\5\u00f8"+
		"}\2\u0590\u0593\3\2\2\2\u0591\u0593\7\63\2\2\u0592\u058c\3\2\2\2\u0592"+
		"\u058d\3\2\2\2\u0592\u0591\3\2\2\2\u0593\u00f1\3\2\2\2\u0594\u0597\bz"+
		"\1\2\u0595\u0597\5\u00f8}\2\u0596\u0594\3\2\2\2\u0596\u0595\3\2\2\2\u0597"+
		"\u059d\3\2\2\2\u0598\u0599\f\3\2\2\u0599\u059a\7S\2\2\u059a\u059c\5\u00f8"+
		"}\2\u059b\u0598\3\2\2\2\u059c\u059f\3\2\2\2\u059d\u059b\3\2\2\2\u059d"+
		"\u059e\3\2\2\2\u059e\u00f3\3\2\2\2\u059f\u059d\3\2\2\2\u05a0\u05a5\5\16"+
		"\b\2\u05a1\u05a2\5:\36\2\u05a2\u05a3\5\16\b\2\u05a3\u05a5\3\2\2\2\u05a4"+
		"\u05a0\3\2\2\2\u05a4\u05a1\3\2\2\2\u05a5\u00f5\3\2\2\2\u05a6\u05a7\b|"+
		"\1\2\u05a7\u05aa\5\u00f4{\2\u05a8\u05aa\7+\2\2\u05a9\u05a6\3\2\2\2\u05a9"+
		"\u05a8\3\2\2\2\u05aa\u05bc\3\2\2\2\u05ab\u05ac\f\5\2\2\u05ac\u05ad\7U"+
		"\2\2\u05ad\u05bb\5\20\t\2\u05ae\u05af\f\4\2\2\u05af\u05b0\7K\2\2\u05b0"+
		"\u05b1\5\u00f8}\2\u05b1\u05b2\7L\2\2\u05b2\u05bb\3\2\2\2\u05b3\u05b4\f"+
		"\3\2\2\u05b4\u05b5\7K\2\2\u05b5\u05b6\5\u00f8}\2\u05b6\u05b7\7R\2\2\u05b7"+
		"\u05b8\5\u00f8}\2\u05b8\u05b9\7L\2\2\u05b9\u05bb\3\2\2\2\u05ba\u05ab\3"+
		"\2\2\2\u05ba\u05ae\3\2\2\2\u05ba\u05b3\3\2\2\2\u05bb\u05be\3\2\2\2\u05bc"+
		"\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u00f7\3\2\2\2\u05be\u05bc\3\2"+
		"\2\2\u05bf\u05c0\b}\1\2\u05c0\u05e7\7k\2\2\u05c1\u05e7\7]\2\2\u05c2\u05e7"+
		"\7-\2\2\u05c3\u05e7\7\26\2\2\u05c4\u05e7\7+\2\2\u05c5\u05e7\5\16\b\2\u05c6"+
		"\u05c7\5:\36\2\u05c7\u05c8\5\16\b\2\u05c8\u05e7\3\2\2\2\u05c9\u05ca\7"+
		"M\2\2\u05ca\u05cb\5\u00f2z\2\u05cb\u05cc\7N\2\2\u05cc\u05e7\3\2\2\2\u05cd"+
		"\u05ce\7I\2\2\u05ce\u05cf\5\u00f8}\2\u05cf\u05d0\7J\2\2\u05d0\u05e7\3"+
		"\2\2\2\u05d1\u05d2\7Q\2\2\u05d2\u05e7\5\u00f8}\"\u05d3\u05d4\7H\2\2\u05d4"+
		"\u05e7\5\u00f8}!\u05d5\u05d6\7@\2\2\u05d6\u05e7\5\u00f8} \u05d7\u05d8"+
		"\7>\2\2\u05d8\u05e7\5\u00f8}\37\u05d9\u05da\5z>\2\u05da\u05db\7U\2\2\u05db"+
		"\u05dc\5\20\t\2\u05dc\u05e7\3\2\2\2\u05dd\u05de\7\23\2\2\u05de\u05df\7"+
		"U\2\2\u05df\u05e7\5\20\t\2\u05e0\u05e7\5\u00aeX\2\u05e1\u05e2\7I\2\2\u05e2"+
		"\u05e3\5t;\2\u05e3\u05e4\7J\2\2\u05e4\u05e5\5\u00f8}\3\u05e5\u05e7\3\2"+
		"\2\2\u05e6\u05bf\3\2\2\2\u05e6\u05c1\3\2\2\2\u05e6\u05c2\3\2\2\2\u05e6"+
		"\u05c3\3\2\2\2\u05e6\u05c4\3\2\2\2\u05e6\u05c5\3\2\2\2\u05e6\u05c6\3\2"+
		"\2\2\u05e6\u05c9\3\2\2\2\u05e6\u05cd\3\2\2\2\u05e6\u05d1\3\2\2\2\u05e6"+
		"\u05d3\3\2\2\2\u05e6\u05d5\3\2\2\2\u05e6\u05d7\3\2\2\2\u05e6\u05d9\3\2"+
		"\2\2\u05e6\u05dd\3\2\2\2\u05e6\u05e0\3\2\2\2\u05e6\u05e1\3\2\2\2\u05e7"+
		"\u0647\3\2\2\2\u05e8\u05e9\f\33\2\2\u05e9\u05ea\7B\2\2\u05ea\u0646\5\u00f8"+
		"}\34\u05eb\u05ec\f\32\2\2\u05ec\u05ed\7C\2\2\u05ed\u0646\5\u00f8}\33\u05ee"+
		"\u05ef\f\31\2\2\u05ef\u05f0\7D\2\2\u05f0\u0646\5\u00f8}\32\u05f1\u05f2"+
		"\f\30\2\2\u05f2\u05f3\7>\2\2\u05f3\u0646\5\u00f8}\31\u05f4\u05f5\f\27"+
		"\2\2\u05f5\u05f6\7@\2\2\u05f6\u0646\5\u00f8}\30\u05f7\u05f8\f\26\2\2\u05f8"+
		"\u05f9\7?\2\2\u05f9\u0646\5\u00f8}\27\u05fa\u05fb\f\25\2\2\u05fb\u05fc"+
		"\7A\2\2\u05fc\u0646\5\u00f8}\26\u05fd\u05fe\f\24\2\2\u05fe\u05ff\7\66"+
		"\2\2\u05ff\u0646\5\u00f8}\25\u0600\u0601\f\23\2\2\u0601\u0602\7P\2\2\u0602"+
		"\u0603\7P\2\2\u0603\u0646\5\u00f8}\24\u0604\u0605\f\22\2\2\u0605\u0606"+
		"\7<\2\2\u0606\u0646\5\u00f8}\23\u0607\u0608\f\21\2\2\u0608\u0609\7;\2"+
		"\2\u0609\u0646\5\u00f8}\22\u060a\u060b\f\20\2\2\u060b\u060c\7O\2\2\u060c"+
		"\u0646\5\u00f8}\21\u060d\u060e\f\17\2\2\u060e\u060f\7P\2\2\u060f\u0646"+
		"\5\u00f8}\20\u0610\u0611\f\16\2\2\u0611\u0612\7:\2\2\u0612\u0646\5\u00f8"+
		"}\17\u0613\u0614\f\r\2\2\u0614\u0615\79\2\2\u0615\u0646\5\u00f8}\16\u0616"+
		"\u0617\f\f\2\2\u0617\u0618\7F\2\2\u0618\u0646\5\u00f8}\r\u0619\u061a\f"+
		"\13\2\2\u061a\u061b\7G\2\2\u061b\u0646\5\u00f8}\f\u061c\u061d\f\n\2\2"+
		"\u061d\u061e\7E\2\2\u061e\u0646\5\u00f8}\13\u061f\u0620\f\t\2\2\u0620"+
		"\u0621\7=\2\2\u0621\u0646\5\u00f8}\n\u0622\u0623\f\b\2\2\u0623\u0624\7"+
		"\67\2\2\u0624\u0646\5\u00f8}\t\u0625\u0626\f\7\2\2\u0626\u0627\78\2\2"+
		"\u0627\u0646\5\u00f8}\b\u0628\u0629\f\6\2\2\u0629\u062a\7T\2\2\u062a\u062b"+
		"\5\u00f8}\2\u062b\u062c\7R\2\2\u062c\u062d\5\u00f8}\7\u062d\u0646\3\2"+
		"\2\2\u062e\u062f\f&\2\2\u062f\u0630\7K\2\2\u0630\u0631\5\u00f8}\2\u0631"+
		"\u0632\7L\2\2\u0632\u0646\3\2\2\2\u0633\u0634\f%\2\2\u0634\u0635\7K\2"+
		"\2\u0635\u0636\5\u00f8}\2\u0636\u0637\7R\2\2\u0637\u0638\5\u00f8}\2\u0638"+
		"\u0639\7L\2\2\u0639\u0646\3\2\2\2\u063a\u063b\f\34\2\2\u063b\u063c\7U"+
		"\2\2\u063c\u0646\5\20\t\2\u063d\u063e\f\4\2\2\u063e\u063f\7O\2\2\u063f"+
		"\u0640\5\u0090I\2\u0640\u0641\7P\2\2\u0641\u0642\7I\2\2\u0642\u0643\5"+
		"\u00ecw\2\u0643\u0644\7J\2\2\u0644\u0646\3\2\2\2\u0645\u05e8\3\2\2\2\u0645"+
		"\u05eb\3\2\2\2\u0645\u05ee\3\2\2\2\u0645\u05f1\3\2\2\2\u0645\u05f4\3\2"+
		"\2\2\u0645\u05f7\3\2\2\2\u0645\u05fa\3\2\2\2\u0645\u05fd\3\2\2\2\u0645"+
		"\u0600\3\2\2\2\u0645\u0604\3\2\2\2\u0645\u0607\3\2\2\2\u0645\u060a\3\2"+
		"\2\2\u0645\u060d\3\2\2\2\u0645\u0610\3\2\2\2\u0645\u0613\3\2\2\2\u0645"+
		"\u0616\3\2\2\2\u0645\u0619\3\2\2\2\u0645\u061c\3\2\2\2\u0645\u061f\3\2"+
		"\2\2\u0645\u0622\3\2\2\2\u0645\u0625\3\2\2\2\u0645\u0628\3\2\2\2\u0645"+
		"\u062e\3\2\2\2\u0645\u0633\3\2\2\2\u0645\u063a\3\2\2\2\u0645\u063d\3\2"+
		"\2\2\u0646\u0649\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0648\3\2\2\2\u0648"+
		"\u00f9\3\2\2\2\u0649\u0647\3\2\2\2\u064a\u064b\t\2\2\2\u064b\u00fb\3\2"+
		"\2\2\u064c\u0662\5\u00f8}\2\u064d\u064e\5\u00f8}\2\u064e\u064f\79\2\2"+
		"\u064f\u0650\5X-\2\u0650\u0662\3\2\2\2\u0651\u0652\5\u00f8}\2\u0652\u0653"+
		"\79\2\2\u0653\u0654\7I\2\2\u0654\u0655\5X-\2\u0655\u0656\7J\2\2\u0656"+
		"\u0662\3\2\2\2\u0657\u0658\5X-\2\u0658\u0659\79\2\2\u0659\u065a\5\u00f8"+
		"}\2\u065a\u0662\3\2\2\2\u065b\u065c\7I\2\2\u065c\u065d\5X-\2\u065d\u065e"+
		"\7J\2\2\u065e\u065f\79\2\2\u065f\u0660\5\u00f8}\2\u0660\u0662\3\2\2\2"+
		"\u0661\u064c\3\2\2\2\u0661\u064d\3\2\2\2\u0661\u0651\3\2\2\2\u0661\u0657"+
		"\3\2\2\2\u0661\u065b\3\2\2\2\u0662\u00fd\3\2\2\2_\u0107\u0109\u0117\u0130"+
		"\u0142\u014b\u014f\u0155\u0159\u015d\u0166\u0175\u017f\u0181\u01d7\u01e1"+
		"\u01ea\u01f4\u0203\u0209\u0236\u0248\u024d\u0254\u0264\u026b\u027c\u028c"+
		"\u0294\u029e\u02a4\u02b3\u02bd\u02cd\u02db\u02fe\u0315\u031d\u0333\u033a"+
		"\u0354\u035b\u035f\u0365\u039d\u03a2\u03a9\u03b3\u03ba\u03be\u03c5\u03cb"+
		"\u03d5\u03e5\u03eb\u0407\u0409\u0423\u042d\u0446\u045d\u046c\u0476\u0483"+
		"\u0493\u04a5\u04b1\u04c1\u04cb\u04cf\u04d5\u04e5\u0512\u0519\u0529\u0535"+
		"\u054a\u0553\u0569\u0576\u057f\u0589\u0592\u0596\u059d\u05a4\u05a9\u05ba"+
		"\u05bc\u05e6\u0645\u0647\u0661";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}