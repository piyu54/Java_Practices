package com.referenceexamples;

public class Razarpay extends Payment {

	@Override
	void reward() {
		System.out.println("Gpay provides 15rs cashback Reward");
	}
	
	@Override
	void checkBal() {
		System.out.println("10000 Balance");
	}
}
