package com.loop;

public class Continue8 {
//Print numbers 1 to 50 but skip multiples of 4.
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 10 == 4) {
				continue;
			}
			System.out.println(i);
		}

	}

}
