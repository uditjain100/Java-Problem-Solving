package AssignmentsRecursion;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int[] a = ss(arr, 0);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static int[] ss(int[] arr, int vidx) {

		if (arr.length - 1 == vidx) {
			int[] ans = new int[arr.length];
			ans[arr.length - 1 - vidx] = arr[vidx];
			return ans;
		}

		int[] rr = ss(arr, vidx + 1);

		rr[arr.length - 1 - vidx] = arr[vidx];

		return rr;
	}
}