package com.oxande.vinci.vm;

import com.oxande.vinci.grammar.VinciClass;
import com.oxande.vinci.util.Assert;
import com.oxande.vinci.util.VinciUtils;

public class VinciValue {
    private String stringValue;
    private boolean boolValue;
    private double floatValue;
    private int intValue;
    VinciClass type;
    private String varName = null;

    public VinciValue(VinciClass type){
    	this.type = type;
    }
    
    /**
     * In case this value is a variable.
     * 
     */
    public String getName(){
    	return varName;
    }
    
    
    public void setName(String name){
    	varName = name;
    }
    
    public void copyValue(VinciValue v){
    	Assert.equals(v.type, this.type);
    	this.stringValue = v.stringValue;
    	this.floatValue = v.floatValue;
    	this.intValue = v.intValue;
    	this.boolValue = v.boolValue;
    }
    
    
    public static VinciValue fromString(CharSequence v){
    	VinciValue self = new VinciValue(VinciClass.STRING);
        self.stringValue = v.toString();
        return self;
    }
    
    public static VinciValue fromFloat(double v){
    	VinciValue self = new VinciValue(VinciClass.FLOAT);
        self.floatValue = v;
        self.stringValue = Double.toString(v);
        return self;
    }

    public static VinciValue fromInteger(int v){
    	VinciValue self = new VinciValue(VinciClass.INTEGER);
        self.intValue = v;
        self.stringValue = Integer.toString(v);
        return self;
    }
    
    public static VinciValue fromBoolean(boolean v){
    	VinciValue self = new VinciValue(VinciClass.BOOLEAN);
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
    
    public VinciValue add(VinciValue other){
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
    		case STRING: {
    			String concat = this.stringValue + other.stringValue;
    			return fromString(concat);
    		}
    	}
		throw new UnsupportedOperationException("Addition is not supported for type " + this.type);
    }

    /**
     * There is something special in the language: you can multiply a {@link VinciClass#STRING}
     * by a {@link VinciClass#INTEGER} and you will obtain the needed string (this is useful for adding some padding).
     * 
     */
    public VinciValue string_multiply(VinciValue other){
		// Multiply a String by an integer.
		Assert.isTrue( this.type.equals(VinciClass.STRING) );
		Assert.isTrue( other.type.equals(VinciClass.INTEGER));
		
		StringBuilder buf = new StringBuilder();
		for(int i = 0; i < other.intValue; i++){
			buf.append(this.stringValue);
		}
		return fromString(buf);
    }
	
    /**
     * Multiply 2 values. 
     * 
     * @param other the multiplier. Must be of the same type than the original (in many cases)
     * @return a new value.
     */
    public VinciValue multiply(VinciValue other){
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
    
    public VinciValue divide(VinciValue other){
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
    
    
    public int compare( VinciValue other ){
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
    
    /**
     * The value expressed as a {@link String}.
     * 
     * @return the value in the form of a {@link String}. Can be null.
     */
    public String value(){
    	return stringValue;
    }
    
    public String toString(){
    	return (this.varName == null ? "_const_" : varName) + " (" + this.type.name().toLowerCase() + ") = " + VinciUtils.quote(this.value());
    }
}
