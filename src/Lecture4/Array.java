package Lecture4;

import java.util.Scanner;

public class Array {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		display(arr);
	}

	public static int[] takeInput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		int i = 0;
		while (i < arr.length) {
			arr[i] = scn.nextInt();
			i++;
		}
		return arr;
	}

	public static void display(int[] arr) {
		System.out.println("---------------");
		for (int val : arr) {
			System.out.println(val);
		}
		System.out.println("---------------");
	}
}
