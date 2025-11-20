package com.loop;

public class Continue {
//print  num from 1to 100 but skip nums ending with digit 5
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
