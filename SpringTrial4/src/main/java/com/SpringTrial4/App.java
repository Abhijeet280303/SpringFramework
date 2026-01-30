package com.SpringTrial4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringTrial4.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("==============================================");
        
        
        ApplicationContext context = new  ClassPathXmlApplicationContext("configurationfile.xml");
        
        Student student1 =(Student)context.getBean("Student1");
        Student student2 =(Student)context.getBean("Student2");
        Student student3 =(Student)context.getBean("Student3");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}

