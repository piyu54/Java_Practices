package com.encapsulation;

/*1. Create a class Student with private variables id and name.
Provide getters and setters. Write a program to set values and print them.*/
public class Student {

	
	private int id;
	private String name;
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
