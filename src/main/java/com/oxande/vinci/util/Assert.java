package com.oxande.vinci.util;

public final class Assert {
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
