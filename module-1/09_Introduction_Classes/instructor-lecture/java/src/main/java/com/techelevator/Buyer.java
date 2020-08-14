package com.techelevator;

public class Buyer {
	
	
	private String firstName;
	private String lastName;

	
	
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
	
	//derived method example
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
	
	
	

}
