package com.loop;

public class Break7 {
//Print numbers from 100 to 1, but stop when the number reaches 60.
	public static void main(String[] args) {

		for (int i = 100; i >= 1; i--) {
			
			if (i ==60) {
				break;
			}
			System.out.println(i);
		}
	}

}
