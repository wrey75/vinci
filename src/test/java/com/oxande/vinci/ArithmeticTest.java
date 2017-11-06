package com.oxande.vinci;

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
        
        // Due to rounding issue, use native value
        check( String.valueOf(5.1*7.0), basicRun("println 5.1 * 7;"));
    }
    
    @Test
    public void integerDivideTest() throws Exception {
    	// Division with 2 integers gives back an integer (same as JAVA and C).
        check( "0", basicRun("println 1 /2;"));
        check( "1", basicRun("println 9 / 8;"));
    }
    
    @Test
    public void floatDivideTest() throws Exception {
        check( "5.5", basicRun("println 5.5 / 1;"));
        check( "0.5", basicRun("println 1.0 /2;"));
        check( "1.125", basicRun("println 9 / 8.0;"));
    }
    
    @Test
    public void parenthesisTest() throws Exception {
        check( "36", basicRun("println ( 3 + 1 ) *9; "));
        check( "-12.375", basicRun("println ( 3.125 + 1 ) * -3; "));
    }
}
