package com.pojo;

import java.util.Scanner;

public class EmpAddMain {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

//	       
	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter City: ");
	        String city = sc.nextLine();

	        System.out.print("Enter State: ");
	        String state = sc.nextLine();

	        Address addr = new Address(city, state);
	        Employee2 emp = new Employee2(id, name, addr);

	        
	        System.out.println("\n--- Employee Details ---");
	        System.out.println("ID     : " + emp.getId());
	        System.out.println("Name   : " + emp.getName());
	        System.out.println("City   : " + emp.getA().getCity());
	        System.out.println("State  : " + emp.getA().getState());

	        sc.close();
	}
	
}
