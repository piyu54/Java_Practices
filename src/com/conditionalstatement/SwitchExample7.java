package com.conditionalstatement;

public class SwitchExample7 {
//2. Accept a number (1–12) from the user and print the name of the month using a switch case.

	public static void main(String[] args) {

		int num = 11;

		switch (num) {

		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("mar");
			break;
		case 4:
			System.out.println("apr");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("jun");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("aug");
			break;

		case 9:
			System.out.println("sep");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
		default:
			System.out.println("invaild input");
		}

	}
}
