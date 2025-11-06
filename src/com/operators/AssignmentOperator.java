package com.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		System.out.println("----------Assignment operator-----------");
		
		int a=5;
		int b=9;
		
		System.out.println("= Assignment operator");
		System.out.println(a+=b);//addition a+b=14
		System.out.println(a-=b);//sub a-b= 14-9=5
		System.out.println(a/=b);
		System.out.println(a*=b);
		System.out.println(a%=b);
		
		
		

	}

}
