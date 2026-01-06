package com.pojo;

import java.util.Scanner;

public class StudentMain {

public static void main(String[] args) {
		
//		Student s2= new Student(101,"piyu",92);
//		System.out.println(s2);
		
		Scanner sc = new Scanner (System.in);
		Student s = new Student();
		System.out.println("Enter an student id");
		s.setId(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Enter an student name");
		s.setName(sc.nextLine());
		
		
		System.out.println("Enter an student percentage");
		s.setPerc(sc.nextFloat());
		
		
		System.out.println(s);
	
		sc.close();
}
}
