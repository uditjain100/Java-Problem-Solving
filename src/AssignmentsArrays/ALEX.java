package AssignmentsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ALEX {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = { 100, 200, 400, 100 };

		int a = scn.nextInt();
		for (int i = 0; i < a; i++) {

			int amount = scn.nextInt();
			int no = scn.nextInt();

			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (amount % arr[j] == 0) {
					count++;
				}
			}
			if (count >= no) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}