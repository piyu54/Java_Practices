package com.staticexamples;
//variable,method,block,inner class
public class StaticExample {

	//variable
	static String  clgname ="Raisoni";
	int age;
	
	
	 StaticExample(int age)
	{
		this.age = age;
	}
	 
	 //method 
	 
	 public static void display()
	 {
		 System.out.println("static method");
	 }
	public static void main(String[] args) {
		
		
		System.out.println(clgname);
		StaticExample s = new StaticExample(11);
		
	}
}
