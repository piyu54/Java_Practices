package com.ops.polymorphismoverriding;

/*Bank Interest Example
Create a class Bank with method getRateOfInterest().
Override this method in classes SBI, HDFC, and ICICI with different interest rates.*/
public class Bank {

	void getRateOfInterest()
	{
		System.out.println("Interest rates of all the banks");
	}
	
	public static void main(String[] args) {
		Bank b = new Bank();
		b.getRateOfInterest();
		
		SBI i = new SBI();
		i.getRateOfInterest();
		
		HDFC h = new HDFC();
		h.getRateOfInterest();
		
		ICICI ic = new ICICI();
		ic.getRateOfInterest();
	}
	
}
