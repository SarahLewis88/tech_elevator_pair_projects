package com.techelevator;

import java.util.Scanner;

public class HumanDogYears {

	public static void main(String[] args) {
		

		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("How old are you, human?");
		
		int humanAge =  myScanner.nextInt();
		myScanner.nextLine();
		
		System.out.println("Age of human: " + humanAge);
		
		System.out.println("What is your name?");
		String name = myScanner.nextLine();
		
		System.out.println("Your name is " + name);;
		

	}

}
