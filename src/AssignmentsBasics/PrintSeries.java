package Assignments;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int count = 1;
		for (int i = 1; count <= n1; i++) {
			int d = 3 * i + 2;
			if (d % n2 == 0) {
				continue;
			} else {
				System.out.println(d);
				count++;
			}
		}
	}

}
