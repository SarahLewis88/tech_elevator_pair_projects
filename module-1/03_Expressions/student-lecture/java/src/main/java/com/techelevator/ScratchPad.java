package com.techelevator;

public class ScratchPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isAdult = true;
		double balanceInSavings = 101;
		int numberOfYearsInHome = 12;
		
		if (isAdult && balanceInSavings > 100 && numberOfYearsInHome > 5) {
			System.out.println("Steve is an adult.");
			System.out.println("They passed the balance check.");
			System.out.println("They passed the residence check.");
		}
		else {
			System.out.println("You dont't qualify at this time.");
		}
	}
}

