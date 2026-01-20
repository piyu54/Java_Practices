package com.collectionframeworkset;


import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		//insertion order is follow
		//duplicate not allowed
		// null not allowed
		//multiple types not allowed
		ts.add(10);
//		ts.add("priya");
		ts.add(20);
//		ts.add(null);
//		ts.add(null);
//		ts.add("sakshi");
//		ts.add(50);
		
		System.out.println(ts);
	}
}
