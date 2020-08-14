package com.techelevator.noisy;

public class Guitar implements INoise{
	
	
	public void shred() {
		System.out.println("That's awesome!");
	}

	@Override
	public String makeNoise() {

		return "That's aweful!";
	}

	@Override
	public void printName(String name) {
		System.out.println("I am a " + name);
		
	}

}
