package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {
	
	public AnimalGroupName animal = new AnimalGroupName();
	
	@Test
	public void testAnimalName() {
		Assert.assertEquals("animal = group", "Tower", animal.getHerd("Giraffe"));
		Assert.assertEquals("animal = group", "Crash", animal.getHerd("rhino"));
		Assert.assertEquals("animal = group", "Float", animal.getHerd("CROCODILE"));
		Assert.assertEquals("animal = group", "Herd", animal.getHerd("dEER"));
	}
	@Test
	public void unknownAnimals() {
		Assert.assertEquals("animals not found", "unknown", animal.getHerd("Chupacabra"));
	}

}
