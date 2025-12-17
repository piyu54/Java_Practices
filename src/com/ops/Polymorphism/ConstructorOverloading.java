package com.ops.Polymorphism;

public class ConstructorOverloading {

	private int id;
	private String name;
	ConstructorOverloading()
	{
		System.out.println("Default constructor");
	}
	ConstructorOverloading(int id)
	{
		this.id=id;
		this.Display();
	}
	ConstructorOverloading(int id,String name)
	{
		this.id=id;
		this.name=name;
		this.Display();
	}
	
	void Display()
	{
		System.out.println("Id : "+id);
		System.out.println("Name :"+name);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading();
		ConstructorOverloading c2 = new ConstructorOverloading(10);
		ConstructorOverloading c3 = new ConstructorOverloading(101, "piyu");
		
		
	}
	
	
	
}
