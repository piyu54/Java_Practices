package com.ops.types.inheritance;

public class Teacher extends Person {

	int s = 60;
	int c = 80;

	public static void main(String[] args) {

		Teacher s = new Teacher();
		System.out.println("This is person variable :"+s.p);

		System.out.println("This is student variable :"+s.s);

		System.out.println("This is student variable :"+s.c);
	}

}
