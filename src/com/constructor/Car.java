package com.constructor;


/*Write a program to create a class Car with:
Non-parameterized constructor that prints “Car Started”.
Parameterized constructor that takes model name and price.
Create both objects.*/

public class Car {

	
	private String model;
	private String price;
	
	Car()
	{
		System.out.println("Car Started");
	}
	
	Car(String model,String price)
	{
		this.model=model;
		this.price=price;
		this.CarInfo();
	}
	
	void CarInfo()
	{
	
		System.out.println("Car Model Name is :"+model);
		System.out.println("Car Price is :"+price);
	}
}
