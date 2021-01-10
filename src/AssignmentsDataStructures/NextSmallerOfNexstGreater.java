package AssignmentsDataStructures;

import java.util.Scanner;

public class NextSmallerOfNexstGreater {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = { 5, 1, 9, 2, 5, 1, 7 };
		StackR stack = new StackR();
		nsng(stack, arr);
		System.out.println();
		nsng1(0, 1, 2, arr, "");

	}

	// With Data Structure
	public static void nsng(StackR stack, int[] arr) throws Exception {

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && stack.top() < arr[i]) {

				if (i != arr.length - 1) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i] > arr[j]) {
							System.out.println(stack.top() + " - " + arr[j]);
							break;
						}
					}
					stack.pop();
				} else {
					break;
				}
			}
			stack.push(arr[i]);

		}
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			System.out.println(temp + " - " + "-1");
		}

	}

	// With Recursion
	public static void nsng1(int vidx1, int vidx2, int vidx3, int[] arr, String ans) throws Exception {

		if (vidx1 == arr.length - 1) {
			System.out.println(ans + arr[vidx1] + "  -  " + "-1");
			return;
		}

		if (vidx2 == arr.length) {
			// A
			vidx2 = vidx1 + 1;
			vidx3 = vidx2 + 1;
			nsng1(vidx1 + 1, vidx2, vidx3, arr, ans + arr[vidx1] + "  -  " + "-1" + "\n");
			return;
		}

		if (vidx3 == arr.length) {
			// B
			vidx2 = vidx1 + 1;
			vidx3 = vidx2 + 1;
			nsng1(vidx1 + 1, vidx2 + 1, vidx3 + 1, arr, ans + arr[vidx1] + "  -  " + "-1" + "\n");
			return;
		}

		if (arr[vidx1] < arr[vidx2]) {
			if (arr[vidx2] > arr[vidx3]) {
				ans = ans + arr[vidx1] + "  -  " + arr[vidx3] + "\n";
				vidx2 = vidx1 + 1;
				vidx3 = vidx2 + 1;
				// C
				nsng1(vidx1 + 1, vidx2 + 1, vidx3 + 1, arr, ans);
				return;
			} else {
				// D
				nsng1(vidx1, vidx2, vidx3 + 1, arr, ans);
			}
		} else {
			// E
			nsng1(vidx1, vidx2 + 1, vidx3 + 1, arr, ans);
			return;
		}
	}
}
