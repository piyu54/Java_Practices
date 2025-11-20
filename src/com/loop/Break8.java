package com.loop;

public class Break8 {
//Find the first number between 1 to 200 that is divisible by both 7 and 11, then stop.
	public static void main(String[] args) {

		for (int i = 1; i <= 200; i++) {

			if (i % 7 == 0 && i % 11 == 0) {
				System.out.println(i);
				break;
			}

		}
	}

}
