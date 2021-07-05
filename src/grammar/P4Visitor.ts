// Generated from ./src/grammar/P4.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { StartContext } from "./P4Parser";
import { ProgramContext } from "./P4Parser";
import { InputContext } from "./P4Parser";
import { DeclarationContext } from "./P4Parser";
import { PreprocessorLineContext } from "./P4Parser";
import { PpIncludeFileNameContext } from "./P4Parser";
import { NonTypeNameContext } from "./P4Parser";
import { NameContext } from "./P4Parser";
import { NonTableKwNameContext } from "./P4Parser";
import { OptCONSTContext } from "./P4Parser";
import { OptAnnotationsContext } from "./P4Parser";
import { AnnotationsContext } from "./P4Parser";
import { AnnotationContext } from "./P4Parser";
import { AnnotationBodyContext } from "./P4Parser";
import { AnnotationTokenContext } from "./P4Parser";
import { KvListContext } from "./P4Parser";
import { KvPairContext } from "./P4Parser";
import { ParameterListContext } from "./P4Parser";
import { NonEmptyParameterListContext } from "./P4Parser";
import { ParameterContext } from "./P4Parser";
import { DirectionContext } from "./P4Parser";
import { PackageTypeDeclarationContext } from "./P4Parser";
import { InstantiationContext } from "./P4Parser";
import { MainInstantiationContext } from "./P4Parser";
import { ObjInitializerContext } from "./P4Parser";
import { ObjDeclarationsContext } from "./P4Parser";
import { ObjDeclarationContext } from "./P4Parser";
import { OptConstructorParametersContext } from "./P4Parser";
import { DotPrefixContext } from "./P4Parser";
import { ParserDeclarationContext } from "./P4Parser";
import { ParserLocalElementsContext } from "./P4Parser";
import { ParserLocalElementContext } from "./P4Parser";
import { ParserTypeDeclarationContext } from "./P4Parser";
import { ParserStatesContext } from "./P4Parser";
import { ParserStateContext } from "./P4Parser";
import { ParserStatementsContext } from "./P4Parser";
import { ParserStatementContext } from "./P4Parser";
import { ParserBlockStatementContext } from "./P4Parser";
import { TransitionStatementContext } from "./P4Parser";
import { StateExpressionContext } from "./P4Parser";
import { SelectExpressionContext } from "./P4Parser";
import { SelectCaseListContext } from "./P4Parser";
import { SelectCaseContext } from "./P4Parser";
import { KeysetExpressionContext } from "./P4Parser";
import { TupleKeysetExpressionContext } from "./P4Parser";
import { SimpleExpressionListContext } from "./P4Parser";
import { SimpleKeysetExpressionContext } from "./P4Parser";
import { ValueSetDeclarationContext } from "./P4Parser";
import { ControlDeclarationContext } from "./P4Parser";
import { ControlTypeDeclarationContext } from "./P4Parser";
import { ControlLocalDeclarationsContext } from "./P4Parser";
import { ControlLocalDeclarationContext } from "./P4Parser";
import { ControlBodyContext } from "./P4Parser";
import { ExternDeclarationContext } from "./P4Parser";
import { MethodPrototypesContext } from "./P4Parser";
import { FunctionPrototypeContext } from "./P4Parser";
import { MethodPrototypeContext } from "./P4Parser";
import { TypeRefContext } from "./P4Parser";
import { NamedTypeContext } from "./P4Parser";
import { PrefixedTypeContext } from "./P4Parser";
import { TypeNameContext } from "./P4Parser";
import { TupleTypeContext } from "./P4Parser";
import { HeaderStackTypeContext } from "./P4Parser";
import { SpecializedTypeContext } from "./P4Parser";
import { BaseTypeContext } from "./P4Parser";
import { TypeOrVoidContext } from "./P4Parser";
import { OptTypeParametersContext } from "./P4Parser";
import { TypeParameterListContext } from "./P4Parser";
import { TypeArgContext } from "./P4Parser";
import { TypeArgumentListContext } from "./P4Parser";
import { RealTypeArgContext } from "./P4Parser";
import { RealTypeArgumentListContext } from "./P4Parser";
import { TypeDeclarationContext } from "./P4Parser";
import { DerivedTypeDeclarationContext } from "./P4Parser";
import { HeaderTypeDeclarationContext } from "./P4Parser";
import { StructTypeDeclarationContext } from "./P4Parser";
import { HeaderUnionDeclarationContext } from "./P4Parser";
import { StructFieldListContext } from "./P4Parser";
import { StructFieldContext } from "./P4Parser";
import { EnumDeclarationContext } from "./P4Parser";
import { SpecifiedIdentifierListContext } from "./P4Parser";
import { SpecifiedIdentifierContext } from "./P4Parser";
import { ErrorDeclarationContext } from "./P4Parser";
import { MatchKindDeclarationContext } from "./P4Parser";
import { IdentifierListContext } from "./P4Parser";
import { TypedefDeclarationContext } from "./P4Parser";
import { MethodCallContext } from "./P4Parser";
import { AssignmentOrMethodCallStatementContext } from "./P4Parser";
import { EmptyStatementContext } from "./P4Parser";
import { ExitStatementContext } from "./P4Parser";
import { ReturnStatementContext } from "./P4Parser";
import { ConditionalStatementContext } from "./P4Parser";
import { DirectApplicationContext } from "./P4Parser";
import { StatementContext } from "./P4Parser";
import { BlockStatementContext } from "./P4Parser";
import { StatOrDeclListContext } from "./P4Parser";
import { SwitchStatementContext } from "./P4Parser";
import { SwitchCasesContext } from "./P4Parser";
import { SwitchCaseContext } from "./P4Parser";
import { SwitchLabelContext } from "./P4Parser";
import { StatementOrDeclarationContext } from "./P4Parser";
import { TableDeclarationContext } from "./P4Parser";
import { TablePropertyListContext } from "./P4Parser";
import { TablePropertyContext } from "./P4Parser";
import { KeyElementListContext } from "./P4Parser";
import { KeyElementContext } from "./P4Parser";
import { ActionListContext } from "./P4Parser";
import { ActionRefContext } from "./P4Parser";
import { EntryContext } from "./P4Parser";
import { ActionBindingContext } from "./P4Parser";
import { EntriesListContext } from "./P4Parser";
import { ActionDeclarationContext } from "./P4Parser";
import { VariableDeclarationContext } from "./P4Parser";
import { ConstantDeclarationContext } from "./P4Parser";
import { OptInitializerContext } from "./P4Parser";
import { InitializerContext } from "./P4Parser";
import { FunctionDeclarationContext } from "./P4Parser";
import { ArgumentListContext } from "./P4Parser";
import { NonEmptyArgListContext } from "./P4Parser";
import { ArgumentContext } from "./P4Parser";
import { ExpressionListContext } from "./P4Parser";
import { PrefixedNonTypeNameContext } from "./P4Parser";
import { LvalueContext } from "./P4Parser";
import { ExpressionContext } from "./P4Parser";
import { Type_or_idContext } from "./P4Parser";
import { ParserStateConditionContext } from "./P4Parser";
import { PpDefineNameContext } from "./P4Parser";
import { Preproc_includeContext } from "./P4Parser";
import { Preproc_defineContext } from "./P4Parser";
import { Preproc_undefContext } from "./P4Parser";
import { Preproc_ifdefContext } from "./P4Parser";
import { Preproc_ifndefContext } from "./P4Parser";
import { Preproc_elseifContext } from "./P4Parser";
import { Preproc_endifContext } from "./P4Parser";
import { Preproc_lineContext } from "./P4Parser";
import { Preproc_ifContext } from "./P4Parser";
import { Preproc_elseContext } from "./P4Parser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `P4Parser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface P4Visitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `P4Parser.start`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStart?: (ctx: StartContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram?: (ctx: ProgramContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.input`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInput?: (ctx: InputContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeclaration?: (ctx: DeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.preprocessorLine`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreprocessorLine?: (ctx: PreprocessorLineContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.ppIncludeFileName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPpIncludeFileName?: (ctx: PpIncludeFileNameContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.nonTypeName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNonTypeName?: (ctx: NonTypeNameContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitName?: (ctx: NameContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.nonTableKwName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNonTableKwName?: (ctx: NonTableKwNameContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.optCONST`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptCONST?: (ctx: OptCONSTContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.optAnnotations`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptAnnotations?: (ctx: OptAnnotationsContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.annotations`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAnnotations?: (ctx: AnnotationsContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.annotation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAnnotation?: (ctx: AnnotationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.annotationBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAnnotationBody?: (ctx: AnnotationBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.annotationToken`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAnnotationToken?: (ctx: AnnotationTokenContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.kvList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKvList?: (ctx: KvListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.kvPair`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKvPair?: (ctx: KvPairContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parameterList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterList?: (ctx: ParameterListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.nonEmptyParameterList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNonEmptyParameterList?: (ctx: NonEmptyParameterListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parameter`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameter?: (ctx: ParameterContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.direction`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDirection?: (ctx: DirectionContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.packageTypeDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPackageTypeDeclaration?: (ctx: PackageTypeDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.instantiation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInstantiation?: (ctx: InstantiationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.mainInstantiation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMainInstantiation?: (ctx: MainInstantiationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.objInitializer`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitObjInitializer?: (ctx: ObjInitializerContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.objDeclarations`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitObjDeclarations?: (ctx: ObjDeclarationsContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.objDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitObjDeclaration?: (ctx: ObjDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.optConstructorParameters`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptConstructorParameters?: (ctx: OptConstructorParametersContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.dotPrefix`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDotPrefix?: (ctx: DotPrefixContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parserDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParserDeclaration?: (ctx: ParserDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parserLocalElements`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParserLocalElements?: (ctx: ParserLocalElementsContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parserLocalElement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParserLocalElement?: (ctx: ParserLocalElementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parserTypeDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParserTypeDeclaration?: (ctx: ParserTypeDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parserStates`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParserStates?: (ctx: ParserStatesContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parserState`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParserState?: (ctx: ParserStateContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parserStatements`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParserStatements?: (ctx: ParserStatementsContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parserStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParserStatement?: (ctx: ParserStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parserBlockStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParserBlockStatement?: (ctx: ParserBlockStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.transitionStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTransitionStatement?: (ctx: TransitionStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.stateExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStateExpression?: (ctx: StateExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.selectExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSelectExpression?: (ctx: SelectExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.selectCaseList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSelectCaseList?: (ctx: SelectCaseListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.selectCase`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSelectCase?: (ctx: SelectCaseContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.keysetExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeysetExpression?: (ctx: KeysetExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.tupleKeysetExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTupleKeysetExpression?: (ctx: TupleKeysetExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.simpleExpressionList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimpleExpressionList?: (ctx: SimpleExpressionListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.simpleKeysetExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimpleKeysetExpression?: (ctx: SimpleKeysetExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.valueSetDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValueSetDeclaration?: (ctx: ValueSetDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.controlDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitControlDeclaration?: (ctx: ControlDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.controlTypeDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitControlTypeDeclaration?: (ctx: ControlTypeDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.controlLocalDeclarations`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitControlLocalDeclarations?: (ctx: ControlLocalDeclarationsContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.controlLocalDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitControlLocalDeclaration?: (ctx: ControlLocalDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.controlBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitControlBody?: (ctx: ControlBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.externDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExternDeclaration?: (ctx: ExternDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.methodPrototypes`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMethodPrototypes?: (ctx: MethodPrototypesContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.functionPrototype`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionPrototype?: (ctx: FunctionPrototypeContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.methodPrototype`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMethodPrototype?: (ctx: MethodPrototypeContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.typeRef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeRef?: (ctx: TypeRefContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.namedType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamedType?: (ctx: NamedTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.prefixedType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrefixedType?: (ctx: PrefixedTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.typeName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeName?: (ctx: TypeNameContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.tupleType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTupleType?: (ctx: TupleTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.headerStackType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHeaderStackType?: (ctx: HeaderStackTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.specializedType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSpecializedType?: (ctx: SpecializedTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.baseType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBaseType?: (ctx: BaseTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.typeOrVoid`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeOrVoid?: (ctx: TypeOrVoidContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.optTypeParameters`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptTypeParameters?: (ctx: OptTypeParametersContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.typeParameterList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeParameterList?: (ctx: TypeParameterListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.typeArg`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeArg?: (ctx: TypeArgContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.typeArgumentList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeArgumentList?: (ctx: TypeArgumentListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.realTypeArg`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRealTypeArg?: (ctx: RealTypeArgContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.realTypeArgumentList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRealTypeArgumentList?: (ctx: RealTypeArgumentListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.typeDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeDeclaration?: (ctx: TypeDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.derivedTypeDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDerivedTypeDeclaration?: (ctx: DerivedTypeDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.headerTypeDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHeaderTypeDeclaration?: (ctx: HeaderTypeDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.structTypeDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructTypeDeclaration?: (ctx: StructTypeDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.headerUnionDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHeaderUnionDeclaration?: (ctx: HeaderUnionDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.structFieldList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructFieldList?: (ctx: StructFieldListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.structField`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructField?: (ctx: StructFieldContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.enumDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEnumDeclaration?: (ctx: EnumDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.specifiedIdentifierList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSpecifiedIdentifierList?: (ctx: SpecifiedIdentifierListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.specifiedIdentifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSpecifiedIdentifier?: (ctx: SpecifiedIdentifierContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.errorDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitErrorDeclaration?: (ctx: ErrorDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.matchKindDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMatchKindDeclaration?: (ctx: MatchKindDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.identifierList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentifierList?: (ctx: IdentifierListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.typedefDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypedefDeclaration?: (ctx: TypedefDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.methodCall`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMethodCall?: (ctx: MethodCallContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.assignmentOrMethodCallStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssignmentOrMethodCallStatement?: (ctx: AssignmentOrMethodCallStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.emptyStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEmptyStatement?: (ctx: EmptyStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.exitStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExitStatement?: (ctx: ExitStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.returnStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReturnStatement?: (ctx: ReturnStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.conditionalStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConditionalStatement?: (ctx: ConditionalStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.directApplication`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDirectApplication?: (ctx: DirectApplicationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatement?: (ctx: StatementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.blockStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlockStatement?: (ctx: BlockStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.statOrDeclList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatOrDeclList?: (ctx: StatOrDeclListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.switchStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSwitchStatement?: (ctx: SwitchStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.switchCases`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSwitchCases?: (ctx: SwitchCasesContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.switchCase`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSwitchCase?: (ctx: SwitchCaseContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.switchLabel`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSwitchLabel?: (ctx: SwitchLabelContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.statementOrDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatementOrDeclaration?: (ctx: StatementOrDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.tableDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTableDeclaration?: (ctx: TableDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.tablePropertyList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTablePropertyList?: (ctx: TablePropertyListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.tableProperty`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTableProperty?: (ctx: TablePropertyContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.keyElementList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeyElementList?: (ctx: KeyElementListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.keyElement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeyElement?: (ctx: KeyElementContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.actionList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitActionList?: (ctx: ActionListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.actionRef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitActionRef?: (ctx: ActionRefContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEntry?: (ctx: EntryContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.actionBinding`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitActionBinding?: (ctx: ActionBindingContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.entriesList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEntriesList?: (ctx: EntriesListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.actionDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitActionDeclaration?: (ctx: ActionDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.variableDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableDeclaration?: (ctx: VariableDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.constantDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstantDeclaration?: (ctx: ConstantDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.optInitializer`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptInitializer?: (ctx: OptInitializerContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.initializer`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInitializer?: (ctx: InitializerContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.functionDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionDeclaration?: (ctx: FunctionDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.argumentList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArgumentList?: (ctx: ArgumentListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.nonEmptyArgList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNonEmptyArgList?: (ctx: NonEmptyArgListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.argument`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArgument?: (ctx: ArgumentContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.expressionList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpressionList?: (ctx: ExpressionListContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.prefixedNonTypeName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrefixedNonTypeName?: (ctx: PrefixedNonTypeNameContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.lvalue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLvalue?: (ctx: LvalueContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression?: (ctx: ExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.type_or_id`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitType_or_id?: (ctx: Type_or_idContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.parserStateCondition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParserStateCondition?: (ctx: ParserStateConditionContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.ppDefineName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPpDefineName?: (ctx: PpDefineNameContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.preproc_include`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreproc_include?: (ctx: Preproc_includeContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.preproc_define`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreproc_define?: (ctx: Preproc_defineContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.preproc_undef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreproc_undef?: (ctx: Preproc_undefContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.preproc_ifdef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreproc_ifdef?: (ctx: Preproc_ifdefContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.preproc_ifndef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreproc_ifndef?: (ctx: Preproc_ifndefContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.preproc_elseif`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreproc_elseif?: (ctx: Preproc_elseifContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.preproc_endif`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreproc_endif?: (ctx: Preproc_endifContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.preproc_line`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreproc_line?: (ctx: Preproc_lineContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.preproc_if`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreproc_if?: (ctx: Preproc_ifContext) => Result;

	/**
	 * Visit a parse tree produced by `P4Parser.preproc_else`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreproc_else?: (ctx: Preproc_elseContext) => Result;
}

