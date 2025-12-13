package com.encapsulation;

public class BankAccount {

	/*2. Create a class BankAccount using encapsulation with private balance.
Add methods: deposit(), withdraw(), getBalance().
Perform operations in main.*/
	
	
	private int balance ;
	
	
	public int deposit(int deposit)
	{
		return deposit+balance;
	}
	
	public int Withdraw(int Withdraw)
	{
		return Withdraw-balance;
	}
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
}
