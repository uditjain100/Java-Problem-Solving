package AssignmentsBasics;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int tc = 1; tc <= n; tc++) {
			int M = scn.nextInt();
			int N = scn.nextInt();
			ShoppingGame(M, N);
		}

	}

	public static void ShoppingGame(int M, int N) {
		int sum1 = 0;
		int sum2 = 0;
		int a = 0;
		if (M != N) {
			a = Math.max(M, N);
		} else {
			a = M;
		}
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
				if (sum1 >= N) {
					System.out.println("Aayush");
					break;
				}
			} else {
				sum2 = sum2 + i;
				if (sum2 >= M) {
					System.out.println("Harshit");
					break;
				}
			}
		}
	}

}
