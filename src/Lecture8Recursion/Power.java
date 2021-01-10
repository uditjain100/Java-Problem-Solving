package Lecture8Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(pow(3, 6));
	}

	public static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int pownm1 = pow(x, n - 1);
		int pow = pownm1 * x;
		return pow;

	}
}
