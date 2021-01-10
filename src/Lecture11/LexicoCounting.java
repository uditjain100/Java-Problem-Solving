package Lecture11;

import java.util.ArrayList;

public class LexicoCounting {

	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LexicoCounting(0, 1000);
		System.out.println(list);
	}

	public static void LexicoCounting(int curr, int end) {
		if (curr > end) {
			return;
		}
		//System.out.println(curr);
		list.add(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			LexicoCounting(curr * 10 + i, end);

		}
	}

}
