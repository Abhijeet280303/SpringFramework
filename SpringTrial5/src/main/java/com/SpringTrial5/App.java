package com.SpringTrial5;



import com.SpringTrial5.Beans.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringTrial5.Beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new  ClassPathXmlApplicationContext("Config.xml");
        
        Employee emp1 =(Employee)context.getBean("Emp1");
        System.out.println(emp1);
        
        Book book1 =(Book) context.getBean("Book1");
        System.out.println(book1);
      
    }
}
