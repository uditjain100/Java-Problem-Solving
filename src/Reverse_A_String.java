/*
 *
 *  Author : Udit Jain
	College : Maharaja Agrasen Institute Of Technology Rohini
	Year/Department : 2nd year - Computer Science And Engineering
	E-Mail Id : jain30udit@gmail.com

*/

import java.util.Scanner;

public class Reverse_A_String {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String ans = ras(str);
		System.out.println(ans);

	}

	public static String ras(String str) {

		String ans = "";
		int li = str.length() - 1;

		for (int i = str.length() - 1; i >= 0; i--) {

			char cc = str.charAt(i);
			if (cc == ' ') {
				ans += str.substring(i + 1, li + 1);
				ans += " ";
				li = i;
			}

			if (i == 0) {
				ans += str.substring(i, li);
			}

		}
		return ans;

	}

}
