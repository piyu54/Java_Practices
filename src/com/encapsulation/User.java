package com.encapsulation;

public class User {

	public static void main(String[] args) {

		ATM a = new ATM();
		a.setPin(2001);
		a.setBalance(100000);
		a.setWithdraw(2000);
		System.out.println("Bank Balance");
		System.out.println("Your pin is :" + a.getPin());
		System.out.println("Your balance is :" + a.getBalance());
		System.out.println("After withdraw your amount is :" + a.getWithdraw());

	}

}
