package Lecture9;

public class AllIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 20, 30, 20, 60 };

		int[] ans = allindex(arr, 0, 20, 0);
		for (int i : ans) {
			System.out.print(i + "\t");
		}
		// System.out.println(allindex(arr, 0, 20, 0));

	}

	public static int[] allindex(int[] arr, int vidx, int item, int count) {
		if (vidx == arr.length) {
			int[] abc = new int[count];
			return abc;

		}
		int[] ans;
		if (arr[vidx] == item) {
			ans = allindex(arr, vidx + 1, item, count + 1);
			ans[count] = vidx;
		} else {
			ans = allindex(arr, vidx + 1, item, count);
		}
		return ans;
	}
}
