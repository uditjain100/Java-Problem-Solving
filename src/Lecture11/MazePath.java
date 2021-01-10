package Lecture11;

import java.util.Scanner;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a = MazePath(2, 2, 0, 0, " ");
		System.out.print(a);
	}

	public static int MazePath(int er, int ec, int cr, int cc, String ans) {

		if (ec == cc && er == cr) {
			System.out.print(ans + "\t");
			return 1;
		}
		if (er < cr || ec < cc) {
			return 0;
		}
		int count = 0;
		count += MazePath(er, ec, cr, cc + 1, ans + "H");
		count += MazePath(er, ec, cr + 1, cc, ans + "V");
		count += MazePath(er, ec, cr + 1, cc + 1, ans + "D");

		return count;
	}

}