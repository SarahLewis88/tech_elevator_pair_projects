package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {
	
	public Lucky13 luck = new Lucky13();
	
	@Test
	public void unlucky() {
		Assert.assertEquals("unlucky", false, luck.getLucky(new int[] { 0, 1, 6 }));
		Assert.assertEquals("unlucky", false, luck.getLucky(new int[] { 2, 7, 3 }));
		Assert.assertEquals("unlucky", false, luck.getLucky(new int[] { 1, 1, 1 }));
	}
	@Test
	public void verylucky() {
		Assert.assertEquals("lucky", true, luck.getLucky(new int[] { 0, 4, 6 }));
		Assert.assertEquals("lucky", true, luck.getLucky(new int[] { 7, 2, 9 }));
		Assert.assertEquals("lucky", true, luck.getLucky(new int[] { 2, 7, 0 }));
	}
}
