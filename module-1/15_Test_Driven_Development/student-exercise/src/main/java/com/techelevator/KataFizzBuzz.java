package com.techelevator;

public class KataFizzBuzz {

	public String methodFizzBuzz(int n) {
		
		String nStr = Integer.toString(n);
		
		if (n <= 0 || n >= 100) {
			return "";
		}
		if ((n % 15 == 0) || (nStr.contains("3") && nStr.contains("5"))) {
			return "FizzBuzz";
		}
		else if ((n % 3 == 0) || nStr.contains("3")) {
			return "Fizz";
		}
		else if ((n % 5 == 0) || nStr.contains("5")) {
			return "Buzz";
		}
		else {
			return String.valueOf(n);
		}
	}
		
}
