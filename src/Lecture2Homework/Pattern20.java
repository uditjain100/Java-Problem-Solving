package Lecture2Homework;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nsp1 = (n / 2);
		int nsp2 = 1;
		// first line
		for (int i = 1; i <= (n / 2); i++) {
			System.out.print(" ");
		}
		System.out.println("*");

		// Middle lines

		for (int row = 2; row <= n - 1; row++) {

			for (int j = 1; j <= nsp1 - 1; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 1; j <= nsp2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (row <= (n / 2)) {
				nsp1--;
				nsp2 += 2;
			} else {
				nsp1++;
				nsp2 -= 2;
			}
			System.out.println();
		}
		// Last Lines
		for (int i = 1; i <= (n / 2); i++) {
			System.out.print(" ");
		}
		System.out.print("*");

	}

}
