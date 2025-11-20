package com.loop;

public class Continue9 {
//Print numbers from 1 to 100 but skip odd numbers.
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}

	}

}
