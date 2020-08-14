package com.techelevator.dog;

public class Dog {

	private boolean isSleeping; // attribute
	
	public Dog() {
		this.isSleeping = false; // constructor
	}
	
	public boolean isSleeping() { // boolean
		return isSleeping;
	}

	public String makeSound() { // make sound method
		if (isSleeping == true) {
			return "Zzzzz...";
		}
		else if (isSleeping == false) {
			return "Woof!";
		}
		return null;
	}
	
	public void sleep() { // sleep method
		isSleeping = true;
	}
	
	public void wakeUp() { // wake up method
		isSleeping = false;
	}


}
