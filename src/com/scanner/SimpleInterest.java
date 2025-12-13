package com.scanner;

import java.util.*;

public class SimpleInterest {

//	 Take principal, rate, time and calculate Simple Interest (SI = PRT/100)

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter an principle : ");

		int p = s.nextInt();

		System.out.println("Enter an rate : ");

		int r = s.nextInt();

		System.out.println("Enter an time : ");

		int t = s.nextInt();
		
		int SI = (p * r * t) / 100;
		
		System.out.println("Simple Interest is :"+SI);
	}
}
