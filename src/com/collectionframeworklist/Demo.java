package com.collectionframeworklist;


import java.util.ArrayList;

public class Demo {
public static void main(String[] args) {
	
	ArrayList l = new ArrayList();
	//add is use to add elements at end
	l.add("piyu");
	l.add(24);
	l.add("Female");
	l.add("Raisoni College");
	l.add("1234567891");
	System.out.println(l);
	
	
	
	ArrayList l2 = new ArrayList();
	l2.add("vik");
	l2.add(24);
	l2.add("male");
	l2.add("Raisoni College");
	l2.add("9876567891");
	
	System.out.println(l2);
	//this use to add all elements to another
	l.addAll(l2);
	System.out.println(l);
	
	//program for demonstrate method of arraylist
	
	ArrayList al2 = new ArrayList();
	al2.add("mumbai"); // 0th index
	al2.add("pune"); // 1st index
	al2.add(20); // 2nd index
	al2.add("bangalore"); // 4rd index
	al2.add(50); // 5th index
	al2.add(3, "piyu");//3rd index specific

	System.out.println(al2);
	// to get the specific elements
	System.out.println(al2.get(3));
	// to remove the elements
	System.out.println(al2.remove("pune"));
	System.out.println(al2);
	System.out.println(al2.contains("kiran"));
	System.out.println(al2);

	
}
}
