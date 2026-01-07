package com.exceptionhandling;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("Exception ");
//In this example if in try block there are no exception then catch block can not executed
		try {
			
		} catch (Exception e) {
			System.out.println("Handle exception");
		} finally {

			System.out.println(10/2);
		}
	}
}
