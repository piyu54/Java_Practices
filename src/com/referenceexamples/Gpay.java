package com.referenceexamples;

public class Gpay extends Payment{

	@Override
	void reward() {
		System.out.println("Gpay provides 5rs cashback Reward");
	}
	
	@Override
	void checkBal() {
		
		System.out.println("10000 Balance");
	}
}
