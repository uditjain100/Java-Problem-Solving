package AssignmentsRecursion;

import java.util.Scanner;

public class NthTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		pers(10, 0);

	}

	public static void pers(int n, int sum) {

		if (n == 0) {
			System.out.println(sum);
			return;
		}
		sum += n;

		pers(n - 1, sum);

	}

}