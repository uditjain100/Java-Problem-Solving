package Lecture14;
import java.util.Arrays;
public class printPrimes {

	public static void main(String[] args) {
		SOE(25);
	}

	public static void SOE(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int counter = 2; counter * counter <= n; counter++) {
			if (prime[counter] == true) {
				for (int multi = 2; counter * multi <= n; multi++) {
					prime[counter * multi] = false;
				}
			}
		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == true) {
				System.out.println(i);
			}
		}
	}
}
