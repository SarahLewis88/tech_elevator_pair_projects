package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner decimalToBinaryScanner = new Scanner(System.in); // creates scanner: decimalToBinaryScanner
		 
		System.out.println("Please enter in a series of decimal values (separated by spaces):"); // asks for series of number separated by spaces

		String listOfDecimalNumbers = decimalToBinaryScanner.nextLine(); // assigns input to string called listOfDecimalNumbers
		
		String decimalNumbersArray[] = listOfDecimalNumbers.split(" "); // creates an ARRAY with individual inputs, dividing them using spaces, and names it decimalNumbersArray
	
		for (int i = 0; i < decimalNumbersArray.length; i++) {  
			
			int decimalNumber = Integer.parseInt(decimalNumbersArray[i]); // converts array elements from strings to ints
				
			String binaryString = ""; // creates empty binary string
			
			if (decimalNumber == 0) {
				  binaryString = "0";
				
			}
			while (decimalNumber > 0) {
				binaryString = (decimalNumber % 2) + binaryString;
				decimalNumber = decimalNumber / 2;
			}
			System.out.println(decimalNumbersArray[i] + " in binary is " + binaryString); // prints answer
		}	
	}
}
