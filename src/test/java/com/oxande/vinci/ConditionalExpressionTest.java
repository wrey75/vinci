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
}
