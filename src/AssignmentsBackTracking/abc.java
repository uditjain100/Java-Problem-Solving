package AssignmentsBackTracking;

public class abc {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] boxes = { 2, 3, 5, 6 };
		PQueenCom(boxes, 10, "", 0);
		System.out.println();
		PQueenPer(boxes, 10, "");
	}

	public static void PQueenCom(int[] denom, int amount, String ans, int nu) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = nu; i < denom.length; i++) {
			if (amount >= denom[i]) {
				PQueenCom(denom, amount - denom[i], ans + denom[i], i);
			}
		}

	}

	public static void PQueenPer(int[] denom, int amount, String ans) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < denom.length; i++) {
			if (amount >= denom[i]) {
				PQueenPer(denom, amount - denom[i], ans + denom[i]);
			}
		}

	}
}
