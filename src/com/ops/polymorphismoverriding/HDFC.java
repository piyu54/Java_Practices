package com.ops.polymorphismoverriding;

public class HDFC  extends Bank{

	
	
	@Override
	void getRateOfInterest() {
		System.out.println("Interest Rate on HDFC is : 12%");
	}
}
