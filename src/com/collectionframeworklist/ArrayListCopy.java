package com.collectionframeworklist;

import java.util.ArrayList;

public class ArrayListCopy {

	public static void main(String[] args) {
		//
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(40);
		al.add(60); // al contain 20 40 60

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(30);
		al2.add(70);
		al2.add(90); // al2 contain 30 70 90

		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.addAll(al);
		al3.addAll(al2);
		System.out.println(al3);

	}
}
