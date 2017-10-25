package com.oxande.vinci;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import com.oxande.vinci.grammar.GrammarTree;
import com.oxande.vinci.grammar.VinciCompiler;
import com.oxande.vinci.compiler.VinciCode;
import com.oxande.vinci.vm.VinciVirtualMachine;

public class Vinci {

    static public int runCode( CharSequence sourceCode ) throws IOException {
        return runCode(sourceCode, null, null, null);
    }

    /**
     * Mainly for testing purposes.
     *
     * @param sourceCode the source code (to be compiled)
     * @param in the input stream, use {@link System#in} if null givem
     * @param out the output stream, use {@link System#out} if null givem
     * @param err the error stream, use {@link System#err} if null givem
     * @return the exit code.
     * @throws IOException
     */
    static public int runCode( CharSequence sourceCode, InputStream in, OutputStream out, OutputStream err ) throws IOException {
        byte[] buf = sourceCode.toString().getBytes(StandardCharsets.UTF_8.name());
        ByteArrayInputStream in_code = new ByteArrayInputStream(buf);
        VinciCompiler compiler = new VinciCompiler(in_code);
        GrammarTree code = compiler.compile();
        VinciVirtualMachine vvm = new VinciVirtualMachine();
        vvm.load(code);
        if( out != null ) vvm.setOutput( out );
        if( err != null ) vvm.setError( out );
        if( in != null ) vvm.setInput( in );
        vvm.run();
        return vvm.getExitCode();
    }

    static public void main(String args[]) throws IOException {
        int i = 0;
        while( i < args.length ){
            if( args[i].equals("--") ){
                // Run the input stream
                run(System.in);
            }
            else if( args[i].charAt(0) == '-' && args[i].length() > 1 ){
                if( args[i].charAt(1) == '-'){
                    switch( args[i++] ){
                    case "--version" :
                        showVersion();
                        break;
                    }
                }
                else {
                    switch( args[i].charAt(1) ){
                    case 'V':
                        showVersion();
                        break;
                    }
                }
            }
            else {
                File fic = new File(args[i++]);
                run( new FileInputStream(fic) );
            }
        }
    }

    /**
     * Compile and run the code.
     *
     * @param stream the code to compile
     * @throws IOException if an I/O error occurred.
     */
    static protected void run( InputStream stream ) throws IOException {
        VinciCompiler code = new VinciCompiler(stream);
        GrammarTree vcode = code.compile();
        VinciVirtualMachine vvm = new VinciVirtualMachine();
        vvm.load(vcode);
        vvm.run();
        int retCode = vvm.getExitCode();
        System.exit(retCode);
    }

    static protected void showVersion(){
        System.out.println("Version 0.10-alpha");
    }
}
