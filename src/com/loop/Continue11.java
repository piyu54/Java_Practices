package com.loop;

public class Continue11 {
//Print the alphabets A to Z but skip the letter ‘M’..
	public static void main(String[] args) {

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (ch == 'M') {
				continue;
			}
			System.out.println(ch);
		}

	}
}
