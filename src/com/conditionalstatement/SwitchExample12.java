package com.conditionalstatement;

public class SwitchExample12 {
//8. Accept a category type (Domestic, Commercial, Industrial) and print the electricity rate per unit using a switch case.
	
	public static void main(String[] args) {
		String elerate="Domestic";
		
		switch(elerate)
		{
		
		case "Domestic":
		System.out.println("The electricity rate per unit 1200");
		break;
		
		case "Commercial":
			System.out.println("The electricity rate per unit 2000");
			break;
			
		case "Industrial":
			System.out.println("The electricity rate per unit 3000");
			break;
			
		default:
			System.out.println("Invaild input");
			
		}
		
	}
}
