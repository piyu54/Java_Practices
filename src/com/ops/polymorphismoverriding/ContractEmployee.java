
package com.ops.polymorphismoverriding;

public class ContractEmployee extends Employee {

	
	@Override
	void calculateSalary() {
	System.out.println("ContractEmployee salary");
	}
}
