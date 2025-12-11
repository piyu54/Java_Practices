package com.ops.inheritance;

public class Dog extends Animal {//child sub

	
	public void barking()
	{
		System.out.println("Dog is Barking");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		
		d.barking();
		d.eating();

	}

}
