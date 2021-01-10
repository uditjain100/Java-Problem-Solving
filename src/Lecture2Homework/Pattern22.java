package Lecture2Homework;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 1;
		while (a <= 2 * n - 1) {
			System.out.print("*");
			a++;
		}
		System.out.println();

		int row = 1;
		int nsp = 1;
		int nst = n - 1;
		while (row <= n - 1) {
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
			while (cstt <= nst) {
				System.out.print("*");
				cstt++;
			}
			System.out.println();
			nst--;
			nsp += 2;
			row++;
		}
	}
}
