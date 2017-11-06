package com.oxande.vinci.util;

import org.junit.Test;

/**
 * The class extends the {@link Assert} class to improve test coverage. Not
 * very serious, but doesn't hurt.
 * 
 */
public class AssertTest {

	@Test(expected=InstantiationException.class)
	public void newClassTest() throws InstantiationException {
		new Assert();
	}
	
	@Test(expected=IllegalStateException.class)
	public void isTrueTest1(){
		Assert.isTrue(false);
	}
	
	@Test
	public void isTrueTest2(){
		Assert.isTrue(1 == 1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void notNullTest1(){
		Assert.notNull(null, "test");
	}
	
	@Test
	public void notNullTest2(){
		Assert.notNull("VALID", "string");
	}
}
