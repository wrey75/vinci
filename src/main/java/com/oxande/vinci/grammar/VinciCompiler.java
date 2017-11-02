package com.oxande.vinci.grammar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import com.oxande.vinci.antlr4.VinciLexer;
import com.oxande.vinci.antlr4.VinciParser;
import com.oxande.vinci.lexer.PreprocessorReader;
import com.oxande.vinci.compiler.VinciCode;

/**
 * Interpret the source (basically, the source can be anything).
 *
 */
public class VinciCompiler {

    PreprocessorReader reader = null;

    public VinciCompiler(File f) throws IOException  {
        this( new FileInputStream(f) );
    }

    public VinciCompiler(InputStream in) throws IOException {
        reader = new PreprocessorReader(in);
    }

    public GrammarTree compile() throws IOException {
        CharStream charStream = CharStreams.fromReader(reader);
        VinciLexer lexer = new VinciLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        VinciParser parser = new VinciParser(tokens);

        GrammarCompiler programListener = new GrammarCompiler();
        GrammarTree tree = programListener.compileProgram(parser);
        return tree;
    }
}
