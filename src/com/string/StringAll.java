package com.string;

public class StringAll {
//		Find length of string using length() method. 
	
	public static void main(String[] args) {
		
	
	String name="piyu";
	
	System.out.println(name.length());
	
//	Convert string to uppercase.	Convert string to lowercase. 

	
		
		String fname="vik";
		String lname="singh";
		
		System.out.println(fname.toLowerCase());
		System.out.println(fname.toUpperCase());
		
//		Check whether two strings are equal or not. 
		System.out.println(fname.equals(lname));
		
//		Concatenate two strings without using + operator.
		
		System.out.println(fname.concat(lname));
		
//		Check whether a string contains the word "Java". 
		
		System.out.println(fname.contains("java"));
		
//		Find the first and last character of a string.
		
		System.out.println(fname.charAt(0));
		System.out.println(fname.charAt(2));
		System.out.println(fname.charAt(fname.length()-1));
}
}
