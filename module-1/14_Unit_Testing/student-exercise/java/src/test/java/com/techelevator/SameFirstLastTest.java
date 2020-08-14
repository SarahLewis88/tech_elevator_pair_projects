package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

	public SameFirstLast same = new SameFirstLast();

	@Test
	public void firstLastArrayTrue() {
		Assert.assertEquals("longer than 0 AND first and last equal", true, same.isItTheSame(new int[] { 3 }));
		Assert.assertEquals("longer than 0 AND first and last equal", true, same.isItTheSame(new int[] { 17, 32, 1, 28, 47, 17 }));
		Assert.assertEquals("longer than 0 AND first and last equal", true, same.isItTheSame(new int[] { 0, 12, 0 }));
	}
	
	@Test
	public void firstLastArrayFalse() {
		Assert.assertEquals("not longer than 0 OR first and last not equal", false, same.isItTheSame(new int[] { 3, 62, 3, 4 }));
		Assert.assertEquals("not longer than 0 OR first and last not equal", false, same.isItTheSame(new int[] {  }));
		Assert.assertEquals("not longer than 0 OR first and last not equal", false, same.isItTheSame(new int[] { 42, 42, 41 }));
	}
	
}
