package Lecture2Homework;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 1;
		int b = 1;

		while (a <= n) {
			System.out.print("*");
			a++;
		}
		System.out.println();

		int row = 1;
		int nsp = 1;
		int nstt = n / 2;
		int nst = n / 2;
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
			while (cstt <= nstt) {
				System.out.print("*");
				cstt++;
			}
			if (row == (n / 2)) {

			} else {
				System.out.println();
			}
			if (row <= n / 2) {
				nst--;
				nsp += 2;
				nstt--;
			} else if (row == (n / 2) + 1) {
				nst += 2;
				nsp -= 4;
				nstt += 2;
			} else if (row == n - 1) {
				break;
			} else {
				nst++;
				nsp -= 2;
				nstt++;
			}
			row++;
		}
		while (b <= n) {
			System.out.print("*");
			b++;

		}
	}
}
