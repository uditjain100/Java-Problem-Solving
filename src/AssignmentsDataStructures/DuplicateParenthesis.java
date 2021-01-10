package AssignmentsDataStructures;

import java.util.Scanner;

public class DuplicateParenthesis {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		StackR stack = new StackR();
		String str = "((a+b) + ((c+d)))";
		DP(stack, str);
	}

	public static boolean DP(StackR stack, String str) throws Exception {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ')') {
				while (str.charAt(i) != '(') {
					stack.pop();
				}
				count++;
				if (count <= 1) {
					return true;
				}
			} else {
				stack.push(str.charAt(i));
			}
		}
		return false;
	}
}
