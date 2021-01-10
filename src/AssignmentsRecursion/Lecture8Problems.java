package AssignmentsRecursion;

public class Lecture8Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printincdec(7);
		System.out.println();

		int temp1 = factorial(5);
		System.out.println(temp1);

		int temp2 = power(5, 3);
		System.out.println(temp2);

		int temp3 = fibonnaci(3);
		System.out.println(temp3);

		int[] arr = { 10, 20, 6, 800, 56 };
		System.out.println(MaxOfArray(arr, 0));
	}

	public static void printincdec(int n) {

		if (n == 0) {
			return;
		}
		if (n % 2 == 0) {
			System.out.print(n + "\t");
		}
		printincdec(n - 1);
		if (n % 2 == 1) {
			System.out.print(n + "\t");
		}
	}

	public static int factorial(int n) {

		if (n == 0) {
			return 1;
		}

		int fnml = factorial(n - 1);
		int fn = fnml * n;

		return fn;
	}

	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}
		int a = power(x, n - 1);
		int b = a * x;
		return b;
	}

	public static int fibonnaci(int n) {

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int a = fibonnaci(n - 1);
		int b = fibonnaci(n - 2);
		int sum = a + b;

		return sum;
	}

	public static int MaxOfArray(int[] arr, int vidx) {

		if (vidx == arr.length - 1) {
			return arr[arr.length - 1];
		}
		int a = MaxOfArray(arr, vidx + 1);
		int b = arr[vidx];

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
