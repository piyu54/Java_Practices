package com.encapsulation;

public class ATM {

	
	private int pin;
	private int balance ;
	private int withdraw;
	
	
	public int getWithdraw() {
		return withdraw-balance;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
}
