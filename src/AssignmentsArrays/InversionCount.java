package AssignmentsArrays;

import java.util.Scanner;

public class InversionCount {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int tc = scn.nextInt();
		for (int i = 0; i <= tc; i++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			int i1 = 0;
			while (i1 < arr.length) {
				arr[i1] = scn.nextInt();
				i1++;
			}
			int a = Inversion(arr);
			System.out.println(a);
		}
	}

	public static int Inversion(int[] arr) {
		int count = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int k = j + 1; k < arr.length; k++) {
				if (j < k && arr[j] > arr[k]) {
					count++;
				}
			}
		}
		return count;
	}
}
