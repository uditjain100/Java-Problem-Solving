package Lecture2Homework;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int temp = 1;
		while (row <= 2 * n - 1) {
			if (row <= n) {
				temp = row;
			} else {
				temp = 2 * n - row;
			}
			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 1) {
					System.out.print(temp);
				} else {
					System.out.print("*");
				}
				cst++;
			}
			System.out.println();
			if (row <= n - 1) {
				nst += 2;
			} else {
				nst -= 2;
			}
			row++;
		}
	}
}
