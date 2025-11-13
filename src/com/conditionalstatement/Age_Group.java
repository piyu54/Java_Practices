package com.conditionalstatement;

public class Age_Group {

	public static void main(String[] args) {
		/*Write a program to print a message based on age group:

0–12 → Child
13–19 → Teenager
20–59 → Adult
60+ → Senior Citizen*/
		
		
		int age=17;
		
		if(age>=0 && age<=12)
		{
			System.out.println("Child");
		}
		else if(age>=13 && age<=19)
		{
			System.out.println("Teenager");
		}
		else if(age>=20 && age<=59)
		{
			System.out.println("Adult");
		}
		else 
		{
			System.out.println("Senior Citizen");
		}


	}

}
