package com.ops.types.inheritance;

public class Student extends Person{
	
	int s=50;
	int c=20;

	public static void main(String[] args) {
		
		
		
		Student s = new Student();
		System.out.println("This is person variable :"+s.p);

		System.out.println("This is student variable :"+s.s);

		System.out.println("This is student variable :"+s.c);
	}
}
