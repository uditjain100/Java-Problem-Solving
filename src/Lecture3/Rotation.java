package Lecture3;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rot = scn.nextInt();
		int nod = 0;
		int temp = n;
		while (temp != 0) {
			nod++;
			temp = temp / 10;
		}
		int divisor = (int) Math.pow(10, rot);
		int rem = n % divisor;
		int quot = n / divisor;
		int ans = rem * (int) Math.pow(10, nod - rot) + quot;

		System.out.println(ans);
	}

}
