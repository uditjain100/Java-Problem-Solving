package Lecture26;

public class DynamicProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		int n = 7;
		int[] strg = new int[n + 1];
		System.out.println(fibonnaci(n, strg));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		int an = 8;
		System.out.println(fibitr(an));
		System.out.println(fibSE(an));
	}

	public static int fibonnaci(int a, int[] strg) {

		if (a == 0 || a == 1) {
			return a;
		}
		if (strg[a] != 0) {
			return strg[a];
		}
		int fn1 = fibonnaci(a - 1, strg);
		int fn2 = fibonnaci(a - 2, strg);

		int fn = fn1 + fn2;
		strg[a] = fn;

		return fn;
	}

	public static int fibitr(int a) {

		int[] strg = new int[a + 1];

		strg[0] = 0;
		strg[1] = 1;

		for (int i = 2; i <= a; i++) {
			strg[a] = strg[a - 1] + strg[a - 2];
		}
		return strg[a];

	}

	public static int fibSE(int a) {

		int[] strg = new int[2];

		for (int i = 1; i <= a - 1; i++) {
			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}
		return strg[1];

	}

	public static int LCS(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String rs1 = s1.substring(1);
		String rs2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {
			ans = LCS(rs1, rs2) + 1;
		} else {
			ans = Math.max(LCS(rs1, s2), LCS(s1, rs2));
		}
		return ans;
	}

	public static int LCSRT(String s1, String s2) {

		int[][] str = new int[s1.length()][s2.length()];

		for (int row = s1.length() - 1; row >= 0; row--) {
			for (int col = s2.length() - 1; col >= 0; col--) {

				if (s1.charAt(row) == s2.charAt(col)) {
					str[row][col] = str[row + 1][col + 1] + 1;
				} else {
					str[row][col] = Math.max(str[row + 1][col], str[row][col + 1]);
				}
			}
		}
		return str[0][0];
	}

}
