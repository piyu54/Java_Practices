package com.ops.types.inheritance;

public class B2 extends A1{

	
	double b = a * 2;
	public static void main(String[] args) {
		
		B2 b = new B2();
		System.out.println(b.a);
		System.out.println(b.b);
	}
	
}
