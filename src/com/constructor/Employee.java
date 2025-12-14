package com.constructor;

//Create a class Employee with a parameterized constructor that accepts id, name, and salary.
//Create 2 Employee objects and display the details.**
public class Employee {

	
	private int id;
	private String name;
	private String Salary;
	
	
	Employee(int id,String name,String Salary)
	{
		this.id=id;
		this.name=name;
		this.Salary=Salary;
		this.EmployeeInfo();
	}
	
	void EmployeeInfo()
	{
		System.out.println("Employee Details");
		System.err.println("Employee ID is :"+id);
		System.out.println("Employee Name is :"+name);
		System.err.println("Employee SALARY is :"+Salary);
	}
}
