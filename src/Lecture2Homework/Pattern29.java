package Lecture2Homework;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1) {
					System.out.print(row);
				} else if (cst == nst) {
					System.out.print(row);
				} else {
					System.out.print("0");
				}
				cst++;
			}
			System.out.println();
			nsp--;
			nst += 2;
			row++;
		}
	}

}
