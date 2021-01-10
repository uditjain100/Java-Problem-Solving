package AssignmentsBasics;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num = 1;

		for (int row = 0; row <= n-1; row++) {
			num = 1;
			for (int cst = 0; cst <= row; cst++) {
				System.out.print(num + " ");
				num = num * (row - cst) / (cst + 1);
			}
			System.out.println();
		}
	}

}
