package com.SpringTrial7.LifecycleMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringTrial7/LifecycleMethods/config.xml");
		Laptop lap1 =(Laptop)context.getBean("L1");
		System.out.println(lap1);
		
		//but to get destroy method executed we need to enable the preshuddown hook (registering the registershutdownhhk) so that the context can execute it 
		context.registerShutdownHook();   //this method itself is present in the AbstractApplicationContext
		
		System.out.println("============================================================================");
		Book object1 =(Book)context.getBean("obj1");
		System.out.println(object1);
		System.out.println("============================================================================");
		
		Smartphone smartphone=(Smartphone)context.getBean("phone1");
		System.out.println(smartphone);
		
		
	}

}
