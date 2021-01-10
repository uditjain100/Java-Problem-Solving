package Lecture7;

import java.util.Scanner;

public class palintrome {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();
		System.out.println(palindromess(str));
	}

	public static boolean ispalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static int palindromess(String str) {
		int count = 0;
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String ss = str.substring(i, j);
				if (ispalindrome(ss)) {
					count++;

				}
			}
		}
		return count;
	}
}
