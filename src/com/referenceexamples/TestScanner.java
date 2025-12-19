package com.referenceexamples;
import java.util.Scanner;
public class TestScanner {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an Id");
		int id=s.nextInt();
		s.nextLine();
		
		System.out.println("Enter an Name");
		String name = s.nextLine();
		
		
		ScannerAsObject s2=new ScannerAsObject(id,name);
		s2.display();
		
	}
}
