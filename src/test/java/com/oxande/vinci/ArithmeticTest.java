package com.oxande.vinci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmeticTest extends AbstractRunner {



    @Test
    public void addTest() throws Exception {
        check( "10", basicRun("println 4 + 6 ;"));
        check( "-4", basicRun("println 4 + -8;"));
        check( "-58", basicRun("println -50 + -8;"));
    }

    @Test
    public void subtractTest() throws Exception {
        check( "-2", basicRun("println 4 - 6 ;"));
        check( "2.1", basicRun("println 3.2 - 1.1;"));
    }

    @Test
    public void multiplyTest() throws Exception {
        check( "42", basicRun("println 6 * 7 ;"));
        check( "1.25", basicRun("println 0.125 * 10.0 ;"));
        check( "1.0", basicRun("println 0.1 * 10 ;"));
        check( "35.875", basicRun("println 5.125 * 7 ;"));
    }
    
    @Test
    public void divideTest() throws Exception {
        check( "0.5", basicRun("println 1 /2;"));
        check( "5.5", basicRun("println 5.5 / 1;"));
        check( "0.25", basicRun("println 2 / 8;"));
    }
    
    @Test
    public void parenthesisTest() throws Exception {
        check( "36", basicRun("println ( 3 + 1 ) *9; "));
        check( "-12.375", basicRun("println ( 3.125 + 1 ) * -3; "));
    }
}
