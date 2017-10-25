package com.oxande.vinci.grammar;

public enum OpCode {
    CONSTANT, // Load a constant. Note the type must be defined.
    CAST_INT_TO_FLOAT,
    CAST_FLOAT_TO_INT,
    MULTIPLY,
    DIVIDE,
    ADD,
    SUBSTRACT, // Not sure when have to use
    NOP, // No operation
    BOOLEAN_OR,
    BOOLEAN_AND,
    BINARY_OR,
    BINARY_XOR,
    PRINTLN, // To print something

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
