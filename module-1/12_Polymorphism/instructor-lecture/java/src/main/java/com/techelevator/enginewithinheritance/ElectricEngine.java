package com.techelevator.enginewithinheritance;

public class ElectricEngine extends Engine {
	
	private boolean isPluggedIN;
	
	
	public boolean start() {
		// unplug from wall
		isPluggedIN = false;
		
		// then start
		return super.start();
	
	}
	
	public boolean shutOff() {
		//plug back into a wall
		isPluggedIN = true;
		return super.shutOff();

	}

}
