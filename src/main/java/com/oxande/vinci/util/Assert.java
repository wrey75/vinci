package com.oxande.vinci.util;

import java.util.Objects;

public class Assert {

	Assert() throws InstantiationException {
		throw new InstantiationException("Instances of this type are forbidden.");
	}

	public static void notNull(Object expr, String name) {
		if (expr == null) {
			throw new IllegalArgumentException("Argument '" + name + "' MUST NOT be null.");
		}
	}

	/**
	 * Ensure the variable is not blank.
	 * 
	 * @param var a String to check.
	 * @param name the name of the variable (due to missing reflection capabilities)
	 */
	public static void notBlank(String var, String name) {
		if (var == null || var.trim().length() == 0) {
			throw new IllegalArgumentException("Argument '" + name + "' MUST NOT be a blank string.");
		}
	}
	
	public static void isTrue(boolean expr) {
		if (!expr) {
			throw new IllegalStateException("We have found an error.");
		}
	}
	
	public static void equals(Object a, Object b) {
		if (!Objects.equals(a, b)) {
			throw new IllegalStateException("Objects" + a + " and " + b  + "differs");
		}
	}
}
