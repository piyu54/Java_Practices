package com.constructor;

public class Rectangle {
//Create a class Rectangle with a non-parameterized constructor that sets length = 10 and width = 5. Print the area.

	int length;
	int width;

	Rectangle() {
		this.length = 10;
		this.width = 5;
		this.area();
	}

	void area() {
		System.out.println("Area of Rectangle is " + length * width);
	}

	public static void main(String[] args) {

		Rectangle r = new Rectangle();

	}

}
