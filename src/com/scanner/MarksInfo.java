package com.scanner;

import java.util.Scanner;

public class MarksInfo {
// Take marks of 5 subjects and print total & percentage.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your Marks ");
		System.out.println("Math");
		float math = s.nextFloat();
		System.out.println("English");
		float english = s.nextFloat();
		System.out.println("Computer science");
		float cs = s.nextFloat();
		System.out.println("History");
		float history = s.nextFloat();
		System.out.println("biology");
		float bio = s.nextFloat();

		float total = math + english + cs + history + bio;

		System.out.println("The total subject is " + total);

		float percentage = (total / 500) * 100;

		System.out.println("The Percentage is " + percentage);

	}

}
