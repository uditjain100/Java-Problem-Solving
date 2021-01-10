package AssignmentsArrays;

import java.util.Scanner;

public class TakeInput {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] ans = takeinput();
		display(ans);
	}

	public static int[][] takeinput() {

		int row = scn.nextInt();
		int[][] arr = new int[row][];
		for (int i = 0; i < arr.length; i++) {
			int cols = scn.nextInt();
			arr[i] = new int[cols];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
