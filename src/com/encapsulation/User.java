package com.encapsulation;

public class User {

	public static void main(String[] args) {

		BankAccount a = new BankAccount();
		
		a.setBalance(100000);
		
		System.out.println("Bank Balance");
		
		System.out.println("Your balance is :" + a.getBalance());
		
		System.out.println("After deposit "+a.deposit(100));
		
		System.out.println("After withdraw amount "+a.Withdraw(5000));
		
		

	}

}
