package com.encapsulation;

public class Employee {

	private int id;
	private String name;
	private int Salary;
	private String designation;
	
	
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
	
	public void setSalary(int Salary)
	{
		this.Salary=Salary;
	}
	public int getSalary()
	{
		return Salary;
	}
	
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	public String getDesignation()
	{
		return designation;
	}
}
