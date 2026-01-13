package com.arrayoperations;

//Write a program to count even numbers in an array.
public class CountEvenNum {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0]=6;
		num[1]=7;
		num[2]=8;
		num[3]=9;
		num[4]=19;
		
		int count=0;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]);
				count++;
			}
		}
		System.out.println("count of even numbers is :"+count);
		
	}
}
