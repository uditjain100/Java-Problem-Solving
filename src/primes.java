
/*
 *
 *  Author : Udit Jain
	College : Maharaja Agrasen Institute Of Technology Rohini
	Year/Department : 2nd year - Computer Science And Engineering
	E-Mail Id : jain30udit@gmail.com

*/

import java.util.Scanner;

public class primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printprimes(n);
	}

	public static void printprimes(int n) {

		for (int i = 2; i <= n; i++) {
			if (isprime(i)) {
				System.out.print(i + " ");
			}
		}

	}

	public static boolean isprime(int n) {
		int div = 2;
		int var = 0;
		while (div <= n - 1) {

			if (n % div == 0) {
				var = 1;
			}
			div++;
		}
		if (var == 0) {
			return true;
		} else {
			return false;
		}

	}

}
