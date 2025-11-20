package com.loop;

public class Break6 {
//Print numbers from 1 to 500, but break the loop as soon as a number divisible by 37 is found.
	public static void main(String[] args) {

		for (int i = 1; i <= 500; i++) {
			
			if (i %37==0) {
				break;
			}
			System.out.println(i);
		}
	}

}
