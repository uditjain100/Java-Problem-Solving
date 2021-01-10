package AssignmentsRecursion;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		toh(4, 'A', 'B', 'C');
	}

	public static void toh(int n, char src, char dest, char helper) {

		if (n == 1) {
			System.out.println("Move disc 1 from " + src + " to " + dest);
			return;
		}

		toh(n - 1, src, helper, dest);
		System.out.println("Move disc " + n + " from " + src + " to " + dest);
		toh(n - 1, helper, dest, src);

	}

}