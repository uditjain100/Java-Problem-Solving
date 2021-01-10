package AssignmentsBasics;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int a = ((n - 1) * 4) + 1;
		// first line
		System.out.print("  ");
		for (int i = 3; i < a; i = i + 4) {
			System.out.print("*   ");
		}
		System.out.println();
		// second line
		for (int i = 1; i < a; i = i + 2) {
			System.out.print(" *");
		}
		System.out.println();
		// third line
		for (int i = 1; i <= a; i = i + 4) {
			System.out.print("*   ");
		}
	}
}