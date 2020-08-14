package com.techelevator;

public class StringExamples {
	
	public static void main(String[] args) {
	String myString = "The big bad wolf";
	
	boolean isFound = myString.contains("big");
	System.out.println(isFound);
	
	isFound = myString.contains("car");
	System.out.println(isFound);
	
	
     if (myString.contains("big")) {
    	 System.out.println("Word found!");
     }
     
     
     if (myString.startsWith("Bob")) {
    	 System.out.println("Starts with The!");
     }
     
     
//     myString = myString.substring(4);
//     System.out.println(myString);
     
     
//     int badIndex = myString.indexOf("bad");
//     System.out.println(badIndex);
//     myString = myString.substring(badIndex);
//     System.out.println(myString);
     
     myString = myString.replace("bad", "good");
     System.out.println(myString);
     
     String trimExample = " Steve ";
     String trimmedValue = trimExample.trim();
     System.out.println(trimmedValue);
    
     String boolValueAsAString = String.valueOf(true);
     System.out.println(boolValueAsAString);
     
     
     char[] myCharArray = new char[] { 's', 't', 'e', 'v', 'e'};
     
     String nameUsingChar = new String(myCharArray);
     String standardString = "Steve";
     
     char[] steveArray = standardString.toCharArray();
     
     
     

	}

}
