package com.SpringTrial10.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringTrial10.SpEL.beans.MensDress;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        MensDress dress1 =  context.getBean("mensDress",MensDress.class);
        System.out.println(dress1);
        
        System.out.println(dress1.getDiscount().getDiscountAmount());
        
        
        
    }
}
