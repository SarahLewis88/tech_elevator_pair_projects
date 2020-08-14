package com.techelevator.noisy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NoiseApp {

	public static void main(String[] args) {

		INoise guitar = new Guitar();
		
		
       Chainsaw chainsaw = new Chainsaw();
	    //((Chainsaw)chainsaw).
		
		
		List<INoise> noisyObjects = new ArrayList<INoise>();
		noisyObjects.add(guitar);
		noisyObjects.add(chainsaw);
		
		for (INoise noise : noisyObjects) {
			if (noise instanceof Guitar) {
				
			}
			System.out.println(noise.makeNoise());
		}
		

		Map<String, String> normalMap = new TreeMap<String, String> ();
		
	//Map<String, String> stevesMap = new SteveMap<String, String> ();
		
		
		
		

	}
	

}
