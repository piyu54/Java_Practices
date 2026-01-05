package com.staticexamples;

public class Student {
//Create a class Student with:
//	static variable → collegeName
//	non-static → id, name
//	method to display details
//	Create 3 objects and show how collegeName is same for all.
	
	static String collegeName="G H Raisoni";
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(collegeName);
		System.out.println("-----------------");
	}
	public static void main(String[] args) {
		
		Student s = new Student(1,"piyu");
		s.display();
		Student s1= new Student(2,"sakshi");
		s1.display();
		Student s2 = new Student(3,"prixi");
		s2.display();
		
	}
}
