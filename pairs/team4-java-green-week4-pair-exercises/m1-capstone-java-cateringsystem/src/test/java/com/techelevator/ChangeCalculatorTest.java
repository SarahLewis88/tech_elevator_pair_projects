package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.view.ChangeCalculator;

public class ChangeCalculatorTest {
	
	private ChangeCalculator changeCalculator;
	
	@Before
	public void preTest() {
		changeCalculator = new ChangeCalculator();
	}

	@Test
	public void notNull() {
		Assert.assertNotNull(changeCalculator);
	}
	
	@Test
	public void stringTest() {
		Assert.assertEquals("Twenties: " + 2 + "\nTens: " + 0 + "\nFives: " + 0 + "\nOnes: " + 3 + "\nQuarters: " + 0 + "\nDimes: " + 1 + "\nNickels: " + 0 + "\nPennies: " + 2, changeCalculator.changeCalculator(43.12));
	}
	
	@Test
	public void stringTestJustTwenty() {
		Assert.assertEquals("Twenties: " + 1 + "\nTens: " + 0 + "\nFives: " + 0 + "\nOnes: " + 0 + "\nQuarters: " + 0 + "\nDimes: " + 0 + "\nNickels: " + 0 + "\nPennies: " + 0, changeCalculator.changeCalculator(20.00));
	}
	
	@Test
	public void stringTestAllZeros() {
		Assert.assertEquals("Twenties: " + 0 + "\nTens: " + 0 + "\nFives: " + 0 + "\nOnes: " + 0 + "\nQuarters: " + 0 + "\nDimes: " + 0 + "\nNickels: " + 0 + "\nPennies: " + 0, changeCalculator.changeCalculator(0.0));
	}
	
	@Test
	public void stringTestLargeNumber() {
		Assert.assertEquals("Twenties: " + 172 + "\nTens: " + 1 + "\nFives: " + 1 + "\nOnes: " + 3 + "\nQuarters: " + 2 + "\nDimes: " + 0 + "\nNickels: " + 1 + "\nPennies: " + 4, changeCalculator.changeCalculator(3458.59));
	}
}
