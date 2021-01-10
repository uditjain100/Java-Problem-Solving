package AssignmentsRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class abc {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean[][] board = new boolean[n][n];
		int a = bpa(board, 0);
		System.out.println(a);

	}

	private static boolean isitsafe(int row, int col, boolean[][] board) {

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}
		return true;
	}

	public static int bpa(boolean[][] board, int row) {

		if (row == board.length) {
			return 1;
		}

		for (int col = 0; col < board[row].length; col++) {
			if (isitsafe(row, col, board)) {
				board[row][col] = true;
				count++;
			}
		}
		bpa(board, row + 1);
		return count;
	}

}