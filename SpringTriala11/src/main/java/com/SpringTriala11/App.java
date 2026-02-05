package com.SpringTriala11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resources.configurations.JavaConfig;

import com.SpringTriala11.JavaConfiguration.Payment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Payment p1 =  context.getBean( Payment.class);
        p1.MakePayment();
    }
}
