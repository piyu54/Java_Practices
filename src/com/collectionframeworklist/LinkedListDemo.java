package com.collectionframeworklist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("sakshi");
		l.add("priti");
		l.add("piyali");
		l.add("sakshi");
		l.add(10);
		l.add(null);
		l.add(null);
		l.addFirst("piyu");
		l.add(2, "Software");
		
		System.out.println(l);
	}
}
