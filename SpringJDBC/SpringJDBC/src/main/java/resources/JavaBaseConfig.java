package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJDBC01.SpringJDBC.Services.EmployeeDAPOImpl;

@Configuration
public class JavaBaseConfig {
	
	@Bean
	public DriverManagerDataSource driverManagerDataSource() { 
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/employees");
		ds.setUsername("root");
		ds.setPassword("root@abhi");
		
		return ds ;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(driverManagerDataSource());
	}
	
	@Bean("employeeService")
	public EmployeeDAPOImpl employeeDAPOImpl() {
		return new EmployeeDAPOImpl(jdbcTemplate());
	}
	

}
