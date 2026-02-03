package com.SpringTrial8.autowannotat;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringTrial8.autowannotat.Student;

/**
 * Hello world!
 *
 */
public class Test2 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("======================================================================");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringTrial8/autowannotat/Config.xml");
        
        Student s1= context.getBean("student" ,Student.class);
        System.out.println(s1);
    }
}
