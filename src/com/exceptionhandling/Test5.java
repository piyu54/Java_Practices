package com.exceptionhandling;

public class Test5 {
	//Example- finally wont be executed in below case
	public static void main(String[] args) {
		
		try {
			System.exit(0); //shut down jvm
		} catch (Exception e) {
			System.out.println("in catch block");
		} finally {
			System.out.println("in finally block");
		}
	}
}
