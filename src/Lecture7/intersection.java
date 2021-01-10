package Lecture7;

import java.util.ArrayList;

public class intersection {

	public static void main(String[] args) {

		int[] one = { 10, 20, 30, 30, 40, 40, 50, 50, 50 };
		int[] two = { 10, 10, 10, 30, 30, 30, 40, 60 };

		//ArrayList<Integer> ans = intersection(one, two);
		System.out.println(intersection(one, two));
	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();
		int j = 0;
		for (int i = 0; i < one.length && j < two.length;) {
			if (one[i] == two[j]) {
				ans.add(one[i]);
				i++;
				j++;
			} else if (one[i] < two[j]) {
				i++;
			} else {
				j++;

			}

		}
		return ans;
	}

}
