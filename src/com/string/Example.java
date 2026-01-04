package com.string;
//Print each character of a string on a new line. 
public class Example {

	
	public static void main(String[] args) {
		
		String name="priya";
		
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(4));
		
		System.out.println("----------using forloop-----------");
		for(int i=0;i<=name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
//		

//		Convert string to uppercase. 
//		Convert string to lowercase. 
//		Check whether two strings are equal or not. 
//		Concatenate two strings without using + operator.
//		Check whether a string contains the word "Java". 
//		Find the first and last character of a string.
	}
}
