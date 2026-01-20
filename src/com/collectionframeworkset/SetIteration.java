package com.collectionframeworkset;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import java.util.TreeSet;

public class SetIteration {
	
		public static void main(String[] args) {
			

//			HashSet<Integer> l= new HashSet<Integer>();
//			LinkedHashSet<Integer> l= new LinkedHashSet<Integer>();
			TreeSet<Integer> l= new TreeSet<Integer>();
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
			
//			System.out.println("Using List Iterator");
//			ListIterator<Integer> itr =l.listIterator();
//			while(itr.hasNext())
//			{
//				System.out.println(itr.next());
//			}
			
			
			//enumeration not allowed in linkedlist,arraylist
		}

	}


