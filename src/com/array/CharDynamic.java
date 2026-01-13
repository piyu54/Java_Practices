package com.array;

import java.util.Scanner;

public class CharDynamic {

	public static void main(String[] args) {

		System.out.println("Dynamic way for Char");
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter size of array: ");
	        int n = sc.nextInt();

	        char[] ch = new char[n];

	        System.out.println("Enter characters:");
	        for (int i = 0; i < n; i++) {
	            ch[i] = sc.next().charAt(0);
	        }

	        System.out.println("Characters are:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(ch[i] + " ");
	}
}
}
