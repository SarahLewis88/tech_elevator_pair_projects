package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ScratchPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> stateCodes = new TreeMap<String, String> ();
		
		stateCodes.put("OH", "Ohio");
		stateCodes.put("TX", "Texas");
		stateCodes.put("FL", "Florida");
		stateCodes.put("NY", "New York");
		
		String myState = stateCodes.get("OH");
		System.out.println(myState);
		
		String newState = stateCodes.get("AK");
		System.out.println(newState);
		if (newState == null) {
			System.out.println("not found!");
		}
		
		
		if (stateCodes.containsKey("TX")) {
			System.out.println("found!");
		}
		
		
		
		String newYork = stateCodes.get("NY");
		
		Set<String> keys = stateCodes.keySet();
		for (String key : keys ) {
			//System.out.println(key);
			
			//do something
			//System.out.println ("Hello " + stateCodes.get(key)   );
			
			if (stateCodes.get(key).equals("New York")) {
				System.out.println("We found NY");
			}
			
		}
		
		
		
		Map<String, Integer> filingStatus = new HashMap<String, Integer>();
		
		filingStatus.put("OH", new Integer(1000));
		filingStatus.put("PA", 1000);
		
	     Map<String, Bird> birds = new HashMap<String, Bird>();
	     
	     birds.put("Sesame Street", new Bird());
	     
		
	     Map<String, int[]> scores = new HashMap<String, int[]>();
	     
	     int[] student1_scores = new int[] {3,4,5,6,7,8};
	     int[] student2_scores = new int[] {1,5,5,9,7,8,8,9,0,0};
	     
	     scores.put("123", student1_scores);
	     scores.put("456", student2_scores);
	     
	     
	     int[] tempArray = scores.get("123");
	     int x = tempArray[0];
	     
	     
	     
	     
	    Set<String> mySet = new HashSet<String>();
	    mySet.add("A");
	    mySet.add("BBNNBN");
	    
	    
	    //mySet.
	     
	     
	     

	}

}
