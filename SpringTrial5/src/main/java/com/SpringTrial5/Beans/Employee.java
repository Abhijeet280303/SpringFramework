package com.SpringTrial5.Beans;

import java.util.List;

public class Employee {
	
	private int EmployeeID;
	private String Name;
	private String Department;
	private List<String> month;
	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return EmployeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return Department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		Department = department;
	}
	
	
	/**
	 * @return the month
	 */
	public List<String> getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(List<String> month) {
		this.month = month;
	}
	
	
	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", Name=" + Name + ", Department=" + Department + ", month="
				+ month + "]";
	}
	
	
	

}
