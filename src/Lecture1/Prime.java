
package UditJain;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int div = 2;
		int var = 0;
		while (div <= n - 1) {

			if (n % div == 0) {
				var = 1;
			}
			div++;
		}
		if (var == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}
