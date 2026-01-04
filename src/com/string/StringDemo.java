package com.string;

public class StringDemo {

	public static void main(String[] args) {
		
		//by using String literal (scp immutable(cannot change))
		
//		String s1="java";
//		String s2="java";
//		System.out.println(s1==s2);//reference
//		System.out.println(s1.equals(s2));//values
		
		
		//different values
		
//		String s1="hello";
//		String s2=s1;
//		String s3="world";
//		System.out.println(s1==s3);//reference
//		System.out.println(s1.equals(s2));//values
		
		
		String s1="hello";
		String s2=s1+"world";
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
}
