package com.techelevator.view;

public class ChangeCalculator {
	
	private int TWENTIES = 0;
	private int TENS = 0;
	private int FIVES = 0;
	private int ONES = 0;
	private int QUARTERS = 0;
	private int DIMES = 0;
	private int NICKELS = 0;
	private int PENNIES = 0;

	public String changeCalculator(double accountBalance) {
		double balanceByHundred = accountBalance * 100;
		while (balanceByHundred > 0) {
			if (balanceByHundred >= 2000) {
				balanceByHundred -= 2000;
				TWENTIES += 1;
			} else if (balanceByHundred >= 1000) {
				balanceByHundred -= 1000;
				TENS += 1;
			} else if (balanceByHundred >= 500) {
				balanceByHundred -= 500;
				FIVES += 1;
			} else if (balanceByHundred >= 100) {
				balanceByHundred -= 100;
				ONES += 1;
			} else if (balanceByHundred >= 25) {
				balanceByHundred -= 25;
				QUARTERS += 1;
			} else if (balanceByHundred >= 10) {
				balanceByHundred -= 10;
				DIMES += 1;
			} else if (balanceByHundred >= 5) {
				balanceByHundred -= 5;
				NICKELS += 1;
			} else if (balanceByHundred >= 1) {
				balanceByHundred -= 1;
				PENNIES += 1;
			} 
		}
		String returnChange = "Twenties: " + Integer.toString(TWENTIES) + "\nTens: " + Integer.toString(TENS) + "\nFives: " + Integer.toString(FIVES) + "\nOnes: " + Integer.toString(ONES) + "\nQuarters: " + Integer.toString(QUARTERS) + "\nDimes: " + Integer.toString(DIMES) + "\nNickels: " + Integer.toString(NICKELS) + "\nPennies: " + Integer.toString(PENNIES);
		return returnChange;
	}
}
