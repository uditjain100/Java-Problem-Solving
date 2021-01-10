import java.util.Scanner;

public class PatternAndStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pattern(n);
	}

	public static void pattern(int n) {

		int nst = 1;
		int nst1 = n-1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nst; j++) {
				System.out.print(j);
			}
			for (int k = 1; k <= nst1; k++) {
				System.out.print("*");
			}
			System.out.println();
			nst++;
			nst1--;
		}

	}
}
