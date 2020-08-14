package com.techelevator;

public class CreditCardAccount implements Accountable { // added implements accountable
	
	private String accountHolder; // attributes
	private String accountNumber;
	private int debt = 0;
	
	public CreditCardAccount(String accountHolder, String accountNumber) { // constructor
		  this.accountHolder = accountHolder;
	      this.accountNumber = accountNumber;
	}

	@Override
	public int getBalance() { // overrides balance to negative
		return -debt;
	}
	
	public int pay (int amountToPay) {
		debt -= amountToPay;
		return debt;
	}
	
	public int charge (int amountToCharge) {
		debt += amountToCharge;
		return debt;
	}

	public String getAccountHolder() {
		return accountHolder;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getDebt() {
		return debt;
	}

}
