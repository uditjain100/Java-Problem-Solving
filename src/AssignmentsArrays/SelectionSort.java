package AssignmentsArrays;

import java.util.Scanner;

public class SelectionSort {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		for (int c = 0; c < arr.length - 1; c++) {
			int min = c;
			for (int j = c + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[c];
			arr[c] = arr[min];
			arr[min] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
