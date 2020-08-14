package com.techelevator.bank;

public class BankAccount {
	
	
	
	private String accountNumber;
	private double balance;
	

	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
//	public void setAccountNumber(String accountNumber) {
//		this.accountNumber = accountNumber;
//	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
	public void transferFunds(String toAccount, String fromAccount, double balance) {
		
	}
	
	public double deposit(double amount) {
		return this.balance += amount;
	}
	
	
	

}
