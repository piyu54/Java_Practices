package com.conditionalstatement;

public class SwitchExample6 {
	public static void main(String[] args) {

		char operation = '*';

		switch (operation) {
		case '+':
			System.out.println("Addition of two num " + (2 + 2));
			break;

		case '-':
			System.out.println("Sub of two num " + (2 - 2));
			break;
		case '*':
			System.out.println("Multi of two num " + (2 * 2));
			break;
		case '/':
			System.out.println("Div of two num " + (2 / 2));
			break;
		case '%':
			System.out.println("Mod of two num " + (2 % 2));
			break;
		default:
			System.out.println("Invaild operation");

		}
	}
}
