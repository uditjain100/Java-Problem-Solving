package AssignmentsStrings;

import java.util.Scanner;

public class StringOddEvenCharacter {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();
		soec(str);
	}

	public static void soec(String str) {

		for (int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			if (i % 2 == 0) {
				ch = ch + 1;
			} else {
				ch = ch - 1;
			}
			System.out.print((char) ch);
		}
	}
}
