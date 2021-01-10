
public class Conversion {

	
	public static long sti(String str) {

		long num = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			long a = cti(str.charAt(i));
			num += a * (long) Math.pow(10, str.length() - i - 1);
		}
		return num;

	}

	public static String its(long n) {

		long temp = n;
		String str = "";
		long count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		while (n != 0) {
			long quo = n / (long) Math.pow(10, count - 1);
			long rem = n % (long) Math.pow(10, count - 1);
			str += itc(quo);
			n = rem;
			count--;
		}
		return str;
	}

	public static long cti(char c) {
		if (c == '1') {
			return 1;
		} else if (c == '2') {
			return 2;
		} else if (c == '3') {
			return 3;
		} else if (c == '4') {
			return 4;
		} else if (c == '5') {
			return 5;
		} else if (c == '6') {
			return 6;
		} else if (c == '7') {
			return 7;
		} else if (c == '8') {
			return 8;
		} else if (c == '9') {
			return 9;
		} else if (c == '0') {
			return 0;
		}
		return 0;
	}

	public static String itc(long i) {

		if (i == 0) {
			return "0";
		} else if (i == 1) {
			return "1";
		} else if (i == 2) {
			return "2";
		} else if (i == 3) {
			return "3";
		} else if (i == 4) {
			return "4";
		} else if (i == 5) {
			return "5";
		} else if (i == 6) {
			return "6";
		} else if (i == 7) {
			return "7";
		} else if (i == 8) {
			return "8";
		} else if (i == 9) {
			return "9";
		}
		return "0";
	}
}
