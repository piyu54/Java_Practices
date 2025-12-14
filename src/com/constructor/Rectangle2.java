package com.constructor;

public class Rectangle2 {
//Create a class Rectangle with a parameterized constructor to set length and width, and print the area.
	
	
	private int length;
	private int width;
	
	
	Rectangle2(int length,int width)
	{
		this.length=length;
		this.width=width;
		this.area();
	}
	
	void area()
	{
		
		int area=width*length;
		System.out.println("Area of Rectangle is : "+area);
	}
}
