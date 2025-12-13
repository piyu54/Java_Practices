package com.encapsulation;


/*3. Create a class Employee with private salary.
Add validation in setter: salary must be > 0, otherwise print error.***/
public class Employeee {

	
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		 if (salary > 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Error: Salary must be greater than 0");
	        }
	}
}
