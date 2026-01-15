package com.arrayoperations1d;
//Write a program to count even and odd numbers in a 1D array.
public class OddEven {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4 ,1,5,7};
		int evencount=0;
		int oddcount=0;

		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("even"+evencount);
		System.out.println("odd"+evencount);
//		
	}
}
