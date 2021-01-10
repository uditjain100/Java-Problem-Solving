package AssignmentsRecursion;

import java.util.Scanner;

public class Keypad {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		sum1(str, "");
		System.out.println();
		System.out.println(sum2(str, ""));
	}

	public static void sum1(String str, String ans) {

		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		String code = getcode(cc);

		for (int i = 0; i < code.length(); i++) {
			sum1(ros, ans + code.charAt(i));
		}
	}

	public static int sum2(String str, String ans) {

		if (str.length() == 0) {
			return 1;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		String code = getcode(cc);
		int count = 0;
		for (int i = 0; i < code.length(); i++) {
			count += sum2(ros, ans + code.charAt(i));
		}
		return count;
	}

	public static String getcode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "0#";
		else
			return "";
	}

}