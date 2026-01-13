package com.arrayoperations;
//Create one array and copy all its elements into another array.
public class CopyAnArray {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0]=6;
		num[1]=7;
		num[2]=8;
		num[3]=9;
		num[4]=19;
		
		int[] copy= new int[num.length];
		
		for(int i=0;i<num.length;i++)
		{
			copy[i]=num[i];
		}
		
		for(int i=0;i<copy.length;i++)
		{
			System.out.println(copy[i]);
		}
	}
}
