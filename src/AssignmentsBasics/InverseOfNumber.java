package AssignmentsBasics;

import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		int count = 1 ;
		while (n != 0) {
			int rem = n % 10;
			int d = (int) Math.pow(10, rem - 1);
			ans = ans + count * d;
			n /= 10;
			count++ ;
		}
		System.out.println(ans);
	}

}
