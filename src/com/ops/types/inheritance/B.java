package com.ops.types.inheritance;

public class B extends A{

	
	void showB()
	{
		System.out.println("this is an method of class B");
	}
	public static void main(String[] args) {
		
		B b=new B();
		b.showA();
		b.showB();
	}
	
}
