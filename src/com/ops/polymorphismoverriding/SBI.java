package com.ops.polymorphismoverriding;

public class SBI extends Bank{

	@Override
	void getRateOfInterest() {
		System.out.println("Interest rate on SBI is : 10%");
	}
	
}
