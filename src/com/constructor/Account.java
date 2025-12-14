package com.constructor;

/*Create a class Account with:
Default constructor → set balance = 1000
Parameterized constructor → set balance based on user input
Display both account balances.*/

public class Account {

	private String bal;
	
	Account()
	{
		System.out.println("Balance = 1000");
	}
	
	Account(String bal)
	{
		this.bal=bal;
		this.balInfo();
	}

	 void balInfo() {
		
		 System.out.println("Balance  based on user input is = "+bal);
		
	}
}
