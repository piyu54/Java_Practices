package com.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// Bitwise Operators

		/*
		 * ...512 256 128 64 32 16 8 4 2 1 bitwise operator works bit by bit
		 * 
		 * denote by & true(1)& false(0)
		 */

		System.out.println("---------Bitwise Operator----------");
		System.out.println("Decimal to Binary");
		int a = 125;

		System.out.println(Integer.toBinaryString(a));

		System.out.println("Operation with &");

		System.out.println(4 & 23);
		System.out.println(14 & 43);

		System.out.println("Operation with |");

		System.out.println(4 | 23);
		System.out.println(14 | 43);
		
		//
		System.out.println(12&15);
		System.out.println();
/*	12&15
    11|13&12
    17&7&49
    XOR
    */
		
		System.out.println("Operations");
		System.out.println(12&15);
		
	}

}
