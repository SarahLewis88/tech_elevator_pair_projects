package com.techelevator;

public class Truck implements Vehicle{
	
	private int numberOfAxles;
	
	public Truck (int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}
	
	public int getNumberOfAxles() {
		return numberOfAxles;
	}

	@Override
	public String getType() {
		if (numberOfAxles == 4) {
			return "Truck (4 axels)";
		}
		else if (numberOfAxles == 6) {
			return "Truck (6 axels)";
		}
		else if (numberOfAxles >= 8) {
			return "Truck (8 axels)";
		}
		return null;
	}

	@Override
	public double calculateToll(int distance) {
		if (numberOfAxles == 4) {
			return ((double) distance * 0.040);
		}
		else if (numberOfAxles == 6) {
			return ((double) distance * 0.045);
		}
		else if (numberOfAxles >= 8) {
			return ((double) distance * 0.048);
		}
		return 0;
	}

}
