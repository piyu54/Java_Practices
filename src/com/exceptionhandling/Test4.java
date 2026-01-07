package com.exceptionhandling;

public class Test4 {

	public static void main(String[] args) {

		try {
			int a = 20 / 0;
			System.out.println("in try block");//this will not executed
		} catch (Exception e) {
			System.out.println("in catch block");
		} finally {
			System.out.println("in finally block");
		}
	}
}
