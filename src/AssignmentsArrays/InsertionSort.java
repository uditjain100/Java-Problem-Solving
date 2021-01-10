package AssignmentsArrays;

import java.util.Scanner;

public class InsertionSort {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int[] ans1 = InsertionSort1(arr);
		int[] ans2 = InsertionSort2(arr);
		for (int i = 0; i < ans1.length; i++) {
			System.out.print(ans1[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < ans2.length; i++) {
			System.out.print(ans2[i] + "\t");
		}
	}

	public static int[] InsertionSort1(int[] arr) {

		for (int c = 1; c < arr.length; c++) {
			int item = arr[c];
			int j = 0;
			for (j = c - 1; j >= 0 && arr[j] > item; j--) {
				arr[j + 1] = arr[j];
			}
			System.out.println("j   " + j);
			arr[j + 1] = item;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
		}
		return arr;

	}

	public static int[] InsertionSort2(int[] arr) {

		for (int c = arr.length - 2; c >= 0; c--) {
			int item = arr[c];
			int j = arr.length - 1;
			for (j = c + 1; j <= arr.length - 1 && arr[j] < item; j++) {
				arr[j - 1] = arr[j];
			}

			arr[j - 1] = item;
		}
		return arr;

	}

	public static int[] InsertionSortpra(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int item = arr[i];
			int j = 0;
			for (j = i - 1; j >= 0 && arr[j] > item; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = item;
		}

		return arr;

	}

}
