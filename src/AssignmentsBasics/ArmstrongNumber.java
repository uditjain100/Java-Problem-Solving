package AssignmentsBasics;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int rem = temp % 10;
			int n1 = (int) Math.pow(rem, 3);
			sum = sum + n1;
			temp /= 10;
		}
		if (sum == n) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}