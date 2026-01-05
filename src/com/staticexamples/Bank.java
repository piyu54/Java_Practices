package com.staticexamples;

public class Bank {

	
//	Create a class Bank:
//		static variable: rateOfInterest
//		static method to change ROI
//		non-static method to display account balance + ROI
//		Call methods and observe behavior.
	
	static int rateOfInterest=16;
	int accbal=1000;
	
	static void ROI() {
		rateOfInterest=10;
	}
	void display()
	{
		System.out.println(accbal+rateOfInterest);
	}
	public static void main(String[] args) {
		Bank b = new Bank();
		b.display();
	}
}
