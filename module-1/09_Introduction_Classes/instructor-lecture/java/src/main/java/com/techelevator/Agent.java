package com.techelevator;

public class Agent {
	
	
	public Agent(int agentId) {
		this.agentId = agentId;
	}
	
	private String firstName;
	private String lastName;
	private int agentId;
	
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
	
	

}
