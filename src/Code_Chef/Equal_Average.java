package Code_Chef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Equal_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int temp = scn.nextInt();
		ArrayList<ArrayList<Integer>> list = allarrofarray(arr);
		System.out.println(list);
		System.out.println(qwe(arr, temp));
	}

	public static String qwe(int[] arr, int temp) {

		ArrayList<ArrayList<Integer>> list = allarrofarray(arr);

		ArrayList<Integer> ans = new ArrayList<>();

		int sum = 0;
		int var = 0;
		int res = 0;
		for (int i = 0; i < list.size(); i++) {
			var = 0;
			for (int k = 0; k < list.get(i).size() - temp - 1; k++) {
				sum = 0;
				for (int j = k; j < k + temp; j++) {
					sum += list.get(i).get(j);
				}
				ans.add(sum);
			}

			for (int x = 0; x < ans.size(); x++) {
				if (ans.get(x) == sum) {
					var++;
				}
			}

			if (var == ans.size()) {
				res = 1;
				System.out.println(list.get(i));
				break;
			}
		}
		if (res == 1) {
			return "true";
		} else {
			return "false";
		}

	}

	public static ArrayList<ArrayList<Integer>> allarrofarray(int[] arr) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		ArrayList<Integer> res = new ArrayList<>();

		boolean[] board = new boolean[arr.length];

		per(list, res, arr, board);
		return list;

	}

	public static void per(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> res, int[] arr, boolean[] used) {

		if (res.size() == arr.length) {
			list.add(new ArrayList<>(res));
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (used[i] || i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
					continue;
				}

				used[i] = true;
				res.add(arr[i]);
				per(list, res, arr, used);
				used[i] = false;
				res.remove(res.size() - 1);
			}
		}

	}

}
