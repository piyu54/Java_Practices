package com.pojo;

public class PojoExample {

	// fields
	// arg con
	// no arg con
	// public getter setter
	// tostring

	int empid;
	String name;
	double salary;

	public PojoExample() {

	}

	public PojoExample(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;

	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PojoExample [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

	}
}
