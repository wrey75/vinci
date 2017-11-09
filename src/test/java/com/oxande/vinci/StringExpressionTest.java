package com.oxande.vinci;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;

public class StringExpressionTest extends AbstractRunner {

    @Test
    public void basicTest() throws Exception {
        check( "hello", basicRun("\"hello\""));
        check( "Hello World!", basicRun("println \"Hello\" \" \" \"World!\";"));
        check( "Hello\tWorld!", basicRun("println \"Hello\\tWorld!\";"));
    }
  
    @Test
    public void concateneTest() throws Exception {
        check( "hello", basicRun("\"hello\""));
        check( "HelloWorld!", basicRun("\"Hello\" + \"World!\";"));
        check( "=====", basicRun("\"=\" * 5;"));
    }

    
    @Test(expected=ParseCancellationException.class)
    public void notPossitleTest() throws Exception {
        check( "hello", basicRun("\"hello\" - \"\\n\""));
    }
    
}
