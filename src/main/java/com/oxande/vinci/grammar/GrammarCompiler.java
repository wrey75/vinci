package com.oxande.vinci.grammar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.oxande.vinci.antlr4.VinciBaseVisitor;
import com.oxande.vinci.antlr4.VinciParser;
import com.oxande.vinci.antlr4.VinciParser.CompilationUnitContext;
import com.oxande.vinci.util.VinciUtils;

public class GrammarCompiler extends VinciBaseVisitor<GrammarTree> {

    private int line;
    private Map<String, VinciVariable> variables = new HashMap<>();

    
    public GrammarTree compileProgram(VinciParser parser){
        GrammarTree rootTree = parser.compilationUnit().accept(this);
        return rootTree;
    }

    // ----------------------- UTILITIES
    
    private GrammarTree multiplyMinusOne(GrammarTree src) {
        GrammarTree minus1 = GrammarTree.getConstInteger(-1);
        GrammarTree[] ops;
		ops = GrammarTree.castNumeric( minus1, src );
        return new GrammarTree(OpCode.MULTIPLY, ops);
    }
    
    private GrammarTree getFromConst(String str){
    	try {
    		long v = Long.parseLong(str);
    		if( v < Integer.MAX_VALUE && v > Integer.MIN_VALUE ){
    			return GrammarTree.getConstInteger((int)v);
    		}
    		else {
    			throw new UnsupportedOperationException("64 bits integers not supported yet.");
    			// return GrammarTree.getConstInt64(v);
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
    	
    	throw new NumberFormatException("Unexpected numeric value " + VinciUtils.quote(str));
   		// BigDecimal dec = new BigDecimal(str);
   		// return GrammarTree.getConstNumeric(dec);
    }
    


    // ----------------------- GRAMMAR CODE

    @Override 
    public GrammarTree visitShiftExpression(VinciParser.ShiftExpressionContext ctx) { 
    	GrammarTree addExpr = visitAdditiveExpression(ctx.additiveExpression());
    	if( ctx.shiftExpression() != null ){
    		throw new UnsupportedOperationException("shiftExpression not yet supported.");
    	}
    	return addExpr;
    }
    
    private GrammarTree compare(Token op, GrammarTree expr1, GrammarTree expr2) {
		GrammarTree results = null;
    	GrammarTree[] cast = GrammarTree.castNumeric(expr1, expr2);
		String oper = (op == null ? "==" : op.getText());
		switch(oper){
			case "<" :
				results = new GrammarTree(OpCode.BELOW, cast[0], cast[1]);
				break;
			case "<=" :
				results = new GrammarTree(OpCode.BELOW_OR_EQUALS, cast[0], cast[1]);
				break;
			case ">" :
				results = new GrammarTree(OpCode.BOOLEAN_NOT,
						new GrammarTree(OpCode.BELOW_OR_EQUALS, cast[0], cast[1]));
				break;
			case ">=" :
				results = new GrammarTree(OpCode.BOOLEAN_NOT,
						new GrammarTree(OpCode.BELOW, cast[0], cast[1]));
				break;
			case "==" :
				results = new GrammarTree(OpCode.EQUALS, cast[0], cast[1]);
				break;
				
			case "!=" :
				results = new GrammarTree(OpCode.BOOLEAN_NOT,
						new GrammarTree(OpCode.EQUALS, cast[0], cast[1]));
				break;
		}
		return results;
    }
	
    @Override
    public GrammarTree visitRelationalExpression(VinciParser.RelationalExpressionContext ctx) { 
    	GrammarTree shiftExpr = visitShiftExpression(ctx.shiftExpression());
    	if( ctx.relationalExpression() != null ){
    		GrammarTree relExpr = visitRelationalExpression(ctx.relationalExpression());
    		return compare(ctx.op, relExpr, shiftExpr);
    	}
    	return shiftExpr;
    }
    
    @Override 
    public GrammarTree visitEqualityExpression(VinciParser.EqualityExpressionContext ctx) { 
    	GrammarTree relExpr = visitRelationalExpression(ctx.relationalExpression());
    	if( ctx.equalityExpression() != null ){
    		GrammarTree eqExpr = visitEqualityExpression(ctx.equalityExpression());
    		return compare(ctx.op, eqExpr, relExpr);
    	}
    	return relExpr;
    }
	
    @Override 
    public GrammarTree visitAndExpression(VinciParser.AndExpressionContext ctx) { 
    	GrammarTree eqExpr = visitEqualityExpression(ctx.equalityExpression());
    	if( ctx.andExpression() != null ){
    		GrammarTree andExpr = visitAndExpression(ctx.andExpression());
    		return new GrammarTree(OpCode.BINARY_AND, andExpr, eqExpr);
    	}
    	return eqExpr;
    }
    
    @Override
    public GrammarTree visitExclusiveOrExpression(VinciParser.ExclusiveOrExpressionContext ctx) {
        GrammarTree and = visitAndExpression(ctx.andExpression());
        if( ctx.exclusiveOrExpression() != null ){
            GrammarTree xor = visitExclusiveOrExpression(ctx.exclusiveOrExpression());
            return new GrammarTree( OpCode.BINARY_XOR, xor, and);
        }
        return and;
    }

    @Override
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

    /**
     * Create a variable if needed.
     * 
     * @param v the grammar concerned.
     */
    private GrammarTree createVariableIfNeeded(GrammarTree v, VinciClass type ){
    	String varName = v.getValue().toString();
    	VinciVariable var = variables.get(varName);
    	if( var == null ){
        	if( v.type == VinciClass.AUTO ){
        		// Set the type to the correct one.
        		v.type = type;
        	}
        	var = new VinciVariable(varName, v.type);
        	variables.put(varName, var);
    	}
    	v.cast(var.getType(), false);
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
        	
        	if( lvalue.opCode != OpCode.REFERENCE ){
        		throw new UnsupportedOperationException("AssignmentExpression: assignment '=' not supported (variable expected).");
        	}
        	lvalue = createVariableIfNeeded(lvalue, expr.type);
        	return new GrammarTree(OpCode.STORE, lvalue, expr);
        }
        throw new UnsupportedOperationException("AssignmentExpression: not fully supported.");
    }

    public GrammarTree visitExpression(VinciParser.ExpressionContext ctx) {
        if( ctx.assignmentExpression() != null ){
            return visitAssignmentExpression( ctx.assignmentExpression() );
        }
        throw new UnsupportedOperationException("Expression: not fully supported.");
    }
    
	/**
	 * Declare a variable in the tree.
	 * 
	 * @param name
	 *            the name of the variable.
	 * @return the variable reference.
	 */
	public GrammarTree variable(String name) {
		VinciVariable var = variables.get(name);
		if( var == null ){
			GrammarTree tree = new GrammarTree(OpCode.REFERENCE, VinciClass.AUTO);
			tree.setObject(name);
			return tree;
		}
		return new GrammarTree(OpCode.REFERENCE, var.getType(), var.getName() );
	}
	

    public GrammarTree visitPrimaryExpression(VinciParser.PrimaryExpressionContext ctx) {
        if( ctx.Constant() != null ){
            String digits = ctx.Constant().getText();
            return getFromConst(digits);
        }
        if( ctx.expression() != null ){
            return visitExpression(ctx.expression());
        }
        if( ctx.Identifier() != null && ctx.Identifier().getText().length() > 0){
            String identifier = ctx.Identifier().getText();
            return variable(identifier);
        }
        if( ctx.StringLiteral() != null ){
        	StringBuilder buf = new StringBuilder();
        	for( TerminalNode node : ctx.StringLiteral() ){
        		String text = node.getText();
            	buf.append(VinciUtils.fromJava(text));
        	}
        	return GrammarTree.getConstString(buf);
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

        if( ctx.castExpression() != null ){
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
        	if(a.isString() && b.isInteger()) {
        		return new GrammarTree(OpCode.STRING_MULTIPLY, 
        				a.cast(VinciClass.STRING, false), 
        				b.cast(VinciClass.INTEGER, false));
        	}
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
