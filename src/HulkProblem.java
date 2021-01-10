import java.util.Scanner;

public class HulkProblem {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = scn.nextInt();
			hulk(a);
		}
	}

	public static int hulk(int a) {

		int abc = 1;
		int count = 0;
		if (abc > a) {
			return 0;
		}

		while (a > abc) {
			abc = abc * 2;
		}

		if (abc == a) {
			return 1;
		}
		int x = (int) Math.pow(2, count - 1);
		int roa = a - x;
		int ans = hulk(roa);
		return ans;
	}
}
