package AssignmentsStrings;

import java.util.Scanner;

public class StringDiffInASCIIcode {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();
		sdac(str);
	}

	public static void sdac(String str) {

		System.out.print(str.charAt(0));

		for (int i = 0; i < str.length() - 1; i++) {
			int a = str.charAt(i);
			int b = str.charAt(i + 1);
			int diff = b - a;
			System.out.print(diff);
			System.out.print((char) b);
		}
	}
}
