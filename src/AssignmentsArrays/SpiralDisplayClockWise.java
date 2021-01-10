package AssignmentsArrays;

import java.util.Scanner;

public class SpiralDisplayClockWise {
	
	static Scanner scn = new Scanner(System.in) ;

	public static void main(String[] args) {
		int[][] ans = takeinput() ;
		spiraldisplay(ans) ;
	}

	public static int[][] takeinput() {

		int row = scn.nextInt();
		int cols = scn.nextInt();
		int[][] arr = new int[row][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[cols];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}

	public static void spiraldisplay(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int count = 0;
		int nel = arr.length * arr[0].length;
		while (count < nel) {
			for (int i = mincol; count < nel && i <= maxcol; i++) {
				System.out.print(arr[minrow][i] + ", ");
				count++;
			}
			minrow++;
			for (int i = minrow; count < nel && i <= maxrow; i++) {
				System.out.print(arr[i][maxcol] + ", ");
				count++;
			}
			maxcol--;
			for (int i = maxcol; count < nel && i >= mincol; i--) {
				System.out.print(arr[maxrow][i] + ", ");
				count++;
			}
			maxrow--;
			for (int i = maxrow; count < nel && i >= minrow; i--) {
				System.out.print(arr[i][mincol] + ", ");
				count++;
			}
			mincol++;
		}
		System.out.println("End");
	}
}
