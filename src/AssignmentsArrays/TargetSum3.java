package AssignmentsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSum3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int n1 = scn.nextInt();
			arr[i] = n1;
		}
		int target = scn.nextInt();
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
					}
				}
			}

		}
	}

}
