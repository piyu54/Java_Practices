package com.loop;

public class Break9 {
//Print characters A to Z but stop at the letter P.
	public static void main(String[] args) {

		for (char ch = 'A'; ch <= 'Z'; ch++) {

			if (ch == 'P') {
				break;
			}
			System.out.println(ch);
		}
	}

}
