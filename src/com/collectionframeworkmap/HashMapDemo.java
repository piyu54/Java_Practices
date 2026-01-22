package com.collectionframeworkmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
		
		for (Map.Entry<Integer, String> s :hm.entrySet()) {
			System.out.println(s.getKey() +" "+s.getValue());
			
		}
	}
}
