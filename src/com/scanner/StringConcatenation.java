package com.scanner;

import java.util.*;
public class StringConcatenation {
// Take two strings using nextLine() and print their concatenation.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an first Sentence ");
		String first=s.nextLine();
		
		System.out.println("Enter an Second Sentence ");
		String sec=s.nextLine();
		
		String con=first+sec;
		
		System.out.println("The concatenation of two sencetence is :"+con);

	}

}
