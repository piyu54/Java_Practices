package com.staticexamples;

public class Staticdemo {

static int id=10;
	
	static void m1()
	{
		System.out.println("this is an static method");
	}



	public static void main(String [] args)
	{
		System.out.println(Staticdemo.id);
		Staticdemo.m1();
		
	}
}
