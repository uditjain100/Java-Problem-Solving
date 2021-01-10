package Lecture17;

import Lecture14.Stack;
import Lecture15.DynamicStack;

public class StackClient1 {

	public static void main(String[] args) throws Exception {

		Stack s = new DynamicStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);

		s.display();
		ReverseDisplay(s);
		s.display();
		ActualDisplay(s, new DynamicStack());
		s.display();
		int[] arr = { 10, 20, 3, 2, 5, 1, 70, 60 };
		nextGreaterElement(arr);

		/*
		 * int[] prices = { 15, 20, 17, 30, 25, 13, 27, 14, 20, 35 }; int[] span =
		 * stockspan(prices); for (int val : span) { System.out.println(val + " "); }
		 * System.out.println();
		 */
	}

	public static void ReverseDisplay(Stack s) throws Exception {

		if (s.isEmpty()) {
			return;
		}
		int temp = s.pop();
		ReverseDisplay(s);
		System.out.println(temp);
		s.push(temp);
	}

	public static void ActualDisplay(Stack s, Stack helper) throws Exception {
		if (s.isEmpty()) {
			ActualDisplayhelper(s, helper);
			return;
		}
		int temp = s.pop();
		helper.push(temp);
		ActualDisplay(s, helper);

	}

	public static void ActualDisplayhelper(Stack s, Stack helper) throws Exception {

		if (helper.isEmpty()) {
			return;
		}
		int temp = helper.pop();
		ActualDisplayhelper(s, helper);
		s.push(temp);

	}

	public static void nextGreaterElement(int[] arr) throws Exception {

		Stack s = new DynamicStack();

		for (int i = 0; i < arr.length; i++) {
			
			while (!s.isEmpty() && s.peek() < arr[i]) {
				int temp = s.pop();
				System.out.println(temp + "->" + arr[i]);
			}
			s.push(arr[i]);
		}
		while (!s.isEmpty()) {
			int temp = s.pop();
			System.out.println(temp + "->" + "-1");
		}

	}

	public static int[] stockspan(int[] prices) throws Exception {

		int[] span = new int[prices.length];
		Stack s = new DynamicStack();

		for (int i = 0; i < prices.length; i++) {
			while (!s.isEmpty() && prices[s.peek()] < prices[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - s.peek();
			}
			s.push(i);
		}
		return span;
	}
}
