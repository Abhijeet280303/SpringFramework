package com.SpringTrial8.StandaloneCollections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringTrial8.autowannotat.Student;

/**
 * Hello world!
 *
 */
public class Test3 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("======================================================================");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringTrial8/StandaloneCollections/Stdalncollect_config.xml");
        
        Smartphone s1= context.getBean("smartphone1" ,Smartphone.class);
        System.out.println(s1);
    }
}
