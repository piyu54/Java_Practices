package com.encapsulation;

public class CarDetails {

	public static void main(String[] args) {

		Car c = new Car();
		c.setBrand("BMW");

		c.setPrice(100000000);

		System.out.println("Details of Car");
		System.out.println("Car Name is an:"+c.getBrand());
		System.out.println("Car price is :"+c.getPrice());
	}

}
