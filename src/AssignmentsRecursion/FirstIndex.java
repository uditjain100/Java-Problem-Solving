package AssignmentsRecursion;

import java.util.Scanner;

public class FirstIndex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int m = scn.nextInt();
		int a = ss(arr, 0, m);

	}

	public static int ss(int[] arr, int vidx, int item) {

		if (arr.length == vidx) {
			return -1;
		}
		if (arr[vidx] == item) {
			return vidx;
		}
		int ans = ss(arr, vidx + 1, item);
		return ans;
	}
}