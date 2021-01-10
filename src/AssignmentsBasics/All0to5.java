package AssignmentsBasics;

import java.util.Scanner;

public class All0to5 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long ans = 0;
		long pow = 1;
		while (n != 0) {
			long rem = n % 10;
			if (rem == 0) {
				rem = 5;
			}
			ans = ans + rem * pow;
			pow = pow * 10;
			n /= 10;
		}
		System.out.println(ans);
	}

}
