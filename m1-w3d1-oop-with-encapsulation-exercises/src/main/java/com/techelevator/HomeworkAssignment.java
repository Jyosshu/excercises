package com.techelevator;

public class HomeworkAssignment {
	
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	public String getLetterGrade() {
		if (((totalMarks * 100) / possibleMarks) >= 90) {
			return "A";
		}
		else if (((totalMarks * 100) / possibleMarks) >= 80 && ((totalMarks * 100) / possibleMarks) < 90) {
			return "B";
		}
		else if (((totalMarks * 100) / possibleMarks) >= 70 && ((totalMarks * 100) / possibleMarks) < 80) {
			return "C";
		}
		else if (((totalMarks * 100) / possibleMarks) >= 60 && ((totalMarks * 100) / possibleMarks) < 70) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	

}
