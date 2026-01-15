package com.arrayoperations1d;

import java.util.Arrays;

//Write a program to sort a 1D array in descending order.
public class DesArray {

	public static void main(String[] args) {
		
		int[] marks = { 10, 20, 30, 40 ,10};
		
		Arrays.sort(marks);
		
//		Write a program to sort a 1D array in ascending order.
		System.out.println("sort a 1D array in ascending order");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("sort a 1D array in descending order");
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
	}
}
