package com.scanner;

import java.util.*;

public class StudentResult {
//Take marks as float and check whether student is pass or fail.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your marks");

		float marks = s.nextFloat();

		if (marks < 35) {
			System.err.println("Sorry !!You are FAIL");
		} else {
			System.out.println("Congo !!! You are PASS");
		}

	}

}
