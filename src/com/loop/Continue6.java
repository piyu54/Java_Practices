package com.loop;

public class Continue6 {
//Print all characters from A to Z but skip vowels.(A,e,i,o,u)
	public static void main(String[] args) {

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				continue;
			}
			System.out.println(ch);
		}
	}

}
