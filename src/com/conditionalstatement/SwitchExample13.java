package com.conditionalstatement;

public class SwitchExample13 {
/*
 * 
 * 9. Take month number (1–12) and print the corresponding season:

Dec–Feb → Winter
Mar–May → Summer
Jun–Aug → Monsoon
Sep–Nov → Autumn*/
	
	public static void main(String[] args) {
		
		int num = 11;

		switch (num) {

		case 1:
			System.out.println("Winter");
			break;
		case 2:
			System.out.println("Winter");
			break;
		case 3:
			System.out.println("Summer");
			break;
		case 4:
			System.out.println("Summer");
			break;
		case 5:
			System.out.println("Summer");
			break;
		case 6:
			System.out.println("Monsoon");
			break;
		case 7:
			System.out.println("Monsoon");
			break;
		case 8:
			System.out.println("Monsoon");
			break;

		case 9:
			System.out.println("Autumn");
			break;
		case 10:
			System.out.println("Autumn");
			break;
		case 11:
			System.out.println("Autumn");
			break;
		case 12:
			System.out.println("Winter");
			break;
		default:
			System.out.println("invaild input");
		}
	}
}
