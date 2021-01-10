package AssignmentsBasics;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int var1 = n1 ;
		int var2 = n2 ;
		while (var1 % var2 != 0) {

			int remainder = var1 % var2 ;
			var1 = var2;
			var2 = remainder;
		}
		int gcd = var2 ;
		
		int lcm = (n1*n2) / gcd ;
		System.out.println(lcm);
	}
}
