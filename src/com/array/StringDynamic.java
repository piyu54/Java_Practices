package com.array;

import java.util.Scanner;

public class StringDynamic {

	public static void main(String[] args) {
		
		System.out.println("Dynamic way for String");
		
		System.out.println("Enter the size of Array");
		
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		sc.nextLine();
		
		String[] s= new String[size];
		  System.out.println("Enter Names:");
		for(int i=0;i<size;i++)
		{
			s[i]=sc.nextLine();
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(s[i]);
		}
	}
}
