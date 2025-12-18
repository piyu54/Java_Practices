package com.referenceexamples;

public class Phonepe  extends Payment{

	@Override
	void reward() {
		System.out.println("Phonepe provides 2rs cashback Reward");
	}
	
	@Override
	void checkBal() {
		System.out.println("10000 Balance");
	}
}
