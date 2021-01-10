package AssignmentsBasics;

import java.util.Scanner;

public class BostonNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(isBostan(n));
	}

	public static int isBostan(int n) {

		int sum1 = sod(n);
		int sum2 = primefactors(n);
		if (sum1 != sum2) {
			return 0;
		}
		return 1;
	}

	public static int sod(int n) {

		int sum = 0;

		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;

	}

	public static int primefactors(int n) {

		int i = 2;
		int sum = 0;
		while (n != 1) {
			if (isprime(i) == true) {
				int rem = n % i;
				if (rem == 0) {
					sum = sum + i;
					n = n / i;
				}
			}
			if (n % i != 0) {
				i++;
			}
		}
		return sum;
	}

	public static boolean isprime(int n) {

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
