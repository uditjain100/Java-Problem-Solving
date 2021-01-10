package Lecture10;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {

		System.out.println(Permutations("abc"));

	}

	public static ArrayList<String> Permutations(String str) {
		if (str.length() == 0) {
			ArrayList<String> xyz = new ArrayList<>();
			xyz.add("");
			return xyz;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recans = Permutations(ros);
		ArrayList<String> myres = new ArrayList<>();

		for (String val : recans) {

			for (int i = 0; i <= val.length(); i++) {

				String ans = val.substring(0, i) + ch + val.substring(i);
				myres.add(ans);
			}
			
		}
		return myres;
	}

}
