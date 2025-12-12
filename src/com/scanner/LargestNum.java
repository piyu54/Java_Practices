package com.scanner;

import java.util.Scanner;

public class LargestNum {

	// Take three numbers and print the largest number.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter first num");
		int a = s.nextInt();
		System.out.println("Enter second num");
		int b = s.nextInt();
		System.out.println("Enter third num");
		int c = s.nextInt();

		LargestNum l = new LargestNum();
		System.out.println("Largest num is: " + l.largestNum(a, b, c));
	}

	int largestNum(int a, int b, int c) {
		if (a > b && b > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}

	}

}
