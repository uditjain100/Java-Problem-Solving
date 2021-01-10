package Lecture9;

import java.util.ArrayList;

public class get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getss("abc"));
	}

	public static ArrayList<String> getss(String str) {
		if (str.length() == 0) {
			ArrayList<String> xyz = new ArrayList<>();
			xyz.add("");
			return xyz;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recans = getss(ros);
		ArrayList<String> myres = new ArrayList<>();

		for (String i : recans) {
			myres.add(i);
			myres.add(ch + i);
			myres.add((int) ch + i);

		}
		return myres;
	}

}
