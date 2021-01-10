package Practice;

import java.util.ArrayList;
import java.util.Stack;

public class Temp {

	public static String[] Keypad = { "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// ai(new int[] { 1, 2, 8, 4, 5, 5, 8, 9 }, 0, 5);

		// System.out.println(boardpath(0, 10));
		// System.out.println(boardpath(0, 10).size());

		// System.out.println(isValid("(){}[]"));

		System.out.println(MazePath(1, 1, 3, 2));
		// System.out.println(countAndSay(5));
		// int ans = printss("ac" , " ") ;
		// System.out.println(ans);
		// int ans = printper("abc" , "") ;
		// System.out.println(ans);
		// int ans = printbp(0, 10, "");
		// System.out.println(ans);
		// int ans = printmp(1,1,3,3,"") ;
		// System.out.println(ans);

		// boolean[][] board = new boolean[4][4];
		// int ans = Nqueen(board, 0, "");
		// System.out.println();
		// System.out.println(ans);

		// System.out.println(string_to_integer("12345"));

		// System.out.println(multiply(2, -3));

		/*
		 * boolean[] box = new boolean[4]; int ans = one_D_Queen(box, 0, 2, "", -1);
		 * System.out.println(ans);
		 */

		// System.out.println(coin_change_per(new int[] { 2, 3, 5, 7 }, 10, ""));
		// System.out.println("\n" + keypad("79", ""));

		int[][] arr = new int[3][2];
		System.out.println(print_mp_dp(arr, 1, 1, 2, 3));
	}

	public static int fi(int[] arr, int idx, int data) {

		if (idx == arr.length - 1) {
			if (arr[idx] == data) {
				return idx;
			} else {
				return -1;
			}
		}

		int ans = fi(arr, idx + 1, data);

		if (ans == -1 && arr[idx] == data) {
			return idx;
		}

		return ans;
	}

	public static void ai(int[] arr, int idx, int data) {

		if (idx == arr.length - 1) {
			if (arr[idx] == data) {
				System.out.println(idx);
				return;
			} else {
				return;
			}
		}

		if (arr[idx] == data) {
			System.out.println(idx);
		}

		ai(arr, idx + 1, data);

		return;

	}

	public static ArrayList<String> subseq(String str) {

		if (str.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(" ");
			return list;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myRes = new ArrayList<>();
		ArrayList<String> recRes = subseq(ros);

		for (String temp : recRes) {
			myRes.add(temp);
			myRes.add(ch + temp);
			myRes.add((int) ch + temp);
		}

		return myRes;
	}

	public static ArrayList<String> per(String str) {

		if (str.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(" ");
			return list;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recRes = per(ros);
		ArrayList<String> myRes = new ArrayList<>();

		for (String temp : recRes) {
			for (int i = 0; i < temp.length(); i++) {
				String res = temp.substring(0, i) + ch + temp.substring(i);
				myRes.add(res);
			}
		}

		return myRes;

	}

	public static ArrayList<String> boardpath(int curr, int end) {

		if (curr == end) {
			ArrayList<String> list = new ArrayList<>();
			list.add(" ");
			return list;
		}

		if (curr > end) {
			ArrayList<String> list = new ArrayList<>();
			return list;
		}

		ArrayList<String> myRes = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> recRes = boardpath(dice + curr, end);

			for (String temp : recRes) {
				myRes.add(dice + temp);
			}
		}

		return myRes;

	}

	public static boolean isValid(String str) {

		Stack<Character> s = new Stack<>();

		for (int i = 0; i < str.length() - 1; i++) {
			Character ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				s.push(ch);
			} else {
				if (s.isEmpty()) {
					return false;
				} else {
					if (ch == ')' && s.peek() == '(') {
						s.pop();
					} else if (ch == ']' && s.peek() == '[') {
						s.pop();
					} else if (ch == '}' && s.peek() == '{') {
						s.pop();
					} else {
						return false;
					}
				}
			}
		}

		if (s.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public static String countAndSay(int n) {

		if (n == 1) {
			return "1";
		}

		String myRes = "";

		String rr = countAndSay(n - 1);

		int count = 1;
		int i = 0;
		while (i < rr.length()) {

			char ch1 = rr.charAt(i);
			char ch2 = ' ';

			if (i != rr.length() - 1) {
				ch2 = rr.charAt(i + 1);
			}

			if (ch1 == ch2) {
				count++;
				i++;
			} else if (ch2 == ' ' || ch1 != ch2) {
				System.out.println("count : " + count);
				myRes += "" + count + ch1;
				count = 1;
				i++;
			}

		}

		return myRes;

	}

	public static ArrayList<String> MazePath(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> list = new ArrayList<>();
			list.add(" ");
			return list;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> list = new ArrayList<>();
			return list;
		}

		ArrayList<String> myRes = new ArrayList<>();
		ArrayList<String> recResh = MazePath(cr + 1, cc, er, ec);

		for (String temp : recResh) {
			myRes.add("H" + temp);
		}

		ArrayList<String> recResv = MazePath(cr, cc + 1, er, ec);

		for (String temp : recResv) {
			myRes.add("V" + temp);
		}

		ArrayList<String> recResd = MazePath(cr + 1, cc + 1, er, ec);

		for (String temp : recResd) {
			myRes.add("D" + temp);
		}

		return myRes;

	}

	public static int printss(String str, String ans) {

		if (str.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		int ans1 = printss(ros, ans);
		int ans2 = printss(ros, ans + cc);

		return ans1 + ans2;

	}

	public static int printper(String str, String ans) {

		if (str.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);

			count += printper(ros, ans + cc);
		}

		return count;
	}

	public static int printbp(int curr, int end, String ans) {

		if (curr == end) {
			System.out.print(ans + "\t");
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int count = 0;
		for (int i = 1; i <= 6; i++) {
			count += printbp(curr + i, end, ans + i);
		}

		return count;
	}

	public static int printmp(int cc, int cr, int ec, int er, String ans) {

		if (cc == ec && cr == er) {
			System.out.print(ans + " ");
			return 1;
		}

		if (cc > ec || cr > er) {
			return 0;
		}

		int count = 0;
		count += printmp(cc + 1, cr, ec, er, ans + "V");
		count += printmp(cc, cr + 1, ec, er, ans + "H");
		count += printmp(cc + 1, cr + 1, ec, er, ans + "D");

		return count;

	}

	public static int print_mp_dp(int[][] arr, int cc, int cr, int ec, int er) {

		if (cc == ec && cr == er) {
			return 1;
		}

		if (cc > ec || cr > er) {
			return 0;
		}

		if (arr[cr - 1][cc - 1] != 0) {
			return arr[cr - 1][cc - 1];
		}

		int count = 0;

		count += print_mp_dp(arr, cc + 1, cr, ec, er);
		count += print_mp_dp(arr, cc, cr + 1, ec, er);
		count += print_mp_dp(arr, cc + 1, cr + 1, ec, er);

		arr[cr - 1][cc - 1] = count;

		return count;
	}

	public static int Nqueen(boolean[][] board, int row, String ans) {

		if (row == board.length) {
			System.out.println(ans);
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isitSafe(board, row, col)) {
				board[row][col] = true;
				count += Nqueen(board, row + 1, ans + "{" + (row + 1) + "," + (col + 1) + "}");
				board[row][col] = false;
			}
		}

		return count;

	}

	private static boolean isitSafe(boolean[][] board, int row, int col) {

		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}

		for (int i = col, j = row; i >= 0 && j >= 0; i--, j--) {
			if (board[j][i]) {
				return false;
			}
		}

		for (int i = col, j = row; i < board.length && j >= 0; i++, j--) {
			if (board[j][i]) {
				return false;
			}
		}

		return true;
	}

	public static Integer string_to_integer(String str) {

		if (str.length() == 0) {
			return 0;
		}

		String cc = str.substring(0, 1);
		String ros = str.substring(1);

		Integer ans = string_to_integer(ros);

		Integer ch = Integer.parseInt(cc);

		ans += ch * (int) Math.pow(10, str.length() - 1);

		return ans;
	}

	public static int multiply(int a, int b) {

		if (b == 0) {
			return 0;
		}

		int ans = 0;

		if (a > 0 && b > 0) {
			ans += multiply(a, b - 1);
		} else if (a > 0 && b < 0) {
			ans += multiply(a, b + 1);
		} else if (a < 0 && b > 0) {
			ans += multiply(a, b - 1);
		} else if (a < 0 && b < 0) {
			ans += multiply(a, b + 1);
		}

		ans += a;

		return ans;
	}

	public static int one_D_Queen_per(boolean[] box, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		for (int i = 0; i < box.length; i++) {
			box[i] = true;
			count += one_D_Queen_per(box, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
			box[i] = false;
		}

		return count;

	}

	public static int one_D_Queen_com(boolean[] box, int qpsf, int tq, String ans, int liu) {

		if (qpsf == tq) {
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		for (int i = liu + 1; i < box.length; i++) {
			box[i] = true;
			count += one_D_Queen_com(box, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);
			box[i] = false;
		}

		return count;

	}

	public static int coin_change_com(int[] arr, int amount, String ans, int liu) {

		if (amount == 0) {
			System.out.println(ans);
			return 1;
		}

		int count = 0;

		for (int i = liu; i < arr.length; i++) {
			if (amount >= arr[i]) {
				count += coin_change_com(arr, amount - arr[i], ans + arr[i], i);
			}
		}

		return count;

	}

	public static int coin_change_per(int[] arr, int amount, String ans) {

		if (amount == 0) {
			System.out.println(ans);
			return 1;
		}

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (amount >= arr[i]) {
				count += coin_change_per(arr, amount - arr[i], ans + arr[i]);
			}
		}

		return count;

	}

	public static int keypad(String str, String ans) {

		if (str.length() == 0) {
			System.out.print(ans + ", ");
			return 1;
		}

		int count = 0;
		int digit = str.charAt(0) - '0';
		String ros = str.substring(1);

		if (digit == 0 || digit == 1) {
			count += keypad(ros, ans);
		}

		for (int k = 0; k < Keypad[digit].length(); k++) {
			count += keypad(ros, ans + Keypad[digit].charAt(k));
		}

		return count;

	}

	public static int rat_in_maze(boolean[][] box, int cc, int cr, int ec, int er, String ans) {

		if (cc == ec && cr == er) {
			System.out.print(ans + " ");
			return 1;
		}

		if (cc > ec || cr > er) {
			return 0;
		}

		if (box[cr][cc] == false) {
			return 0;
		}

		int count = 0;

		box[cr][cc] = true;
		count += rat_in_maze(box, cc + 1, cr, ec, er, ans + "V");
		count += rat_in_maze(box, cc, cr + 1, ec, er, ans + "H");
		box[cr][cc] = false;

		return count;

	}

}
