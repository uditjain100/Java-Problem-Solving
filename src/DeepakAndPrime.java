
public class DeepakAndPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countprime(4);
	}

	public static void countprime(int n) {

		int j = 2;
		for (int i = 1; i <= n;) {
			if (isprime(j)) {
				System.out.println(j);
				j++;
				i++;
			} else {
				j++;
			}
		}
	}

	public static boolean isprime(int n) {

		int var = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				var = 1;
			}
		}
		if (var == 0) {
			return true;
		} else {
			return false;
		}
	}
}
