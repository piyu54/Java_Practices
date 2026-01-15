package com.arrayoperations1d;

//Write a program to find the length of a 1D array.
public class LengthOfArray {

	public static void main(String[] args) {

		int[] marks = { 10, 20, 30, 40 };

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		System.out.println("length of a 1D array is: " + marks.length);
		System.out.println("----------using for each----------");
		for (int z : marks) {
			System.out.println(z);
		}
		System.out.println("length of a 1D array is: " + marks.length);
	}
}
