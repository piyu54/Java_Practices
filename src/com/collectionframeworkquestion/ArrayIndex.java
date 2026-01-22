package com.collectionframeworkquestion;

import java.util.ArrayList;

//Add an element at a specific index in an ArrayList.
public class ArrayIndex {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("priya");
		al.add("sakshi");
		al.add("piu");
		al.add("priti");
		al.add("vikas");
		
//		System.out.println(al);
		
		System.out.println("Give the value of index 1 which is "+al.get(1));
	}
}
