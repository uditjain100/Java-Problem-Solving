package AssignmentsRecursion;

import java.util.Scanner;

public class AllxAtEnd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String c = sum2(str);
		System.out.println(c);
	}

	public static String sum2(String str) {

		if (str.length() == 0) {
			String abc = "";
			return abc;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		String res = sum2(ros);
		if (cc != 'x') {
			res = cc + res;
		} else {
			res = res + cc;
		}
		
		return res;
	}

}