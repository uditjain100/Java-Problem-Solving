package AssignmentsStrings;

import java.util.Scanner;

public class ispalindrome {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();
		System.out.println(nop(str));
	}

	public static boolean ispalindrome(String str) {

		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static int nop(String str) {

		int count = 0;
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String ss = str.substring(i, j);
				if (ispalindrome(ss) == true) {
					System.out.println(ss);
					count++;
				}
			}
		}
		return count;
	}
}
