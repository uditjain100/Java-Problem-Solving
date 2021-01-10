package AssignmentsRecursion;

import java.util.Scanner;

public class Twins {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int c = sum2(str);
		System.out.println(c);
	}

	public static int sum2(String str) {

		if (str.length() == 2 || str.length() == 1) {
			return 0;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		
		int res = sum2(ros);
		if(cc == str.charAt(2)) {
			res++;
		}
		return res;
	}

}