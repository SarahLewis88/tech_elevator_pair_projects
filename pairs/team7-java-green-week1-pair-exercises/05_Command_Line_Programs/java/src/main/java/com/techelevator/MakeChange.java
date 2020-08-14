package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		
		Scanner changeScanner = new Scanner(System.in); // creates scanner for console input: changeScanner
		
		System.out.println("Please enter the amout of the bill:"); // asks for decimal bill input in console
		float bill = changeScanner.nextFloat(); // assigns input amount to long bill
				
		System.out.println("Please enter the amount tendered:"); // asks for decimal amount tendered input in console
		float amountTendered = changeScanner.nextFloat(); // assigns input to long amountTendered 
		
		float changeRequired = amountTendered - bill;
		
		System.out.println("The change required is " + changeRequired); // prints amount of change that is required
	}
}
