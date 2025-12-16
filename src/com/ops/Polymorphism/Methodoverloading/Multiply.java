package com.ops.Polymorphism.Methodoverloading;

/*2.Overload a method multiply() to multiply:
two int values
two double values*/
public class Multiply {

	
//	void multiply(int a,int b)
//	{
//		System.out.println(a*b);
//	}
//	void multiply(double a,double b)
//	{
//		System.out.println(a*b);
//	}
	
	
	int multiply(int a,int b)
	{
		return a*b;
	}
	
	
	double multiply(double a,double b)
	{
		return a*b;
	}
	
	public static void main(String[] args) {
		Multiply m = new Multiply();
		
		System.out.println(m.multiply(10, 20));
		System.out.println(m.multiply(122333.22, 212323233.22));
		
		
	}
}
