package Lecture6;

import java.util.Scanner;

public class ABC1 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] var = takeinput();
	//	int[][] array = {{10,20,30},{40,50,60},{70,80,90}};
		display(var);
		
	}

	public static int[][] takeinput() {

		System.out.println("Rows + ? ");

		int rows = scn.nextInt();

		// jagged array

		int[][] arr = new int[rows][];
		for (int row = 0; row < arr.length; row++) {

			System.out.println("col" + "?");
			int cols = scn.nextInt();
			arr[row] = new int[cols];

			for (int col = 0; col < arr[row].length; col++) {

				System.out.println("[" + row + "-" + col + "]");
				arr[row][col] = scn.nextInt();
			}

		}

		return arr;

	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
