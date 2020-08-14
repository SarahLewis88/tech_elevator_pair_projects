package com.techelevator.realtor;

public class House {

	/*
	 * Class instance (member) variables, aka class attributes, aka class properties
	 */
	private int numberOfBedrooms;
	private double squareFootage;
	private double numberOfBathrooms;
	private boolean hasBasement;
	private int garageSize;
	private int yearBuilt;
	private double askingPrice;
	private double sellingPrice;
	private long mlsListingNumber;
	private String propertyClassification;

	// The House object is composed of the datatypes above AND an Address object
	private Address address;

	/*
	 * Future home of a custom constructor
	 * 
	 */
	
	
	
	
	
	

	/*
	 * Getters and setters section is below
	 */
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getAskingPrice() {
		return askingPrice;
	}

	public void setAskingPrice(double askingPrice) {
		this.askingPrice = askingPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {

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
	

	public long getMlsListingNumber() {
		return mlsListingNumber;
	}

	public void setMlsListingNumber(long mlsListingNumber) {
		this.mlsListingNumber = mlsListingNumber;
	}
	


	public String getPropertyClassification() {
		return propertyClassification;
	}

	public void setPropertyClassification(String propertyClassification) {
		this.propertyClassification = propertyClassification;
	}

	/**
	 * This is a toString() method. We are overriding the Object.toString method
	 * (see inheritance lecture for more information on overriding.
	 */
	public String toString() {
		
		String msg = "***************************************************************************************";
		
		msg = msg + "\nGarage Size: " + this.garageSize + "\n" + "Number of Bathrooms: " + this.numberOfBathrooms + "\n"
				+ "Number of Bedrooms: " + this.numberOfBedrooms + "\n" + "Square Footage: " + this.squareFootage + "\n"
				+ "Has a Basement: " + this.hasBasement + "\n" + "Year Built: " + this.yearBuilt + "\n"
				+ "Asking Price: " + this.askingPrice + "\n"
				+ "Classification: " + this.getPropertyClassification() + "\n"
				+ "MLS Number: " + this.mlsListingNumber + "\n";

		if (this.sellingPrice == 0) {
			msg = msg + "Selling Price: " + "NOT SOLD";
		} else {
			msg = msg + "Selling Price: " + this.sellingPrice;
		}

		return msg;

	}

}
