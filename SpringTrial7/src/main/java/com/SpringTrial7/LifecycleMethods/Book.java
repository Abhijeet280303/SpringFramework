package com.SpringTrial7.LifecycleMethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean, DisposableBean{
	
	private String something;

	public Book(String something) {
		super();
		this.something = something;
	}

	@Override
	public String toString() {
		return "Book [something=" + something + "]";
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("initialization code executed! - Book");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Disposal code executed! - Book");
		
	}
	
	

}
