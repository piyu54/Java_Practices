package com.abtraction;

public class Transaction implements Bank {

	public int bal;

	public Transaction(int bal) {
		this.bal = bal;
	}

	@Override
	public void checkBal() {
		
		System.out.println("Current Bal is " + bal);

	}
	public void bankName()
	{
		System.out.println("Bank Name is "+name);
	}

	@Override
	public void windraw(int amount) {

		if (bal < amount) {
			System.out.println("You can have sufficient bal");
		}
		bal = bal - amount;

	}

	public static void main(String[] args) {

		Transaction t = new Transaction(500000);
		t.bankName();
		t.checkBal();
		t.windraw(500);
		t.checkBal();
	}

}
