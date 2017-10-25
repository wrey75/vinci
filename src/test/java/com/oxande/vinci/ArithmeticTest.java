package com.oxande.vinci;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticTest extends AbstractRunner {

    private void check( String expected, String actual ){
        assertEquals( expected.trim(), actual.trim() );
    }

    @Test
    public void addTest() throws Exception {
        check( "10", basicRun("println 4 + 6 "));
        check( "-4", basicRun("println 4 + -8"));
        check( "-58", basicRun("println -50 + -8"));
    }

    @Test
    public void subtractTest() throws Exception {
        check( "-2", basicRun("println 4 - 6 "));
    }

    @Test
    public void multiplyTest() throws Exception {
        check( "42", basicRun("println 6 * 7 "));
    }

    @Test
    public void parenthesisTest() throws Exception {
        check( "36", basicRun("println ( 3 + 1 ) *9 "));
    }
}
