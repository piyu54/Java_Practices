package com.ops.Polymorphism.Methodoverloading;

/*7. Overload a constructor in a Student class to initialize:
default values
only id
id and name*/
public class Student {

	
	void studentInfo()
	{
		System.out.println("Default Const");
	}
	
	void studentInfo(int id)
	{
		System.out.println(id);
	}
	
	void studentInfo(int id,String name)
	{
		 System.out.println(id +" "+name);
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentInfo();
		s.studentInfo(101);
		s.studentInfo(101, "sakshi");
		
		s.display(108);
		s.display(100, "vikas");
	}
	
	/*8. Overload a static method print() with:
one parameter
two parameters*/
	
	
	static void display(int id)
	{
		System.out.println(id);
	}
	static void display(int id,String name)
	{
		System.out.println(id+" "+name);
	}
}
