package Lecture2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = n;
		int nsp = 0;

		while (row <= n) {

			int csp = 1;
			while (csp <= nsp) {
				csp = csp + 1;
				System.out.print(" ");
			}
			int cst = 1;
			while (cst <= nst) {
				cst = cst + 1;
				System.out.print("*");
			}
			System.out.println();
			row = row + 1;
			nst = nst - 1;
			nsp = nsp + 1;
		}

	}

}
