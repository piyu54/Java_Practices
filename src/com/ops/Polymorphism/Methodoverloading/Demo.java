package com.ops.Polymorphism.Methodoverloading;

/*6.Create a class Demo and overload show() using:
(int, String)
(String, int)*/
public class Demo {

	
	
	void show(int id,String name)
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	void show(String name,int id)
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	
}
