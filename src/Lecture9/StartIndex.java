package Lecture9;

public class StartIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50, 60 };

		System.out.println(findstartindex(arr, 0, 30));

	}

	public static int findstartindex(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}
		if (arr[vidx] == item) {
			return vidx;
		}
		int recans = findstartindex(arr, vidx + 1, item);
		return recans;

	}
}
