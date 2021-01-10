package AssignmentsBasics;

import java.util.Scanner;

public class FibonnaciPattern {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pattern(n);
	}

	public static void pattern(int n) {
		int row = 1;
		int nst = 1;
		int var = 0;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 && row == 1) {
					System.out.print("0" + " ");
				} else if (cst == 1 && row == 2) {
					System.out.print("1" + " ");
				} else {
					int a = fibonnaci(var + 1);
					System.out.print(a + " ");
				}
				cst++;
				var++;
			}
			System.out.println();
			row++;
			nst++;
		}
	}

	public static int fibonnaci(int n) {

		int a = 0;
		int b = 1;
		int i = 1;
		int sum = 0;
		while (i <= n - 2) {
			sum = a + b;
			a = b;
			b = sum;
			i++;
		}
		return sum;
	}

}
