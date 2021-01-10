package UditJain;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int divident = scn.nextInt();
		int divisor = scn.nextInt();
		while (divident % divisor != 0) {

			int remainder = divident % divisor ;
			divident = divisor;
			divisor = remainder;
		}
		System.out.println(divisor);

	}

}
