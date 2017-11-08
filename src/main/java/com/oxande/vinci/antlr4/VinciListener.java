// Generated from com/oxande/vinci/antlr4/Vinci.g4 by ANTLR 4.7
package com.oxande.vinci.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VinciParser}.
 */
public interface VinciListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VinciParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(VinciParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(VinciParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(VinciParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(VinciParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(VinciParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(VinciParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(VinciParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(VinciParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(VinciParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(VinciParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(VinciParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(VinciParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(VinciParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(VinciParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(VinciParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(VinciParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(VinciParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(VinciParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(VinciParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(VinciParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(VinciParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(VinciParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(VinciParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(VinciParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(VinciParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(VinciParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(VinciParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(VinciParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(VinciParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(VinciParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(VinciParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(VinciParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(VinciParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(VinciParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(VinciParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(VinciParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VinciParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VinciParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(VinciParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(VinciParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(VinciParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(VinciParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(VinciParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(VinciParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(VinciParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(VinciParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(VinciParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(VinciParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(VinciParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(VinciParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(VinciParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(VinciParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(VinciParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(VinciParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(VinciParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(VinciParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(VinciParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(VinciParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(VinciParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(VinciParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(VinciParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(VinciParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(VinciParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(VinciParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(VinciParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(VinciParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(VinciParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(VinciParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(VinciParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(VinciParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(VinciParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(VinciParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(VinciParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(VinciParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(VinciParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(VinciParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(VinciParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(VinciParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(VinciParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(VinciParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(VinciParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(VinciParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(VinciParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(VinciParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(VinciParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(VinciParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(VinciParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(VinciParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(VinciParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(VinciParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(VinciParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(VinciParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(VinciParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(VinciParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(VinciParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(VinciParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(VinciParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(VinciParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(VinciParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(VinciParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(VinciParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(VinciParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(VinciParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(VinciParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(VinciParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(VinciParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(VinciParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(VinciParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(VinciParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(VinciParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(VinciParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(VinciParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(VinciParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(VinciParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(VinciParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(VinciParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(VinciParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(VinciParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(VinciParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(VinciParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(VinciParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(VinciParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(VinciParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(VinciParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(VinciParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(VinciParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(VinciParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(VinciParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(VinciParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(VinciParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(VinciParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(VinciParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VinciParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VinciParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(VinciParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(VinciParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(VinciParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(VinciParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(VinciParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(VinciParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(VinciParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(VinciParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(VinciParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(VinciParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(VinciParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(VinciParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(VinciParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(VinciParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(VinciParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(VinciParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(VinciParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(VinciParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(VinciParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(VinciParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(VinciParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(VinciParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(VinciParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(VinciParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(VinciParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(VinciParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(VinciParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(VinciParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(VinciParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(VinciParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VinciParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(VinciParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VinciParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(VinciParser.DeclarationListContext ctx);
}