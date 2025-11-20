package com.loop;

public class Break {

	//print even num from 1 to 100 but stop after you get first odd num
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i %2==1) {
				System.out.println(i);
				break;
			}
			
		}
	}

}
