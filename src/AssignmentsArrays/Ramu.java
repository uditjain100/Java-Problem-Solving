package AssignmentsArrays;

import java.util.Scanner;

public class Ramu {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int tc = scn.nextInt();
		for (int i = 0; i < tc; i++) {
			int c1 = scn.nextInt();
			int c2 = scn.nextInt();
			int c3 = scn.nextInt();
			int c4 = scn.nextInt();

			int r = scn.nextInt();
			int c = scn.nextInt();

			int[] ra = new int[r];
			int[] ca = new int[c];

			for (int i1 = 0; i1 < r; i1++) {
				ra[i1] = scn.nextInt();
			}
			for (int i2 = 0; i2 < c; i2++) {
				ca[i2] = scn.nextInt();
			}

			System.out.println(min(c1, c2, c3, c4, ra, ca));
		}

	}

	public static int min(int c1, int c2, int c3, int c4, int[] ra, int[] ca) {

		int ans1 = minTransport(c1, c2, c3, ra);
		int ans2 = minTransport(c1, c2, c3, ca);

		return Math.min(ans1 + ans2, c4);
	}

	public static int minTransport(int c1, int c2, int c3, int[] arr) {

		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			ans += Math.min(arr[i] * c1, c2);
		}
		return Math.min(ans, c3);
	}

}