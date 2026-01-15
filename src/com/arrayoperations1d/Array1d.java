package com.arrayoperations1d;

//Write a program to declare and initialize a 1D array of integers.
//Write a program to print all elements of a 1D array.
public class Array1d {
	public static void main(String[] args) {

		
		int[] marks= {10,20,30,40};
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("----------using for each----------");
		for(int z:marks)
		{
			System.out.println(z);
		}
	}
}
