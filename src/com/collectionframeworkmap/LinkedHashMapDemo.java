package com.collectionframeworkmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		//follow insertion order
		//key should be unique
		//value can be duplicate
		//only one null accepted
//		value can be null 
		lhm.put(1, "priya");
		lhm.put(2, "sakshi");
		lhm.put(1, "riya");//value updated
		lhm.put(3, "piyu");
		lhm.put(4, "piu");
		lhm.put(5, "sneha");
		lhm.put(null, "null");
//		lhm.put(null, "null");
		
//		System.out.println(lhm);
		for (Map.Entry<Integer, String> s :lhm.entrySet()) {
			System.out.println(s.getKey() +" "+s.getValue());
			
		}
	}

}
