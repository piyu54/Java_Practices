package com.conditionalstatement;

public class Ternary_Operator {

	public static void main(String[] args) {
//		int time = 20;
//		String result = (time < 18) ? "Good day." : "Good evening.";
//		System.out.println(result);
//		int time2 = 20;
//		System.out.println((time2 < 18) ? "Good day." : "Good evening.");
		
		int time = 22;
		String message = (time < 12) ? "Good morning."
		               : (time < 18) ? "Good afternoon."
		               : "Good evening.";
		System.out.println(message);
	}

}
