package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {
	
	private Less20 less = new Less20();

	@Test
	public void testLess20True() {
		System.out.println("testing for Less20 - true");
		Assert.assertEquals("testing for true", true, less.isLessThanMultipleOf20(38));
		Assert.assertEquals("testing for true", true, less.isLessThanMultipleOf20(2019));
		Assert.assertEquals("testing for true", true, less.isLessThanMultipleOf20(78));
	}
	
	@Test
	public void testLess20False() {
		System.out.println("testing for Less20 - false");
		Assert.assertEquals("testing for false", false, less.isLessThanMultipleOf20(42));
		Assert.assertEquals("testing for false", false, less.isLessThanMultipleOf20(0));
		Assert.assertEquals("testing for false", false, less.isLessThanMultipleOf20(20));
	}

}
