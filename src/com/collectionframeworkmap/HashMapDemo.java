package com.collectionframeworkmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		//insertion order not follow
		//key-value null allow one only
		//key should unique value can be same
		//
		
		hm.put(10, "piyu");
		hm.put(15, "piyu");
		hm.put(17, "piyu");
		hm.put(null, null);
		hm.put(13, "piyu");
//		hm.put(null, null);
		hm.put(11, "piyu");
		hm.put(12, "piyu");
		
		
//		System.out.println(hm);
		
//		for (Map.Entry<Integer, String> s :hm.entrySet()) {
//			System.out.println(s.getKey() +" "+s.getValue());
//			
//		}
		Set<Integer> s = hm.keySet(); 
		Iterator<Integer> itr = s.iterator(); //itr - 15 20 25
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println("key>>" + i); //15
			System.out.println("value>>" + hm.get(i));
			
		}
		

		
	}
}
