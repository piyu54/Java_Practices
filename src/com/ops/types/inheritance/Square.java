package com.ops.types.inheritance;

public class Square extends Shape{

	
	void square()
	{
		System.out.println("circle");
	}

	public static void main(String[] args) {
		
		Square c= new Square();
		System.out.println(c.s);
		c.square();
	}
}
