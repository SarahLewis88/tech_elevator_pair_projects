package com.techelevator;

import org.junit.*;

public class KataFizzBuzzTest {

	private KataFizzBuzz kata;
	
	@Before
	public void setUp() {
		kata = new KataFizzBuzz();
	}
	
	@Test
	public void testNotNull() {
		Assert.assertNotNull(kata);
	}
	
	@Test
	public void testDivisibleByThreeAndFiveOrContainsThreeAndFive() {
		Assert.assertEquals("number is divisible by three and five or contains three and five", "FizzBuzz", kata.methodFizzBuzz(53));
		Assert.assertEquals("number is divisible by three and five or contains three and five", "FizzBuzz", kata.methodFizzBuzz(35));
		Assert.assertEquals("number is divisible by three and five or contains three and five", "FizzBuzz", kata.methodFizzBuzz(90));
	}
	
	@Test
	public void testDivisibleThreeOrContainsThree() {
		Assert.assertEquals("number is divisible by three or contains three", "Fizz", kata.methodFizzBuzz(3));
		Assert.assertEquals("number is divisible by three or contains three", "Fizz", kata.methodFizzBuzz(13));
		Assert.assertEquals("number is divisible by three or contains three", "Fizz", kata.methodFizzBuzz(27));
	}
	
	@Test
	public void testDivisibleFiveOrContainsFive() {
		Assert.assertEquals("number is divisible by five or contains five", "Buzz", kata.methodFizzBuzz(52));
		Assert.assertEquals("number is divisible by five or contains five", "Buzz", kata.methodFizzBuzz(65));
		Assert.assertEquals("number is divisible by five or contains five", "Buzz", kata.methodFizzBuzz(40));
	}
	
	@Test
	public void notDivisibleByThreeOrFiveInsideRange() {
		Assert.assertEquals("number is not divisible by three or five but is in range", "2", kata.methodFizzBuzz(2));
		Assert.assertEquals("number is not divisible by three or five but is in range", "41", kata.methodFizzBuzz(41));
		Assert.assertEquals("number is not divisible by three or five but is in range", "17", kata.methodFizzBuzz(17));
	}
	
	@Test
	public void outsideRange() {
		Assert.assertEquals("number is outside range", "", kata.methodFizzBuzz(107));
		Assert.assertEquals("number is outside range", "", kata.methodFizzBuzz(-3));
		Assert.assertEquals("number is outside range", "", kata.methodFizzBuzz(500));
	}
	
}
