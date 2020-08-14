package com.techelevator.company;

public class Company {

	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;
	
	public Company() { // default constructor (not necessary)	
	}

	public String getCompanySize() { 
		String companySize = "medium";
		if (numberOfEmployees <= 50) {
			companySize = "small";
		}	
		if (numberOfEmployees > 250) {
			companySize = "large";
		}
		return companySize;
	}
		
	public double getProfit() {
		return revenue - expenses;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public double getExpenses() {
		return expenses;
	}
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
}
