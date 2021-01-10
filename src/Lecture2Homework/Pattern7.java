package Lecture2Homework;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int nst1 = 1; nst1 <= n; nst1++) {
			System.out.print("*");
		}
		System.out.println();
		for (int row = 1; row <= n - 2; row++) {
			System.out.print("*");
			for (int nsp = 1; nsp <= n - 2; nsp++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for (int nst2 = 1; nst2 <= n; nst2++) {
			System.out.print("*");
		}
	}

}
