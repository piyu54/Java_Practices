package com.conditionalstatement;

public class Even_Odd2 {

	public static void main(String[] args) {
		int num = 66;
		/*Write a program to check whether a number is even, and if even, 
		 * check whether it’s greater than 50.
		num %2==0 means koi num jo 2 se divide ho and rem 0 aaye wo even h baki odd*/
		if(num%2==0)
		{
			System.out.println("this is an even num");
			if(num>50)
			{
				System.out.println("this num is greater then 50");
			}
			else
			{
				System.out.println("this num is not greater then 50");
			}
			
		}
		else
		{
			System.out.println("this num is odd");
		

		}
		
	}

}
