package com.conditionalstatement;

public class SwitchExample5 {
	public static void main(String[] args) {

		char firstletter = 'V';

		switch (firstletter) {

		case 'P':
			System.out.println("This first char is P");
			break;

		case 'V':
			System.out.println("This first char is V");
			break;

		case 'S':
			System.out.println("This first char is S");
			break;
		case 'I':
			System.out.println("This first char is I");
			break;
		default:
			System.out.println("Enter right first letter ");
			
		}
	}
}
