package AssignmentsBasics;

import java.util.Scanner;

public class DelhiOddEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int count = 1; count <= n; count++) {
			int n1 = scn.nextInt();
			int n2 = n1;
			int sum = 0;
			while (n2 != 0) {
				int rem = n2 % 10;
				sum = sum + rem;
				n2 /= 10;
			}
			System.out.println(n1);
			System.out.println(sum);
			if (n1 % 2 == 0 && sum % 4 == 0) {
				System.out.println("Yes");
			} else if (n1 % 2 == 1 && sum % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
