package com.oxande.vinci;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;


public abstract class AbstractRunner {

	
	protected void check( String expected, String actual ){
        assertEquals( expected.trim(), actual.trim() );
    }
	
	
    /**
     * A basic test.
     *
     * @param source the code source
     * @return the output.
     * @throws Exception if an
     */
    public String basicRun(String source) throws Exception {
        // ByteArrayInputStream code = new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        int exitCode = Vinci.runCode(source, System.in, out, err );
        assertEquals(0, exitCode); // No error (based on exit code)
        if(err.size() > 0) {
            System.err.println("ERROR STREAM - \n" + err.toString() );
            fail("The error stream was expected to be empty."); // No error (based on error output)
        }
        return out.toString(Charset.defaultCharset().name());
    }
}
