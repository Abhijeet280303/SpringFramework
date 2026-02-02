package com.SpringTrial7.Beans;

public class Person {
	
	private String name;
	private int govtID;
	private Subsidy subs;
	
	public Person(String name, int govtID, Subsidy subs) {
		super();
		this.name = name;
		this.govtID = govtID;
		this.subs = subs;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", govtID=" + govtID + ", subs=" + subs + "]";
	}
	
	

}
