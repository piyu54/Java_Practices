package com.constructor;

public class Student_Info {

	//Write a program with a parameterized constructor to initialize id and name of a Student and display them.
	
	int id;
	String name;
	
	Student_Info(int id,String name)
	{
		this.id=id;
		this.name=name;
		this.display();
	}
	
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	
	
	public static void main(String[] args) {
		Student_Info s= new Student_Info(14,"piyu");

	}

}
