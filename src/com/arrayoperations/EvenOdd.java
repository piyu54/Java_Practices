package com.arrayoperations;

public class EvenOdd {

	public static void main(String[] args) {
	
		
		int[] num=new int[4];
		
		num[0]=9;
		num[1]=8;
		num[2]=7;
		num[3]=6;
		
		for(int i=0;i<num.length;i++)
		{
			
			if(num[i]%2==0)
			{
				System.out.println("Even num "+num[i]);
			}
			
		}
		
	}
	
}
