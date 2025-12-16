package com.ops.types.inheritance;

public class Child2 extends Parent2{
	int c = 3;

	public static void main(String[] args) {
		
		Child2 c=new Child2();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
	}
}
