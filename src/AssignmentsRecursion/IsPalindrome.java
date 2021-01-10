package AssignmentsRecursion;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		boolean c = sum2(str);
		System.out.println(c);
	}

	public static boolean sum2(String str) {

		if (str.length() == 0) {
			return false;
		}
		if (str.length() == 1) {
			return true;
		}

		char c1 = str.charAt(0);
		char c2 = str.charAt(str.length() - 1);

		String ros = str.substring(1, str.length() - 1);
		boolean res = sum2(ros);
		if (c1 != c2) {
			return false;
		}
		return true;
	}

}