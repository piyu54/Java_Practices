package com.classandobject;
//
public class Laptop {
	/*Q1. Create a class Laptop
Variables → brand, ram

Q2. Create a class Employee
Variables → id, name, salary

Q3. Create a class Car
Variables → model, price, color

Q4. Create a class Book
Variables → title, author, price

*/
	
	//global variable 
	
	String brand ;
	String name;
	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		
		String brandName=l.brand="Asus";
		String ownerName=l.name="Ram";
		
		System.out.println("Laptop Brand Name is :"+brandName);
		System.out.println("Laptop Owner Name is :"+ownerName);
		
		
	}
}
