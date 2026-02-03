package com.SpringTrial9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringTrial9.Stereotype.Bean.Candidate;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");
        Candidate c1=cont.getBean("CandidateObject", Candidate.class);
        
        System.out.println(c1);
    }
}
