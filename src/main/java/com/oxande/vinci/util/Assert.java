package com.oxande.vinci.util;

public final class Assert {
	
	private Assert(){
		// The class can NEVER be created.
	}
	
	public static void notNull(Object expr, String name){
		if( expr == null ){
			throw new IllegalArgumentException("Argument '"+name+"' MUST NOT be null.");
		}
	}
	
	public static void isTrue(boolean expr){
		if( !expr ){
			throw new IllegalStateException("We have found an error.");
		}
	}
}
