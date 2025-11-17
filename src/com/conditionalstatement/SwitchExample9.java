package com.conditionalstatement;

public class SwitchExample9 {
	/*
	 * 5. Input color name (Red, Yellow, or Green) and print the appropriate action:
	 * 
	 * Red → Stop Yellow → Ready Green → Go
	 */

	public static void main(String[] args) {
		String color = "Yellow";

		switch (color) {

		case "Red":
			System.out.println("stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invaild input");

		}
	}
}
