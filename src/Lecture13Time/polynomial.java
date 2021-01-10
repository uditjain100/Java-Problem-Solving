package Lecture13Time;

public class polynomial {

	public static void main(String[] args) {
		int ans = polynomial(3, 5);
		System.out.println(ans);
	}

	public static int polynomial(int x, int n) {
		int sum = 0;
		int power = x;
		for (int coeff = n; coeff >= 1; coeff--) {
			sum = sum + (coeff * power);
			power = power * x;
		}
		return sum;

	}
}
