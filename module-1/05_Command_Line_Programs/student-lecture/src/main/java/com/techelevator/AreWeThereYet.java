package com.techelevator;

import java.util.Scanner;

public class AreWeThereYet {

	public static void main(String[] args) {
		

		Scanner randomScannerName = new Scanner(System.in);
		
		boolean notThere = true;
		
		while (notThere) {
			
			System.out.println("Are We There Yet? Enter (Y) for Yes, (N) for No");
			String answer = randomScannerName.nextLine();  //randomScannerName.nextLine() is your input
			
			if(answer.equalsIgnoreCase("Y")) {  // if you typed y or Y proceed
				notThere = false;;
			}
			else {
				System.out.println("Eat My Shorts!!!");  // if you didn't, do this
			}
			
		}
			
		System.out.println("Finally!");
		

	}

}
