package com.pojo;

import java.util.Scanner;
//
//3.Create class Calculator with methods add():
//add(int a, int b)
//add(int a, int b, int c)
//add(double a, double b)
//Take values using Scanner and show results.

public class Calculator {
	
	public int add(int a ,int b)
	{
		return a+b;
		
	}
	public int add(int a ,int b,int c)
	{
		return a+b+c;
		
	}
	public double add(double a ,double b)
	{
		return a+b;
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int First=s.nextInt();
		System.out.println("Enter the sec number");
		int sec=s.nextInt();
		System.out.println("Enter the third number");
		int third=s.nextInt();
		
		Calculator c= new Calculator();
		System.out.println("Addition of Two num "+c.add(First, sec));
		System.out.println("Addition of Three num "+c.add(First, sec, third));
		System.out.println("Addition of Two num in Decimal "+c.add(First, sec));
		
		
	}
}
