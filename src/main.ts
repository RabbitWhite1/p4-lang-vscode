import { P4Lexer } from './grammar/P4Lexer';
import { 
	P4Parser, 
	DeclarationContext,
	TypedefDeclarationContext,
	TypeDeclarationContext,
	InputContext,
	ProgramContext,
	TypeRefContext,
	StructFieldContext,
	ParameterContext,
	VariableDeclarationContext,
	ConstantDeclarationContext,
	SelectCaseContext,
	StateExpressionContext,
	TablePropertyContext,
	KeyElementContext,
	ActionRefContext,
	LvalueContext,
	AssignmentOrMethodCallStatementContext,
	EnumDeclarationContext,
	IdentifierListContext,
	PreprocessorLineContext,
	ExpressionContext,
	ExternDeclarationContext,
	MethodPrototypeContext,
	FunctionPrototypeContext,
	TypeParameterListContext,
	PackageTypeDeclarationContext,
	SpecializedTypeContext,
	TypeArgContext,
	InstantiationContext,
	MethodCallContext,
	ActionBindingContext,
	ConditionalStatementContext,
	DirectApplicationContext,
	MainInstantiationContext,
	RealTypeArgContext,
	SimpleKeysetExpressionContext,
	AnnotationContext,
	Preproc_includeContext,
	Preproc_defineContext
} from './grammar/P4Parser';
import { P4Visitor } from './grammar/P4Visitor';
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
	// context.subscriptions.push(vscode.languages.registerDefinitionProvider({ language: 'p4'}, new GoDefinitionProvider(), legend));
}

interface ParsedToken {
	line: number;
	startCharacter: number;
	length: number;
	tokenType: string;
	tokenModifiers: string[];
}

class SemanticHighlightingVisitor extends AbstractParseTreeVisitor<ParsedToken[]> implements P4Visitor<ParsedToken[]> {
	defaultResult() {
		return [];
	}

	aggregateResult(aggregate: ParsedToken[], nextResult: ParsedToken[]) {
		return aggregate.concat(nextResult);
	}

	visitTypedefDeclaration(ctx: TypedefDeclarationContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: ['declaration']
		});
		
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitTypeRef(ctx: TypeRefContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		let nameToken = ctx?.typeName()?.prefixedType()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		nameToken = ctx?.typeName()?.prefixedType()?.type_or_id()?.TYPE_IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		nameToken = ctx?.specializedType()?.typeName()?.prefixedType()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		nameToken = ctx?.headerStackType()?.typeName()?.prefixedType()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitStructField(ctx: StructFieldContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "variable",
			tokenModifiers: ['declaration']
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitParameter(ctx: ParameterContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "variable",
			tokenModifiers: ['declaration']
		});
		
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitSpecializedType(ctx: SpecializedTypeContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.typeName()?.prefixedType()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: ['declaration']
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitVariableDeclaration(ctx: VariableDeclarationContext): ParsedToken[] {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "variable",
			tokenModifiers: ['declaration']
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitConstantDeclaration(ctx: ConstantDeclarationContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "variable",
			tokenModifiers: ['declaration', 'readonly']
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}
	
	// visitPreprocessorLine(ctx: PreprocessorLineContext): ParsedToken[] {
	// 	const parsedTokens: ParsedToken[] =[];
	// 	const token = ctx?.type_or_id()?.IDENTIFIER()?.symbol;
	// 	token && parsedTokens.push({
	// 		line: token.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
	// 		startCharacter: token.charPositionInLine,
	// 		length: token.stopIndex - token.startIndex + 1,
	// 		tokenType: "variable",
	// 		tokenModifiers: ['declaration']
	// 	});
	// 	const childExpressionContext = ctx.tryGetChild(0, ExpressionContext);
	// 	if (childExpressionContext) parsedTokens.concat(super.visit(childExpressionContext));
	// 	return parsedTokens.concat(super.visitChildren(ctx));
	// }

	visitPreproc_include(ctx: Preproc_includeContext): ParsedToken[] {
		const parsedTokens: ParsedToken[] =[];
		const token = ctx?.ppIncludeFileName()?.STRING_LITERAL()?.symbol;
		token && parsedTokens.push({
			line: token.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: token.charPositionInLine,
			length: token.stopIndex - token.startIndex + 1,
			tokenType: "variable",
			tokenModifiers: ['declaration']
		});
		const childExpressionContext = ctx.tryGetChild(0, ExpressionContext);
		if (childExpressionContext) parsedTokens.concat(super.visit(childExpressionContext));
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitPreproc_define(ctx: Preproc_defineContext): ParsedToken[] {
		const parsedTokens: ParsedToken[] =[];
		const token = ctx?.ppDefineName()?.IDENTIFIER()[0]?.symbol;
		token && parsedTokens.push({
			line: token.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: token.charPositionInLine,
			length: token.stopIndex - token.startIndex + 1,
			tokenType: "variable",
			tokenModifiers: ['declaration']
		});
		const childExpressionContext = ctx.tryGetChild(0, ExpressionContext);
		if (childExpressionContext) parsedTokens.concat(super.visit(childExpressionContext));
		return parsedTokens.concat(super.visitChildren(ctx));
	}
	
	visitEnumDeclaration(ctx: EnumDeclarationContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "enum",
			tokenModifiers: ['declaration']
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitIdentifierList(ctx: IdentifierListContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "variable",
			tokenModifiers: ['declaration', 'readonly']
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitSelectCase(ctx: SelectCaseContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}
	
	visitStateExpression(ctx: StateExpressionContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitTableProperty(ctx: TablePropertyContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `KEY`
		const keyToken = ctx?.KEY()?.symbol;
		keyToken && parsedTokens.push({
			line: keyToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: keyToken.charPositionInLine,
			length: keyToken.stopIndex - keyToken.startIndex + 1,
			tokenType: "parameter",
			tokenModifiers: []
		});
		// parse `ACTIONS`
		const actionsToken = ctx?.ACTIONS()?.symbol;
		actionsToken && parsedTokens.push({
			line: actionsToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: actionsToken.charPositionInLine,
			length: actionsToken.stopIndex - actionsToken.startIndex + 1,
			tokenType: "parameter",
			tokenModifiers: []
		});
		// parse `ENTRIES`
		const entriesToken = ctx?.ENTRIES()?.symbol;
		entriesToken && parsedTokens.push({
			line: entriesToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: entriesToken.charPositionInLine,
			length: entriesToken.stopIndex - entriesToken.startIndex + 1,
			tokenType: "parameter",
			tokenModifiers: []
		});
		// parse `DEFAULT_ACTION`
		const defaultActionToken = ctx?.DEFAULT_ACTION()?.symbol;
		if (defaultActionToken) {
			parsedTokens.push({
				line: defaultActionToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
				startCharacter: defaultActionToken.charPositionInLine,
				length: defaultActionToken.stopIndex - defaultActionToken.startIndex + 1,
				tokenType: "parameter",
				tokenModifiers: []
			});
			// parse `name`
			const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
			nameToken && parsedTokens.push({
				line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
				startCharacter: nameToken.charPositionInLine,
				length: nameToken.stopIndex - nameToken.startIndex + 1,
				tokenType: "method",
				tokenModifiers: []
			});
		}
		// parse `name`
		const nameToken = ctx.nonTableKwName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "parameter",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitKeyElement(ctx: KeyElementContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "enum",
			tokenModifiers: ['readonly']
		});
		return parsedTokens;
	}

	visitActionRef(ctx: ActionRefContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "method",
			tokenModifiers: []
		});
		return parsedTokens;
	}

	visitLvalue(ctx: LvalueContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		if (nameToken) {
			let tokenType = 'variable';
			if (ctx.parent instanceof MethodCallContext || ctx.parent instanceof ActionBindingContext) {
				tokenType = 'function';
			}
			parsedTokens.push({
				line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
				startCharacter: nameToken.charPositionInLine,
				length: nameToken.stopIndex - nameToken.startIndex + 1,
				tokenType: tokenType,
				tokenModifiers: []
			});
		}
		// parse `prefixedNonTypeName`
		const prefixedNonTypeNameToken = ctx.prefixedNonTypeName()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		if (prefixedNonTypeNameToken) {
			let tokenType = 'variable';
			if (ctx.parent instanceof MethodCallContext || ctx.parent instanceof ActionBindingContext) {
				tokenType = 'function';
			}
			parsedTokens.push({
				line: prefixedNonTypeNameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
				startCharacter: prefixedNonTypeNameToken.charPositionInLine,
				length: prefixedNonTypeNameToken.stopIndex - prefixedNonTypeNameToken.startIndex + 1,
				tokenType: tokenType,
				tokenModifiers: []
			});
		}
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitExpression(ctx: ExpressionContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		let nameToken = ctx?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "variable",
			tokenModifiers: []
		});
		// parse `name`
		nameToken = ctx?.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "variable",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitMethodPrototype(ctx: MethodPrototypeContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "method",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitFunctionPrototype(ctx: FunctionPrototypeContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx?.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "function",
			tokenModifiers: []
		});

		let typeToken = ctx?.typeOrVoid()?.type_or_id()?.TYPE_IDENTIFIER()?.symbol;
		typeToken && parsedTokens.push({
			line: typeToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: typeToken.charPositionInLine,
			length: typeToken.stopIndex - typeToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});

		typeToken = ctx?.typeOrVoid()?.typeRef()?.typeName()?._stop;
		typeToken && parsedTokens.push({
			line: typeToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: typeToken.charPositionInLine,
			length: typeToken.stopIndex - typeToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitExternDeclaration(ctx: ExternDeclarationContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitTypeParameterList(ctx: TypeParameterListContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitPackageTypeDeclaration(ctx: PackageTypeDeclarationContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}
	
	visitInstantiation(ctx: InstantiationContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}

	visitDirectApplication(ctx: DirectApplicationContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.typeName()?.prefixedType()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "variable",
			tokenModifiers: []
		});
		const applyToken = ctx.APPLY().symbol;
		applyToken && parsedTokens.push({
			line: applyToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: applyToken.charPositionInLine,
			length: applyToken.stopIndex - applyToken.startIndex + 1,
			tokenType: "function",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}
	visitMainInstantiation(ctx: MainInstantiationContext) {
		const parsedTokens: ParsedToken[] = [];
		// parse `name`
		const nameToken = ctx.name()?.nonTypeName()?.type_or_id()?.IDENTIFIER()?.symbol;
		nameToken && parsedTokens.push({
			line: nameToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: nameToken.charPositionInLine,
			length: nameToken.stopIndex - nameToken.startIndex + 1,
			tokenType: "class",
			tokenModifiers: []
		});
		const applyToken = ctx.MAIN().symbol;
		applyToken && parsedTokens.push({
			line: applyToken.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
			startCharacter: applyToken.charPositionInLine,
			length: applyToken.stopIndex - applyToken.startIndex + 1,
			tokenType: "variable",
			tokenModifiers: []
		});
		return parsedTokens.concat(super.visitChildren(ctx));
	}
	
}

class DocumentSemanticTokensProvider implements vscode.DocumentSemanticTokensProvider {
	async provideDocumentSemanticTokens(document: vscode.TextDocument, token: vscode.CancellationToken): Promise<vscode.SemanticTokens> {
		const allTokens = this._parseText(document.getText());
		const builder = new vscode.SemanticTokensBuilder();
		allTokens.forEach((token: ParsedToken) => {
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

	private _parseText(text: string): ParsedToken[] {
		// Create the lexer and parser
		const inputStream = new ANTLRInputStream(text);
		const lexer = new P4Lexer(inputStream);
		const tokenStream = new CommonTokenStream(lexer);
		const parser = new P4Parser(tokenStream);
		
		parser.buildParseTree = true;
		const tree = parser.program();

		/* This is a sample for highlighting at SEMANTIC level.
		 * It can highlight any `typeRef` as `class` and `name` as `variable` 
		 * in `structField`, `parameter` and `variableDeclaration`
		 */
		let parsedTokens: ParsedToken[] = [];
		const semanticHighlightingVisitor = new SemanticHighlightingVisitor();
		parsedTokens = parsedTokens.concat(semanticHighlightingVisitor.visit(tree));
		
		/* This is a sample for highlighting at LEXER level.
		 * It can highlight all `#INCLUDE`
		 */
		tokenStream.fill();
		const tokens = tokenStream.getTokens();
		
		// tokens.forEach(token => {
		// 	if (token.type == P4Lexer.PREPROC_INCLUDE) {
		// 		parsedTokens.push({
		// 			line: token.line - 1, // vscode API starts from 0, while ANTLR4 starts from 1
		// 			startCharacter: token.charPositionInLine,
		// 			length: token.stopIndex - token.startIndex + 1,
		// 			tokenType: 'keyword',
		// 			tokenModifiers: ['declaration']
		// 		});
		// 	}
		// });
		return parsedTokens;
	}
}

// class GoDefinitionProvider implements vscode.DefinitionProvider {
// 	public provideDefinition(
// 		document: vscode.TextDocument, position: vscode.Position, token: vscode.CancellationToken
// 	): Thenable<vscode.Definition> {
// 		const allTokens = this._parseText(document.getText());

// 		return ;
// 	}
// }

// class GoDocumentSymbolProvider implements vscode.DocumentSymbolProvider {
//     public provideDocumentSymbols(
//         document: vscode.TextDocument, token: vscode.CancellationToken):
//         Thenable<vscode.SymbolInformation[]> {
		
// 		return ;
//     }


// }
