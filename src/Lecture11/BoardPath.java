package Lecture11;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BoardPath(0, 10, " "));
	}

	public static int BoardPath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return 1;
		}
		if (curr > end) {
			return 0;
		}

		int count = 0;
		for (int i = 1; i <= 6; i++) {
			count += BoardPath(curr + i, end, ans + i);
		}

		return count;

	}

}
