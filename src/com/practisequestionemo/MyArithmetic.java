package com.practisequestionemo;
//Write a program to handle ArithmeticException using try-catch.
public class MyArithmetic {

	
	public static void main(String[] args) {
		
		try {
		System.out.println(10/0);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}

