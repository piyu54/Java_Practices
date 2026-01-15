package com.arrayoperations1d;

public class MinElement {
	
//	Write a program to find the minimum element in a 1D array
		public static void main(String[] args) {
			
			int[] marks = { 10, 20, 30, 40 };
			int min = marks[0];

			for (int i = 0; i < marks.length; i++) {
				if(marks[i]<min)
				{
					min=marks[i];
				}
				
			}
			
			System.out.println("the minimum element in a 1D array :"+min);
			
			System.out.println("----------using for each----------");
			int min2=marks[0];
			for (int x : marks) {
				if(x<min2)
				{
					min2=x;
				}
			}
			
			System.out.println("the minimum element in a 1D array :"+min2);
		}
	}


