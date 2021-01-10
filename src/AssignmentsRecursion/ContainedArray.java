package AssignmentsRecursion;

import java.util.Scanner;

public class ContainedArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int m = scn.nextInt();
		boolean a = ss(arr, m);
		System.out.println(a);
	}

	public static boolean ss(int[] arr, int m) {

		if (arr.length == 1) {
			if (arr[0] == m) {
				return true;
			} else {
				return false;
			}
		}
		int var = arr[arr.length - 1];
		int[] na = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			na[i] = arr[i];
		}
		boolean rr = ss(na, m);

		if (rr == true) {
			return true;
		} else {
			if (m == var) {
				return true;
			} else {
				return false;
			}
		}

	}
}