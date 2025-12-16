package com.ops.types.inheritance;

public class Car extends Vehicle{

	
	
	
	void drive()
	{
		System.out.println("you can drive");
	}
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.start();
		c.drive();

	}

}
