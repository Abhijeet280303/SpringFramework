package com.SpringTrial9.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringTrial9.Stereotype.Bean.Candidate;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext cont = new ClassPathXmlApplicationContext("com/SpringTrial9/BeanScope/config.xml");
        Customer c1=cont.getBean("regularCustomer",Customer.class);
        Customer c2=cont.getBean(Customer.class);
        
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        
        System.out.println(c1);
        System.out.println(c2);
        
        												
        
        
    }
}
