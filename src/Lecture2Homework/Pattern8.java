package Lecture2Homework;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst1 = 1;
		int nst2 = 1;
		int nsp1 = 1;
		int nsp2 = n - 2;

		while (row <= n) {
			int csp1 = 2;
			while (csp1 <= nsp1) {
				System.out.print(" ");
				csp1++;
			}
			int cst1 = 1;
			while (cst1 <= nst1) {
				System.out.print("*");
				cst1++;
			}
			int csp2 = 1;
			while (csp2 <= nsp2) {
				System.out.print(" ");
				csp2++;
			}
			if (row != (n / 2) + 1) {
				int cst2 = 1;
				while (cst2 <= nst2) {
					System.out.print("*");
					cst2++;
				}
			}
			System.out.println();
			row++;
			if (row <= (n / 2) + 1) {
				nsp1++;
				nsp2 -= 2;
			} else {
				nsp1--;
				nsp2 += 2;
			}
		}

	}

}
