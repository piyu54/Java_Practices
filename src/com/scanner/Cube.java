package com.scanner;

import java.util.*;

public class Cube {
// Take a number and print its square and cube.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter an number");

		int num = s.nextInt();

		System.out.println("The square of " + num + " is:" + (num * num));

		System.out.println("The cube of " + num + " is:" + (num * num * num));
	}

}
