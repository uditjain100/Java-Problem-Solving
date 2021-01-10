package AssignmentsRecursion;

import java.util.Scanner;

public class LexicoCounting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		lc(0, 100);
	}

	public static void lc(int start, int end) {

		if (start > end) {
			return;
		}
		System.out.println(start);
		int i = 0;
		if (start == 0) {
			i = 1;
		}

		for (; i <= 9; i++) {
			lc((start * 10) + i, end);
		}
	}

}