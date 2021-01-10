package AssignmentsAdvanced;

import java.util.Scanner;

public class abc {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int k = scn.nextInt();

		int[] books = new int[n];
		for (int i = 0; i < n; i++) {
			books[i] = scn.nextInt();
		}
	}

}