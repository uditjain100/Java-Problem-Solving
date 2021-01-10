package UditJain;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int counter = 0;

		while (counter <= n) {

			System.out.println(counter);

			counter = counter + 2;

		}
		System.out.println("bye");
	}

}
