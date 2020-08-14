package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		Scanner convertScanner = new Scanner(System.in);
		System.out.println("Please enter the length:");
		int length = convertScanner.nextInt();
		convertScanner.nextLine();
		
		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		String metersOrFeet = convertScanner.nextLine();
		
		if(metersOrFeet.equalsIgnoreCase("m")) { 
			float lenghtFeet = (float) (length * 3.2808399);
		
			System.out.println(length + "m is " + lenghtFeet + "f.");
		}

		if(metersOrFeet.equalsIgnoreCase("f")) { 
			
			float lenghtMeters = (float) (length * 0.3048);
			
			System.out.println(length + "f is " + lenghtMeters + "m.");
		}
	}
}
