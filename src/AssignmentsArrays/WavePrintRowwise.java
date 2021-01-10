package AssignmentsArrays;

import java.util.Scanner;

public class WavePrintRowwise {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] ans = takeinput() ;
		display(ans);

	}
	public static int[][] takeinput() {

		int row = scn.nextInt();
		int cols = scn.nextInt();
		int[][] arr = new int[row][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[cols];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[row].length; col++) {

					System.out.print(arr[row][col] + ", ");
				}
			//	System.out.println();
			} else {
				for (int col = arr[row].length - 1; col >= 0; col--) {

					System.out.print(arr[row][col] + ", ");

				}

			//	System.out.println();
			}
		}
		System.out.print("End");
	}
}
