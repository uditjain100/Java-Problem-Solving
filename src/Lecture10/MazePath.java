package Lecture10;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {

		System.out.println(MazePath(0, 0, 3, 3));

	}

	public static ArrayList<String> MazePath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> xyz = new ArrayList<>();
			xyz.add("");
			return xyz;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> xyz = new ArrayList<>();
			return xyz;
		}
		ArrayList<String> myres = new ArrayList<>();

		ArrayList<String> recansH = MazePath(cr, cc + 1, er, ec);
		for (String val : recansH) {
			myres.add("H" + val);
		}
		ArrayList<String> recansV = MazePath(cr + 1, cc, er, ec);
		for (String val : recansV) {
			myres.add("V" + val);
		}

		return myres;
	}

}
