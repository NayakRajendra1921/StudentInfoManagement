package com.tut;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	
	@Id
	@Column(name="subject_code",nullable=false,unique=true,updatable=false)
	private long subjectCode;
	
	@Column(name="subject_name")
	private String subjectName;
	
	public Subject() {
		super();
	}

	public Subject(long subjectCode, String subjectName) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
	}

	public long getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(long subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + "]";
	}
	
	
}
