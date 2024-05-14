package com.tut;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class StudentInfo {
	
	@Id
	@Column(name="student_registration_number",nullable=false,unique=true)
	private int regid;
	
	@Column(name="student_name")
	private String name;
	
	@Column(name="student_father_name")
	private String fathersName;
	
	@Column(name="dob")
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="sub_stu_id",referencedColumnName="subject_code")
	private List<Subject> subjectList;
	
	
	private PreviousYearResult previousYearResult;
	
	@Column(name="student_picture")
	@Lob
	private byte[] studentProfilePicture;
	
	public StudentInfo() {
		
	}
	
	public int getRegid() {
		return regid;
	}

	public void setRegid(int regid) {
		this.regid = regid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public PreviousYearResult getPreviousYearResult() {
		return previousYearResult;
	}

	public void setPreviousYearResult(PreviousYearResult previousYearResult) {
		this.previousYearResult = previousYearResult;
	}

	public byte[] getStudentProfilePicture() {
		return studentProfilePicture;
	}

	public void setStudentProfilePicture(byte[] studentProfilePicture) {
		this.studentProfilePicture = studentProfilePicture;
	}
	
	
}
