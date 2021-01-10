package Lecture5;

import java.util.Scanner;

public class Search {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = takeInput();
		// int a = scn.nextInt();
		// int val = linearSearch(arr, a);
		// System.out.println(val);
		// int count = binarySearch(arr, a);
		// System.out.println(count);
		// reverse(arr);
		// display(arr);
		/*
		 * int[] inv = inverse(arr); for (int i = 0; i < inv.length; i++) {
		 * System.out.print(inv[i]); }
		 */

		// int ro = scn.nextInt();
		// int[] rot = rotation(arr, ro);
		// for (int r = 0; r < rot.length; r++) {
		// System.out.print(rot[r]+" ");
		// }
		// bubblesort(arr);
		// display (arr);
		selectionsort(arr);
		display(arr);
		// insertionsort(arr);
		// display(inv);
	}

	public static void bubblesort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - counter - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void insertionsort(int[] arr) {
		int n = arr.length;

		for (int counter = 1; counter < n; counter++) {
			int item = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = item;
		}
	}

	public static void insertionSort1(int n, int[] arr) {

		for (int i = n - 2; i >= 0; i--) {

			int item = arr[i];
			int j = i + 1;
			while (j <= n - 1 && arr[j] < item) {
				arr[j - 1] = arr[j];
				j++;
				for (int k = 0; k < n; k++) {
					System.out.print(arr[k] + " " + " i -> " + i + " ");
				}
				System.out.println();
			}
			arr[j - 1] = item;
		}

	}

	public static void selectionsort(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int j = counter + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
				int temp = arr[counter];
				arr[counter] = arr[min];
				arr[min] = temp;
			}
		}
	}

	public static void reverse(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

	}

	public static int[] inverse(int[] arr) {

		int[] inv = new int[arr.length];

		for (int i = 0; i < inv.length; i++) {
			inv[arr[i]] = i;

		}
		return inv;

	}

	public static int[] rotation(int[] arr, int r) {
		int[] rot = new int[arr.length];
		for (int i = 0; i < rot.length; i++) {
			if (i < r) {
				rot[i] = arr[i + arr.length - r];
			} else {
				rot[i] = arr[i - r];
			}

		}
		return rot;
	}

	public static int binarySearch(int[] arr, int item) {
		int low = 0;
		int hi = arr.length - 1;
		while (low <= hi) {
			int mid = (low + hi) / 2;

			if (arr[mid] > item) {
				hi = mid - 1;
			} else if (arr[mid] < item) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

	public static int linearSearch(int[] arr, int item) {

		int i = 0;
		while (i <= arr.length) {
			if (arr[i] == item) {
				return i;
			}

			i++;

		}
		return -1;

	}

	public static int[] takeInput() {

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
