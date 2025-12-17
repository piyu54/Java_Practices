package com.ops.polymorphismoverriding;

public class ICICI  extends Bank{

	
	@Override
	void getRateOfInterest() {
		System.out.println("Interest rate on ICICI bank is : 7%");
	}
}
