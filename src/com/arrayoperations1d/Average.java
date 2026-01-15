package com.arrayoperations1d;
//Write a program to find the average of elements in a 1D array.
public class Average {

	public static void main(String[] args) {

		int[] marks = { 10, 20, 30, 40 };
		double avg = 0;

		for (int i = 0; i < marks.length; i++) {
			avg+=marks[i];
			
		}
		double avg1=avg/=marks.length;
		System.out.println("average of elements in a 1D array :"+avg1);
		
		System.out.println("----------using for each----------");
		int sum2=0;
		for (int x : marks) {
			sum2+=x;
		}
		double aveage=sum2/marks.length;
		System.out.println("sum of all elements in a 1D array is :"+aveage);

	}
}
