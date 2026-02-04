package com.SpringTrial10.SpEL.beans;

import java.security.KeyStore.PrivateKeyEntry;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component                               //  <-so that springIOC container will manage this class as bean named as "mensDress"  but iske liye component ko scan krna imp hai hence in config file --
public class MensDress {
	
	@Value("Full Dress")      //<- field injection 
	private String type;
	@Value("Black")
	private String colour;
	
	@Value("#{3>2 ? 1200:500}")            // <- SpEL 
	private int price;
	
	
	@Value("#{T(java.lang.Math).sqrt(196) }")
	private int quantity;
	
	
	@Value("#{ T(java.lang.Math).PI }")
	private double piValue;
	
	
	@Value("#{new java.lang.String('Abhijeet')}")
	private String nameString;
	
	
	
	private Discount discount;
	
	public MensDress(Discount discount) {
		super();
		this.discount = discount;
	}
	
	 
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "MensDress [type=" + type + ", colour=" + colour + ", price=" + price + ", quantity=" + quantity
				+ ", piValue=" + piValue + ", discount=" + discount +",name="+ nameString + " ]";
	}





	

	
	



















	
	
	
}
