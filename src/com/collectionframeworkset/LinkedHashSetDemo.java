package com.collectionframeworkset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		//insertion order is follow
		//duplicate not allowed
		//multiple null not allowed
		lhs.add(10);
		lhs.add("priya");
		lhs.add(null);
		lhs.add(null);
		lhs.add("priya");
		lhs.add(50);
		lhs.add("");//one allowed
		
		System.out.println(lhs);
		
	}
}
