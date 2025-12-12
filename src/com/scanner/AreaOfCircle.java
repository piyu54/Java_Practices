package com.scanner;

import java.util.Scanner;

public class AreaOfCircle {
//	 Take radius from user and calculate area of circle.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter an radius");

		int radius = s.nextInt();

		System.out.println("Area of circle is " + 3.14 * radius * radius);

	}

}
