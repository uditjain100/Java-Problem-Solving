package Lecture9;

import java.util.ArrayList;

public class allindexAL {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 20, 30, 20, 60 };

		ArrayList<Integer> ans = allindex(arr, 0, 20);

		System.out.println(ans);
		System.out.println(ans.get(0));
	}

	public static ArrayList<Integer> allindex(int[] arr, int vidx, int temp) {

		if (vidx == arr.length) {
			ArrayList<Integer> list = new ArrayList<>();
			return list;
		}

		ArrayList<Integer> list1;

		if (arr[vidx] == temp) {
			list1 = allindex(arr, vidx + 1, temp);
			list1.add(0 , vidx);
		} else {
			list1 = allindex(arr, vidx + 1, temp);
		}
		return list1;
	}
}
