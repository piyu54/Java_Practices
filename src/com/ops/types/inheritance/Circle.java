package com.ops.types.inheritance;

public class Circle extends Shape{

	void circle()
	{
		System.out.println("circle");
	}

	public static void main(String[] args) {
		
		Circle c= new Circle();
		System.out.println(c.s);
		c.circle();
	}
}
