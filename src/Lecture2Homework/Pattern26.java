package Lecture2Homework;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int val = 1;
		while (row <= n) {
			val = 1;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				val++;
				cst++;
			}
			System.out.println();
			nsp--;
			nst += 2;
			row++;
		}
	}

}
