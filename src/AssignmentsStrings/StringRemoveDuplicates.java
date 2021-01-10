package AssignmentsStrings;

import java.util.Scanner;

public class StringRemoveDuplicates {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();
		Max(str);
	}

	public static void Max(String str) {

		if (str.charAt(0) == str.charAt(1)) {
			System.out.print(str.charAt(0));
		} else {
			System.out.print(str.charAt(0));
			System.out.print(str.charAt(1));
		}
		for (int i = 1; i < str.length() - 1; i++) {
			char a = str.charAt(i);
			char b = str.charAt(i + 1);
			if (a != b) {
				System.out.print(b);
			} else {
				continue;
			}
		}
	}
}
