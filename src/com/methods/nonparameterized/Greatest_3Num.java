package com.methods.nonparameterized;

public class Greatest_3Num {
//Write a method that returns the greatest of three numbers
	
	int GreaterNum()
	{
		int a=8;
		int b=9;
		int c=99;
		if(a>b && b>c)
		{
			return a;
		}
		else if(b>a && b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
		
		 
	}
}
