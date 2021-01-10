package Lecture4;

import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();

		printAllArmstrong(a, b);
	}

	public static void printAllArmstrong(int ll, int ul) {
		int i = ll;
		while (i <= ul) {

			int digits = numberofdigits(i);
			if (isArmstrong(i, digits)) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static int numberofdigits(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}

	public static boolean isArmstrong(int num, int nod) {

		int ans = 0;
		int temp = num;
		while (num != 0) {
			int rem = num % 10;
			ans = ans + (int) Math.pow(rem, nod);
			num = num / 10;
		}
		if (ans == temp) {
			return true;
		} else {
			return false;

		}
	}

}
