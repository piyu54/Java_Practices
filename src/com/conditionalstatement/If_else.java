package com.conditionalstatement;

public class If_else {

	public static void main(String[] args) {
		int age = 19;
		
		//if execute when condition is true and else block execute when consition is false
		if (age >= 18) {
			System.out.println("you can vote");
		}
		else
		{
			System.out.println("you cant vote first be an 18+");
		}

		boolean isRaining = false;

		if (isRaining) {
		  System.out.println("Bring an umbrella!");
		} else {
		  System.out.println("No rain today, no need for an umbrella!");
		}
		
		int time = 20;

		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
	}

}
