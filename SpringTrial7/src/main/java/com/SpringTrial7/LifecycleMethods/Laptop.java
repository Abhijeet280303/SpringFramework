package com.SpringTrial7.LifecycleMethods;

public class Laptop {
	private String modelName;

	public Laptop(String modelName) {
		super();
		this.modelName = modelName;
	}
	
	public void init() {
		System.out.println("initialization code executed! - Laptop");
		
	}
	
	public void destroy() {
		System.out.println("Disposal code executed!! - Laptop");
		
	}

	@Override
	public String toString() {
		return "Laptop [modelName=" + modelName + "]";
	}
	
	

}
