package com.springJDBC01.SpringJDBC.DAO;

import com.springJDBC01.SpringJDBC.Entity.Employee;

public interface EmployeeDAO {
	
	public int insert(Employee employee);
	
	public int Update(Employee employee);
	
	public int Delete(String dept_no);

}
