package com.arrayoperations2d;

public class MaxElement {

	public static void main(String[] args) {

		int[][] arr = { { 14, 33, 53 }, { 47, 68, 74 } };

		int max = 0;

		for (int i = 0; i < arr.length; i++)

		{
			for (int j = 0; j < arr[i].length-1; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}

		}
		System.out.println(max);

	}
}
