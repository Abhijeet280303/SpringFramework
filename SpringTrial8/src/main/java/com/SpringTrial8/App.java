package com.SpringTrial8;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringTrial8.Beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("======================================================================");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        
        Student s1= context.getBean("student1" ,Student.class);
        System.out.println(s1);
    }
}
