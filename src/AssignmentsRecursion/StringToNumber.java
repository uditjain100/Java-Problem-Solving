package AssignmentsRecursion;

import java.util.Scanner;

public class StringToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in) ;
		String str = scn.nextLine() ;
		int c = sum2(str);
		System.out.println(c);
	}

	
	public static int sum2(String str) {

		if (str.length() == 0) {
			return 0;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		int sum = 0 ;
		int res = sum2(ros);
		int rem = get(cc);
		int a = (int)Math.pow(10,str.length()-1) ;
		res += rem*a ;
		return res ;
	}

	public static int get(char ch) {

		if (ch == '1') {
			return 1;
		} else if (ch == '2') {
			return 2;
		} else if (ch == '3') {
			return 3;
		} else if (ch == '4') {
			return 4;
		} else if (ch == '5') {
			return 5;
		} else if (ch == '6') {
			return 6;
		} else if (ch == '7') {
			return 7;
		} else if (ch == '8') {
			return 8;
		} else if (ch == '9') {
			return 9;
		} else if (ch == '0') {
			return 0;
		}
		return 0;
	}


}
