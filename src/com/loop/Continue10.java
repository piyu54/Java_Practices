package com.loop;

public class Continue10 {
//Print numbers 1 to 30 but skip the number 15.
	public static void main(String[] args) {

		for (int i = 1; i <= 30; i++) {
			if (i == 15) {
				continue;
			}
			System.out.println(i);
		}
	}

}
