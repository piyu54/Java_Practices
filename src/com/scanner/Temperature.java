package com.scanner;

import java.util.Scanner;

public class Temperature {
//Take temperature in Celsius and convert to Fahrenheit.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter an Temperature in Celsius");

		float cel = s.nextFloat();

		float fah = (cel * 9 / 5) + 32;
		System.out.println("Conerting in fahrenheit :" + fah);

	}

}
