package com.pojo;

public class Employee extends Person {

	private double sal;
	

	Employee() {

	}

	Employee(String name, int age, double sal) {
		super(name, age);
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + sal + "]";
	}

	

}
