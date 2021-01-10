package Lecture6;

import java.util.Scanner;

public class wavedisplay {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] array = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		display(array);

	}

	public static void display(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {

					System.out.print(arr[row][col] + " ");
				}
				//System.out.println();
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {

					System.out.print(arr[row][col] + " ");

				}

				//System.out.println();
			}
		}
	}
}
