package Lecture2;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int power = 1;
		int decimal = 0;

		while (n != 0) {
			int rem = n % 10;

			decimal = decimal + rem * power;
			power = power * 2;
			n = n / 10;
		}
		System.out.println(decimal);
	}

}
