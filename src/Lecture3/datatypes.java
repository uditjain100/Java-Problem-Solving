package Lecture3;

import java.util.Scanner;

public class datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int maxF = scn.nextInt();
		int minF = scn.nextInt();
		int step = scn.nextInt();

		for (int i = minF; i <= maxF; i = i + step) {
			int c = (int) ((5.0 / 9) * (i - 32));
			System.out.println(i + "\t" + c);
		}
	}

}
