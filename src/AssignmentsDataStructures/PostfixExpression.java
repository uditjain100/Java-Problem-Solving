package AssignmentsDataStructures;

import java.util.ArrayList;
import java.util.Scanner;

import Lecture14.Stack;

public class PostfixExpression {

	public static void main(String[] args) throws Exception {

		// 4*5+9-2/1
		// 45921/-+*
		// 4/5-9+2*1
		// 45921*+-/

		Scanner scn = new Scanner(System.in);
		Stackcar stack = new Stackcar(15);
		StackR sta = new StackR(15) ;
		String str = scn.nextLine();
		/*
		 * char[] ch = itp(str, stack); for (int i = 0; i < str.length(); i++) {
		 * System.out.print(ch[i]); }
		 */

		// Postfix(str, stack);

		/*
		 * char ch = ')'; System.out.println((int) ch);
		 */
		// System.out.println(itp(str, stack));
		// itp2(str, stack);
		//itp3(str, stack);
		Postfix(str, sta);
		// abcd^e-fgh*+^*+i-

	}

	public static void itp3(String str, Stackcar stack) throws Exception {

		String ans = "";
		int var = 0;
		for (int i = 0; i < str.length(); i++) {

			System.out.println("i -> " + i);
			char ch = str.charAt(i);

			if (Character.isLetterOrDigit(ch)) {
				System.out.print("ch -> " + ch);
				ans += ch;
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == (')')) {
				while (!stack.isEmpty() && stack.top() != '(') {
					char rv = stack.pop();
					System.out.print("rv -> " + rv);
					ans += rv;
				}
				/*
				 * if (!stack.isEmpty() && stack.top() != '(') {
				 * System.out.println("Invalid Expression!!"); } else { stack.pop(); }
				 */
			} else { // operators
				if (var == 0) {
					stack.push(ch);
					var = 1;
				} else {
					if (stack.top() == '(') {
						stack.push(ch);
					} else if (Prec(stack.top()) < Prec(ch)) {
						stack.push(ch);
					} else if (Prec(stack.top()) >= Prec(ch)) {
						while (!stack.isEmpty() && Prec(stack.top()) >= Prec(ch)) {
							char rv = stack.pop();
							System.out.print("rv -> " + rv);
							ans += rv;
						}
						stack.push(ch);
					}
				}
			}

			System.out.println();
			System.out.print("Stack -> ");
			stack.display();
			System.out.println();
			System.out.println("ans ->  " + ans);
		}

		while (!stack.isEmpty()) {
			char rv = stack.pop();
			if (rv != '(') {
				System.out.println("rv -> " + rv);
				ans += rv;
			}
		}
		System.out.println();
		System.out.println("ans -> " + ans);

	}

	public static int Prec(char ch) {

		if (ch == '+' || ch == '-') {
			return 1;
		} else if (ch == '*' || ch == '/') {
			return 2;
		} else if (ch == '^') {
			return 3;
		} else {
			return -1;
		}

	}

	public static void itp2(String str, StackR stack) throws Exception {

		String ans = "";
		int var = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				System.out.print((char) ch);
				ans += cts(ch);
			} else if (ch == '(') {
				stack.push((int) '(');
			} else if (ch == (')')) {
				while (stack.top() != (int) '(') {
					int rv = stack.pop();
					System.out.print((char) rv);
					ans += cts((char) rv);
				}
			} else {
				if (var == 0) {
					stack.push(ch);
					var = 1;
				} else {
					if (stack.top() == 40) {
						stack.push(ch);
					} else if ((int) stack.top() < (int) ch) {
						stack.push((char) ch);
					} else if ((int) stack.top() >= (int) ch) {
						while (stack.isEmpty() || (int) stack.top() < (int) ch) {
							int rv = stack.pop();
							System.out.print(rv);
							ans += cts((char) rv);
						}
						stack.push(ch);
					}
				}
			}

		}

		while (!stack.isEmpty()) {
			int rv = stack.pop();
			if (rv != 40) {
				System.out.print((char) rv);
				ans += cts((char) rv);
			}
		}
		System.out.println();
		System.out.println(ans);

	}

	public static ArrayList<String> itp(String str, StackR stack) throws Exception {

		ArrayList<String> list = new ArrayList<>();
		int var = 0;
		for (int i = 0; i < str.length(); i++) {
			String ch = str.substring(i, i + 1);
			char c = str.charAt(i);
			if (ch.equals("1") || ch.equals("2") || ch.equals("3") || ch.equals("4") || ch.equals("5") || ch.equals("6")
					|| ch.equals("7") || ch.equals("8") || ch.equals("9") || ch.equals("0")) {
				list.add(ch);
				var = 1;
			} else if (ch.equals("(")) {
				stack.push((int) '(');
				var = 2;
			} else if (ch.equals(")")) {
				while (!stack.isEmpty() && stack.top() != (int) '(') {
					int rv = stack.pop();
					char c1 = (char) rv;
					String ss = cts(c1);
					list.add(ss);
				}
				var = 3;
			} else {
				if (stack.isEmpty()) {
					stack.push((int) c);
					var = 6;
				} else {

					if (stack.top() == 40) {
						stack.push((int) c);
						var = 7;
					} else if (stack.top() >= (int) c) {
						stack.push((int) c);
						var = 4;
					} else if (stack.top() < (int) c) {
						int rv = stack.pop();
						char c1 = (char) rv;
						String ss = cts(c1);
						list.add(ss);
						var = 5;
					}
				}
			}
			System.out.print("Stack    ");
			stack.display();
			System.out.println();
			System.out.println("i " + i + " and " + "var " + var);
			System.out.println(list);
		}

		while (!stack.isEmpty()) {
			int rv = stack.pop();
			char c1 = (char) rv;
			String ss = cts(c1);
			if ((rv != 40)) {
				list.add(ss);
			}
		}
		// stack.display();
		return list;

	}

	public static void Postfix(String str, StackR stack) throws Exception {

		int i = 0;
		for (; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				int abc = num(str.charAt(i));
				stack.push(abc);
			} else if (str.charAt(i) == '^' || str.charAt(i) == '*' || str.charAt(i) == '/' || str.charAt(i) == '+'
					|| str.charAt(i) == '-') {
				int a = stack.pop();
				int b = stack.pop();
				int c = ope(a, b, str.charAt(i));
				stack.push(c);
			}
		}
		if (i == str.length()) {
			System.out.println(stack.data[0]);
		}
	}

	public static int num(char c) { 

		if (c == '0') {
			return 0;
		} else if (c == '1') {
			return 1;
		} else if (c == '2') {
			return 2;
		} else if (c == '3') {
			return 3;
		} else if (c == '4') {
			return 4;
		} else if (c == '5') {
			return 5;
		} else if (c == '6') {
			return 6;
		} else if (c == '7') {
			return 7;
		} else if (c == '8') {
			return 8;
		} else {
			return 9;
		}
	}

	public static int ope(int a, int b, char c) {

		if (c == '+') {
			return a + b;
		} else if (c == '-') {
			return b - a;
		} else if (c == '/') {
			return b / a;
		} else if (c == '^') {
			return (int) Math.pow(a, b);
		} else {
			return a * b;
		}

	}

	public static String cts(char ch) {

		if (ch == '+') {
			return "+";
		} else if (ch == '-') {
			return "-";
		} else if (ch == '*') {
			return "*";
		} else if (ch == '/') {
			return "/";
		} else if (ch == '(') {
			return "(";
		} else if (ch == ')') {
			return ")";
		} else if (ch == '^') {
			return "^";
		} else if (ch == '1') {
			return "1";
		} else if (ch == '2') {
			return "2";
		} else if (ch == '3') {
			return "3";
		} else if (ch == '4') {
			return "4";
		} else if (ch == '5') {
			return "5";
		} else if (ch == '6') {
			return "6";
		} else if (ch == '7') {
			return "7";
		} else if (ch == '8') {
			return "8";
		} else if (ch == '9') {
			return "9";
		} else if (ch == '0') {
			return "0";
		}

		return null;

	}

}
