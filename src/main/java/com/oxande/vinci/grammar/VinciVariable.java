package com.oxande.vinci.grammar;

/**
 * Definition of a variable.
 * 
 * @author wrey75
 *
 */
public class VinciVariable {
	private String name;
	private VinciClass type;
	
//	public VinciVariable(String name){
//		this.name = name;
//	}

	public VinciVariable(String name, VinciClass type){
		this.name = name;
		this.type = type;
	}
	
	public String getName(){
		return name;
	}
	
	public VinciClass getType(){
		return type;
	}
	
	public void setType(VinciClass type){
		this.type = type;
	}
}
