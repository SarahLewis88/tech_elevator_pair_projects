package com.techelevator.constructor;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String firstName;
	private String lastName;
	private List<Integer> scores;
	
	
	public Student (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.scores = new ArrayList<Integer>();
		
	}
	


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


	
	// This is a great example of encapsulation.  Notice that we can't touch the scores list at any point. 
	// We can only ask for a grade.
	public String getOverallGrade() {
		
		//put logic here to calculate score
		
	    int sum = 0;
		for (int i : scores) {
			sum += i;
		}
		double avg = sum / scores.size();
		
		if (avg > 50) {
			return "A";
		}
		else {
			return "F";
		}
	}

	// Again, encapsulation... We do not pass around the scores list,  we simply pass the score to
	// this class and this class will use the scores list "behind the scenes" to keep track of the scores.
	// In this example, we can only add a score... or above, get a grade, but we can't touch the underlying 
	// data.
	public void addStudentScore(Integer score) {
		
		
		
		
		
		this.scores.add(score);
		System.out.println("Score: " + score + " added");
	}

	


	
}
