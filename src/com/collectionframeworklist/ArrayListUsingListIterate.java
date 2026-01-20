package com.collectionframeworklist;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListUsingListIterate {

	public static void main(String[] args) {
		
//		ArrayList<Integer> l= new ArrayList<Integer>();
//		LinkedList<Integer> l=new LinkedList();
		Vector<Integer> l= new Vector<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		System.out.println("Using Iterator");
		Iterator<Integer> itr2=l.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		System.out.println("Using List Iterator");
		ListIterator<Integer> itr =l.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Using Enumeration");
		Enumeration<Integer> itr3=l.elements();
		while(itr3.hasMoreElements())
		{
			System.out.println(itr3.nextElement());
		}
		
		//enumeration not allowed in linkedlist,arraylist
	}

}
