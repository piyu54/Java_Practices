package com.loop;

public class Break5 {
//Print the multiplication table of 10 but stop when the product becomes greater than 50.
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int product = 10 * i;
			if (product > 50) {
				break;
			}
			System.out.println(product);
		}
	}

}
