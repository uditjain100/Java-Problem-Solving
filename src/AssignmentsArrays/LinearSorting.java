package AssignmentsArrays;

import java.util.Scanner;

public class LinearSorting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		LinearSort(arr);

	}

	public static void LinearSort(int[] arr) {

		int noz = 0;
		int noo = 0;
		int not = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				noz++;
			} else if (arr[i] == 1) {
				noo++;
			} else {
				not++;
			}
		}
		for (int j = 0; j < noz; j++) {
			arr[j] = 0;
		}
		for (int j = noz; j < noz + noo; j++) {
			arr[j] = 1;  
		}
		for (int j = noz + noo; j < arr.length; j++) {
			arr[j] = 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
