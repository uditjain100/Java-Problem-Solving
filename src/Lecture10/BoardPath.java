package Lecture10;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println(per(0, 4));
		System.out.println(per(0, 4).size());
	}

	public static ArrayList<String> per(int curr, int end) {

		if (curr == end) {
			ArrayList<String> listt = new ArrayList<>();
			listt.add("\n");
			return listt;
		}
		if (curr > end) {
			ArrayList<String> listt = new ArrayList<>();
			return listt;
		}

		ArrayList<String> myres = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = per(curr + dice, end);
			for (String j : rr) {
				myres.add(dice + j);
			}
		}
		return myres;
	}

}