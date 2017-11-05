package com.oxande.vinci.util;

public final class Assert {
	public static void notNull(Object expr, String name){
		if( expr == null ){
			throw new IllegalArgumentException("Argument '"+name+"' MUST NOT be null.");
		}
	}
}
