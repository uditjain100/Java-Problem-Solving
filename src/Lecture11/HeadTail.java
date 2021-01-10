package Lecture11;

public class HeadTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeadTail(3, " ");
	}

	public static void HeadTail(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		HeadTail(n - 1, ans + "T");
		HeadTail(n - 1, ans + "H");

	}
}
