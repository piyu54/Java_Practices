package com.task;

public class Application {

	public static void main(String[] args) {

		// Payment p=new Payment();
//		   p.reward();
//		   p.checkBal();

		Payment p;
		p = new Gpay();
		p.reward();
		p.checkBal();

		p = new Phonepe();
		p.reward();
		p.checkBal();

		p = new Paytm();
		p.reward();
		p.checkBal();

		p = new Razarpay();
		p.reward();
		p.checkBal();
	}

}
