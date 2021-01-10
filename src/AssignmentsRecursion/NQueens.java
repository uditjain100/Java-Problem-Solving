package AssignmentsRecursion;

import java.util.Scanner;

public class NQueens {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		boolean[][] board = new boolean[n][n];
		//int a = bp(board, 0);
		bpc(board, 0, "");
		//System.out.println();
		//System.out.println(a);

	}

	public static int bp(boolean[][] board, int row) {

		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isitsafe(row, col, board)) {
				board[row][col] = true;
				count += bp(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;
	}

	public static void bpc(boolean[][] board, int row, String ans) {

		if (row == board.length) {
			System.out.print(ans);
			return;
		}
		for (int col = 0; col < board[row].length; col++) {
			if (isitsafe(row, col, board)) {
				board[row][col] = true;
				bpc(board, row + 1, ans + "{" +  (row + 1) + "-" + (col + 1) + "}" + " ");
				board[row][col] = false;
			}
		}
	}

	private static boolean isitsafe(int row, int col, boolean[][] board) {

		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}

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

}