package com.string;

public class StringDemo {

	public static void main(String[] args) {
		
		//by using String literal (scp immutable(cannot change) inside heap memory)
		
//		String s1="java";
//		String s2="java";
//		System.out.println(s1==s2);//reference true
//		System.out.println(s1.equals(s2));//values true
		
		
		//different values
		
//		String s1="hello";
//		String s2=s1;
//		String s3="world";
//		System.out.println(s1==s3);//reference false
//		System.out.println(s1.equals(s2));//values true
		
//		
//		String s1="hello";
//		String s2=s1+"world";
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s1==s2);//reference false
//		System.out.println(s1.equals(s2));//value false
		
		
		//with new keyword(scp+heap)
//		String str1 = new String("hello");
//		String str2 = "hello";
//
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str1 == str2); // references
//		System.out.println(str1.equals(str2)); // Values
		
		String s1=new String("hello");
		String s2=new String("hello");
		System.out.println(s1==s2);//ref false
		System.out.println(s1);
	}
}
