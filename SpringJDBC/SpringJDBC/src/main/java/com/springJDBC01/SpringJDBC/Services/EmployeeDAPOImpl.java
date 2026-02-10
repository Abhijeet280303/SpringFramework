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

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public int insert(Employee employee) {
		String InsertQuery= "INSERT INTO departments(dept_no,dept_name) VALUES (?,?)";
		int rowsAffeccted=jdbcTemplate.update(InsertQuery,employee.getDept_no(), employee.getDept_name() );
		 System.out.println("Inserted "+rowsAffeccted+" Employees");
		return rowsAffeccted;
	}



	@Override
	public int Update(Employee employee) {
		String UpdateQuery="UPDATE departments SET dept_name=? WHERE dept_no=? " ;
		int rowsAffected=this.jdbcTemplate.update(UpdateQuery,employee.getDept_name(), employee.getDept_no());
		return rowsAffected;
	}


	@Override
	public int Delete(String dept_no) {
		String DeleteQuery="DELETE FROM departments WHERE dept_no = ?";
		int rowsaffected=this.jdbcTemplate.update(DeleteQuery,dept_no);
		System.out.println("Deleted the rocord for "+dept_no+"Department number");
		return rowsaffected;
	}

}
