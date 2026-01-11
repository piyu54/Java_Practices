package com.exceptionhandling;



//What is the output if an exception occurs inside finally block?
public class Finally {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
		}

		catch (Exception e1) {
			System.out.println("General Exception handled "+e1);
		}

		finally {
			System.out.println("Finally block exceute");
		}
	}
}
