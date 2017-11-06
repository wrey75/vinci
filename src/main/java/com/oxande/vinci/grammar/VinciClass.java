package com.oxande.vinci.grammar;

public enum VinciClass {
	// The following order MUST be followed (from little one to big ones)
	BOOLEAN, // a boolean (false = 0, true = 1 or, != 0 when explicit conversion)
    INTEGER, // 32 bits
    // INT64, // 64 bits
    FLOAT, // double
//    NUMERIC, // Big Decimals
    
    VOID, // No type
    OBJECT, // Object
    STRING, // A String
}

