package com.scanner;

import java.util.Scanner;

public class Details {

//	 Take name and age from user and display them
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name =s.nextLine();
		
		System.out.println("Enter your Age");
		
		int age =s.nextInt();
		
		System.out.println("My name is: "+name);
		System.out.println("My age is: 3"+age);
	}

}
