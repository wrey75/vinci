package com.oxande.vinci;

import org.junit.Test;

public class StringExpressionTest extends AbstractRunner {


    @Test
    public void basicTest() throws Exception {
        check( "hello", basicRun("println \"hello\";"));
        check( "Hello World!", basicRun("println \"Hello\" \" \" \"World!\";"));
    }
  
    
    
}
