// Generated from com\oxande\vinci\antlr4\Vinci.g4 by ANTLR 4.7
package com.oxande.vinci.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VinciParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VinciVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VinciParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(VinciParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(VinciParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(VinciParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(VinciParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(VinciParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(VinciParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(VinciParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(VinciParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(VinciParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(VinciParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(VinciParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(VinciParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(VinciParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(VinciParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(VinciParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(VinciParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(VinciParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(VinciParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(VinciParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(VinciParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(VinciParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(VinciParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(VinciParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(VinciParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(VinciParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(VinciParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(VinciParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(VinciParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(VinciParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(VinciParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(VinciParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(VinciParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(VinciParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(VinciParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(VinciParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(VinciParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(VinciParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(VinciParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(VinciParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(VinciParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(VinciParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(VinciParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(VinciParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(VinciParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(VinciParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(VinciParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(VinciParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(VinciParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(VinciParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(VinciParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(VinciParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(VinciParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(VinciParser.GccAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(VinciParser.GccAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(VinciParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(VinciParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(VinciParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(VinciParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(VinciParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(VinciParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(VinciParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(VinciParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(VinciParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(VinciParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(VinciParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(VinciParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(VinciParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(VinciParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(VinciParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(VinciParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(VinciParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VinciParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(VinciParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(VinciParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(VinciParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(VinciParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(VinciParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(VinciParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(VinciParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(VinciParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(VinciParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(VinciParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(VinciParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(VinciParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(VinciParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(VinciParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(VinciParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VinciParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(VinciParser.DeclarationListContext ctx);
}