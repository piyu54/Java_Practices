package com.classandobject;

public class Employee {

	/*
Q2. Create a class Employee
Variables → id, name, salary*/
	
	
	int id;
	String name;
	double salary;
	
	
	public static void main(String[] args) {
		Employee e = new Employee();
		int EmpId=e.id=101;
		String EmpName=e.name="Riya";
		double EmpSal=e.salary=55000;
		
		System.out.println(EmpId);
		System.out.println(EmpName);
		System.out.println(EmpSal);
		
	}
}
