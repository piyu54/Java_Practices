package com.scanner;

import java.util.Scanner;

public class NumberCheck {
// Take a number and check if it is positive, negative, or zero.
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an number");
		int num =s.nextInt();
		
		if(num==0)
		{
			System.out.println("num is zero");
		}
		else if(num>1)
		{
			System.out.println("num is postive");
		}
		else if(num<0)
		{
			System.out.println("num is negative");
		}
		else
		{
			System.out.println("invaild num");
		}

	}

}
