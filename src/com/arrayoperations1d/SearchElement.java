package com.arrayoperations1d;

public class SearchElement {

	// Write a program to search an element in a 1D array.
	public static void main(String[] args) {

		int[] marks = { 10, 20, 30, 40 };
		int search = 40;

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] == search) {
				System.out.println("The search element in a 1D array is :" + search);
			} 

		}
		
//		
		System.out.println("----------using for each----------");
		int search2=10;
		for (int x : marks) {
			if(x==search2)
			{
				System.out.println("The search element in a 1D array is :"+search2);

			}
		}
		
		
	}
}
