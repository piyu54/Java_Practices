package com.conditionalstatement;

public class SwitchExample11 {
//7. Use a switch statement to check if a number is even or odd (hint: use number % 2 as the expression)

	public static void main(String[] args) {

		int num = 9;

		switch (num % 2) {
		case 1:
			System.out.println(num + " is odd");
			break;

		default:
			System.out.println(num + " is even");
			break;

		}
	}
}
