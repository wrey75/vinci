package com.oxande.vinci.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test of the VinciUtils library
 */
public class VinciUtilsTest {

    @Test public void toJavaTest() {
        Assert.assertEquals("\"zozo\"", VinciUtils.toJava("zozo"));
        Assert.assertEquals("\"It's a \\t tabulation.\"", VinciUtils.toJava("It's a \t tabulation."));
        Assert.assertEquals("\"le th\\u00e9 \\u00e0 la coriandre\"", VinciUtils.toJava("le thé à la coriandre"));
        Assert.assertEquals("\"Victor \\net Zola\"", VinciUtils.toJava("Victor \net Zola"));
    }

    @Test public void quoteTest() {
        Assert.assertEquals("\"zozo\"", VinciUtils.toJava("zozo"));
        Assert.assertEquals("\"le thé à la coriandre\"", VinciUtils.quote("le thé à la coriandre"));
    }
}
