package com.springJDBC01.SpringJDBC.Services;

import java.sql.JDBCType;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC01.SpringJDBC.DAO.EmployeeDAO;
import com.springJDBC01.SpringJDBC.Entity.Employee;

public class EmployeeDAPOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDAPOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public int insert(Employee employee) {
		String InsertQuery= "INSERT INTO departments(dept_no,dept_name) VALUES (?,?)";
		int rowsAffeccted=jdbcTemplate.update(InsertQuery,employee.getDept_no(), employee.getDept_name() );
		 System.out.println("Inserted "+rowsAffeccted+" Employees");
		return rowsAffeccted;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
