package com.ops.ecm;

import java.util.Scanner;

public class StudentInfo extends Student{

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Student Details");
//		
//		int id = s.nextInt();
//		
//		
//		String name= s.nextLine();
		
		StudentInfo s2 = new StudentInfo();
		s2.setId(101);
		s2.setName("piyu");
		
		s2.displayInfo();
		
	}
}
