package com.techelevator;

public class House {

	private int numberOfBedrooms;
	private double squareFootage;
	private double numberOfBathrooms;
	private boolean hasBasement;
	private int garageSize;
	private int yearBuilt;
	private boolean termites;
	private boolean sold;

	public boolean isSold() {
		return sold;
	}

	public boolean isTermites() {
		return termites;
	}
	
	public int getNumberOfBedrooms() { //method
		return numberOfBedrooms;
	}
	
	public void setNumberOfBedrooms(int number) { //method
		numberOfBedrooms = number;
	}

	public double getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(double squareFootage) {
		this.squareFootage = squareFootage;
	}

	public double getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public void setNumberOfBathrooms(double numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	public boolean isHasBasement() {
		return hasBasement;
	}

	public void setHasBasement(boolean hasBasement) {
		this.hasBasement = hasBasement;
	}

	public int getGarageSize() {
		return garageSize;
	}

	public void setGarageSize(int garageSize) {
		this.garageSize = garageSize;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	
	
	
}
