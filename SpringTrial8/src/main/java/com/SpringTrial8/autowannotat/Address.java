package com.SpringTrial8.autowannotat;

public class Address {
	private String street;
	private String city;
	
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	
	
	


	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
