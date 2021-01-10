package Lecture2Homework;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int power = 1;
		int binary = 0;
		while (n != 0) {
			int rem = n % 10;

			binary = binary + rem * power;
			power = power * 2;
			n = n / 10;
		}
		System.out.println(binary);
	}

}
