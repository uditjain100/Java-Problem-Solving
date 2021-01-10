package Assignments;

import java.util.Scanner;

public class NextSmallerOfNextGreater {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n1 = scn.nextInt();
		for (int i = 0; i <= n1; i++) {
			takeInput();

		}
	}

	public static int greater(int[] arr) {

		int var = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					var = arr[j];
				}
			}
		}
		return var;
	}

	public static int[] takeInput() {

		int n = scn.nextInt();
		int[] arr = new int[n];
		int i = 0;
		while (i < arr.length) {
			arr[i] = scn.nextInt();
			i++;
		}

		return arr;

	}

}
