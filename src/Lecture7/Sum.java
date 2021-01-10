package Lecture7;

import java.util.ArrayList;

public class Sum {

	public static void main(String[] args) {
		int[] one = { 3, 4, 5, 4 };
		int[] two = { 1, 1, 1 };

		System.out.println(sum(one, two));

	}

	public static ArrayList<Integer> sum(int[] one, int[] two) {
		int i = one.length - 1;
		int j = two.length - 1;
		ArrayList<Integer> list = new ArrayList<>();
		
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0)
				sum += one[i];

			if (j >= 0)
				sum += two[j];

			int rem = sum % 10;
			carry = sum / 10;

			list.add(0, rem);
			i--;
			j--;
		}

		if (carry != 0)
			list.add(0, carry);
		return list;
	}
}
