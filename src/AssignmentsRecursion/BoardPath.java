package AssignmentsRecursion;

import java.util.Scanner;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		bp(0, N, M, " ");
		System.out.println();
		int a = bpc(0, N, M, " ");
		System.out.println(a);
	}

	public static void bp(int start, int end, int faces, String ans) {

		if (start == end) {
			System.out.print(ans + "");
			return;
		}
		if (start > end) {
			return;
		}

		for (int dice = 1; dice <= faces; dice++) {
			bp(start + dice, end, faces, ans + dice);
		}

	}

	public static int bpc(int start, int end, int faces, String ans) {

		if (start == end) {
			return 1;
		}
		if (start > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= faces; dice++) {
			count += bpc(start + dice, end, faces, ans + dice);
		}
		return count;

	}
