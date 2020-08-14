package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {
	
	public WordCount count = new WordCount();
	
	@Test
	public void chickaTest() {
		
		String[] chickaString = new String[] {"Chicka", "Chicka", "Boom", "Boom"};
		
		Map<String, Integer> chickaMap = new HashMap<>();
		chickaMap.put("Chicka", 2);
		chickaMap.put("Boom", 2);
		
		Assert.assertEquals(chickaMap, count.getCount(chickaString));
	}
	
	@Test
	public void twinkleTest() {
		
		String[] twinkleString = new String[] {"Twinkle", "Twinkle", "Little", "Star"};
		
		Map<String, Integer> twinkleMap = new HashMap<>();
		twinkleMap.put("Twinkle", 2);
		twinkleMap.put("Little", 1);
		twinkleMap.put("Star", 1);

		Assert.assertEquals(twinkleMap, count.getCount(twinkleString));
	}

}
