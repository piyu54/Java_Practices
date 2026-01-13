package com.arrayoperations;

public class LargestSmallest {

//	Write a program to find the largest number in an array.
//	Write a program to find the smallest number in an array.
	// largest
	public static void main(String[] args) {

		int[] num = { 3, 4, 5, 6, 7 };

		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
				
			}

		}
		System.out.println("largest number in an array is :"+max);
		
		//smallest
		int min=num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min+=num[i];
			}
		}
		System.out.println("smallest number in an array is :"+min);

	}
}
