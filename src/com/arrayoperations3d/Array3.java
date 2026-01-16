package com.arrayoperations3d;

public class Array3 {
	public static void main(String[] args) {

		int[][][] num = { { { 1, 2 }, { 3, 4 }, { 5, 6 } } };

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {

				for (int k = 0; k< num[i][j].length; k++) {

					System.out.println(num[i][j][k]);
				}
			}
		}
	}
}
