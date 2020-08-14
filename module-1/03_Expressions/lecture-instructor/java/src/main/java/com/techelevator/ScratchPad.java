package com.techelevator;

public class ScratchPad {

	public static void main(String[] args) {

		boolean isAdult = true;
		double balanceInSavings = 101;
		int numberOfYearsInHome = 7;
		boolean isApproved = false;

		if (!isAdult) {
			System.out.println("You don't qualify");
		} 
		else {
			System.out.println("Steve is an adult");
			if ((balanceInSavings > 100 && numberOfYearsInHome > 5) || balanceInSavings >10000  ) {
			    System.out.println("They passed the balance check");
				System.out.println("They passed residence check");
			    isApproved = true;
			}
	
		
			if (isApproved) {
			   System.out.println("Yay! Your approved!");
			}
			else {
				 System.out.println("Sorry!");
			}
		}
		
		int[] scores = new int[8];
		
		


	}

}
