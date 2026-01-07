package com.exceptionhandling;

public class ExceptionScenarios {

	public static void main(String[] args) {
		
		System.out.println("ExceptionScenarios");
		
		try {
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
