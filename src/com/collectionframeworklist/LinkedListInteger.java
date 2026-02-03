package com.collectionframeworklist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInteger {

	public static void main(String[] args) {
		
		//
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(20);
		l.add(40);
		l.add(50);
		l.addFirst(00);
		l.addLast(100);
		
		System.out.println("Direct Way");
		System.out.println(l);//firstway
		
		System.out.println(l.get(5));//index
		System.out.println("-------------------------");
		System.out.println("Using Iterator");
		//second way
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//third way
		System.out.println("-------------------------");
		System.out.println("Using for each");
		
		for (int i : l) {
			System.out.println(i);
		}
		
	}
}
