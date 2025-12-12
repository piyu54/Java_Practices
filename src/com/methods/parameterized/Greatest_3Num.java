package com.methods.parameterized;

public class Greatest_3Num {
//Write a method that returns the greatest of three numbers
	
	int GreaterNum(int a,int b,int c)
	{
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
