package com.SpringTrial6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringTrial6.Beans.Car;
import com.SpringTrial6.Beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("============================================");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        
//        Student student1 = (Student)context.getBean("Student1");
//        System.out.println(student1);
        
        Car car = (Car)context.getBean("Carbean");
        car.Drive();
        
    }
}
