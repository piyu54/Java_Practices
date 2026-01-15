package com.arrayoperations1d;

public class ReverseArray {

	//Write a program to reverse a 1D array.
	public static void main(String[] args) {
		
		int[] marks = { 10, 20, 30, 40 ,10};
		
		System.out.println("reverse a 1D array");
		
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
	}
}

