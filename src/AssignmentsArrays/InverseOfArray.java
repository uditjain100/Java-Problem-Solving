package AssignmentsArrays;

import java.util.Scanner;

public class InverseOfArray {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int[] inv = new int[n];
		for (int j = 0; j < arr.length; j++) {
			inv[arr[j]] = j;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(inv[k] + "\t");
		}
	}

}
