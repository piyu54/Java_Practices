package com.conditionalstatement;

public class SwitchExample {
//	1. Write a Java program that takes an integer (1–7) and prints the corresponding day name (e.g., 1 → Monday)
	public static void main(String[] args) {
		 int day = 3;

	        // Determine the day of the week
	        switch (day)
	        {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            case 6:
	                System.out.println("Saturday");
	                break;
	            case 7:
	                System.out.println("Sunday");
	                break;
	            default:
	                System.out.println("Invalid day");
	        }

	}

}
