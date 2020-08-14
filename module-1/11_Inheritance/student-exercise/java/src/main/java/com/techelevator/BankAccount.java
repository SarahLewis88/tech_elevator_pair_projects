package com.techelevator;

public class BankAccount {

	private String accountHolderName; // attribute
	private String accountNumber; // attribute
	private int balance; // attribute
	
	public String getAccountHolderName() { // get
		return accountHolderName;
	}
	public String getAccountNumber() { // get
		return accountNumber;
	}
	
	public int getBalance() { // get
		return balance;
	}

	public BankAccount(String accountHolderName, String accountNumber) { // constructor
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	}
	
	public BankAccount(String accountHolderName, String accountNumber, int balance) { // constructor
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int deposit (int amountToDeposit) { // method
		return balance += amountToDeposit;
	}
	
	public int withdraw (int amountToWithdraw) { // method
		return balance -= amountToWithdraw;
	}
}
