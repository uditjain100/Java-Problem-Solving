package AssignmentsRecursion;

import java.util.Scanner;

public class CountAAA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int c = sum1(str);
		System.out.println(c);
		int d = sum2(str);
		System.out.println(d);
	}

	public static int sum1(String str) {

		if (str.length() == 2 || str.length() == 1) {
			return 0;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		int res = sum1(ros);
		if (cc == str.charAt(2) && cc == str.charAt(1)) {
			res++;
		}
		return res;
	}

	public static int sum2(String str) {

		if (str.length() == 2 || str.length() == 1 || str.length() == 0) {
			return 0;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		if (cc == str.charAt(2) && cc == str.charAt(1)) {
			ros = str.substring(3);
			int res = sum2(ros);
			res++;
			return res;
		} else {
			int res1 = sum2(ros);
			return res1;
		}
	}

}