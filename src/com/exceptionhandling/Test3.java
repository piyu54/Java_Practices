package com.exceptionhandling;

public class Test3 {
	//catch block is not  executed if exception is not occurred
	public static void main(String[] args) {
		
		try {
			System.out.println("in try block");
		}catch(Exception e) {
			System.out.println("in catch block");
		}finally {
			System.out.println("in finally block");
		}
	}
}
