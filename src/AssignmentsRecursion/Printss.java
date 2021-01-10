package AssignmentsRecursion;

import java.util.Scanner;

public class Printss {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int a = ss(str, "");
		System.out.println();
		System.out.println(a);
	}

	public static int ss(String str, String ans) {

		if (str.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		int count = 0;
		count += ss(ros, ans);
		count += ss(ros, ans + cc);
		// count += ss(ros, ans + (int) cc);

		return count;

	}
}