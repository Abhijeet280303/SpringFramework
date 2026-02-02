package com.SpringTrial7.LifecycleMethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Smartphone {
	private String modelname;

	public Smartphone(String modelname) {
		super();
		this.modelname = modelname;
	}

	@Override
	public String toString() {
		return "Smartphone [modelname=" + modelname + "]";
	}
	
	
	@PostConstruct
	public void start() {
		System.out.println("Initialization code executed ! - Smartphone");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Disposal code executed! - Smartphone");
	}
	
	

}
