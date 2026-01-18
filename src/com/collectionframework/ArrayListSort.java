package com.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSort {
	//I have list of students and want to sort that list 
	//based on ascending order
	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("rahul");
		al.add("om");
		al.add("kiran");
		al.add("sakshi");
		al.add("vikas");
		al.add("priti");
		al.add("chinmay");
		al.add("shyam");
		al.add("sudeep");
		al.add("yash");
		
		Collections.sort(al);
		System.out.println("Ascending order list>>" + al);

	}

}
