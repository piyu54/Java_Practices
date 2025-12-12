package com.scanner;

import java.util.Scanner;

public class Even_Odd {
//Take a number and check if it is even or odd.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter an number");

		int num = s.nextInt();
		if (num % 2 == 0) {
			System.out.println("num is even");
		} else {
			System.out.println("num is odd");
		}
	}

}
