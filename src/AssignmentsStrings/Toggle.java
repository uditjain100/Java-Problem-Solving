package AssignmentsStrings;

import java.util.Scanner;

public class Toggle {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();
		toggle(str);
	}

	public static void toggle(String str) {

		for (int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			if (ch >= 97 && ch <= 122) {
				ch = ch - 32;
			} else {
				ch = ch + 32;
			}
			System.out.print((char) ch);
		}
	}
}
