package com.string;

public class StringBufferEx {

	public static void main(String[] args) {
		
//
//Create a StringBuffer and append your name.
		
		StringBuffer s = new StringBuffer();
		s.append("Priya Kushwaha");
		System.out.println(s);
		
//Insert "Programming" inside "I Love " using StringBuffer.
		
		StringBuffer s1 = new StringBuffer("I Love");
		s1.insert(6, " Programming");
		System.out.println(s1);
		
//Reverse a string using StringBuffer.
		StringBuffer s2 = new StringBuffer("I Love");
		s2.reverse();
		System.out.println(s2);
//Delete last 3 characters using StringBuffer.
		
		StringBuffer s3 = new StringBuffer("I Love");
		s3.delete(3, 6);
		System.out.println(s3);
//Replace "India" with "Bharat" using StringBuffer.
		
		StringBuffer s4 = new StringBuffer("India");
		s4.replace(0, 0, "Bharat ");
		System.out.println(s4);
//Print length and capacity of StringBuffer.
		
		StringBuffer s5 = new StringBuffer("India");

		System.out.println(s5.length());
		System.out.println(s5.capacity());
		
		
//Convert StringBuffer to String.
		StringBuffer s6 = new StringBuffer("India");
		String String=s6.toString();
		System.out.println(String);
		
	}
}
