package com.loop;

public class Break4 {
//print  num from 1to 50 but skip when num divisible by 7
	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			if(i%7==0)
			{
				break;
			}
			System.out.println(i);
		}
	}

}
