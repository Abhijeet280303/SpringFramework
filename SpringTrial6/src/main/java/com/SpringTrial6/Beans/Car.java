package com.SpringTrial6.Beans;



public class Car {
	
	private Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	 public void Drive() {
		engine.StartEngine();
		System.out.println("car is being drived!");
	}



	




}
