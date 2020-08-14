package com.techelevator.realtor;

/**
 * This class represents a real estate buy
 * 
 * @author Java Green Class
 *
 */
public class Buyer {

	/*
	 * Class instance (member) variables, aka class attributes, aka class properties
	 */
	private String firstName;
	private String lastName;

	/*
	 * Getters and setters section below
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// derived method example
	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

}
