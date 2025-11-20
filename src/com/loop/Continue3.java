package com.loop;

public class Continue3 {
//Print numbers from 1 to 100 but skip multiples of 5.
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i);

		}
	}

}
