package com.collectionframeworkmap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1, "priya");
		lhm.put(2, "sakshi");
		lhm.put(1, "priya");
		lhm.put(3, "piyu");
		lhm.put(4, "piu");
		lhm.put(4, "piu");
		
	}

}
