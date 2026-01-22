package com.collectionframeworkquestion;

import java.util.List;
import java.util.ArrayList;

public class ListRemove {

	// Remove an element from a List using index.
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("priya");
		
		l.remove(0);
		
		// Find the size of a List.
		
		System.out.println(l.size());
		System.out.println(l);
		
		//Check whether a List is empty or not.
		
		System.out.println(l.isEmpty());
		
	}
}

