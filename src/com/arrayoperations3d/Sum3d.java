package com.arrayoperations3d;

public class Sum3d {

	public static void main(String[] args) {
		int[][][] num = { { { 1, 2 }, { 3, 4 }, { 5, 6 } } };
		int sum=0;

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {

				for (int k = 0; k< num[i][j].length; k++) {

					sum+=num[i][j][k];
				}
			}
		}
		System.out.println(sum);
	}
}
