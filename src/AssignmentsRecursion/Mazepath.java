package AssignmentsRecursion;

import java.util.Scanner;

public class Mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int N1 = scn.nextInt();
		int N2 = scn.nextInt();

		bp(0, 0, N1 - 1, N2 - 1, " ");

		int a = bpc(0, 0, N1 - 1, N2 - 1, " ");
		System.out.println(a);

	}

	public static void bp(int cc, int cr, int ec, int er, String ans) {

		if (er == cr && ec == cc) {
			System.out.print(ans + " ");
			return;
		}
		if (er < cr || ec < cc) {
			return;
		}
		bp(cc, cr + 1, ec, er, ans + "V");

		bp(cc + 1, cr, ec, er, ans + "H");

		if (cc == cr || cc + cr == er) {
			bp(cc + 1, cr + 1, ec, er, ans + "D");
		}
	}

	public static int bpc(int cc, int cr, int ec, int er, String ans) {

		if (er == cr && ec == cc) {
			return 1;
		}
		if (er < cr || ec < cc) {
			return 0;
		}
		int count = 0;
		count += bpc(cc + 1, cr, ec, er, ans + "H");

		count += bpc(cc, cr + 1, ec, er, ans + "V");

		if (cc == cr || cc + cr == er) {
			count += bpc(cc + 1, cr + 1, ec, er, ans + "D");
		}
		return count;
	}
}