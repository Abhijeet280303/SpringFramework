package com.SpringTrial7;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringTrial7.Beans.Person;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Person person1 =(Person)context.getBean("per1");
        
       System.out.println(person1);
        
        
        
    }
}
