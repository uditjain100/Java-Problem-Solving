package AssignmentsArrays;

import java.util.Scanner;

public class SelectionSort2 {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int k = arr.length - 1;
		for (int c = 0; c < arr.length - 1; c++) {
			int max = k;
			for (int j = 0; j < arr.length - c - 1; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			int temp = arr[k];
			arr[k] = arr[max];
			arr[max] = temp;
			k--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
