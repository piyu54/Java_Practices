package com.loop;

public class Continue7 {
//Print all numbers 1 to 100 but skip numbers between 40 and 60.
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i >= 40 && i <= 60) {
				continue;
			}
			System.out.println(i);
		}

	}

}
