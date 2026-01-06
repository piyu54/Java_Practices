package com.pojo;

public class Person {

//	2.Create parent class Person (name, age).
//	Create child class Employee (salary).
//	Call parent constructor using super()
//	Child should print all details
//	Create one object and display data
	
	String name;
	int age;
	
	Person()
	{
		
	}
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
}
