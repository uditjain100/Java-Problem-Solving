package LeetCode;

public class DayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "2004-03-01";
		System.out.println(dayOfYear(str));
	}

	public static int dayOfYear(String str) {

		int[] ny = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
		int[] ly = { 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335 };
		String y = str.substring(0, 4);
		int year = stn(y);

		int day = 0;
		if (year % 4 == 0) {
			int month = stn(str.substring(5, 7));
			int date = stn(str.substring(8));
			day = date + ny[month - 1];

		} else {
			int month = stn(str.substring(5, 7));
			int date = stn(str.substring(8));
			day = date + ly[month - 1];

		}

		return day;
	}

	public static int stn(String str) {

		int num = 0;
		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			int dig = ctn(ch);
			num += dig * (int) Math.pow(10, j);
			j++;
		}

		return num;
	}

	public static int ctn(char ch) {

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
