package com.oxande.vinci.vm;

import java.math.BigDecimal;

import com.oxande.vinci.grammar.VinciClass;
import com.oxande.vinci.util.Assert;

public class VinciVariable {
    private String stringValue;
    private boolean boolValue;
    private BigDecimal numericValue;
    VinciClass type;

    private VinciVariable(VinciClass type){
    	this.type = type;
    }
    
    public static VinciVariable fromFloat(double v){
    	VinciVariable self = new VinciVariable(VinciClass.FLOAT);
        self.numericValue = new BigDecimal(v);
        self.stringValue = Double.toString(v);
        return self;
    }

    public static VinciVariable fromInteger(int v){
    	VinciVariable self = new VinciVariable(VinciClass.INTEGER);
        self.numericValue = new BigDecimal(v);
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
        if( this.type != VinciClass.FLOAT && this.type != VinciClass.INTEGER ){
            throw new IllegalStateException("Neither a FLOAT nor a INT value.");
        }
        return numericValue.doubleValue();
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
        return numericValue.intValue();
    }
    
//    public VinciVariable(boolean b){
//        this.type = VinciClass.BOOLEAN;
//        this.boolValue = b;
//        this.stringValue = Boolean.toString(b);
//    }
    
    
    public VinciVariable add(VinciVariable other){
    	Assert.notNull(other, "other");
    	if( this.type != other.type ){
    		throw new UnsupportedOperationException("Trying add between " + this.type + " and " + other.type + " (expected the same types).");
    	}
    	switch(this.type){
    		case INTEGER: {
    			int sum = this.intValue() + other.intValue();
    			return fromInteger(sum);
    		}
    		case FLOAT: {
    			double sum = this.doubleValue() + other.doubleValue();
    			return fromFloat(sum);
    		}
    		case NUMERIC:
    			VinciVariable var = new VinciVariable(VinciClass.NUMERIC);
    			var.numericValue = this.numericValue.add(other.numericValue);
    			return var;

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
    		case NUMERIC:
    			VinciVariable var = new VinciVariable(VinciClass.NUMERIC);
    			var.numericValue = this.numericValue.multiply(other.numericValue);
    			return var;

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
    		case FLOAT:
    			double results = this.doubleValue() / other.doubleValue();
    			return fromFloat(results);
    			
    		case NUMERIC:
    			VinciVariable var = new VinciVariable(VinciClass.NUMERIC);
    			var.numericValue = this.numericValue.divide(other.numericValue);
    			return var;
    	}
		throw new UnsupportedOperationException("Division is not supported for type " + this.type);
    }
    
    
    /**
     * Compare 2 values and returns a boolean for the comparison. 
     * 
     * @param other another VinciVariable.
     */
    public boolean equalsTo( VinciVariable other ){
    	Assert.notNull(other, "other");
    	if( this.type != other.type ){
    		throw new UnsupportedOperationException("Trying compare between " + this.type + " and " + other.type + " (expected the same types).");
    	}
    	switch(this.type){
    		case BOOLEAN:
    		case INTEGER:
    		// case INT64:
    		case FLOAT:
    		case NUMERIC:
    			return this.numericValue.equals(other.numericValue);

    	}
		throw new UnsupportedOperationException("Not supported for type " + this.type);
    }
    
    public String toString(){
    	return this.stringValue;
    }
}
