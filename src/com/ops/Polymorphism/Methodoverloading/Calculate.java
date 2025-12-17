package com.ops.Polymorphism.Methodoverloading;

/*10.Overload a method calculate() to find:
square of a number
cube of a number
*/
public class Calculate {

	
	void calculate(int a)
	{
		System.out.println("Square of a number :"+a*a);
	}
	
	void calculate(int a,int b)
	{
		System.out.println("Cube of a number :"+a*a*a);
	}
	
	public static void main(String[] args) {
		
		Calculate c = new Calculate();
		c.calculate(10);
		c.calculate(12333);
	}
}
