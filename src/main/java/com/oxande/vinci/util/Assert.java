package com.oxande.vinci.util;

public class Assert {

	Assert() throws InstantiationException {
		throw new InstantiationException("Instances of this type are forbidden.");
	}

	public static void notNull(Object expr, String name) {
		if (expr == null) {
			throw new IllegalArgumentException("Argument '" + name + "' MUST NOT be null.");
		}
	}

	public static void isTrue(boolean expr) {
		if (!expr) {
			throw new IllegalStateException("We have found an error.");
		}
	}
}
