package com.array;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		
		System.out.println("Even num ");
		
		System.out.println("Enter the size of array");
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		
		int[] num=new int[size];

		System.out.println("Enter Num:");
		for(int i=0;i<size;i++)
		{
			num[i]=s.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(num[i] %2==0);
		}
		
		
	}
}
