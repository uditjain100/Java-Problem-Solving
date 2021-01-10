package Assignments;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		for (int i = 1; i <= n1; i++) {
			int n = scn.nextInt();
			int power = 1;
			int decimal = 0;
			while (n != 0) {
				int rem = n % 2;
				decimal = decimal + rem * power;
				power = power * 10;
				n = n / 2;
			}
			int count = 0;
			while (decimal != 0) {
				int rem2 = decimal % 10;
				if (rem2 == 1) {
					count++;
				}
				decimal /= 10;
			}
			System.out.println(count);
		}

	}

}
