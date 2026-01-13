package com.arrayoperations;

public class Addition {

	public static void main(String[] args) {
		
		int[] num= {3,4,5,6,7};
		
		int sum=0;
		
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
		}
		System.out.println("Total "+sum);
	}
}
