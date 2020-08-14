package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

	public FrontTimes gibberish = new FrontTimes();

	@Test
	public void frontTimesStringGenerator() {
	
		Assert.assertEquals("testing PooPoo", "PooPoo", gibberish.generateString("Pool", 2));
		Assert.assertEquals("testing IIIIIIIIIIIIIIIIIIIIIIIIIII", "IIIIIIIIIIIIIIIIIIIIIIIIIII", gibberish.generateString("I", 27));
		Assert.assertEquals("testing QueQueQueQueQue", "QueQueQueQueQue", gibberish.generateString("Quetzalcoatlus", 5));
		Assert.assertEquals("testing Obl", "Obl", gibberish.generateString("Oblique", 1));
	}

}
