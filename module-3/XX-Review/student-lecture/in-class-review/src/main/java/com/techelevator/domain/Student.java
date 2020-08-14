package com.techelevator.domain;

import javax.validation.constraints.NotBlank;

public class Student {
	
	private long id;
	
	 @NotBlank( message = "The field 'firstName' is required.")
	private String firstName;
	 @NotBlank( message = "The field 'lastName' is required.")
	private String lastName;
	 @NotBlank( message = "The field 'cohort' is required.")
	private String cohort;
	 @NotBlank( message = "The field 'section' is required.")
	private String section;
	 @NotBlank( message = "The field 'phone' is required.")
	private String phone;
	 @NotBlank( message = "The field 'email' is required.")
	private String email;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getCohort() {
		return cohort;
	}
	public void setCohort(String cohort) {
		this.cohort = cohort;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
