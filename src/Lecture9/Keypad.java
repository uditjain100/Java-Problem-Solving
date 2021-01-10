package Lecture9;

import java.util.ArrayList;

public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Keypad("145"));

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

	public static ArrayList<String> Keypad(String str) {
		if (str.length() == 0) {
			ArrayList<String> xyz = new ArrayList<>();
			xyz.add("");
			return xyz;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		String code = getcode(ch);

		ArrayList<String> recans = Keypad(ros);
		ArrayList<String> myres = new ArrayList<>();

		for (int i = 0; i < code.length(); i++) {
			for (String val : recans) {
				myres.add(code.charAt(i) + val);

			}

		}
		return myres;
	}

}
