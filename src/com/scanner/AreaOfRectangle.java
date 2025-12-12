package com.scanner;

import java.util.Scanner;

public class AreaOfRectangle {
// Take length and width and calculate area of rectangle.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter an length");

		int len = s.nextInt();

		System.out.println("enter an width");

		int width = s.nextInt();
		
		System.out.println("Area of Rectangle "+len*width);

	}

}
