package com.techelevator.realtor;

/**
 * This class represents an Address
 * 
 * @author JavaGreen class
 *
 */
public class Address {

	/*
	 * Class instance (member) variables, aka class attributes, aka class properties
	 */
	private String streetNumber;
	private String streetName;
	private String city;
	private String state;
	private String zip;

	/*
	 * This is a DEFAULT constructor. Every class has a default constructor and
	 * typing it is optional. Contructors are always called at object creation
	 */
	public Address() {

	}

	/*
	 * Getters and setters
	 */

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
