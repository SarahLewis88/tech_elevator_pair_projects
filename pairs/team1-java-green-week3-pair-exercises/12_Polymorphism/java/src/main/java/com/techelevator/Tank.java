package com.techelevator;

public class Tank implements Vehicle{
	
	@Override
	public String getType() {
		return "Tank";
	}

	@Override
	public double calculateToll(int distance) {
		return 0;
	}
	

}
