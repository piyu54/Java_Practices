package com.collectionframeworkmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// how to add elements
		hm.put(15, "mohit");
		hm.put(20, "sandip");
		hm.put(25, "sohan");

		// using iterator
		Set<Integer> s = hm.keySet(); //s contain 15 20 25
		Iterator<Integer> itr = s.iterator(); //itr - 15 20 25
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println("key>>" + i); //15
			System.out.println("value>>" + hm.get(i));
		}

	}
}
