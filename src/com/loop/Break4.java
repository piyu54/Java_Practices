package com.loop;

public class Break4 {
//Print numbers from 1 to 100 but stop when the number reaches 50.
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (i == 50) {
				break;
			}
			System.out.println(i);
		}
	}

}
