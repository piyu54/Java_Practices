package com.collectionframeworkset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//insertion order not follow
		HashSet h=new HashSet();
		h.add("piyu");
		h.add(10);
		h.add(null);
		h.add("piyu");//not allowed
		h.add(null);//not allowed
		
		System.out.println(h);

	}

}
