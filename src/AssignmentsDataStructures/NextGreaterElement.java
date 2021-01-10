package AssignmentsDataStructures;

import java.util.Scanner;

public class NextGreaterElement {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);
		StackR stack = new StackR();
		int[] arr = { 11, 9, 13, 21, 3 };
		NGE(arr, 0, 1, stack, "");
		System.out.println();
		NGE2(arr, stack);
		System.out.println();
		NGE3(arr,stack) ;
	}

	// Without using Stack(Only Recursion)
	public static void NGE(int[] arr, int vidx1, int vidx2, StackR stack, String ans) throws Exception {

		if (vidx1 == arr.length - 1) {
			System.out.println(ans + arr[vidx1] + "  -  " + "-1");
			return;
		}

		if (vidx2 == arr.length) {
			// A
			NGE(arr, vidx1 + 1, vidx1 + 1, stack, ans + arr[vidx1] + "  -  " + "-1" + "\n");
			return;
		}

		if (arr[vidx1] < arr[vidx2]) {
			// B
			ans = ans + arr[vidx1] + "  -  " + arr[vidx2] + "\n";
			vidx2 = vidx1 + 1;
			NGE(arr, vidx1 + 1, vidx2 + 1, stack, ans);
			return;
		} else {
			// C
			NGE(arr, vidx1, vidx2 + 1, stack, ans);
			return;
		}
	}

	// Without Using Stack(+ Without Recursion)
	public static void NGE2(int[] arr, StackR stack) throws Exception {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length;) {
				if (arr[j] > arr[i]) {
					System.out.println(arr[i] + " - " + arr[j]);
					break;
				} else {
					j++;
					if (j == arr.length) {
						System.out.println(arr[i] + " - -1");
						break;
					}
				}
			}
			if (i == arr.length - 1) {
				System.out.println(arr[i] + " - " + "-1");
			}
		}

	}

	// With Using Stack(+ Recursion)
	public static void NGE3(int[] arr, StackR stack) throws Exception {

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && stack.top() < arr[i]) {
				int temp = stack.pop();
				System.out.println(temp + " - " + arr[i]);
			}
			stack.push(arr[i]);
		}
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			System.out.println(temp + " - " + "-1");
		}
	}

}
