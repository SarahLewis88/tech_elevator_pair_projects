package com.techelevator;

public class ScratchPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String gloria = "Gloria";
		String lance = "Lance";
		String clay = "Clay";

		int[] ages = new int[10];
		double[] averages = new double[] {1.23, 2.7,3.6,4.4,5.3};

		String[] students = new String[10];

		students[2] = "Lance";
		students[0] = "Clay";
		students[5] = "Mark";
		students[3] = "Matty";
		students[0] = "Brian";

		students[0] = students[0] + " Smith";

		int lengthOfStudents = students.length;
		// System.out.println(lengthOfStudents);

		if (students.length < 5) {
			String newClay = "Clay";
			System.out.println(clay);

		}

		for (int i = 0; i < students.length; i++) {
		
	
			if (students[i] != null && students[i].equals("Lance")) {
				System.out.println(students[i]);
			}
		}

		System.out.println("---------------");

		for (int i = students.length - 1; i >= 0; i--) {
			System.out.println(students[i]);
		}
		
		
		System.out.println("---------------");
		
		
		for (int count = 0; count < averages.length; count++) {
			//System.out.println(averages[count]);
			if (averages[count] > 5) {
				System.out.println("I am greater than 5: " + averages[count]);
			}
			else {
				System.out.println("I am less than 5: " + averages[count]);
			}
		}
		
		for (int i =0; i<10000; i+=10 ) {
			
			if (i % 100 == 0) {
			   System.out.println(i);
			}
			else {
				System.out.println ("Doh!");
			}
		}
		
		
		
		System.out.println("---------------");
		
		
		
		int[] ageOfCats = new int[] { 3,4,5,6,7,8, 12, 23, 22, 33};
		
		
		for (int i=0; i<ageOfCats.length ; i++ ) {
			
			System.out.println(ageOfCats[i]);
			
			
			if (ageOfCats[i] % 3 == 0) {
				ageOfCats[i] = ageOfCats[i] * 2;
				System.out.println(ageOfCats[i] + " is twice what it was...");
			}
			
			
		}
		
		
		

	}

}
