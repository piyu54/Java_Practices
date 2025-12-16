package com.ops.types.inheritance;

public class Dog2  extends Animal2{

	
	void dog()
	{
		System.out.println("this is an dog");
	}
	
	public static void main(String[] args) {
		
		Dog2 d= new Dog2();
		d.LivingThing();
		d.animal();
		d.dog();
		}
	
	
}
