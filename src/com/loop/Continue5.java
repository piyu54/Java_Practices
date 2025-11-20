package com.loop;

public class Continue5 {
//Print numbers 1 to 200 but skip numbers not divisible by 8.
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 8 == 0) {
				continue;
			}
			System.out.println(i);
		}
//		for(int i=1;i<=200;i++)
//		{
//			if(i%8==0)
//			{
//				System.out.println(i);
//			}
//		}
	}

}
