package Lecture6;

import java.util.Scanner;

public class SpiralDisplay {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] array = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 }, { 110, 120, 130, 140, 150 },
				{ 160, 170, 180, 190, 200 }, { 210, 220, 230, 240, 250 } };
		// display(array);
		spiraldisplay(array);

	}

	public static void spiraldisplay(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int count = 0;
		int nel = arr.length * arr[0].length;
		while (count < nel) {
			for (int i = minrow; count < nel && i <= maxrow; i++) {
				System.out.print(arr[i][mincol] + " ");
				count++;
			}
			mincol++;
			for (int i = mincol; count < nel && i <= maxcol; i++) {
				System.out.print(arr[maxrow][i] + " ");
				count++;
			}
			maxrow--;
			for (int i = maxrow; count < nel && i >= minrow; i--) {
				System.out.print(arr[i][maxcol] + " ");
				count++;
			}
			maxcol--;
			for (int i = maxcol; count < nel && i >= mincol; i--) {
				System.out.print(arr[minrow][i] + " ");
				count++;
			}
			minrow++;
			//System.out.println();
		}
	}

}
