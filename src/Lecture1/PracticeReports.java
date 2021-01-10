package UditJain;

import java.util.Scanner;

public class PracticeReports {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1 ;
		int nst = 1 ;
		
		while(row <= n) {
			int cst = 1 ;
			while(cst <= nst) {
				System.out.print(row);
			}
			System.out.println();
			row++ ;
			nst++ ;
		}
	}

}
