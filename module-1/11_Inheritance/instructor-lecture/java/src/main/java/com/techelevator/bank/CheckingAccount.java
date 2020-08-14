package com.techelevator.bank;

public class CheckingAccount extends BankAccount {
	
	
	private String startingCheckNumber;
	
	
	public CheckingAccount(String accountNumber, double balance, String startingCheckNumber) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
		this.startingCheckNumber = startingCheckNumber;
	}

	public void writeCheck() {
		//do implement this at some point
		System.out.println("I am writing Steve a BIGGGG check!!!!");
		
	}
	
	
	@Override
	public void transferFunds(String toAccount, String fromAccount, double balance) {
		// TODO Auto-generated method stub
		super.transferFunds(toAccount, fromAccount, balance);
	}
	

	public double deposit(double amount) {
		double adjustmentAmount = amount + 3.00;
		return super.deposit(adjustmentAmount);
		
		
		
	}

}
