package com.arrayoperations;

public class Reverse {
//Write a program to print array elements in reverse order.
	public static void main(String[] args) {
		

		int[] num = new int[4];
		num[0]=6;
		num[1]=7;
		num[2]=8;
		num[3]=9;
		

		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
	}
}
