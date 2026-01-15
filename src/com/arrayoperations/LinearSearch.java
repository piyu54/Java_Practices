package com.arrayoperations;

public class LinearSearch {

	public static int linearSearch(String menu[], String key) {
		
		for (int i = 0; i < menu.length; i++) {
			if (menu[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		String[] menu = { "dosa", "pizza", "momoos" };
		String key = "piza";

		int index = linearSearch(menu, key);

		if (index==-1)
		{
			System.out.println("not found");
			
		} else {
			System.out.println("item found on index " + index);
			
		}
	}
}
