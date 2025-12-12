package com.methods.parameterized;

public class Fact {

	//Write a method that returns the factorial of a number. 
	
	
	int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			
			 fact=fact*i;
		}
		return fact;
	}
}
