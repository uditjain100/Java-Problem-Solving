package Lecture8Recursion;

public class MaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 50, 6, 600 };
		System.out.println(max(arr, 0));
	}

	public static int max(int[] arr, int vidx) {
		if (vidx == arr.length-1) {
			return arr[vidx];
		}
		int mm1 = max(arr, vidx + 1);
		int m1 = arr[vidx];

		if (mm1 > m1) {
			return mm1;
		} else {
			return m1;
		}

	}
}
