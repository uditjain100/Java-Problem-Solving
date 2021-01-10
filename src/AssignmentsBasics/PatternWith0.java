package AssignmentsBasics;

import java.util.Scanner;

public class PatternWith0 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;

		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 || cst == nst) {
					System.out.println(row);
				} else {
					System.out.println("0");
				}
				cst++;
			}
			System.out.println();
			row++;
			nst++;
		}
	}

}
