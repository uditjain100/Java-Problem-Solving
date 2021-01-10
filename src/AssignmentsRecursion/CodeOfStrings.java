package AssignmentsRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeOfStrings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		ArrayList<String> res = cos("1125");
		System.out.println(res);
		// System.out.println(get("1"));

	}

	public static ArrayList<String> cos(String str) {

		if (str.length() == 0) {
			ArrayList<String> abc = new ArrayList<>();
			abc.add(" ");
			return abc;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		char var = (char) (cc + 48);

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = cos(ros);
		for (String i : rr) {
			mr.add(var + i);
		}

		if (str.length() > 1) {

			String cr = str.substring(0, 2);
			int value = Integer.parseInt(cr);
			if (value <= 26) {
				char alpha = (char) ('a' + value - 1);
				ros = str.substring(2);
				rr = cos(ros);
				for (String s : rr) {
					mr.add(alpha + s);
				}
			}

		}
		return mr;

	}

}