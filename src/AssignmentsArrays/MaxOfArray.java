package AssignmentsArrays;

import java.util.Scanner;

public class MaxOfArray {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		for (int j = 0; j < arr.length - 1; j++) {
			for (int k = 0; k < arr.length - j - 1; k++) {
				if (arr[k] > arr[k + 1]) {
					int temp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = temp;
				}
			}
		}
		System.out.println(arr[arr.length - 1]);
		System.out.println(arr[0]);
	}

}
