package com.task;

public class Paytm extends Payment {

	
	@Override
	void reward() {
		System.out.println("paytm provides 10rs cashback Reward");
	}
	
	@Override
	void checkBal() {
		System.out.println("10000 Balance");
	}
}
