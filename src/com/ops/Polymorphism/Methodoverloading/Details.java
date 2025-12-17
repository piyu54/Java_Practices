package com.ops.Polymorphism.Methodoverloading;
/*12. Overload details() method to display:
name
name and age*/
public class Details {

	
	void details(String name)
	{
		System.out.println("Name is :"+name);
	}
	
	void details(String name,int age)
	{
		System.out.println("Name is :"+name+" And Age is :"+age);
	}
	
	public static void main(String[] args) {
		
		Details d = new Details();
		d.details("Yash");
		d.details("Reena", 50);
	}
}
