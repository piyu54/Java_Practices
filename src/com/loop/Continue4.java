package com.loop;

public class Continue4 {
//Print 1 to 50 but skip numbers ending with digit 9.
	public static void main(String[] args) {

//		for (int i = 1; i <= 50; i++) {
//			if(i%10==9)
//			{
//				
//				continue;
//			}
//			System.out.println(i);
//		}
		for(int i=1;i<=50;i++)
		{
			if(i%10==9)
			{
				System.out.println(i);
			}
		}
		
	}

}
