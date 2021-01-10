package AssignmentsRecursion;

import java.util.Scanner;

public class isBalanced {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println(isBalanced("[a + {b + (c + d) + e} + f]" , ""));

	}

	public static boolean isBalanced(String str, String ans) {

		if (str.length() == 0) {
			if (ans.length() == 0) {
				return true;
			} else {
				return false;
			}
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		if (ch == '{' || ch == '[' || ch == '(') {
			ans += ch;
		} else if (ch == '}' || ch == ']' || ch == ')') {
			if (ans.length() != 0) {
				char last = ans.charAt(ans.length() - 1);
				if (ch == '{' && last != '}') {
					return false;
				} else if (ch == '(' && last != ')') {
					return false;
				} else if (ch == '[' && last != ']') {
					return false;
				}

				ans = ans.substring(0, ans.length() - 1);
			} else {
				return false;
			}
		}
		return isBalanced(ros, ans);
	}

}