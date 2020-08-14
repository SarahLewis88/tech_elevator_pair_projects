package com.techelevator.realtor;

/**
 * This class represents a real estate agent
 * 
 * @author JavaGreen class
 *
 */

public class Agent {

	/*
	 * Class instance (member) variables, aka class attributes, aka class properties
	 */
	private String firstName;
	private String lastName;
	private String companyName;
	private int agentId; // unique agent identifier

	// constructor
	public Agent(int agentId) {
		this.agentId = agentId;
	}

	
	

	/*
	 * Getters and Setters go in this section
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

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
