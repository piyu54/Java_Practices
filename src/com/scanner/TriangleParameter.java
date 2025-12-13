package com.scanner;
import java.util.*;
// Take three sides of triangle and print its parameter.
public class TriangleParameter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first side of triangle");
		int first=s.nextInt();
		
		System.out.println("Enter the second side of triangle");
		int sec=s.nextInt();
		
		System.out.println("Enter the third side of triangle");
		int third=s.nextInt();
		
		
		System.out.println("The parameter of triangle is :"+ first*sec*third);
	}
	
	

}
