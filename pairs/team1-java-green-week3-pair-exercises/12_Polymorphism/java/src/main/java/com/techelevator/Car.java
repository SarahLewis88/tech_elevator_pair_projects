package com.techelevator;

public class Car implements Vehicle {

	private boolean hasTrailer;

	public Car (boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}

	@Override
	public String getType() {
		if (hasTrailer) {
			return "Car (with trailer)";
		}
		return "Car";
	}

	@Override
	public double calculateToll(int distance) {
		if (hasTrailer) {
			return ((double)distance * 0.020) + 1.00;
		}
		return ((double)distance * 0.020);
	}
	
}
