package com.techelevator.enginewithinheritance;

public class Engine {
	
	private int numberOfCylinders;
	private int horsepower;
	private int cubicCentimeters;
	private boolean isStarted;
	
	
	public boolean start() {
		isStarted = true;
		return isStarted;
	}
	
	public boolean shutOff() {
		isStarted = false;
		return true;
	}
	
	public int calculateHorsePower(int numberOfCylinders, int cubicCentimeters) {
		return numberOfCylinders * cubicCentimeters;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public boolean isStarted() {
		return isStarted;
	}
	
	
	
	

}
