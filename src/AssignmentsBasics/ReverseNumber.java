package AssignmentsBasics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		reverse(n) ;

	}
	public static int nod(int n) {
		int var = 0 ;
		while(n != 0) {
			n /= 10 ;
			var++ ;
		}
		return var ;
	}

	public static void reverse(int n) {
		int var = n ;
		int sum = 0 ;
		int b = nod(n) ;
		while (var != 0) {
			int rem = var % 10;
			int a = (int) Math.pow(10, b-1) ;
			rem = rem*a ;
			sum = sum + rem ;
			var /= 10;
			b-- ;
		}
		System.out.println(sum);
	}
		
}
