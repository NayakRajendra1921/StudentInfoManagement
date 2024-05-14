package com.tut;

import javax.persistence.Embeddable;

@Embeddable
public class PreviousYearResult {
	
	int marksObtained;
	int totalMarks;
	double percentage;
	
	
	
	public PreviousYearResult(int marksObtained, int totalMarks, double percentage) {
		super();
		this.marksObtained = marksObtained;
		this.totalMarks = totalMarks;
		this.percentage = percentage;
	}
	public int getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
}
