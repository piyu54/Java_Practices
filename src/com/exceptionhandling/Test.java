package com.exceptionhandling;

public class Test {

	public static void main(String[] args) {

		System.out.println("Exception ");
//In this example the exception can't be disturb 
		try {
			System.out.println(10 / 0);
			
		} catch (Exception e) {
			System.out.println("Handle exception");
		} finally {

			System.out.println(10 / 2);
		}
	}
}
