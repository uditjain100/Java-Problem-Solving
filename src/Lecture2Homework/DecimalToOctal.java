package Lecture2Homework;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int power = 1 ;
		int decimal = 0;
		while (n != 0) {
			int rem = n % 8;
			decimal = decimal + rem * power ;
			power = power*10;
			n = n / 8 ;
		}
		System.out.println(decimal);
	}

}
