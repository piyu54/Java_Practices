
package com.ops.polymorphismoverriding;

public class PermanentEmployee extends Employee{

	
	@Override
	void calculateSalary() {
		
		System.out.println("Permanent salary of employee");
	}
}
