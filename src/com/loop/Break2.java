package com.loop;

public class Break2 {
//print  num from 1to 50 but stop when num becomes 25
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i == 25) {
				break;
			}
			System.out.println(i);
		}
	}

}
