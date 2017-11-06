package com.oxande.vinci.vm;

import com.oxande.vinci.grammar.VinciClass;
import com.oxande.vinci.util.Assert;

public class VinciVariable {
    private String stringValue;
    private boolean boolValue;
    private double floatValue;
    private int intValue;
//    private BigDecimal numericValue;
    VinciClass type;

    private VinciVariable(VinciClass type){
    	this.type = type;
    }
    
    public static VinciVariable fromString(CharSequence v){
    	VinciVariable self = new VinciVariable(VinciClass.STRING);
        self.stringValue = v.toString();
        return self;
    }
    
    public static VinciVariable fromFloat(double v){
    	VinciVariable self = new VinciVariable(VinciClass.FLOAT);
        self.floatValue = v;
        self.stringValue = Double.toString(v);
        return self;
    }

    public static VinciVariable fromInteger(int v){
    	VinciVariable self = new VinciVariable(VinciClass.INTEGER);
        self.intValue = v;
        self.stringValue = Integer.toString(v);
        return self;
    }
    
    public static VinciVariable fromBoolean(boolean v){
    	VinciVariable self = new VinciVariable(VinciClass.BOOLEAN);
        self.boolValue = v;
        self.stringValue = Boolean.toString(v);
        return self;
    }
    
    public double doubleValue(){
        switch(this.type){
        	case FLOAT:
        		return floatValue;
        	case INTEGER:
        		return intValue;
        }
    	throw new IllegalStateException("Neither a FLOAT nor a INT value.");
    }
    
    
    public boolean booleanValue(){
        if( this.type != VinciClass.BOOLEAN ){
            throw new IllegalStateException("Not a BOOLEAN value.");
        }
        return boolValue;
    }
    
    public int intValue(){
        if( this.type != VinciClass.INTEGER ){
            throw new IllegalStateException("Not a INTEGER value.");
        }
        return intValue;
    }
    
    public VinciVariable add(VinciVariable other){
    	Assert.notNull(other, "other");
    	if( this.type != other.type ){
    		throw new UnsupportedOperationException("Trying add between " + this.type + " and " + other.type + " (expected the same types).");
    	}
    	switch(this.type){
    		case INTEGER: {
    			int sum = this.intValue + other.intValue;
    			return fromInteger(sum);
    		}
    		case FLOAT: {
    			double sum = this.floatValue + other.floatValue;
    			return fromFloat(sum);
    		}
//    		case NUMERIC:
//    			VinciVariable var = new VinciVariable(VinciClass.NUMERIC);
//    			var.numericValue = this.numericValue.add(other.numericValue);
//    			return var;
    	}
		throw new UnsupportedOperationException("Addition is not supported for type " + this.type);
    }

    public VinciVariable multiply(VinciVariable other){
    	Assert.notNull(other, "other");
    	if( this.type != other.type ){
    		throw new UnsupportedOperationException("Trying multiplication between " + this.type + " and " + other.type + " (expected the same types).");
    	}
    	switch(this.type){
    		case INTEGER: {
    			int ret = this.intValue() * other.intValue();
    			return fromInteger(ret);
    		}
    		case FLOAT: {
    			double sum = this.doubleValue() * other.doubleValue();
    			return fromFloat(sum);
    		}
//    		case NUMERIC:
//    			VinciVariable var = new VinciVariable(VinciClass.NUMERIC);
//    			var.numericValue = this.numericValue.multiply(other.numericValue);
//    			return var;

    	}
		throw new UnsupportedOperationException("Multiplication is not supported for type " + this.type);
    }
    
    public VinciVariable divide(VinciVariable other){
    	Assert.notNull(other, "other");
    	if( this.type != other.type ){
    		throw new UnsupportedOperationException("Trying division between " + this.type + " and " + other.type + " (expected the same types).");
    	}
    	switch(this.type){
    		case INTEGER:
    			int iVal = this.intValue / other.intValue;
    			return fromInteger(iVal);
    			
    		case FLOAT:
    			double fVal = this.doubleValue() / other.doubleValue();
    			return fromFloat(fVal);
    			
//    		case NUMERIC:
//    			VinciVariable var = new VinciVariable(VinciClass.NUMERIC);
//    			var.numericValue = this.numericValue.divide(other.numericValue);
//    			return var;
    	}
		throw new UnsupportedOperationException("Division is not supported for type " + this.type);
    }
    
    
    public int compare( VinciVariable other ){
    	Assert.notNull(other, "other");
    	if( this.type != other.type ){
    		throw new UnsupportedOperationException("Trying compare between " + this.type + " and " + other.type + " (expected the same types).");
    	}
    	switch(this.type){
    		case BOOLEAN:
    			return new Boolean(this.boolValue).compareTo(other.boolValue);
    			
    		case INTEGER:
    			return new Integer(this.intValue).compareTo(other.intValue);

    		case FLOAT:
    			return new Double(this.floatValue).compareTo(other.floatValue);
    			
//    		case NUMERIC:
//    			return this.numericValue.compareTo(other.numericValue);

    		case STRING:
    			return this.stringValue.compareTo(other.stringValue);
    	}
		throw new UnsupportedOperationException("Not supported for type " + this.type);
    }
    
    
    public String toString(){
    	return this.stringValue;
    }
}
