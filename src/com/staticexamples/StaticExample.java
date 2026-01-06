package com.staticexamples;

//variable,method,block,inner class
public class StaticExample {

	// variable
	static String clgname = "Raisoni";
	int age;

	StaticExample(int age) {
		this.age = age;
		
	}
	public void normaldisplay()
	{
		System.out.println(age);
	}
	// method

	public static void display() {
//		 static int id=101; //not possible
		System.out.println("static method");
	}

	// block first line to executed no need of object creation

	static {
		System.out.println("static block");
	}
	// object creation
	{
		System.out.println("non static block");
	}
	
	//inner class
	
	public static class inner{
		
		
	}

	public static void main(String[] args) {

		System.out.println(clgname);
		StaticExample s = new StaticExample(11);
		s.normaldisplay();

	}
}
