package com.scanner;

import java.util.Scanner;

public class Addition {

//	Take two numbers from user and print their addition.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your first num");
		
		int a=s.nextInt();
		
		System.out.println("Enter your second num");
		
		int b=s.nextInt();
		
		System.out.println("Addition of two num is : "+(a+b));

	}

}
