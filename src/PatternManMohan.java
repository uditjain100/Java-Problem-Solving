import java.util.Scanner;

public class PatternManMohan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pattern(n);

	}

	public static void pattern(int n) {

		int nsp = n - 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= nsp; j++) {
				System.out.print(" ");
			}
			if (i == 1 || i == n) {
				for (int k = 1; k <= n; k++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int m = 1; m <= n - 2; m++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
			nsp--;
		}
	}

}
