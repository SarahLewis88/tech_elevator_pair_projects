package com.techelevator;

//tracks money: deposits 
public class Account {
	
	private double balance;
	
	//constructor
	public Account(double balance) {
		this.balance = balance;
	}

	//methods
	public double getBalance() {
		return balance;
	}

	public double deposit(double addAmount) {
		if (balance + addAmount <= 5000 ) {
			return balance += addAmount;			
		} else {
			return balance;
		}
	}
	
	public double spend(double productPrice, int quantityOrder) {
		if (balance > (productPrice * quantityOrder)) {
			productPrice *= quantityOrder;
			return productPrice;
		} else {
			productPrice *= quantityOrder;
			return productPrice;
		}
	}

	public double availableBalance(double netTotalAfterPurchase) {
		return balance -= netTotalAfterPurchase;
	}
}
