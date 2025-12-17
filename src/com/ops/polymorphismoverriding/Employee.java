package com.ops.polymorphismoverriding;

/*Employee Salary Example
Create a class Employee with method calculateSalary().
Override it in PermanentEmployee and ContractEmployee.*/
public class Employee {

	
	void calculateSalary()
	{
		System.out.println("Calculate the salary of employees");
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.calculateSalary();
		
		PermanentEmployee p = new PermanentEmployee();
		p.calculateSalary();
		
		ContractEmployee c = new ContractEmployee();
		c.calculateSalary();
	}
}
