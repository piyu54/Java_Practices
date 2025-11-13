package com.conditionalstatement;

public class Student_Marks {

	public static void main(String[] args) {
		/* Write a program to find grade of a student based on marks:
		90–100 → Grade A
		75–89 → Grade B
		50–74 → Grade C
		35–49 → Grade D
		Below 35 → Fail*/
		
		
		int marks = 91;
		
		if(marks>=90 )
		{
			System.out.println("Grade A");
		}
		else if(marks>=75 && marks<=89)
		{
			System.out.println("Grade B");
		}
		else if(marks>=50 && marks <=74)
		{
			System.out.println("Grade C");
		}
		else if(marks >=35 && marks<=49)
		{
			System.out.println("Grade D");
		}
		else 
		{
			System.out.println("Fail");
		}
	}

}
