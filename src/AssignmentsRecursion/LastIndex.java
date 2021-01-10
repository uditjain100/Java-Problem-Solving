package AssignmentsRecursion;

import java.util.Scanner;

public class LastIndex {
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
		System.out.println(a);
	}

	public static int ss(int[] arr, int vidx, int item) {

		if (arr.length == vidx) {
			return -1;
		}

		int ans = ss(arr, vidx + 1, item);
		if (arr[vidx] == item && ans == -1) {
			return vidx;
		}
		return ans;
	}
}