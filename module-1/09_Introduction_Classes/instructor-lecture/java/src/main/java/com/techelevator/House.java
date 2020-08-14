package com.techelevator;

public class House {
	
	
	private int numberOfBedrooms;
	private double squareFootage;
	private double numberOfBathrooms;
	private boolean hasBasement;
	private int garageSize;
	private int yearBuilt;
	private boolean termites;
	private boolean sold = false;
	private double price;
	
	private Address address;
	
	
	
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setPrice(String price) {    //method overloading
		Double tempPrice = Double.valueOf(price);
		this.price = tempPrice.doubleValue();
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	

	public double getPrice() {
		return price;
	}
	
	
	
	
	public boolean isSold() {
		return sold;
	}


	public boolean isTermites () {
		return termites;
	}
	
	
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	
	
	public void setNumberOfBedrooms(int numberOfBedrooms) {
		
		if (numberOfBedrooms < 1) {
			System.out.println("Invalid number of bedrroms!!!!!!!!");
		}
		this.numberOfBedrooms = numberOfBedrooms;
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


	public String toString() {
		return this.garageSize + " is the garage size" +
				this.numberOfBathrooms + " is the bathroom size" +
				this.price + " is th price";
	}
	
	
	

}
