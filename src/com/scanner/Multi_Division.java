package com.scanner;

import java.util.Scanner;

public class Multi_Division {
// Take two numbers and print multiplication & division.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter the first number ");

		int num = s.nextInt();

		System.out.println("enter the second number ");

		int num2 = s.nextInt();

		System.out.println("Multiplication of two number is :" + num * num2);

		System.out.println("Division of two number is :" + num / num2);

	}

}
