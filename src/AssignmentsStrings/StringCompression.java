package AssignmentsStrings;

import java.util.Scanner;

public class StringCompression {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();
		compression(str);
	}

	public static void compression(String str) {

		int count = 0;
		String ans = " ";
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				ans += str.charAt(i);

				if (count != 0) {
					ans += count;
				}
				count = 1;
			}
		}
		ans += str.charAt(str.length() - 1);
		if (count != 1) {
			ans += count;
		}
		System.out.println(ans);
	}
}
