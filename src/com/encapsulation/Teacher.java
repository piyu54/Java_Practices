package com.encapsulation;

public class Teacher {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setId(101);
		s.setName("sakshi");
		
		System.out.println("Student info");
		System.err.println("Student Id :"+s.getId());
		System.err.println("Student Name :"+s.getName());
	}

}
