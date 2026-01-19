package com.collectionframeworklist;

import java.util.ArrayList;

public class ArrayListString {
	/*Design arraylist for generics string &
	 * iterate using for each loop
	 */
	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("piyu");
		al.add("piu");
		al.add("piyali");
		al.add("priya");
		al.add("riya");
		
		for(String i:al)
		{
			System.out.println(i);
		}
	}
}
