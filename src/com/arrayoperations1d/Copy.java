package com.arrayoperations1d;

//Write a program to copy elements from one array to another.
public class Copy {

	public static void main(String[] args) {

		int[] marks = { 10, 20, 30, 40 ,10};
		
		int[] copy=marks;
		
		System.out.println("copy elements from one array to another");
		
		for(int i=0;i<copy.length;i++)
		{
			System.out.println(copy[i]);
		}
	}
}
