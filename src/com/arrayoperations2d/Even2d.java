package com.arrayoperations2d;

public class Even2d {

	public static void main(String[] args) {
		
		int[][] arr = { { 1, 2, 3 }, { 4, 6, 7 } };

		for (int i = 0; i < arr.length; i++)

		{
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]%2==0)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
		
	}
}
