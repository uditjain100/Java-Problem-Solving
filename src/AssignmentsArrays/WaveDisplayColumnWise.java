package AssignmentsArrays;

import java.util.Scanner;

public class WaveDisplayColumnWise {

	static Scanner scn = new Scanner(System.in) ;
	
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
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {

					System.out.print(arr[row][col] + ", ");
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {

					System.out.print(arr[row][col] + ", ");

				}

			}
		}
		System.out.print("End");
	}
}

