package com.techelevator.person;

public class Person {

	private int age;
	private String firstName;
	private String lastName;

	
	public Person() { // default constructor 	
	}

	public String getFullName() { // method
		String fullName = firstName + " " + lastName;
		return fullName;

	}
	
	public boolean isAdult() { // method
		boolean isAdult = true;
		if (age >= 18) {
			return isAdult;
		}
		return false;
	}
	
	public int getAge() { // gets and sets from here down
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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
	
}
