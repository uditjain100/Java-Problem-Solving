package Lecture2Homework;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int var = n - row + 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				
				if(var == n) {
				System.out.print(0);
				}else {
					System.out.print(var);
				}
				if (cst <= nst / 2) {
					var++;
				} else if (cst == nst / 2) {
					System.out.print("0");;
				} else {
					var--;
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
