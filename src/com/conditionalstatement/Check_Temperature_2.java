package com.conditionalstatement;

public class Check_Temperature_2 {

	public static void main(String[] args) {
		// Write a program to classify a temperature as Hot, Warm, Cool, or Cold.
		
		int temp= 35;
		
		if (temp >= 35)
		    System.out.println("Hot");
		else if (temp >= 25)
		    System.out.println("Warm");
		else if (temp >= 15)
		    System.out.println("Cool");
		else
		    System.out.println("Cold");


	}

}
