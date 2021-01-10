import java.util.Scanner;

public class abcde {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			System.out.println(prime(n));
		}

	}

	public static boolean isprime(int n) {

		int var = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				var = 1;
				break;
			}
		}
		if (var == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static int prime(int n) {

		if (n == 1) {
			return 2;
		}
		int count = 1;
		int i = 2;

		while (count != n + 1) {
			if (isprime(i)) {
				count++;
			}
			if (count == n + 1) {
				return i;
			}
			i++;
		}
		return 0;
	}

	public static void minsum(int k, String str) {

		String tut = "abcdefghijklmnopqrstuvwxyz";
		int var = 0;
		for (int i = tut.length() - 1; i >= 0; i--) {
			char ci = tut.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				char cc = str.charAt(j);
				if (ci == cc && var < k) {
					str = str.substring(0, j) + str.substring(j + 1);
					var++;
				}
			}
		}
		System.out.println(str);
		char cf = str.charAt(1);
		int var1 = 0;
		for (int i = 1; i < str.length(); i++) {
			if (cf == str.charAt(i)) {
				var1++;
			}
		}
		if (var1 == str.length() - 1) {
			System.out.println(var1);
		} else {
			int sum = 0;
			int count = 0;
			for (int j = 0; j < tut.length(); j++) {
				count = 0;
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == tut.charAt(j)) {
						count++;
					}

				}
				sum += count * count;

			}
			System.out.println(sum);
		}
	}

	public static void mintata(int k, String str) {

		String tut = "abcdefghijklmnopqrstuvwxyz";
		int var = 0;
		while (var != k) {
			char cit = maxcount(str);
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == cit && var < k) {
					if (i != 1) {
						str = str.substring(0, i) + str.substring(i + 1);
					} else if (i == 1) {
						str = str.substring(i + 1);
					}
					var++;
				}
			}
		}
		int sum = 0;
		int count = 0;
		for (int j = 0; j < tut.length(); j++) {
			count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == tut.charAt(j)) {
					count++;
				}

			}
			sum += count * count;

		}
		System.out.println(sum);
	}

	public static char maxcount(String str) {

		String tut = "abcdefghijklmnopqrstuvwxyz";

		int count12 = 0;
		int max = 0;
		char c12 = ' ';
		for (int j = 0; j < tut.length(); j++) {
			count12 = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == tut.charAt(j)) {
					count12++;
				}
				if (max < count12) {
					max = count12;
					c12 = str.charAt(i);
				}

			}

		}
		return c12;

	}
}
