package AssignmentsArrays;

import java.util.Scanner;

public class CalculateTheSum {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] a1 = new int[n];
		for (int j1 = 0; j1 < n; j1++) {
			a1[j1] = scn.nextInt();
		}
		int[] a2 = new int[2 * n];

		for (int i = 0; i < a1.length; i++) {
			a2[i] = a1[i];
			a2[i + a1.length] = a1[i];
		}
		for (int i = 0; i < 2 * n; i++) {
			System.out.print(a2[i] + "\t");
		}
		System.out.println();
		int[] na = new int[a2.length];
		int p1 = 0;
		int p2 = a2.length - 1;
		while (p1 <= a2.length - 1) {
			na[p1] = a2[p2];
			p1++;
			p2--;
		}
		for (int i = 0; i < 2 * n; i++) {
			System.out.print(na[i] + "\t");
		}
		System.out.println();
		int tc = scn.nextInt();
		for (int i = 0; i < tc; i++) {
			System.out.println();
			int x = scn.nextInt();
			int[] a3 = new int[na.length / 2];
			int j4 = 0;
			while (j4 < na.length / 2) {
				a3[j4] = na[j4] + na[j4 + x];
				j4++;
			}
			for (int i1 = 0; i1 < a3.length; i1++) {
				System.out.print(a3[i1] + "\t");
			}
			System.out.println();
			int[] na2 = new int[2 * n];
			for (int i2 = 0; i2 < a1.length; i2++) {
				na2[i2] = a3[i2];
				na2[i2 + a3.length] = a3[i2];
			}
			for (int i2 = 0; i2 < 2 * n; i2++) {
				System.out.print(na2[i2] + "\t");
			}
			System.out.println();
			int[] na3 = new int[a2.length];
			int p01 = 0;
			int p02 = na2.length - 1;
			while (p01 <= na2.length - 1) {
				na3[p01] = na2[p02];
				p01++;
				p02--;
			}
			for (int i2 = 0; i2 < 2 * n; i2++) {
				System.out.print(na3[i2] + "\t");
			}
			for (int i2 = 0; i2 < 2 * n; i2++) {
				na[i2] = na3[i2];
			}
		}
		System.out.println();
		int sum = 0;
		for (int i2 = 0; i2 < n; i2++) {
			sum += na[i2];
		}
		System.out.println(sum);

	}

}
