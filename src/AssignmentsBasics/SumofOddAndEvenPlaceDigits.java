package AssignmentsBasics;

import java.util.Scanner;

public class SumofOddAndEvenPlaceDigits {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		odd(n);
		even(n);
	}

	public static void odd(int n) {
		int sum1 = 0;
		int a = 100;

		while (n != 0) {
			int rem = n % 10;
			sum1 = sum1 + rem;
			n /= a;
		}
		System.out.println(sum1);
	}

	public static void even(int n) {
		int sum2 = 0;
		int a = 100;
		int var = n / 10;
		while (var != 0) {

			int rem = var % 10;
			sum2 = sum2 + rem;
			var /= a;
		}
		System.out.println(sum2);
	}
}
