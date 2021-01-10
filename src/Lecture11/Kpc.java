package Lecture11;

public class Kpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kpc("145" , " ");
	}

	public static String getcode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "0#";
		else
			return "";
	}

	public static void Kpc(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = que.charAt(0);
		String code = getcode(ch);

		String ros = que.substring(1);
		for (int i = 0; i < code.length(); i++) {
			Kpc(ros, ans + code.charAt(i));
		}

	}
}
