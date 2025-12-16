package com.ops.types.inheritance;

public class Z  extends Y{

	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		Z z = new Z();
		z.display();
	}
}
