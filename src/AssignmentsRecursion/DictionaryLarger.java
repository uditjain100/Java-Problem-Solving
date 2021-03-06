package AssignmentsRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryLarger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<String> ans = pers("abcd");
		dic(ans, "bcda");
		System.out.println();

	}

	public static void dic(ArrayList<String> mr, String temp) {

		for (int i = 0; i < mr.size(); i++) {
			if (temp.equals(mr.get(i))) {
				for (int j = i + 1; j < mr.size(); j++) {
					System.out.println(mr.get(j));
				}
			}
		}
	}

	public static void per(String str, String ans, String temp) {

		if (str.length() == 0) {
			if (ans.equals(temp)) {
				System.out.println(ans);
			}
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(0);
			String ros = str.substring(0, i) + str.substring(i + 1);
			per(ros, ans + str.charAt(i), temp);
		}

	}

	public static ArrayList<String> pers(String str) {

		if (str.length() == 0) {
			ArrayList<String> nw = new ArrayList<>();
			nw.add("");
			return nw;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(0);
			String ros = str.substring(0, i) + str.substring(i + 1);
			ArrayList<String> rr = pers(ros);

			for (String j : rr) {
				mr.add(str.charAt(i) + j);
			}
		}
		return mr;

	}

}