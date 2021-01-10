package Lecture6;

import java.util.Scanner;

public class MatrixMultiplication {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] one = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] two2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] two = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int c1 = one[0].length;
		int c2 = two[0].length;
		int r1 = one.length;
		int r2 = two.length;
		int sum = 0;

		int[][] three = new int[r1][c2];

		if (c1 != r2) {
			System.out.println("Not Done");
		} else {
			for (int i = 0; i < one.length; i++) {
				for (int j = 0; j < two.length; j++) {
					for (int k = 0; k < three.length; k++) {
						three[i][j] = three[i][j] + one[i][k] * two[k][j];
					}
				}
			}
			for (int i = 0; i < one.length; i++) {
				for (int j = 0; j < two.length; j++) {
					System.out.print(three[i][j] + "\t");
				}
				System.out.println();
			}
		}

	}
}