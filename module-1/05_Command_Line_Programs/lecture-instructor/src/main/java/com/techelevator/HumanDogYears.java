package com.techelevator;

import java.util.Scanner;

public class HumanDogYears {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner myScanner = new Scanner(System.in);
		
		
		System.out.println("Enter a series of human ages (separated by commas):");
		
		String ageInput = myScanner.nextLine();
		
		String[] ages = ageInput.split(",");
	
		
		
		for (int i=0; i<ages.length;i++) {
			
			
			String tempAge = ages[i];
			int ageAsInt = Integer.parseInt(tempAge);
			
			System.out.println("Your age in dog years is:      " + ageAsInt * 7);
			
			
		}
		
		
		
		
		System.out.println("You are done ");


	}	
	
	
	

//	public static void main(String[] args) {
//		
//		
//		Scanner myScanner = new Scanner(System.in);
//		
//		
//		System.out.println("How old are you human?");
//		
//		String humanAge = myScanner.nextLine();
//		int humanAgeAsInteger = Integer.parseInt(humanAge);  // taking a string converting to int.
//		
//		System.out.println("Age of Human: " + humanAge);
//		System.out.println("Age of Human: " + humanAgeAsInteger);
//		
//		int dogYears = humanAgeAsInteger * 7;
//		System.out.println("Age of Human in Dog Years: " + dogYears);
//		
//		System.out.println("What is your name?");
//		String name = myScanner.nextLine();
//		
//		System.out.print("   Your name is " + name);
//		
//
//
//	}
	
	
//	
//	public static void main(String[] args) {
//		
//		
//		Scanner myScanner = new Scanner(System.in);
//		
//		
//		System.out.println("How old are you human?");
//		
//		int humanAge = myScanner.nextInt();
//		myScanner.nextLine();
//		
//		System.out.println("Age of Human: " + humanAge);
//		
//		
//		
//		System.out.println("What is your name?");
//		String name = myScanner.nextLine();
//		
//		System.out.print("   Your name is " + name);
//		
//
//
//	}	
	
	

}
