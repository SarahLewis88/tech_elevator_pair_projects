package com.techelevator;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String department;
	private double annualSalary;
	
	public Employee(int employeeId, String firstName, String lastName, double annualSalary) {
		this.firstName = firstName;
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.annualSalary = annualSalary;
	}
	
	public void raiseSalary(double percent) {
		if (percent > 0) {
			annualSalary += (annualSalary * (percent/100));
		}
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return lastName + ", " + firstName;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}
}
