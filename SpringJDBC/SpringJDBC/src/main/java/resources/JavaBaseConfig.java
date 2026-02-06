package resources;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaBaseConfig {
	
	@Bean
	public  DataSource dataSource() {
		
		return (DataSource)new DriverManagerDataSource();
	}
	
//	@Bean
//	public JdbcTemplate jdbcTemplate() {
		
//		return new JdbcTemplate( dataSource());
//	}

}
