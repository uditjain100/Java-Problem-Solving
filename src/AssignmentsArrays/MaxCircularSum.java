package AssignmentsArrays;

import java.util.Scanner;

public class MaxCircularSum {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int tc = scn.nextInt();

		for (int i = 0; i < tc; i++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = scn.nextInt();
			}
			int[] na = new int[2 * arr.length];
			for (int j1 = 0; j1 < arr.length; j1++) {
				na[j1] = arr[j1];
				na[j1 + arr.length] = arr[j1];
			}
			int maxsum = 0;
			for (int si = 0; si < arr.length; si++) {
				for (int ei = si; ei < arr.length + si - 1; ei++) {
					int sa = 0;
					for (int j2 = si; j2 < ei; j2++) {
						sa += na[j2];
					}
					if (sa > maxsum) {
						maxsum = sa;
					}
				}
			}
			System.out.println(maxsum);
		}

	}

}