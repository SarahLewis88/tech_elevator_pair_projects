package com.techelevator.noisy;

public class Chainsaw implements INoise {
	

	
	public void cut() {
		
		System.out.println("cutting....");
		
	}

	@Override
	public String makeNoise() {
		return "Loud really noise";
	}

	@Override
	public void printName(String name) {
		System.out.println( "I am a " + name );
		
	}

}
