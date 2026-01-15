package com.arrayoperations1d;

//Write a program to find the sum of all elements in a 1D array
public class SumOfElement {
	public static void main(String[] args) {

		int[] marks = { 10, 20, 30, 40 };
		int sum=0;

		for (int i = 0; i < marks.length; i++) {
			sum+=marks[i];
		}
		System.out.println("sum of all elements in a 1D array is :"+sum);

		System.out.println("----------using for each----------");
		int sum2=0;
		for (int x : marks) {
			sum2+=x;
		}
		System.out.println("sum of all elements in a 1D array is :"+sum2);

	
	}
}
