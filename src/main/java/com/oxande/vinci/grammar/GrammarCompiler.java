package com.oxande.vinci.grammar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.oxande.vinci.antlr4.VinciBaseVisitor;
import com.oxande.vinci.antlr4.VinciParser;
import com.oxande.vinci.antlr4.VinciParser.CompilationUnitContext;
import com.oxande.vinci.antlr4.VinciParser.StatementContext;

public class GrammarCompiler extends VinciBaseVisitor<GrammarTree> {

    private int line;

    
    public GrammarTree compileProgram(VinciParser parser){
        GrammarTree rootTree = parser.compilationUnit().accept(this);
        return rootTree;
    }

    // ----------------------- UTILITIES
    
    private GrammarTree multiplyMinusOne(GrammarTree src){
        GrammarTree minus1 = GrammarTree.getConstInteger(-1);
        GrammarTree[] ops = GrammarTree.castNumeric( minus1, src );
        return new GrammarTree(OpCode.MULTIPLY, ops);
    }
    
    private GrammarTree getFromConst(String str){
    	try {
    		long v = Long.parseLong(str);
    		if( v < Integer.MAX_VALUE && v > Integer.MIN_VALUE ){
    			return GrammarTree.getConstInteger((int)v);
    		}
    		else {
    			return GrammarTree.getConstInt64(v);
    		}
    	}
    	catch(NumberFormatException ex){
    		// Not a integer...
    	}

    	try {
    		double v = Double.parseDouble(str);
    		return GrammarTree.getConstFloat(v);
    	}
    	catch(NumberFormatException ex){
    		// Not a double...
    	}
    	
   		BigDecimal dec = new BigDecimal(str);
   		return GrammarTree.getConstNumeric(dec);
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
            GrammarTree results = visitConditionalExpression(ctx.conditionalExpression());
            if( ctx.op != null && ctx.op.getText().equals("println") ){
            	results = new GrammarTree(OpCode.PRINTLN, results);
            }
            return results;
        }
        if( ctx.unaryExpression() != null ){
        	GrammarTree lvalue = visitUnaryExpression(ctx.unaryExpression());
        	GrammarTree expr = visitAssignmentExpression(ctx.assignmentExpression());
        	throw new UnsupportedOperationException("AssignmentExpression: assignment '=' not supported.");
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
            return getFromConst(digits);
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
            return new GrammarTree(OpCode.MULTIPLY, GrammarTree.castNumeric(a, b));
        case '/':
            return new GrammarTree(OpCode.DIVIDE, GrammarTree.castNumeric(a, b));
        }
        throw new UnsupportedOperationException("MultiplicativeExpression: not fully supported.");
    }
    
    @Override 
    public GrammarTree visitExpressionStatement(VinciParser.ExpressionStatementContext ctx) { 
    	if( ctx.expression() == null ){
    		return GrammarTree.NOP();
    	}
    	return visitExpression(ctx.expression());
    }
    
    @Override
    public GrammarTree visitStatement(VinciParser.StatementContext ctx) {
    	if( ctx.expressionStatement() != null ){
    		return visitExpressionStatement(ctx.expressionStatement());
    	}
    	throw new UnsupportedOperationException("MultiplicativeExpression: not fully supported.");
    }

  
    
    @Override 
    public GrammarTree visitExternalDeclaration(VinciParser.ExternalDeclarationContext ctx) {
    	if( ctx.functionDefinition() != null ){
    		throw new UnsupportedOperationException("The declaration of functions not yet supported.");
    		// return visitFunctionDefinition(ctx.functionDefinition());
    	}
    	if( ctx.statement() != null ){
    		return visitStatement(ctx.statement());
    	}
    	if( ctx.declaration() != null ){
    		return visitDeclaration(ctx.declaration());
    	}
    	return GrammarTree.NOP(); 
    }
	
    @Override 
    public GrammarTree visitTranslationUnit(VinciParser.TranslationUnitContext ctx) {
    	GrammarTree first = null;
    	if(ctx.translationUnit() != null){
    		first = visitTranslationUnit(ctx.translationUnit());
    	}
    	GrammarTree last = visitExternalDeclaration(ctx.externalDeclaration());
    	return GrammarTree.statements(Arrays.asList(first, last));
    }
	
    
    @Override
    public GrammarTree visitCompilationUnit(CompilationUnitContext ctx) {
    	if( ctx.translationUnit() != null){
    		return visitTranslationUnit(ctx.translationUnit());
    	}
    	return GrammarTree.NOP();
    	
//    	List<GrammarTree> commands = new ArrayList<>();
//    	for( StatementContext stmt : ctx.statement() ){
//    		GrammarTree ret = visitStatement(stmt);
//    		commands.add(ret);
//    	}
//        return GrammarTree.statements( commands );
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
        return new GrammarTree(OpCode.ADD, GrammarTree.castNumeric(a, b));
    }

}
