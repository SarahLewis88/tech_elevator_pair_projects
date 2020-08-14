package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
			
		Scanner tempScanner = new Scanner(System.in); // creates scanner for console input: tempScanner
		
		System.out.println("Please enter the temperature:"); // asks for decimal temperature input in console
		int temperature = tempScanner.nextInt(); // assigns input temperature to "int temperature"
		tempScanner.nextLine(); // gets rid of /n
				
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?"); // asks for C or F
		String celciusOrFahrenheit = tempScanner.nextLine(); // assigns input to celciusOrFahrenheit (either C or F)
		
		if(celciusOrFahrenheit.equalsIgnoreCase("C")) { // "if" statement if C is true

			int tempFahrenheit = (int) (temperature * 1.8 + 32); // CONVERTS from C to F with mathematical equation and assigns F value
		
			System.out.println(temperature + "C is " + tempFahrenheit + "F."); // prints result in sentence
		}

		if(celciusOrFahrenheit.equalsIgnoreCase("F")) { // "if" statement if F is true
			
			int tempCelcius = (int) ((temperature - 32) / 1.8); // // CONVERTS from F to C with mathematical equation and assigns F value
			
			System.out.println(temperature + "F is " + tempCelcius + "C."); // prints result in sentence
		}
	}
}
