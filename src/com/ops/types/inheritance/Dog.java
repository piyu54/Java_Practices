package com.ops.types.inheritance;

public class Dog extends Animal{

	
	void bark()
	{
		System.out.println("this is an method in dog ");
	}
	public static void main(String[] args) {
		Dog a = new Dog();
		a.eat();
		a.bark();

	}

}
