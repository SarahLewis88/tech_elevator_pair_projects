package com.techelevator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calc;

	@BeforeClass
	public static void setUp() {
		System.out.println("I am run at class startup");
		
	}
	
	@Before
	public void runBeforeEachTest() {
		System.out.println("runBeforeEachTest");
		calc = new Calculator();
	}
	
	@Test
	public void testCalculatorInitialization() {
		Assert.assertNotNull(calc);
	}
	
	@Test
	public void testSimpleIntegerAdd() {
		System.out.println("testSimpleIntegerAdd");
		
		//Arrange
		//Act
		
		//Assert
		Assert.assertEquals(12, calc.add(7, 5));
		Assert.assertEquals(12, calc.add(5, 7));
		Assert.assertEquals(-1, calc.add(-1, 0));
		Assert.assertEquals(-2, calc.add(-1,-1));
		
	}
	
	@Test
	public void testFizzBuzz3() {
		System.out.println("testFizzBuzz3");
		
		//Arrange
		//Act
		Assert.assertEquals("Testing for 3", "fizz", calc.fizzBuzz(3));
		Assert.assertEquals("Testing for 3", "fizz", calc.fizzBuzz(9));
		Assert.assertEquals("Testing for 3", "fizz", calc.fizzBuzz(33));
		//Assert
		
	}
	
	@Test
	public void testFizzBuzz5() {
		System.out.println("testFizzBuzz5");
		
		//Arrange
		//Act
		Assert.assertEquals("Testing for 5", "buzz", calc.fizzBuzz(5));
		Assert.assertEquals("Testing for 5", "buzz", calc.fizzBuzz(10));
		Assert.assertEquals("Testing for 5", "buzz", calc.fizzBuzz(20));
		//Assert
		
	}	
	
	@Test
	public void testFizzBuzz3and5() {
		System.out.println("testFizzBuzz3and5");
		
		//Arrange
		//Act
		Assert.assertEquals("Testing for 3 and 5", "fizzbuzz", calc.fizzBuzz(15));
		Assert.assertEquals("Testing for 3 and 5", "fizzbuzz", calc.fizzBuzz(30));
		Assert.assertEquals("Testing for 3 and 5", "fizzbuzz", calc.fizzBuzz(45));
		//Assert
		
	}	
	
	
	@Test
	public void testNotDivisibleBy3and5() {
		System.out.println("testNotDivisibleBy3and5");
		
		//Arrange
		//Act
		Assert.assertEquals("!Testing for 3 and 5", "2", calc.fizzBuzz(2));
		Assert.assertEquals("!Testing for 3 and 5", "23", calc.fizzBuzz(23));
		Assert.assertEquals("!Testing for 3 and 5", "44", calc.fizzBuzz(44));
		Assert.assertEquals("!Testing for 3 and 5", "-4", calc.fizzBuzz(-4));
		//Assert
		
	}	
	
	@Test
	public void testisALessThanB() {
		System.out.println("testisALessThanB");
		
		//Arrange
		//Act
		Assert.assertTrue("Is A less Than B", calc.isALessThanB(1, 2));
		Assert.assertFalse("Is A less Than B", calc.isALessThanB(7, 1));

		//Assert
		
	}	
	
	
	@Test
	public void testReturnNull() {
		System.out.println("testReturnNull");
		
		//Arrange
		//Act
		//Assert
		
	}
	
	@After
	public void runAfterEachTest() {
		System.out.println("runAfterEachTest");
	}
	
	@AfterClass
	public static void runAfterClass() {
		System.out.println("I am run at the end");
	}
	
	
	
	
}
