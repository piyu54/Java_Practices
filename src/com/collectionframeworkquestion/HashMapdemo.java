
package com.collectionframeworkquestion;

import java.util.HashMap;
import java.util.Map;

//Create a HashMap and store Roll No as key and Name as value.
public class HashMapdemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hp = new HashMap<Integer, String>();

		hp.put(102, "rahul");
		hp.put(103, "sakshi");
		hp.put(104, "vikas");
		hp.put(105, "praful");
		hp.put(106, "poonam");
		hp.put(107, "piyali");

		// Display all key–value pairs using entrySet().

		for (Map.Entry<Integer, String> s : hp.entrySet()) {

			System.out.println(s.getKey() + " " + s.getValue());

		}

		// Retrieve a value using a key from Map.
		System.out.println("Retrieve a value using a key from Map");
		System.out.println(hp.get(107));

		// Check whether a key exists in Map.
		System.out.println(hp.containsKey(107));

		// Check whether a value exists in Map.
		System.out.println(hp.containsValue("piyu"));

		// Remove an entry from Map using key.

		System.out.println("-------After Removing-----------");
		hp.remove(102);// rahul will remove
		for (Map.Entry<Integer, String> s : hp.entrySet()) {

			System.out.println(s.getKey() + " " + s.getValue());

		}
		
		// Find the size of a Map.
		
		System.out.println("Size of Map is "+hp.size());
	}
}
