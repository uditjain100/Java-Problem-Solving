package AssignmentsBasics;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
			int n1 = scn.nextInt();
			int n2 = scn.nextInt();
			int a = Math.max(n1, n2);
			int b = Math.min(n1, n2);
			if (ch == '+') {
				System.out.println(n1 + n2);
			} else if (ch == '-') {
				System.out.println(a - b);
			} else if (ch == '*') {
				System.out.println(n1 * n2);
			} else if (ch == '/') {
				System.out.println(a / b);
			} else {
				System.out.println(a % b);
			}
		} else if (ch == 'X' || ch == 'x') {
		} else {
			System.out.println("Invalid operation. Try again.");
		}

	}
}
