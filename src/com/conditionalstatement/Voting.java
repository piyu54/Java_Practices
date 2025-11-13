package com.conditionalstatement;

public class Voting {

	public static void main(String[] args) {
		/* Write a program to check if a person is eligible to vote, and if eligible, 
		check if they can contest in elections (age ≥ 25).*/

		
		int age = 18;
		
		// Outer if → checks voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");

            // Inner if → checks contesting eligibility
            if (age >= 25) {
                System.out.println(" You are also eligible to contest in elections.");
            } else {
                System.out.println(" But you are not eligible to contest in elections (need to be 25 or older).");
            }

        } else {
            System.out.println(" You are not eligible to vote yet (must be at least 18).");
        }
	}

}
