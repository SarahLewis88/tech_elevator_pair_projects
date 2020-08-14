package com.techelevator;

public class HomeworkAssignment {
	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks; // constructor
	}
	
	public String getLetterGrade() { // get
		
		if (((double) earnedMarks / possibleMarks) * 100 >= 90) {
			letterGrade = "A";
		}
		else if (((double) earnedMarks / possibleMarks) * 100 >= 80) {
			letterGrade = "B";
		}
		else if (((double) earnedMarks / possibleMarks) * 100 >= 70) {
			letterGrade = "C";
		}
		else if (((double) earnedMarks / possibleMarks) * 100 >= 60) {
			letterGrade = "D";
		}
		else {

			return "F";
		}

		return letterGrade;
	}
	public int getEarnedMarks() { // get
		return earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) { // set
		this.earnedMarks = earnedMarks;
	}
	public String getSubmitterName() { // get
		return submitterName;
	}
	public void setSubmitterName(String submitterName) { // set
		this.submitterName = submitterName;
	}
	public int getPossibleMarks() { // get
		return possibleMarks;
	}
}
