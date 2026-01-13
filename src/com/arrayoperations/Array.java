
package com.arrayoperations;

import java.util.Scanner;

public class Array {
//	Create an integer array of 5 elements and print all elements using a loop.
	public static void main(String[] args) {

		int[] num = new int[5];
		num[0]=6;
		num[1]=7;
		num[2]=8;
		num[3]=9;
		num[4]=19;
		

		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		
		System.out.println("----------------------------");
//		Create an array of size 5. Take values from user using Scanner and display them.
		
		int[] marks=new int[5];
		
		Scanner s= new Scanner(System.in);
		
		
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=s.nextInt();
		}
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
	}
}
