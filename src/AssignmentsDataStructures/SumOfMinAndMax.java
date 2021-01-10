package AssignmentsDataStructures;

import java.util.Scanner;

public class SumOfMinAndMax {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);
		StackR stack = new StackR();
		int[] arr = { 2, 5, -1, 7, -3, -1, -2 };
		int k = 4;
		SMM(4, stack, arr);
	}

	public static void SMM(int k, StackR stack, int[] arr) throws Exception {

		int sum = 0;
		for (int i = 0; i < arr.length - k + 1; i++) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int j = i; j < i + k; j++) {
				stack.push(arr[j]);
				if (min > arr[j]) {
					min = arr[j];
				}
				if (max < arr[j]) {
					max = arr[j];
				}
			}
			int s = min + max;
			sum = sum + s;
			System.out.println(min + " = " + max + " = " + sum);
			for (int j = 0; j < k; j++) {
				stack.pop();
			}
		}
		System.out.println(sum);
	}
}
