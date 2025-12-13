package com.scanner;

import java.util.Scanner;

public class Employee {
// Take employee name, id, and salary and print employee details.
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name =s.nextLine();
		
		System.out.println("Enter your Id");
		int id =s.nextInt();
		
		System.out.println("Enter your Salary");
		int sal =s.nextInt();
		
		System.out.println("Employee details here..........!!");
		
		System.out.println("Employee Name is :"+name);
		System.out.println("Employee Name is :"+id);
		System.out.println("Employee Name is :"+sal);
		
		

	}

}
