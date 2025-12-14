package com.constructor;

public class Student2 {

	
	private int id;
	private String name;
	private String Salary;
	private int num;
	private String address;
	
	
	Student2(int id,String name,String Salary,int num,String address)
	{
		this.id=id;
		this.name=name;
		this.Salary=Salary;
		this.num=num;
		this.address=address;
		this.StudentInfo();
	}
	
	void StudentInfo()
	{
		System.out.println("Student Information");
		System.out.println("Student id is an :"+id);
		System.out.println("Student name is :"+name);
		System.out.println("Student Salary is an :"+Salary);
		System.out.println("Student num is :"+num);
		System.out.println("Student address is an :"+address);
		
	}
}
