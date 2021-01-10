package AssignmentsRecursion;

import java.util.Scanner;

public class ChessBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int[][] board = new int[4][4];
		chess(0, 0, 4, 4, "");
		int a = countchess(0, 0, 4, 4);
		System.out.println(a);
	}

	public static void chess(int cr, int cc, int er, int ec, String ans) {

		if (cc == ec - 1 && cr == er - 1) {
			System.out.println(ans + "{" + cr + "-" + cc + "}");
			return;
		}
		if (cc >= ec || cr >= er) {
			return;
		}

		chess(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}" + "K");
		chess(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}" + "K");

		if (cr == 0 || cr == er - 1 || cc == 0 || cc == ec - 1) {
			for (int moves = 1; moves < er; moves++) {
				chess(cr, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}" + "R");
			}
			for (int moves = 1; moves < er; moves++) {
				chess(cr + moves, cc, er, ec, ans + "{" + cr + "-" + cc + "}" + "R");
			}
		}
		if (cc == cr || cc + cr == er - 1) {
			for (int moves = 1; moves < er; moves++) {
				chess(cr + moves, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}" + "B");
			}

		}
	}

	public static int countchess(int cr, int cc, int er, int ec) {

		if (cc == ec - 1 && cr == er - 1) {
			return 1;
		}
		if (cc >= ec || cr >= er) {
			return 0;
		}
		int count = 0;

		count += countchess(cr + 2, cc + 1, er, ec);
		count += countchess(cr + 1, cc + 2, er, ec);

		if (cr == 0 || cr == er - 1 || cc == 0 || cc == ec - 1) {
			for (int moves = 1; moves < er; moves++) {
				count += countchess(cr, cc + moves, er, ec);
			}
			for (int moves = 1; moves < er; moves++) {
				count += countchess(cr + moves, cc, er, ec);
			}
		}
		if (cc == cr || cc + cr == er - 1) {
			for (int moves = 1; moves < er; moves++) {
				count += countchess(cr + moves, cc + moves, er, ec);
			}

		}
		return count;
	}
}