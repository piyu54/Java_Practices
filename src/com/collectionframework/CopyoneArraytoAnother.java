package com.collectionframework;

import java.util.ArrayList;

public class CopyoneArraytoAnother {
//copy one arraylist into another arraylist- int type

	public static void main(String[] args) {
	
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		ArrayList<Integer> al2= new ArrayList<Integer>();
		al2.add(50);
		al2.add(60);
		
		al.addAll(al2);
		
		System.out.println(al);

	}

}
