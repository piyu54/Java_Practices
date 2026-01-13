package com.arrayoperations;
//Write a program to check whether a given number exists in the array or not.
public class GivenNumExits {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0]=6;
		num[1]=7;
		num[2]=8;
		num[3]=9;
		num[4]=19;
		
		int givenNum=9;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==givenNum)
			{
				System.out.println(num[i]);
			}
			
		}
		System.out.println("given number is exists ");
	}
}
