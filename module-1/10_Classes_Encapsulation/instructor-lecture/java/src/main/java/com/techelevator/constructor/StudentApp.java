package com.techelevator.constructor;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
		// Creating a Student using default constructor
		
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		
		
		final double PI = 3.1423434566676;
		final String SUNDAY = "Sunday";
  
		
		
		Student johnny = new Student(firstName, "Wayne");
		
	
		  if (PI < 4) {
			  
		  }
		johnny.addStudentScore(23);
		
		//Student john = new Student();
		

		johnny.addStudentScore(100);
		johnny.addStudentScore(50);
		johnny.addStudentScore(75);
		
		
		System.out.println(johnny.getOverallGrade());
		
		
		
		

	}

}
