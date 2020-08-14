package com.techelevator;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}

	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}

	public int withdraw(int amountToWithdraw) {
		
		if (getBalance() < amountToWithdraw) {
			amountToWithdraw = 0;
		}
		else if (getBalance() - amountToWithdraw < 150) {
			amountToWithdraw += 2;
		}
		return super.withdraw(amountToWithdraw);
	}
}
