package Lecture8Recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Factorial(6));
	}

	public static int Factorial(int n) {
		if (n == 0) {
			return 1 ;
		}
		int fnm1 = Factorial(n - 1);
		int fn = fnm1 * n;

		return fn;
	}
}
