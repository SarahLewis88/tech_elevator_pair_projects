package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {
	
	public MaxEnd3 max = new MaxEnd3();
	
	@Test
	public void maxArray() {
		Assert.assertArrayEquals("higest numbers", new int[] { 3, 3, 3 }, max.makeArray(new int[] { 3, -14, 0 }));
		Assert.assertArrayEquals("higest numbers", new int[] { 21, 21, 21 }, max.makeArray(new int[] { 17, 2, 21 }));
		Assert.assertArrayEquals("higest numbers", new int[] { 6, 6, 6 }, max.makeArray(new int[] { 0, 1, 6 }));
	}
	
}

