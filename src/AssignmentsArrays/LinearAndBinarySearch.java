package AssignmentsArrays;

import java.util.Scanner;

public class LinearAndBinarySearch {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		linearsearch(arr, 20);
		binarysearch(arr, 20);
	}

	public static void linearsearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				System.out.println(item);
			}
		}
	}

	public static void binarysearch(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > item) {
				high = mid - 1;
			} else if (arr[mid] < item) {
				low = mid + 1;
			} else {
				System.out.println(arr[mid]);
				break;
			}
		}
	}

}
