package com.oxande.vinci;

import org.junit.Test;

public class ConditionalExpressionTest extends AbstractRunner {


    @Test
    public void equalityTest() throws Exception {
        check( "false", basicRun("println 4 == 6;"));
        check( "true", basicRun("println 4 == 4;"));
        check( "true", basicRun("println 4 == 4.0;"));
        check( "true", basicRun("println 4.0 == 4;"));
        check( "false", basicRun("println 4.0 != 4;"));
        check( "true", basicRun("println 5 == 5.0;"));
    }
    
    @Test
    public void compareTest() throws Exception {
        check( "false", basicRun("println 4 > 6;"));
        check( "true", basicRun("println 4 >= 4;"));
        check( "true", basicRun("println 4 >= 4.0;"));
        check( "true", basicRun("println 4.0 <= 4;"));
        check( "false", basicRun("println 4.0 < 4;"));
        check( "true", basicRun("println 5 < 6.0;"));
        check( "true", basicRun("println 6 > 5.0;"));
    }
    
    @Test
    public void compareString() throws Exception {
        check( "true", basicRun("println \"chat\" < \"chien\";"));
        check( "false", basicRun("println \"chat\" < \"chat\";"));
        check( "false", basicRun("println \"chat\" > \"chat\";"));
        check( "true", basicRun("println \"chat\" == \"chat\";"));
        check( "true", basicRun("println \"chat\" != \"Chat\";"));
    }  
}
