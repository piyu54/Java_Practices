package com.arrayoperations1d;
//Write a program to find the maximum element in a 1D array.
public class MaxElement {

	public static void main(String[] args) {
		
		int[] marks = { 10, 20, 30, 40 };
		int max = marks[0];

		for (int i = 0; i < marks.length; i++) {
			if(marks[i]>max)
			{
				max=marks[i];
			}
			
		}
		
		System.out.println("maximum element in a 1D array :"+max);
		
		System.out.println("----------using for each----------");
		int max2=marks[0];
		for (int x : marks) {
			if(x>max2)
			{
				max2=x;
			}
		}
		
		System.out.println("sum of all elements in a 1D array is :"+max2);
	}
}
