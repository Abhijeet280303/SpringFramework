package com.SpringTrial8.Beans;

public class Student {
	
	private String name;
	private int roll_number;
	private Address student_address;
	
	
	
	
//	public Student(String name, int roll_number, Address student_address) {
//		super();
//		this.name = name;
//		this.roll_number = roll_number;
//		this.student_address=student_address;
//	}




	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_number=" + roll_number + ", address=" + student_address + "]";
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getRoll_number() {
		return roll_number;
	}




	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}




	public Address getStudent_address() {
		return student_address;
	}




	public void setStudent_address(Address student_address) {
		this.student_address = student_address;
	}



	
	
	
	

}
