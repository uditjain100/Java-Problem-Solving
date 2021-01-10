package Lecture11;

public class Printss {

	public static void main(String[] args) {

		printss("abc", "");

	}

	public static void printss(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = que.charAt(0);
		String ros = que.substring(1);

		printss(ros, ans);
		printss(ros, ans + ch);
	}
}