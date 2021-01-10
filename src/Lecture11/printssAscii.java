package Lecture11;

public class printssAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printssAscii("abc", " ");
	}

	public static void printssAscii(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = que.charAt(0);
		String ros = que.substring(1);

		printssAscii(ros, ans);
		printssAscii(ros, ans + ch);
		printssAscii(ros, ans + (int) ch);
	}

}
