package AssignmentsRecursion;

import java.util.Scanner;

public class IsArraySorted {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int[] a = { 1, 2, 3, 4, 5, 0 };
		System.out.println(pers(a, 0, 0));

	}

	public static boolean pers(int[] arr, int vidx, int count) {

		if (arr[vidx] == arr[arr.length - 1]) {
			if (vidx == count) {
				return true;
			}
			return false;
		}
		if (arr[vidx] < arr[vidx + 1]) {
			boolean rr = pers(arr, vidx + 1, count + 1);
			if (rr == true) {
				return true;
			} else {
				return false;
			}
		} else {
			boolean rr = pers(arr, vidx + 1, count);
			if (rr == true) {
				return true;
			} else {
				return false;
			}
		}

	}

}