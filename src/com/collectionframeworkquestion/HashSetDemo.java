package com.collectionframeworkquestion;

import java.util.HashSet;
import java.util.Iterator;

//Create a HashSet and add 5 string values.
public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String >hs = new HashSet<String>();
		hs.add("java");
		hs.add("c");
		hs.add("c++");
		hs.add("html");
		hs.add("css");
		hs.add("css");//duplicate value
		//Try to add duplicate elements in a Set and observe the output.
//		System.out.println(hs);
		
		Iterator itr =hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		// Display all elements of a Set using for-each loop.
		System.out.println("----------------------------");
		System.out.println("Using Foreach Loop");
		for (String s : hs) {
			System.out.println(s);
		}
		
		//Check whether a specific element exists in a Set.
		System.out.println(hs.contains("piyu"));
		
		//Remove an element from a Set
		
		System.out.println(hs.remove("java"));
		System.out.println("After removing");
		System.out.println(hs);
		
		//Find total number of elements in a Set.
		
		System.out.println("Total number of elements in a Set is "+hs.size());
	}
}
