package AssignmentsArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class abc {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 6, 9 };
		int[] brr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ans = mn(arr, brr);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

	public static int[] mn(int[] arr, int[] brr) {

		ArrayList<Integer> abc = new ArrayList<>();

		ArrayList<Integer> ans = read(arr, brr, 0, 0, abc, 0);

		int[] aa = new int[ans.size()];

		for (int i = 0; i < ans.size(); i++) {
			aa[i] = ans.get(i);
		}

		return aa;
	}

	public static ArrayList<Integer> read(int[] arr, int[] brr, int aidx, int bidx, ArrayList<Integer> ans, int count) {

		if (aidx == arr.length || bidx == brr.length) {
			return ans;
		}

		if (count == 0) {
			Arrays.sort(arr);
			Arrays.sort(brr);
			count = 1;
		}

		if (arr[aidx] == brr[bidx]) {
			ArrayList<Integer> rr = read(arr, brr, aidx + 1, bidx + 1, ans, 1);
		} else {
			if (ans.size() == 0) {
				ans.add(brr[bidx]);
			} else if (ans.size() != 0 && brr[bidx] != ans.get(ans.size() - 1)) {
				ans.add(brr[bidx]);
			}
			ArrayList<Integer> rr = read(arr, brr, aidx, bidx + 1, ans, 1);
		}
		return ans;
	}
}
