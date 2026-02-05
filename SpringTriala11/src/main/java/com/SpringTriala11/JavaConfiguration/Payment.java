package com.SpringTriala11.JavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Payment {
	private CrazyPayment crazyPayment;
	
	
	
	 public Payment(CrazyPayment crazyPayment) {
		super();
		this.crazyPayment = crazyPayment;
	}



	 public void MakePayment() {
		crazyPayment.provideData();
		System.out.println("payment is done with using crazy payyment gateway!!");
	}



	 public CrazyPayment getCrazyPayment() {
		 return crazyPayment;
	 }



	 public void setCrazyPayment(CrazyPayment crazyPayment) {
		 this.crazyPayment = crazyPayment;
	 }

}
