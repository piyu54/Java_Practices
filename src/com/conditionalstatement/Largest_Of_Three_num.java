package com.conditionalstatement;

public class Largest_Of_Three_num {

	public static void main(String[] args) {
		int a=1000;
		int b=120;
		int c=90;
		
		if(a>b && a>c) //1000>120 && 1000>90  T && T =T
		{
			System.out.println("a is greater then b and c");
		}
		else if(b>a && b>c) //120>1000 && 120>90  F && F =F 
		{
			System.out.println("b is greater then a and c");
		}
		else // ELSE PART
		{
			System.out.println("c is greater than a and b");
		}

	}

}
