package com.array;

public class ArrayDemo {

	// static way

	public static void main(String[] args) {

		System.out.println("Array  static way");
		int[] marks = { 10, 20, 30, 40 };

		System.out.println(marks[0]);// 10

		System.out.println("iteration");
		// iteration
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		System.out.println("--------------------------");
		// dynamic way

		System.out.println("Dynamic way");
		
		int[] marks2 = new int[5];
		marks2[0]=10;
		marks2[1]=20;
		marks2[2]=30;
		marks2[3]=40;
		marks2[4]=50;
		
		System.out.println(marks2[0]);//
		System.out.println("Iteration");
		
		for(int i=0;i<marks2.length;i++)
		{
			System.out.println(marks2[i]);
		}
	}

}
