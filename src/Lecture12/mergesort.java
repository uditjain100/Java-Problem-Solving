package Lecture12;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 100, 45, 65, -1 };

		int[] ans = mergesort(arr, 0, arr.length - 1);

		for (int val : ans) {
			System.out.println(val);
		}
	}

	public static int[] mergeTwoSortedArrays(int[] one, int[] two) {

		int[] arr = new int[one.length + two.length];

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				arr[k] = one[i];
				k++;
				i++;
			} else {
				arr[k] = two[j];
				k++;
				j++;
			}
		}
		if (i == one.length) {
			while (j < two.length) {
				arr[k] = two[j];
				j++;
				k++;
			}
		} else {
			while (i < one.length) {
				arr[k] = one[i];
				i++;
				k++;
			}
		}

		return arr;

	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;

		int[] fh = mergesort(arr, lo, mid);
		int[] sh = mergesort(arr, mid + 1, hi);

		int[] merged = mergeTwoSortedArrays(fh, sh);

		return merged;

	}

}
