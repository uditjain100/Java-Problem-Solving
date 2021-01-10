package Lecture2Homework;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = 2 * n - 3;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cstt = 1;
			if (row == n) {
				cstt = 2;
			}
			while (cstt <= nst) {
				System.out.print("*");
				cstt++;
			}
			System.out.println();
			nst++;
			nsp -= 2;
			row++;
		}
	}

}
