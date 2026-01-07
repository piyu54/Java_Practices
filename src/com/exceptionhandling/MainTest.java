package com.exceptionhandling;

public class MainTest {

	public static void main(String[] args) {
		
		Account a = new Account(35000);
		System.out.println("Current balance : " + a.getBankamount());
		
//		a.windraw(2000);
		a.windraw(40000);//exception
		
		
		System.out.println("Current balance : " + a.getBankamount());
		
		
	}
}
