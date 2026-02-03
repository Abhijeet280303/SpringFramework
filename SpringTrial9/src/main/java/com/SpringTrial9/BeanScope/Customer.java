package com.SpringTrial9.BeanScope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("regularCustomer")
@Scope("prototype")
public class Customer {
	
	@Value("Ashish Pawar")
	private String nameString;

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "Customer [nameString=" + nameString + "]";
	}
	
	

}
