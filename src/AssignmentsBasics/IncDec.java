package Assignments;

import java.util.Scanner;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int[] takeInput() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int i = 0;
		while (i < arr.length) {
			arr[i] = scn.nextInt();
			i++;
		}

		return arr;

	}
}
