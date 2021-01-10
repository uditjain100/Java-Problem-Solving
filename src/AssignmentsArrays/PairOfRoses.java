package AssignmentsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n1 = scn.nextInt();
		for (int i = 1; i <= n1; i++) {
			int n2 = scn.nextInt();
			int[] arr = new int[n2];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scn.nextInt();
			}
			Arrays.sort(arr);
			int item = scn.nextInt();
			que(arr, item);
		}
	}

	public static void que(int[] arr, int item) {

		int[][] arr1 = new int[arr.length][];
		int[] arr2 = new int[arr.length];
		int var = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum == item) {
					int diff = arr[j] - arr[i];
					arr1[var][0] = diff;
					arr1[var][1] = arr[i];
					arr1[var][2] = arr[j];
					var++;
				}
				for (int a = 0; a < var; a++) {
					arr2[a] = arr1[a][0];
				}
				int temp = MinofArray(arr2);
				for (int a = 0; a < var; a++) {
					if (temp == arr1[a][0]) {
						System.out.println(arr1[a][1] + "and" + arr1[a][2]);
					}
				}
			}
		}
	}

	public static int MinofArray(int[] arr) {
		for (int j = 0; j < arr.length - 1; j++) {
			for (int k = 0; k < arr.length - j - 1; k++) {
				if (arr[k] > arr[k + 1]) {
					int temp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = temp;
				}
			}
		}
		return arr[0];
	}

}
