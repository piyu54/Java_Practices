package com.encapsulation;

public class Manager {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setId(101);
		e.setName("piyu");
		e.setSalary(50000);
		e.setDesignation("Java Developer");

		System.out.println("Here is an Employee details");
		System.out.println("Employee id is an :" + e.getId());
		System.out.println("Employee name is :" + e.getName());
		System.out.println("Employee salary is :" + e.getSalary());
		System.out.println("Employee Designation is :" + e.getDesignation());

	}

}
