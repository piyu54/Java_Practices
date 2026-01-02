package com.pojo;

public class Employee extends Person{

	double sal;
	
	Employee(String name,int age,double sal)
	{
		super(name,age);
		this.sal=sal;
	}
	
	void display()
	{
		System.out.println("Name:"+name+" "+"Age:"+age +" "+"Sal:"+sal);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee("piyu",24,55000);
		e.display();
	}
	
	
}
