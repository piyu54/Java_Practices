package com.collectionframeworkquestion;

import java.util.ArrayList;
import java.util.List;

//Write a program to display all elements of a List using for-each loop.
public class ListUsingForeach {

	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("piyu");
		l.add("priya");
		l.add("piu");
		l.add("sakshi");
		
		
		for (String s : l) {
			
			System.out.println(s);
		}
		
		System.out.println("---------------------------------");
//		System.out.println(l);
		//Retrieve an element from a List using get() method.
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		
	}
}
