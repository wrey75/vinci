package com.oxande.vinci.vm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oxande.vinci.grammar.GrammarTree;
import com.oxande.vinci.grammar.OpCode;
import com.oxande.vinci.util.Assert;

/**
 * The virtual machine state. Currently not used.
 * 
 * @author wrey75
 *
 */
public class VinciState {

	 List<Object> stack = new ArrayList<>();
     Map<String, VinciValue> variables = new HashMap<>();

     public VinciValue getVariable(GrammarTree varDesc){
    	 Assert.notNull(varDesc, "varDesc");
    	 Assert.isTrue(varDesc.getOpCode().equals(OpCode.REFERENCE) );
		 String varName = varDesc.getValue().toString();
		 VinciValue v = variables.get(varName);
		 if( v == null ){
			 v = new VinciValue(varDesc.getType());
			 Assert.notNull(v, "v");
			 v.setName(varName);
			 variables.put(varName, v);
		 }
    	 return v;
     }
     
     public VinciValue getVariable(String name){
    	 VinciValue v = variables.get(name);
    	 Assert.notNull(v, "v");
    	 return v;
     }
     
     /**
      * Put the value in the variable name and returns the
      * variable (which contains the same value than <i>value</i>).
      * 
      * @param varName the variable name
      * @param value the new value to set
      * @return the variable.
      */
     public VinciValue putValue(String varName, VinciValue value){
    	 Assert.notBlank(varName, "varName");
    	 VinciValue var = getVariable(varName);
    	 Assert.equals(value.type, var.type);
    	 var.copyValue(value);
    	 return var;
     }
}
