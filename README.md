
[![Build Status](https://travis-ci.org/wrey75/vinci.svg?branch=master)](https://travis-ci.org/wrey75/vinci)

# vinci

Another C-like language. The Vinci language is like JAVA or C, based on algorithmic
construction. To avoid a long learning, the language is near from the existing ones:
C, JAVA or PHP.

As other languages, Vinci should run on any platform. It uses the ANTLR4 engine for
the grammar which is quite convenient to build a compiler quickly.

## Features

The features to be included are:
 - [ ] Simple to learn (for JAVA developers)
 - [ ] A basic interpreter.
 - [ ] A easy "threading" construction including a protection of the vriables.
 - [ ] A construction for "events" jobs.
 - [ ] An easy path to force developers to write "functional" code.
 - [ ] A native mapping 
 - [ ] A native array usages (basically "List" from JAVA).
 - [ ] Easy write for properties.
 - [ ] Automatic heritage for variable types (due to functional coding).
 - [ ] Null pointer special processing
 - [ ] **Preprocessor (like in "C/C++")** (waouh!)
 - [ ] Assertion included like in C/C++ (*with removing in Release mode*)
 - [ ] Annotations.
 - [ ] Code obfuscation (for compiled version).
 - [ ] Multiple compilation stage (grammar tree for native compilation or direct interpretation through a virtual machine).
 - [ ] Helping the coding of unit tests.
 - [ ] Convention over configuration whenever possible.
 - [ ] Native JSON processing
 - [ ] Garbage collector (or count of references).
  
# Examples

Is there any tutorial or example? Not yet... But, look at the test suite: you have all the capabilities tested.

# For what?

A C/C++/JAVA alternative due to native compilation. The grammar provided has a good level of information to
be compiled quickly for different languages. The main goal is to have a LLVM code generation to have native
code.

 
