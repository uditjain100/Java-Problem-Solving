package Assignments;

import java.util.Scanner;

public class CHEWBACCA {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long temp = n ;
		long ans = 0;
		long power = 1;
		int count  = 0 ;
		while (temp != 0) {
			long rem = temp % 10;
			long rem1 = 9 - rem;
			if (rem > rem1) {
				ans = ans + rem1 * power;
			} else {
				ans = ans + rem * power;
			}
			power = power * 10;
			temp /= 10;
			count++;
		}
		long d = (long) Math.pow(10,count - 1) ;
		long rem2 = n / d;
		if (rem2 == 9) {
			ans = ans + 9*d ;
		}
		System.out.println(ans);
	
		}
	}
