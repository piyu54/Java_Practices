package com.conditionalstatement;

public class AllExamples {

	public static void main(String[] args) {
		int doorCode = 1337;

		if (doorCode == 1337) {
		  System.out.println("Correct code. The door is now open.");
		} else {
		  System.out.println("Wrong code. The door remains closed.");
		}
		
		int myNum = 10; // Is this a positive or negative number?

		if (myNum > 0) {
		  System.out.println("The value is a positive number.");
		} else if (myNum < 0) {
		  System.out.println("The value is a negative number.");
		} else {
		  System.out.println("The value is 0.");
		}
		
		int myAge = 25;
		int votingAge = 18;

		if (myAge >= votingAge) {
		  System.out.println("Old enough to vote!");
		} else {
		  System.out.println("Not old enough to vote.");
		}
		
		int age = 20;
		boolean isCitizen = true;

		if (age >= 18) {
		  System.out.println("Old enough to vote.");
		  
		  if (isCitizen) {
		    System.out.println("And you are a citizen, so you can vote!");
		  } else {
		    System.out.println("But you must be a citizen to vote.");
		  }
		} else {
		  System.out.println("Not old enough to vote.");
		}
		
		
		int myNum2 = 5;

		if (myNum2 % 2 == 0) {
		  System.out.println(myNum2 + " is even");
		} else {
		  System.out.println(myNum2 + " is odd");
		} 
		int temperature = 30;

		if (temperature < 0) {
		  System.out.println("It's freezing!");
		} else if (temperature < 20) {
		  System.out.println("It's cool.");
		} else {
		  System.out.println("It's warm.");
		} 
		
		boolean isLoggedIn = true;
		boolean isAdmin = false;
		int securityLevel = 3; // 1 = highest

		if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
		  System.out.println("Access granted");
		} else {
		  System.out.println("Access denied");
		}

		// Try changing securityLevel to test different outcomes:
		//
		// securityLevel 1 = Access granted
		// securityLevel 2 = Access granted
		// securityLevel 3 = Access denied
		// securityLevel 4 = Access denied
		//
		// If isAdmin = true, access is granted.
	}

}
