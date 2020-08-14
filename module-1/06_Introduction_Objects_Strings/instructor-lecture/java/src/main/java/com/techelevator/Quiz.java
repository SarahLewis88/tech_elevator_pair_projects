package com.techelevator;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		
		
		int[] numbers = new int[10];

		int sum = 0;

		for(int ix = 0; ix < numbers.length; ix++) {

		    sum += ix;   // sum = sum + ix

		    numbers[ix] = sum;

		}
		
		int result = numbers[4];
		
		System.out.println(result);
		
		
		
	

	}

}
