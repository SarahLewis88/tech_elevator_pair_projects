package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {
	
	public StringBits bits = new StringBits();

	@Test
	public void alternateStrings() {
		Assert.assertEquals("Alturnating String", new String ("Cbr"), bits.getBits(new String ("Cyborg")));
		Assert.assertEquals("Alturnating String", new String ("Coi"), bits.getBits(new String ("Cookie")));
		Assert.assertEquals("Alturnating String", new String ("Ccu"), bits.getBits(new String ("Cactus")));
		Assert.assertEquals("Alturnating String", new String ("Croat"), bits.getBits(new String ("Cormorant")));
	}
	
}
