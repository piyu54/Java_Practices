package com.scanner;

import java.util.Scanner;

public class Bill {
//Take the price and quantity of a product and print total bill.
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your pen price");
		
		int pen =s.nextInt();
		
		System.out.println("How many Pen you want enter here!!");
		
		int quan=s.nextInt();
		
		int total = pen*quan;
		
		System.out.println("Total bill is "+total);

	}

}
