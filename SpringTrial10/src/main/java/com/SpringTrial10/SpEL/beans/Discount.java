package com.SpringTrial10.SpEL.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Discount {
	
	@Value("100")
	private int DiscountAmount;

	public int getDiscountAmount() {
		return DiscountAmount;
	}

	public void setDiscountAmount(int discount) {
		DiscountAmount = discount;
	}
	
	
	
}
