package com.scanner;

import java.util.Scanner;

public class AllScannerExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("This is my Details");

		System.out.println("Enter your name");

		String name = s.nextLine();

		System.out.println("Enter your age");

		int age = s.nextInt();

		System.out.println("Enter you are male or female");

		String gender = s.next();

		System.out.println("Enter your date of birth ");

		int year = s.nextShort();

		s.nextLine();

		System.out.print("Enter Course Name");

		String course = s.nextLine();

		System.out.print("Enter Full Address");

		String address = s.nextLine();

		System.out.print("Enter Marks (percentage)");

		float marks = s.nextFloat();

		System.out.println("----------------------------");
		System.out.println("Here is my Details ");
		System.err.println("my name is " + name);
		System.err.println("my age is " + age);
		System.err.println("my gender is " + gender);
		System.err.println("my Date of year " + year);
		System.err.println("my gender is " + course);
		System.err.println("my Date of year " + address);
		System.err.println("my Date of year " + marks);
		
		
		s.next();
		s.nextByte();
		s.nextDouble();
		s.nextFloat();
		s.nextInt();
		s.nextLong();
		s.nextShort();
		s.hasNext();
		s.nextLine();
	}

}
