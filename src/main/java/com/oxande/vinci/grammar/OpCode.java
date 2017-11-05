package com.oxande.vinci.grammar;

public enum OpCode {
    CONSTANT, // Load a constant. Note the type must be defined.
    CAST_INT_TO_FLOAT,
    CAST_FLOAT_TO_INT,
    NOP, // No operation
    PRINTLN, // To print something

    // Operators
    MULTIPLY,
    DIVIDE,
    ADD,
    // SUBSTRACT is not used, we simply multiply the value by -1 
    
    // Binary op
    BINARY_OR,
    BINARY_XOR,
    BINARY_AND,
    
    // Booleans
    BOOLEAN_OR,
    BOOLEAN_AND,
    BOOLEAN_NOT,
    EQUALS,
    BELOW,
    BELOW_OR_EQUALS,
    
    
    // Storage
    STORE,
    LOAD,
    STORE_ARRAY, // Array (with index
    LOAD_ARRAY, // Array (with index
    STORE_KEY, // Direct access to maps
    LOAD_KEY, // Direct access to maps

    // Blocks
    BLOCK_OF_STATEMENTS, // A simple list of several statements to follow one by one

    // Conditional parts
}
