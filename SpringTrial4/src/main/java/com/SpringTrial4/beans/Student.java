package com.SpringTrial4.beans;

public class Student {
	private String studentName;
	private int studentRollNo;
	private String studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		
		System.out.println("setting the student name --");
		this.studentName = studentName;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
	public Student(String studentName, int studentRollNo, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRollNo=" + studentRollNo + ", studentAddress="
				+ studentAddress + "]";
	}
	
	
	
	
	
}
