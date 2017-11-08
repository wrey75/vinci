package com.oxande.vinci;

import org.junit.Test;

public class AssignExpressionTest extends AbstractRunner {

    @Test
    public void basicTest() throws Exception {
        check( "27", basicRun("a = 3; a * 9"));
        check( "3", basicRun("a = 3"));
        check( "3.1415926", basicRun("flotant = 3.1415926"));
    }
  
    
    
}
