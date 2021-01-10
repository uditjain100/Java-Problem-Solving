package AssignmentsAdvanced;

import java.util.Scanner;

public class BookAllocation {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int k = scn.nextInt();

		int[] books = new int[n];
		for (int i = 0; i < n; i++) {
			books[i] = scn.nextInt();
		}
		int temp = que(books, n, k);
		System.out.println(temp);

	}

	public static int que(int[] books, int n, int k) {

		int total_pages = 0;
		int s = 0;
		int e = 0;
		for (int i = 0; i < n; i++) {
			total_pages += books[i];
			s = Math.max(s, books[i]);
		}
		e = total_pages;
		int finalans = 0;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (isValid(books, n, k, mid)) {
				finalans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return finalans;
	}

	public static boolean isValid(int[] books, int n, int k, int ans) {

		int currentpages = 0;
		int students = 1;

		for (int i = 0; i < n; i++) {
			if (currentpages + books[i] > ans) {
				currentpages = books[i];
				students++;
				if (students > k) {
					return false;
				}
			} else {
				currentpages += books[i];
			}
		}
		return true;
	}

}
