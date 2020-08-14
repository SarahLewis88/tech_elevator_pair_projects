package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int previousNumber = 0; // declares variables
		int currentNumber = 1; // declares variables
		
		Scanner fibScanner = new Scanner(System.in); // creates scanner: fibScanner
		 
		System.out.println("How high would you like your fibonacci sequence to go?"); // asks for number

		int inputNumber = fibScanner.nextInt(); // assigns input to inputNumber
	     
		System.out.print("0, "); // prints 0, 1 before sequence 
		
		for (int i = 0; currentNumber <= inputNumber; ++i) { // loop that starts with 1, runs until currentNumber is less than inputNumber, and increments by one
			   
			int nextNumber = previousNumber + currentNumber; // creates a nextNumber by adding previousNumber and currentNumber
			previousNumber = currentNumber; // modifies previousNumber so that it is now equal to currentNumber
			currentNumber = nextNumber; // modifies currentNumber so that it is now equal to nextNumber

			System.out.print(previousNumber + ", "); // separates currentNumber values with commas

		}
	}
}