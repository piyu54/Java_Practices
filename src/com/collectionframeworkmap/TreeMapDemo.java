package com.collectionframeworkmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> lhm=new TreeMap<Integer,String>();
		//key order follow
		//key should be unique
		//value can be duplicate
		//null key cant accepted exception
//		value can be null 
		lhm.put(1, "priya");
		lhm.put(2, "sakshi");
		lhm.put(1, "riya");//value updated
		lhm.put(3, "piyu");
		lhm.put(4, "piu");
		lhm.put(5, "sneha");
//		lhm.put(null, "null");
		lhm.put(7, "null");
//		System.out.println(lhm);
		
		for (Map.Entry<Integer, String> s :lhm.entrySet()) {
			System.out.println(s.getKey() +" "+s.getValue());
			
		}
	}
}
