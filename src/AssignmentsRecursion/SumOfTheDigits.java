package AssignmentsRecursion;

public class SumOfTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = sum1(12345);
		System.out.println(b);
		int c = sum2("12345");
		System.out.println(c);
	}

	public static int sum1(int n) {

		int sum = 0;
		int rem = n % 10;
		if (n == 0) {
			return sum;
		}
		int quo = n / 10;
		int res = sum1(quo);
		res += rem;
		return res;
	}

	public static int sum2(String str) {

		if (str.length() == 0) {
			return 0;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		int res = sum2(ros);
		int rem = get(cc);
		res += rem;
		return res;
	}

	public static int get(char ch) {

		if (ch == '1') {
			return 1;
		} else if (ch == '2') {
			return 2;
		} else if (ch == '3') {
			return 3;
		} else if (ch == '4') {
			return 4;
		} else if (ch == '5') {
			return 5;
		} else if (ch == '6') {
			return 6;
		} else if (ch == '7') {
			return 7;
		} else if (ch == '8') {
			return 8;
		} else if (ch == '9') {
			return 9;
		} else if (ch == '0') {
			return 0;
		}
		return 0;
	}

}
