package com.ops.Polymorphism;

public class Banking {

	
	void getBanking(int Creditcard)
	{
		System.out.println("THIS IS CREDIT CARD NO " );
		System.out.println("VALID UPTO 2025");
	}
	
	void getBanking(int Debitnum,String DebitName)
	{
		System.out.println("DebitCard info");
	}
	
	void getBanking(String AccName,int AccNum)
	{
		System.out.println("NetBanking");
	}
	void getBanking(String UPI)
	{
		System.out.println("UPI");
	}
}
