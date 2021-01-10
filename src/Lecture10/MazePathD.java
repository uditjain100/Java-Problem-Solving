package Lecture10;

import java.util.ArrayList;

public class MazePathD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MazePathD(0, 0, 2, 2));

	}

	public static ArrayList<String> MazePathD(int cr, int cc, int er, int ec) {
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

		ArrayList<String> recansH = MazePathD(cr, cc + 1, er, ec);
		for (String val : recansH) {
			myres.add("H" + val);
		}
		ArrayList<String> recansV = MazePathD(cr + 1, cc, er, ec);
		for (String val : recansV) {
			myres.add("V" + val);
		}
		ArrayList<String> recansD = MazePathD(cr + 1, cc + 1, er, ec);
		for (String val : recansD) {
			myres.add("D" + val);
		}

		return myres;

	}

}
