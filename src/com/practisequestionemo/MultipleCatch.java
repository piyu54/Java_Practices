package com.practisequestionemo;

//Write a program where multiple catch blocks handle different exceptions.
public class MultipleCatch {

	public static void main(String[] args) {
		try {
		    System.out.println(10 / 0);
		}
		catch (ArithmeticException e) {
		    System.out.println("Arithmetic Exception handled "+e);
		}
		catch (Exception e1) {
		    System.out.println("General Exception handled");
		}

		
		
	}
}
