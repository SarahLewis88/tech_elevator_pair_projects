package com.techelevator;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(String accountHolderName, String accountNumber) { // constructor
		super(accountHolderName, accountNumber);
	}

	public CheckingAccount(String accountHolderName, String accountNumber, int balance) { // constructor
		super(accountHolderName, accountNumber, balance);
	}
		
	public int withdraw (int amountToWithdraw) { // method
		
		if (getBalance() - amountToWithdraw < -100) {
			amountToWithdraw = 0;
		}

		else if (getBalance() - amountToWithdraw < 0) {
			amountToWithdraw += 10;
		}
		return super.withdraw(amountToWithdraw);
	}
}
