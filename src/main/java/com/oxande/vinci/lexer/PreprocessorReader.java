package com.oxande.vinci.lexer;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * The preprocessor reader has been developed to read the code line by
 * line from a source and save it back to another reader. basically, it it
 * a pipeline.
 *
 * <p>
 *     Note the code reader is skipping all comments and extending
 *     the macros.
 * </p>
 *
 */
public class PreprocessorReader extends Reader {

    private String lastLine;
    private String interpreter;
    private String fileName;
    private Map<String,String> macros;
    private StringBuilder buffer = new StringBuilder();
    private int currentLine = 0;

    // Used to track macros in lines...
    private Pattern macroPattern;

    private LineNumberReader lineReader = null;

    public PreprocessorReader(InputStream stream) throws IOException {
        this(stream, StandardCharsets.UTF_8.name());
    }

    public PreprocessorReader(InputStream stream, String charset) throws IOException {
        Reader r = new InputStreamReader(stream, charset);
        initFromReader(r);
    }

    /**
     * The code reader needs a reader.
     *
     * @param reader the {@link Reader} to use.
     */
    public PreprocessorReader(Reader reader) {
        initFromReader(reader);
    }

    protected void initFromReader(Reader reader) {
        lineReader = new LineNumberReader(reader);
        lastLine = null;
        this.macros = new HashMap<>();
        macroPattern = Pattern.compile("([A-Za-z_][A-Za-z0-9_]*)");
    }

    /**
     * Returns the interpreted if specified at the first line of the file.
     *
     * @return the interpreter.
     */
    public String getInterpreter(){
        return this.interpreter;
    }

    public String getFileName(){
        return fileName;
    }

    private String readFromSource() throws IOException {
        currentLine++;
        String line = lineReader.readLine();
        return line;
    }

    public String readLine() throws IOException {
        boolean code = false;
        while( !code ) {
            String line = readFromSource();
            if (line == null) {
                // End of file reached.
                return null;
            }

            line = line.trim();
            if (line.trim().length() == 0) {
                // Ignore empty line
            } else if (lastLine == null && line.startsWith("#!")) {
                // Simply ignore the interpreter information
                // (only on the first line)
                this.interpreter = line.substring(2);
            } else if (line.charAt(1) == '#') {
                addMacro(line);
            } else {
                this.lastLine = interpret(line);
                code = true;
            }
        }
        return this.lastLine;
    }

    private void addMacro(String line ) throws SyntaxErrorException {
        if( line.length() < 3 || Character.isSpaceChar(line.charAt(2)) ){
            // This is a comment, just ignore.
            return;
        }

        Matcher matcher = macroPattern.matcher(line);
        if( !matcher.matches() ){
            throw new SyntaxErrorException("A macro is expected");
        }

        String cmd = matcher.group(1);
        if( cmd.equals("define") ){
            throw new UnsupportedOperationException("#define not implemented yet.");
        }
        else if( cmd.equals("line") ){
            int lineNumber = NumberUtils.toInt( line.substring(cmd.length()).trim(), 0);
            if( lineNumber < 1 ){
                throw new SyntaxErrorException("#line: bad line number specified.");
            }
            currentLine = lineNumber;
        }
        else if( cmd.equals("file") ){
            String fileName = line.substring(cmd.length()).trim();
            this.fileName = fileName;
        }
        else {
            throw new UnsupportedOperationException("#" + cmd + ": unknown macro.");
        }
    }

    protected String interpret(String in){
        // throw new UnsupportedOperationException("interpret() not implemented");
        return in;
    }

    @Override public int read(char[] cbuf, int off, int len) throws IOException {
        while( buffer.length() < 1 ){
            String line = readLine();
            if( line == null ){
                return -1;
            }
            buffer.append( line + "\n" );
        }

        int adjustedLen = Math.min(len, buffer.length());
        System.arraycopy(buffer.toString().toCharArray(), 0, cbuf, off, adjustedLen);
        buffer.delete(0, adjustedLen);
        return adjustedLen;
    }

    @Override public void close() throws IOException {
        lineReader.close();
    }
}
