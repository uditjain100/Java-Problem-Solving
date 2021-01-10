package UditJain;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int counter = 1;
		int sum = 0;
		while (counter <= n) {
			sum = sum + counter;
			counter = counter + 1;
		}
			System.out.print(sum);
		}
	}


