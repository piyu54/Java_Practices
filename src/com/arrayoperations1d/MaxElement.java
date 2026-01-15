package com.arrayoperations1d;
//Write a program to find the maximum element in a 1D array.
public class MaxElement {

	public static void main(String[] args) {
		
		int[] marks = { 10, 20, 30, 40 };
		double avg = 0;

		for (int i = 0; i < marks.length; i++) {
			avg+=marks[i];
			
		}
		double avg1=avg/=marks.length;
		System.out.println("average of elements in a 1D array :"+avg1);
	}
}
