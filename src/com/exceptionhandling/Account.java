package com.exceptionhandling;

public class Account extends RuntimeException{

	
	
	private double bankamount;
	

	public double getBankamount() {
		return bankamount;
	}

	public void setBankamount(double bankamount) {
		this.bankamount = bankamount;
	}
	
	Account(double bankamount)
	{
		this.bankamount=bankamount;
	}
	
	public void windraw(double amount)
	{
		if(amount>bankamount)
		{
			throw new InsufffundExcep("Insufficient balance in your account..");
		}
		bankamount=bankamount-amount;
	}
	
	
}
