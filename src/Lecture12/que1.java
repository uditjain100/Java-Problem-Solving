package Lecture12;

public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(NQueen(new boolean[4][4], 0, ""));
	}

	public static int NQueen(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.println(ans);
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[0].length; col++) {
			if (safe(board, row, col)) {
				board[row][col] = true;
				count += NQueen(board, row + 1, ans + "(" + row + "-" + col + ")");
				board[row][col] = false;
			}
		}

		return count;
	}

	public static boolean safe(boolean[][] board, int row, int col) {

		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;

			}
			r--;
			c--;
		}
		return true;
	}
}
