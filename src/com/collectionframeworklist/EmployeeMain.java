package com.collectionframeworklist;

import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101,"piyu","55000"));
		al.add(new Employee(102,"sakshi","25000"));
		
		for(Employee e :al)
		{
			System.out.println(e);
		}
	}
}
