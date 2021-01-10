package AssignmentsDataStructures;

import java.util.Scanner;

public class NextGreaterCircularArray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		StackR stack = new StackR();
		int[] arr = { 11, 9, 13, 21, 3 };
		int[] arr2 = new int[2 * arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
			arr2[i + arr.length] = arr[i];
		}
		NGE3(arr2, stack);
	}

	// With Using Stack(+ Recursion)
	public static void NGE3(int[] arr, StackR stack) throws Exception {

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && stack.top() < arr[i]) {
				int temp = stack.pop();
				System.out.println(temp + " - " + arr[i]);
			}
			if (i >= 0 && i < arr.length / 2) {
				stack.push(arr[i]);
			}
		}
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			System.out.println(temp + " - " + "-1");
		}
	}

}
