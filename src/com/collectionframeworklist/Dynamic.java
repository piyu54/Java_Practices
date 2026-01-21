package com.collectionframeworklist;

import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic {
//program for dynamic approach

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		for (int i = 1; i <= 2; i++) {

			System.out.println("Enter the mobile number>>");
			Scanner scanner = new Scanner(System.in);
			String mobile = scanner.next(); //9595958585
			al.add(mobile);
		}

		for (String s : al) {
			System.out.println(s);
		}
		
		
	}
}
