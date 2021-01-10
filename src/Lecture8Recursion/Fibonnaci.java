package Lecture8Recursion;

public class Fibonnaci {

	public static void main(String[] args) {

		System.out.println(fibonnaci(9));
	}

	public static int fibonnaci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fnm1 = fibonnaci(n - 1);
		int fnm2 = fibonnaci(n - 2);
		int fn = fnm1 + fnm2;
		
		return fn;
	}
}
