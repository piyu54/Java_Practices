package com.ops.Polymorphism.Methodoverloading;
/*3.Create a method area() to calculate:
area of circle
area of rectangle*/
public class Area {

	
	 void area(double radius) {
	        System.out.println("Area of Circle: " + (3.14 * radius * radius));
	    }

	    void area(int length, int breadth) {
	        System.out.println("Area of Rectangle: " + (length * breadth));
	    }
	
	public static void main(String[] args) {
		
		Area a = new Area();
		a.area(66);
		a.area(13, 10);
	}
}
