package com.loop;

public class Break10 {
//Print numbers from 1 to 100, but stop the loop when the number becomes a multiple of 13.
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 13 == 0) {
				break;
			}
			System.out.println(i);

		}

	}

}
