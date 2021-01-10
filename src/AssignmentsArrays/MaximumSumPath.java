package AssignmentsArrays;

import java.util.Scanner;

public class MaximumSumPath {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int tc = scn.nextInt();

		for (int i = 0; i < tc; i++) {

			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] a1 = new int[n];
			for (int j1 = 0; j1 < n; j1++) {
				a1[j1] = scn.nextInt();
			}
			int[] a2 = new int[m];
			for (int j2 = 0; j2 < m; j2++) {
				a2[j2] = scn.nextInt();
			}
			int i1 = 0;
			int i2 = 0;
			int result = 0;
			int sum1 = 0;
			int sum2 = 0;
			while (i1 < n && i2 < m) {
				if (a1[i1] < a2[i2]) {
					sum1 += a1[i1];
					i1++;
				} else if (a1[i1] > a2[i2]) {
					sum2 += a2[i2];
					i2++;
				} else {
					result += Math.max(sum1, sum2);
					sum1 = 0;
					sum2 = 0;
					while (i1 < n && i2 < m && a1[i1] == a2[i2]) {
						result += a1[i1];
						i1++;
						i2++;
					}
				}
			}

			while (i1 < n) {
				sum1 += a1[i1];
				i1++;
			}
			while (i2 < m) {
				sum2 += a2[i2];
				i2++;
			}
			result += Math.max(sum1, sum2);
			System.out.println(result);
		}

	}

}