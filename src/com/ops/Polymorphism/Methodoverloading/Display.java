package com.ops.Polymorphism.Methodoverloading;

/*4.Overload a method display() to print:
integer value
string value*/
public class Display {

	
	void display (int id)
	{
		System.out.println("Integer: "+id);
	}
	
	void display (String name)
	{
		System.out.println("String: "+name);
	}
	
	public static void main(String[] args) {
		
		Display d = new Display();
		d.display(101);
		d.display("sheetal");
	}
}
