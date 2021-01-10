package AssignmentsArrays;

import java.util.Scanner;

public class ReverseOfArray {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j] + "\t");
		}
	}

}
