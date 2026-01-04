package com.string;

public class StringBuilderex {

	public static void main(String[] args) {
		
//		Create a StringBuilder with text "Hello" and append " Java".
		
		StringBuilder s = new StringBuilder("Hello ");
		s.append("Java");
		System.out.println(s);
		
//		Create a StringBuilder and insert the word "Java" in the middle of a sentence.
		String sen="i am learning programming ";
		StringBuilder s1 = new StringBuilder(sen);
		int mid=sen.length()/2;
		s1.insert(mid, " Java");
		System.out.println(s1.toString());
		
//		Reverse a string using StringBuilder.
		StringBuilder s2= new StringBuilder("hello");
		s2.reverse();
		System.out.println(s2);
		
//		Replace the word "Java" with "Python" using StringBuilder.
		
		StringBuilder s3= new StringBuilder("Java");
		s3.replace(0, 4, "Python");
		System.out.println(s3);
		
//		Delete characters from index 2 to 5 using StringBuilder.
		
		StringBuilder s4= new StringBuilder("i am java learner");
		s4.delete(2, 5);
		System.out.println(s4);
		
//		Convert String to StringBuilder and modify it.
//		Count the number of characters using StringBuilder (without length()).
//		Check whether the string is palindrome using StringBuilder reverse().
	}
}
