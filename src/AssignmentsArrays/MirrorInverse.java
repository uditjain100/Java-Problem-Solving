package AssignmentsArrays;

import java.util.Scanner;

public class MirrorInverse {

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
		int var1 = 0;
		int var2 = 0;
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] == inv[k]) {
				var1++;
			} else {
			}
			var2++;
		}
		if (var1 == var2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
