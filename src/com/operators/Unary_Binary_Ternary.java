package com.operators;

public class Unary_Binary_Ternary {

	public static void main(String[] args) {
		
		//operation -> a+b addition
		//operand-> a+b a and b are operand
		//operator -> + is an operator which is used to perform action
		
		// unary :Operates on one operand.
		
		System.out.println("-----------------unary----------");
		int x = 5;
		int y = -x;     // Unary minus
		x++;            // Unary increment (post-increment)
		--x;            // Unary decrement (pre-decrement)
		System.out.println(x);
		System.out.println(y);

		//binary :Operates on two operands.
		System.out.println("-----------------binary----------");
		int a = 10, b = 3;
		int add = a + b;   // Addition
		int sub = a - b;  // Subtraction
		
		System.out.println(add);
		System.out.println(sub);
		
		//ternary :Operates on three operands.
//		conditional (ternary) operator ? :
		System.out.println("-----------------ternary----------");
		int p = 10, v = 20;
		int max = (p > v) ? p : v;

		System.out.println(max);

	}

}
