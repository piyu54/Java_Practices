package com.ops.Polymorphism.Methodoverloading;

/*1.Create a class Calculator and overload add() to add:
two integers
three integers*/

public class Calculator
{

	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
