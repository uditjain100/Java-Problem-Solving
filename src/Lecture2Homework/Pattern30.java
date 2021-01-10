package Lecture2Homework;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1 ;
		int nst = n ;
		int var = n ;
		while (row <= n) {
			var = n;
			int cst = 1 ;
			while (cst <= nst) {
			System.out.print(var);
			var--;
			cst++;
			}
			System.out.println();
			row++;
		}
	}

}
