package com.oxande.vinci.grammar;

import com.oxande.vinci.antlr4.VinciBaseVisitor;
import com.oxande.vinci.antlr4.VinciParser;
import com.oxande.vinci.compiler.VinciCode;
import com.sun.org.apache.xerces.internal.xni.grammars.Grammar;

public class GrammarCompiler extends VinciBaseVisitor<GrammarTree> {

    private int line;

    private GrammarTree empty(){
        GrammarTree ret = GrammarTree.NOP();
        return ret;
    }

    private GrammarTree multiplyMinusOne(GrammarTree src){
        GrammarTree minus1 = GrammarTree.getConstInteger(-1);
        GrammarTree[] ops = GrammarTree.castNumeric( minus1, src );
        return new GrammarTree(OpCode.MULTIPLY, ops);
    }

    // ----------------------- GRAMMAR CODE

    public GrammarTree visitExclusiveOrExpression(VinciParser.ExclusiveOrExpressionContext ctx) {
        GrammarTree and = visitAndExpression(ctx.andExpression());
        if( ctx.exclusiveOrExpression() != null ){
            GrammarTree xor = visitExclusiveOrExpression(ctx.exclusiveOrExpression());
            return new GrammarTree( OpCode.BINARY_XOR, xor, and);
        }
        return and;
    }

    public GrammarTree visitInclusiveOrExpression(VinciParser.InclusiveOrExpressionContext ctx) {
        GrammarTree excl = visitExclusiveOrExpression(ctx.exclusiveOrExpression());
        if( ctx.inclusiveOrExpression() != null ){
            GrammarTree incl = visitInclusiveOrExpression(ctx.inclusiveOrExpression());
            return new GrammarTree( OpCode.BINARY_OR, incl, excl);
        }
        return excl;
    }

    public GrammarTree visitLogicalAndExpression(VinciParser.LogicalAndExpressionContext ctx) {
        GrammarTree incl = visitInclusiveOrExpression( ctx.inclusiveOrExpression() );
        if( ctx.logicalAndExpression() != null ){
            GrammarTree and = visitLogicalAndExpression(ctx.logicalAndExpression());
            return new GrammarTree( OpCode.BOOLEAN_OR, and, incl);
        }
        return incl;
    }

    public GrammarTree visitLogicalOrExpression(VinciParser.LogicalOrExpressionContext ctx) {
        GrammarTree and = visitLogicalAndExpression(ctx.logicalAndExpression());
        if( ctx.logicalOrExpression() != null ){
            GrammarTree or = visitLogicalOrExpression(ctx.logicalOrExpression());
            return new GrammarTree( OpCode.BOOLEAN_OR, or, and);
        }
        return and;
    }

    public GrammarTree visitConditionalExpression(VinciParser.ConditionalExpressionContext ctx) {
        GrammarTree v = visitLogicalOrExpression(ctx.logicalOrExpression());
        if( ctx.conditionalExpression() != null ){
            GrammarTree cond = visitConditionalExpression(ctx.conditionalExpression());
            GrammarTree expr = visitExpression(ctx.expression());
            throw new UnsupportedOperationException("ConditionalExpression: not fully supported.");
        }
        return v;
    }


    public GrammarTree visitAssignmentExpression(VinciParser.AssignmentExpressionContext ctx) {
        if( ctx.conditionalExpression() != null ){
            return visitConditionalExpression(ctx.conditionalExpression());
        }
        throw new UnsupportedOperationException("AssignmentExpression: not fully supported.");
    }

    public GrammarTree visitExpression(VinciParser.ExpressionContext ctx) {
        if( ctx.assignmentExpression() != null ){
            return visitAssignmentExpression( ctx.assignmentExpression() );
        }
        throw new UnsupportedOperationException("Expression: not fully supported.");
    }

    public GrammarTree visitPrimaryExpression(VinciParser.PrimaryExpressionContext ctx) {
        if( ctx.Constant() != null ){
            String digits = ctx.Constant().getText();
            return GrammarTree.getConstInteger(Integer.parseInt(digits));
        }
        if( ctx.expression() != null ){
            return visitExpression(ctx.expression());
        }
        throw new UnsupportedOperationException("PrimaryExpression: not fully supported.");
    }

    public GrammarTree visitPostfixExpression(VinciParser.PostfixExpressionContext ctx) {
        if( ctx.primaryExpression() != null ){
            return visitPrimaryExpression(ctx.primaryExpression());
        }
        throw new UnsupportedOperationException("PostfixExpression: not fully supported.");
    }

    public GrammarTree visitUnaryOperator(VinciParser.UnaryOperatorContext ctx){
        throw new IllegalStateException("UnaryOperator: not supposed to be scanned.");
    }

    public GrammarTree visitUnaryExpression(VinciParser.UnaryExpressionContext ctx) {
        if( ctx.postfixExpression() != null ){
            return visitPostfixExpression(ctx.postfixExpression());
        }

        if( ctx.unaryOperator() != null ){
            GrammarTree v = visitCastExpression(ctx.castExpression());
            char operator = ctx.unaryOperator().getText().charAt(0);
            switch( operator ){
            case '+':
                // Just forget about the "+"
                return v;
            case '-':
                return multiplyMinusOne(v);
            }
            throw new UnsupportedOperationException("UnaryExpression: unary operator '" + operator + "' not supported.");
        }
        throw new UnsupportedOperationException("UnaryExpression: not fully supported.");
    }

    public GrammarTree visitCastExpression(VinciParser.CastExpressionContext ctx) {
        if( ctx.unaryExpression() != null ){
            return visitUnaryExpression(ctx.unaryExpression());
        }

        String digits = ctx.DigitSequence().getText();
        return GrammarTree.getConstInteger( Integer.parseInt(digits) );
    }

    public GrammarTree visitMultiplicativeExpression(VinciParser.MultiplicativeExpressionContext ctx) {
        if(ctx.op == null) {
            return visitCastExpression( ctx.castExpression() );
        }
        char operator = ctx.op.getText().charAt(0);
        GrammarTree a = visitMultiplicativeExpression(ctx.multiplicativeExpression());
        GrammarTree b = visitCastExpression(ctx.castExpression());
        switch( operator ){
        case '*' :
            return new GrammarTree(OpCode.MULTIPLY, a, b);
        case '/':
            return new GrammarTree(OpCode.DIVIDE, a, b);
        }
        throw new UnsupportedOperationException("MultiplicativeExpression: not fully supported.");
    }

    public GrammarTree visitProgram(VinciParser.ProgramContext ctx) {
        if( ctx.additiveExpression() != null ){
            GrammarTree ret = visitAdditiveExpression( ctx.additiveExpression() );
            return new GrammarTree( OpCode.PRINTLN, ret );
        }
        throw new UnsupportedOperationException("Program: not fully supported.");
    }


    public GrammarTree visitAdditiveExpression(VinciParser.AdditiveExpressionContext ctx) {
        if(ctx.op == null) {
            // visit the multiplicative
            return visitMultiplicativeExpression(ctx.multiplicativeExpression());
        }

        String operation = ctx.op.getText();
        GrammarTree a = visitAdditiveExpression(ctx.a);
        GrammarTree b = visitMultiplicativeExpression(ctx.b);
        if(operation.equals("-")){
           /** In this case, we multiply the second expression by -1 */
           b = multiplyMinusOne(b);
        }
        return new GrammarTree(OpCode.ADD, a, b);
    }

}
