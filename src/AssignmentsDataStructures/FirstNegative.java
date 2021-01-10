package AssignmentsDataStructures;

import java.util.Scanner;

public class FirstNegative {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		StackR stack = new StackR();
		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 4;
		FirstNeg(3, stack, arr);
	}

	public static void FirstNeg(int k, StackR stack, int[] arr) throws Exception {

		for (int i = 0; i < arr.length - k + 1; i++) {
			for (int j = i; j < i + k; j++) {
				stack.push(arr[j]);
				if (stack.top() < 0) {
					System.out.println(stack.top());
					while (!stack.isEmpty()) {
						stack.pop();
					}
					break;
				} else if (stack.top() >= 0 && j == i + k - 1) {
					System.out.println("0");
				}

			}

		}
	}
}
