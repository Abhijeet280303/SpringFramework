package com.springJDBC01.SpringJDBC;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC01.SpringJDBC.Entity.Employee;
import com.springJDBC01.SpringJDBC.Services.EmployeeDAPOImpl;

import resources.JavaBaseConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("resources/xmlConfig.xml");
//        JdbcTemplate template=  context.getBean("jdbcTemplate",JdbcTemplate.class);
        
//        String insertQueryString= "INSERT INTO departments(dept_no,dept_name) VALUES (?,?)";
        
//        template.update(insertQueryString, "d011", "TelecomDepartment" ); 
        
        
        		//But this is not the standard best practice , 
        		//best practice is to define this CRUD as services in other class and defining the Entity class
            //to put the values in the update() and similarly other ...  lets do -> 
//    	-------------------------------------------------------------------------------------------------------------------------
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("resources/xmlConfig.xml");   //Using XML config
        
        ApplicationContext context2 = new AnnotationConfigApplicationContext(JavaBaseConfig.class);     //Using JAVA config
        EmployeeDAPOImpl employeeDAPOImpl= context2.getBean("employeeService" , EmployeeDAPOImpl.class);
        
//        Employee e1= new Employee();
//        e1.setDept_name("JavaConfigued Department");
//        e1.setDept_no(1014);  
//        employeeDAPOImpl.insert(e1);
        
        Employee e2 = new Employee();
        e2.setDept_name("Updated-JavaConfigued Department2");
        e2.setDept_no("1014");
        
        employeeDAPOImpl.Update(e2);
        
    }
}
