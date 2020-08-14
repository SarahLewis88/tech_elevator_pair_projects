package com.techelevator;

import java.util.Scanner;

public class AreWeThereYet {

	public static void main(String[] args) {
		
		
		Scanner myScanner = new Scanner(System.in);
		
		boolean notThere = true;
		
		
		while (notThere) {
			
			
			System.out.println("Are We There Yet?  Enter (Y) for Yes, (N) for No");
			String answer = myScanner.nextLine();
			
			

			//"16"  not 16
			
			if (answer.equalsIgnoreCase("Y")) {
				notThere = false;
			}
			else {
				System.out.println("Eat My Shorts!!!!");
			}			
			
			
		}
		
		
		System.out.println("Finally!");

		
		

	}

}
