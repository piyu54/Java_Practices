package com.classandobject;

public class Car {
//Q3. Create a class Car
//	Variables → model, price, color

	String model;
	float price;
	String color;

	public static void main(String[] args) {

		Car c = new Car();
		String CarModel = c.model = "BMW";
		float CarPrice = c.price = 1000000;
		String CarColor = c.color = "Red";

		System.out.println(CarModel);
		System.out.println(CarPrice);
		System.out.println(CarColor);
	}
}
