package AssignmentsRecursion;

import java.util.Scanner;

public class AllIndex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int m = scn.nextInt();

		int[] a = ss(arr, 0, m, 0);
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static int[] ss(int[] arr, int vidx, int item, int count) {

		if (arr.length == vidx) {
			int[] ans = new int[count];
			return ans;
		}

		int[] ans;
		if (arr[vidx] == item) {
			ans = ss(arr, vidx + 1, item, count + 1);
			ans[count] = vidx;
		} else {
			ans = ss(arr, vidx + 1, item, count);
		}
		return ans;
	}
}