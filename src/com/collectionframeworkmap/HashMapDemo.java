package com.collectionframeworkmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		//insertion order not follow
		//key-value null allow
		//key should unique value can be same
		//
		hm.put(10, "piyu");
		hm.put(null, null);
		hm.put(11, "piyu");
		hm.put(12, "piyu");
		hm.put(13, "piyu");
		
		System.out.println(hm);
	}
}
